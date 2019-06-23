package com.example.demo.model;

public class Laptop {
	
	private int lapid;
	private String name;
	private String image;
	private int rating;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Laptop(int id, String n, String i, int j, String d) {
		lapid=id;
		name=n;
		image=i;
		rating=j;
		description = d;
	}
	public int getLapid() {
		return lapid;
	}
	public void setLapid(int lapid) {
		this.lapid = lapid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
