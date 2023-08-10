package com.designpattern.creationalpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnnection implements Cloneable {

	private String ipAdd;
	private String serverName;
	private String impData;
	private List<String> sites = new ArrayList<>();

	public NetworkConnnection() {

	}

	public NetworkConnnection(String ipAdd, String serverName) {
		this.ipAdd = ipAdd;
		this.serverName = serverName;
	}

	public String getIpAdd() {
		return ipAdd;
	}

	public void setIpAdd(String ipAdd) {
		this.ipAdd = ipAdd;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getImpData() {
		return impData;
	}

	public void setImpData(String impData) {
		this.impData = impData;
	}

	public List<String> getSites() {
		return sites;
	}

	public void setSites(List<String> sites) {
		this.sites = sites;
	}

	public void loadNetworkPackageData(int packets) throws InterruptedException {
		this.impData = packets + " network packet found";
		this.sites.add("www.google.com");
		this.sites.add("www.yahoo.com");
		this.sites.add("www.tcs.com");
		this.sites.add("www.htcInc.com");
		this.sites.add("www.infosys.com");
		this.sites.add("www.coforge.com");
		this.sites.add("www.wipro.com");
		this.sites.add("www.naukri.com");
		Thread.sleep(5000);
		System.out.println("Network Data loaded");
	}

	// @ deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		NetworkConnnection networkConnnection = new NetworkConnnection(this.ipAdd, this.serverName);
		networkConnnection.setImpData(this.impData);

		for (String domain : this.getSites()) {
			networkConnnection.getSites().add(domain);
		}
		return networkConnnection;
	}

	@Override
	public String toString() {
		return this.ipAdd + " " + this.serverName + " " + this.impData + " " + this.sites;
	}
}
