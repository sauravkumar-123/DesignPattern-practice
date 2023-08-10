package com.designpattern.creationalpattern.singltonpattern;

import java.io.Serializable;

public class Singlton implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;

	private static Singlton singlton = null;

	public String str = null;

	private Singlton() {
		// str = "I am saurav kumar";
//		if(null!=singlton) {
//			throw new RuntimeException("You are trying to break singlton rule!!");
//		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static Singlton getSinglton() {

		if (singlton == null) {
			synchronized (Singlton.class) {
				singlton = new Singlton();
			}
		}
		return singlton;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
