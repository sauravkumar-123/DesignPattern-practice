package com.designpattern.creationalpattern.singltonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingltonRun {

	public static void main(String args[]) {

		Singlton sgt1 = Singlton.getSinglton();
		sgt1.setStr("Hi, Saurav Kumar"); // @set any field value from outer class
		Singlton sgt2 = Singlton.getSinglton();

		// sgt2.str = "How are you?";

		System.out.println(sgt1.hashCode() + "  " + sgt1.str);

		sgt2.str = "How are you?";

		System.out.println(sgt2.hashCode() + "  " + sgt2.str);
		System.out.println(sgt1.hashCode() + "  " + sgt1.str);

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------");
		// @ breaking of singlton pattern using reflication API.
		try {
			Singlton sigtObj = null;
			Constructor<Singlton>[] sgtConstructors = (Constructor<Singlton>[]) Singlton.class
					.getDeclaredConstructors();
			for (Constructor<Singlton> sgtConstructor : sgtConstructors) {
				sgtConstructor.setAccessible(false);
				sigtObj = sgtConstructor.newInstance();
				sigtObj.setStr("Welcome, Onbaording");
			}

			System.out.println(sigtObj.hashCode() + " " + sigtObj.str);
		} catch (Exception e) {
			System.out.println("Exception while breaking singlton...");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		// @ breaking of singlton pattern using serilization.
		try {
			Singlton singltonX1 = Singlton.getSinglton();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc1.txt"));
			objectOutputStream.writeObject(singltonX1);

			singltonX1.str = "Hey, Your Welcome!!!";

			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc1.txt"));
			Singlton singltonX2 = (Singlton) objectInputStream.readObject();

			System.out.println(singltonX1.hashCode() + " " + singltonX1.str);

			System.out.println(singltonX2.hashCode() + " " + singltonX2.str);
		} catch (Exception e) {
			System.out.println("Exception while breaking singlton...");
		}

		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		// @ breaking of singlton pattern using cloning.
		Singlton sgtx01 = Singlton.getSinglton();
		Singlton sgtx02 = null;

		try {
			sgtx02 = (Singlton) sgtx01.clone();
			sgtx02.str = "Hope You are doing good!!";
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(sgtx01.hashCode() + " " + sgtx01.str);
		System.out.println(sgtx02.hashCode() + " " + sgtx02.str);
	}

}
