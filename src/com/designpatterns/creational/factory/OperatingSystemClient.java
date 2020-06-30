package com.designpatterns.creational.factory;

public class OperatingSystemClient {

	public static void main(String[] args) {
		
		OperatingSystemFactory factory = new OperatingSystemFactory();
		OperatingSystem operatingSystem = factory.getInstance("windows");
		System.out.println(operatingSystem.getCompanyName());
	}
}
