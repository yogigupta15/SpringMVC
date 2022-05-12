package com.skillsoft.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController implements ServletContextAware{
	
	private static final String UPLOAD_DRECTROY = "/uploaded_items";
	
	private ServletContext servletContext;
	
	public void setServletContext(ServletContext servletContext) {
		
		this.servletContext = servletContext;
		
	}
	@RequestMapping(value="/uploadSingleFile", method = RequestMethod.GET)
	public ModelAndView uploadSingleFile() {
		
		return new ModelAndView("uploadSingleFile");
	}
	
	@RequestMapping(value="/uploadMultipleFile", method = RequestMethod.GET)
	public ModelAndView uploadMultipleFiles() {
		
		return new ModelAndView("uploadMultipleFile");
	}
	
	@RequestMapping(value="/uploadSingleFile", method = RequestMethod.POST)
	public @ResponseBody String uploadSingleFileHandler(
			@RequestParam("name") String filename,
			@RequestParam("file") MultipartFile file) {
		
		if(!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				
				String pathToFile = servletContext.getRealPath("/") + 
						UPLOAD_DRECTROY + filename;
				BufferedOutputStream stream = new BufferedOutputStream (new FileOutputStream(new File(pathToFile)));
				
				stream.write(bytes);
				stream.close();
				
				return "You successfully uploaded " + filename + " !";
				
			} catch (Exception e) {
				
				return "You failed to upload" + filename + "=>" + e.getMessage();
			}
		} else {
			
			return "You failed to upload" + filename + "because the file was empty.";
		}
	}
	
	@RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	public @ResponseBody String uploadMultipleFilesHandler(
		   @RequestParam("name") String[] filenames,
	       @RequestParam("file") MultipartFile[] files) {
	
	     if (files.length != filenames.length) {
	    	 return "required information missing";
	     }
	     String message = "";
	     for (int i = 0; i < files.length; i++) {
	          MultipartFile file = files[i];
	          String filename = filenames[i];
	          try {
	              
	        	  byte[] bytes = file.getBytes();

	             String pathToFile = servletContext.getRealPath("/") + UPLOAD_DRECTROY + filename;

	             BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(pathToFile)));
	             stream.write(bytes);
	             stream.close();
	             message = message + "You successfully uploaded " + filename + "<br/>";
	           } catch (Exception e) {
	                 return "You failed to upload " + filename + " => " + e.getMessage();
	           }
	      }
	       return message;
	   }
}
