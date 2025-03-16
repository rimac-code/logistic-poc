package com.rimac.logisticpoc.template.pack;

/**
 * 
 * @author rimac VIP Handling at Receiving Priority Scanning Same-Day Air
 *         Shipment Use Case: Medical emergencies, urgent legal documents,
 *         high-value items.
 **/
public class ExpressPackageProcess extends PackageProcess {

	void receivePackage(String packageId) {
		System.out.println("Received express package: " + packageId + " with VIP handling");
	}

	void scanPackage(String packageId) {
		System.out.println("Priority scanning for express package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering express package via same-day air shipment: " + packageId);
	}
}
