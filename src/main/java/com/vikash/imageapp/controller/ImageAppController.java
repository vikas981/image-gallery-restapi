package com.vikash.imageapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.imageapp.model.ImageApp;
import com.vikash.imageapp.service.ImageAppService;


@RestController
public class ImageAppController {
	
	@Autowired
	private ImageAppService imageAppService;
	
	@GetMapping(value = "/")
	public List<ImageApp> showAllImages(){
		return imageAppService.getAllGalleryImages();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<ImageApp> showSingleImage(@PathVariable Long id){
		return imageAppService.getImageById(id);
	}
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	public void addImageToGallary(@RequestBody ImageApp imageApp){
		imageAppService.saveImage(imageApp);
	}
}
