package com.designpattern.behavioralpattern.observerpattern;

public class Suscriber implements Observer {

	private String name;

	public Suscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void notified(video video) {
		System.out.println("Hello " + this.name + " new video uploaded " + "Video Description{} " + video);
	}

}
