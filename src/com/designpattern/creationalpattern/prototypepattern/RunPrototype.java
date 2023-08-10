package com.designpattern.creationalpattern.prototypepattern;

public class RunPrototype {

	public static void main(String[] args) throws InterruptedException {

		NetworkConnnection networkConnnection1 = new NetworkConnnection("192.48.1.6", "AWS");
		networkConnnection1.loadNetworkPackageData(625);
		// System.out.println(networkConnnection1 + " " + "Hashcode{} " +
		// networkConnnection1.hashCode());

		try {
			NetworkConnnection networkConnnection2 = (NetworkConnnection) networkConnnection1.clone();
			// System.out.println(networkConnnection2 + " " + "Hashcode{} " +
			// networkConnnection2.hashCode());

			NetworkConnnection networkConnnection3 = (NetworkConnnection) networkConnnection1.clone();
			// System.out.println(networkConnnection3 + " " + "Hashcode{} " +
			// networkConnnection3.hashCode());

			System.out.println(networkConnnection1 + "    " + "Hashcode{} " + networkConnnection1.hashCode());
			networkConnnection1.getSites().remove(3);
			networkConnnection1.getSites().add("www.linkedin.com");
			System.out.println(networkConnnection1 + "    " + "Hashcode{} " + networkConnnection1.hashCode());

			System.out.println(networkConnnection2 + " " + "Hashcode{} " + networkConnnection2.hashCode());
			System.out.println(networkConnnection3 + " " + "Hashcode{} " + networkConnnection3.hashCode());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
