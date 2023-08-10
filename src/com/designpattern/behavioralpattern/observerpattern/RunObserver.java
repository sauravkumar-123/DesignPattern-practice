package com.designpattern.behavioralpattern.observerpattern;

public class RunObserver {

	public static void main(String[] args) {

		Subject ytc = new YoutubeChannel();

		Observer obsr1 = new Suscriber("Saurav");
		Observer obsr2 = new Suscriber("Aman");
		Observer obsr3 = new Suscriber("Raman");
		Observer obsr4 = new Suscriber("Kumar");
		Observer obsr5 = new Suscriber("Krishana");

		ytc.suscribeChannel(obsr1);
		ytc.suscribeChannel(obsr2);
		ytc.suscribeChannel(obsr3);
		ytc.suscribeChannel(obsr4);
		ytc.suscribeChannel(obsr5);

		video video = new video("Learn Java", "JAVA 8", "12:08", "Educational");

		ytc.uplaodNewVideo(video);

		ytc.unSuscribeChannel(obsr5);

		video video1 = new video("Learn python", "python 3", "10:08", "Educational");

		ytc.uplaodNewVideo(video1);

	}

}
