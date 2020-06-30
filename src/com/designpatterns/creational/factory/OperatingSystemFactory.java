package com.designpatterns.creational.factory;

public class OperatingSystemFactory {

	public OperatingSystemFactory() {}
	
	public OperatingSystem getInstance(String type) {
		
		if ("ios".equalsIgnoreCase(type)) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
