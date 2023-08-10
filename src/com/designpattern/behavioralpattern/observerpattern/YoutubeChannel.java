package com.designpattern.behavioralpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

	List<Observer> observers = new ArrayList<>();

	@Override
	public void suscribeChannel(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSuscribeChannel(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void uplaodNewVideo(video video) {
		for (Observer obsr : observers) {
			obsr.notified(video);
		}
	}

}
