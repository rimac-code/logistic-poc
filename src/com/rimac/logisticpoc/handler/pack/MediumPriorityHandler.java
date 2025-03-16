package com.rimac.logisticpoc.handler.pack;

public class MediumPriorityHandler implements PackageHandler {

	 public String handle(String packageId) {
	        return "Package " + packageId + " is scheduled for Standard Processing";
	    }
	 
}

