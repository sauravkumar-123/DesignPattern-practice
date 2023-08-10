package com.designpattern.behavioralpattern.observerpattern;

public class video {

	private String title;
	private String name;
	private String duration;
	private String category;

	public video(String title, String name, String duration, String category) {
		super();
		this.title = title;
		this.name = name;
		this.duration = duration;
		this.category = category;
	}

	@Override
	public String toString() {
		return this.title + " " + this.name + " " + this.duration + " " + this.category;
	}
}
