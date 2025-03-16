package com.rimac.logisticpoc.template.pack;

/**
 * 
 * @author rimac Check Temperature at Receiving. Quick Scanning to Avoid
 *         Exposure. Refrigerated Delivery. Use Case: Frozen food, dairy,
 *         pharmaceuticals, flowers.
 **/

public class PerishablePackageProcess extends PackageProcess {

	void receivePackage(String packageId) {
		System.out.println("Received perishable package: " + packageId + " - Checking temperature conditions");
	}

	void scanPackage(String packageId) {
		System.out.println("Scanning perishable package quickly: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering perishable package in refrigerated vehicle: " + packageId);
	}
}
