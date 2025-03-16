package com.rimac.logisticpoc.template.pack;

/**
 * @author rimac Safety Protocols at Receiving. Specialized Scanning. Secure
 *         Delivery with Compliance. Use Case: Flammable materials, chemicals,
 *         radioactive substances.
 **/
public class HazardousPackageProcess extends PackageProcess {
	void receivePackage(String packageId) {
		System.out.println("Received hazardous package: " + packageId + " - Applying safety protocols");
	}

	void scanPackage(String packageId) {
		System.out.println("Performing specialized scanning for hazardous package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering hazardous package with special security measures: " + packageId);
	}
}