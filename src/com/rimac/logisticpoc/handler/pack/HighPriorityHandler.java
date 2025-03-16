package com.rimac.logisticpoc.handler.pack;

public class HighPriorityHandler implements PackageHandler {

	public String handle(String packageId) {
        return "Package " + packageId + " is prioritized for Express Processing";
    }
}
