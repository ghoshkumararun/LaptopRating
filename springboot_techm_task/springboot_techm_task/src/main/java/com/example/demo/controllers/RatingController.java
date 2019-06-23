package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.service.RatingService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RatingController {

	@Autowired
	RatingService ratingService;

	@GetMapping("/all")
	public List<Laptop> getAllDetails() {
		return ratingService.getAllDetails();
	}
	
	@GetMapping("/update/{lapid}/{rating}")
	public List<Laptop> updateRating(@PathVariable int lapid, @PathVariable int rating) {
		
	return ratingService.updateRating(lapid,rating);
	}
	
	


}
