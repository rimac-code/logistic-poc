package com.rimac.logisticpoc.template.pack;

/**
 * @author rimac Biometric Authentication at Receiving. X-Ray & Manual
 *         Inspection. Armed Escort for Delivery. Use Case: Gold, diamonds, VIP
 *         assets, confidential documents.
 **/
public class SecurePackageProcess extends PackageProcess {
	void receivePackage(String packageId) {
		System.out.println("Received secure package: " + packageId + " - Applying biometric authentication");
	}

	void scanPackage(String packageId) {
		System.out.println("X-ray and manual inspection for secure package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering secure package with armed escort: " + packageId);
	}
}
