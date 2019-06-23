package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;

@Service
public class RatingService {
	
	int lap1_avg_rating=0;
	int lap2_avg_rating=0;
	int lap3_avg_rating=0;
	
	static int lap1_total_rating=0;
	static int lap2_total_rating=0;
	static int lap3_total_rating=0;
	
	static int lap1_rating_counter=0;
	static int lap2_rating_counter=0;
	static int lap3_rating_counter=0;
	
	int lap1_last_rating=0;
	int lap2_last_rating=0;
	int lap3_last_rating=0;

	public List<Laptop> getAllDetails() {
		ArrayList<Laptop> laptopList = new ArrayList<Laptop>();

		laptopList.add(new Laptop(1, "dell", "laptop1.jpg", lap1_avg_rating, "dell 8gb"));
		laptopList.add(new Laptop(2, "acer", "laptop2.jpg", lap2_avg_rating, "acer 8gb"));
		laptopList.add(new Laptop(3, "hp", "laptop3.jpg", lap3_avg_rating, "hp 8gb"));

		return laptopList;
	}
	
	public List<Laptop> updateRating(int lapid, int rating)
	{
		//System.out.println("Inside updateRating: Lapid :" + lapid +" rating :"+ rating);
		ArrayList<Laptop> laptopList = new ArrayList<Laptop>();
		/*if(lapid==1)
		{
			laptopList.add(new Laptop(1, "dell", "laptop1.jpg", 4, "Laptop1 with 8 GB ram"));
		}
		
		laptopList.add(new Laptop(2, "acer", "laptop2.jpg", 0, "Laptop2 with 8 GB ram"));
		laptopList.add(new Laptop(3, "hp", "laptop3.jpg", 0, "Laptop3 with 8 GB ram"));
		*/
		
		if(lapid==1)
		{
			lap1_rating_counter=lap1_rating_counter+1;
			lap1_total_rating=lap1_total_rating+rating;
			lap1_avg_rating=(lap1_total_rating)/lap1_rating_counter;
			System.out.println("lap1_rating_counter:"+lap1_rating_counter +":lap1_avg_rating:"+lap1_avg_rating+":lap1_total_rating:"+lap1_total_rating);
		}
		
		if(lapid==2)
		{
			lap2_rating_counter=lap2_rating_counter+1;
			lap2_total_rating=lap2_total_rating+rating;
			lap2_avg_rating=(lap2_total_rating)/lap2_rating_counter;
			System.out.println("lap2_rating_counter:"+lap2_rating_counter +":lap2_avg_rating:"+lap2_avg_rating+":lap2_total_rating:"+lap2_total_rating);
	
		}
		
		if(lapid==3)
		{
			lap3_rating_counter=lap3_rating_counter+1;
			lap3_total_rating=lap3_total_rating+rating;
			lap3_avg_rating=(lap3_total_rating)/lap3_rating_counter;
			System.out.println("lap3_rating_counter:"+lap3_rating_counter +":lap3_avg_rating:"+lap3_avg_rating+":lap3_total_rating:"+lap3_total_rating);
	
		}
		
		laptopList.add(new Laptop(1, "dell", "laptop1.jpg", lap1_avg_rating, "dell 8gb"));
		laptopList.add(new Laptop(2, "acer", "laptop2.jpg", lap2_avg_rating, "acer 8gb"));
		laptopList.add(new Laptop(3, "hp", "laptop3.jpg", lap3_avg_rating, "hp 8gb"));
		
		return laptopList;
		
	}

}
