package com.vikash.imageapp.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="image_app")
@Data
public class ImageApp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable =false,unique = true)
	private Long id;
	@Column(name = "ImgName",nullable = false)
	private String imgName;
	
	@Lob
	@Column(name = "ImgURL",nullable = false)
	private String imgURL;
	
	@Column(name = "ImgDetails",nullable = false)
	private String imgDetails;
	
	
}
