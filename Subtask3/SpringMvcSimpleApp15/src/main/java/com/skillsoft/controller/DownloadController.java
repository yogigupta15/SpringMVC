package com.skillsoft.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/downloads",method = RequestMethod.GET)
public class DownloadController {
	
	@Autowired
	ServletContext context; @RequestMapping("/performDownload")
	
	public void downloader(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		String fileName = request.getParameter("filename"); 
		
		System.out.println("Downloading file :- " + fileName); 
		
		String downloadFolder = context.getRealPath("/WEB-INF/downloads/");
	
		
		Path file = Paths.get(downloadFolder, fileName); 
		
		if (Files.exists(file)) {
			
			String extension = FilenameUtils.getExtension(fileName); 
			
			if (extension.toLowerCase().equals("pdf")) {
	
			response.setContentType("application/pdf");
	
		
			} else {
	
			response.setContentType("image/jpeg");
	
		}
	
		response.addHeader("Content-Disposition", "attachment; filename=" + fileName);
		
		try { Files.copy(file, response.getOutputStream());
	
		response.getOutputStream().flush();
	
		} catch (IOException e) {
	
			System.out.println("Error :- " + e.getMessage());
	
		} 
		
		}	
	}
	@RequestMapping(value = "/downloadForm", method = RequestMethod.GET)
	public String displayDownloadForm() { 
		
		return "downloadForm";
	}


}
