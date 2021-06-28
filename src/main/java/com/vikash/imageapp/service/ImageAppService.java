package com.vikash.imageapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikash.imageapp.model.ImageApp;
import com.vikash.imageapp.repository.ImageAppRepository;

@Service
public class ImageAppService {
	
	@Autowired
	private ImageAppRepository imageAppRepository;
	
	public List<ImageApp> getAllGalleryImages(){
		return imageAppRepository.findAll();
	}
	public void saveImage(ImageApp imageApp) {
		imageAppRepository.save(imageApp);
	}
	
	public Optional<ImageApp> getImageById(Long id){
		return imageAppRepository.findById(id);
	}
	
	

}
