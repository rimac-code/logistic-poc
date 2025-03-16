package com.rimac.logisticpoc.handler.pack;

public class LowPriorityHandler implements PackageHandler {

	public String handle(String packageId) {
        return "Package " + packageId + " will be handled when resources are available";
    }
}
