package com.designpattern.behavioralpattern.observerpattern;

public interface Subject {

	void suscribeChannel(Observer observer);
	void unSuscribeChannel(Observer observer);
	void uplaodNewVideo(video video);
}
