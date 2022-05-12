package com.skillsoft.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.skillsoft.model.UploadData;

@Controller
public class FileUploadController {
	
	@RequestMapping(value ="/save-upload", method = RequestMethod.POST)
	public String uploadResources(HttpServletRequest servletRequest,
			@ModelAttribute UploadData upload, Model model) {
		
		List<MultipartFile> files = upload.getImages();
		List<String> fileNames = new ArrayList<String>();
		
		if(null != files && files.size()>0) {
			
			for(MultipartFile multipartFile : files) {
				
				String fileName = multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				
				File imageFile = new File(
						servletRequest.getServletContext().getRealPath("/images"),fileName);
				try {
					multipartFile.transferTo(imageFile);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		model.addAttribute("upload", upload);
		return "viewUpdateDetail";
	}
	
	@RequestMapping(value="/uploadForm", method = RequestMethod.GET)
	public String displayFrom(Model model) {
		model.addAttribute("upload",new UploadData());
		return "uploadForm";
	}
}
