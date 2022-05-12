package com.skillsoft.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	
	private static final String UPLOAD_DRECTROY = "/uploaded_items";
	
	@RequestMapping(value="/uploadForm",method = RequestMethod.GET)
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadForm");
	}
	
	@RequestMapping(value="/saveFile", method=RequestMethod.POST)
	public ModelAndView saveImge(@RequestParam CommonsMultipartFile file,
			                      HttpSession session) throws IOException {
		
		ServletContext context = session.getServletContext();
		
		String uploadPath = context.getRealPath(UPLOAD_DRECTROY);
		System.out.println(uploadPath);
		
		byte[] bytes = file.getBytes();
		
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(
						uploadPath + File.separator + file.getOriginalFilename())));
		stream.write(bytes);
		stream.flush();
		stream.close();
		
		return new ModelAndView("uploadForm","filesuccess","File successfully uploaded!");
	}
	
}
