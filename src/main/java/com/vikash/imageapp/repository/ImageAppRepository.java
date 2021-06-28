package com.vikash.imageapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikash.imageapp.model.ImageApp;

@Repository
public interface ImageAppRepository extends JpaRepository<ImageApp, Long> {

}
