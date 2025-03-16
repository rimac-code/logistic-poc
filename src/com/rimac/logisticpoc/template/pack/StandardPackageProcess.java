package com.rimac.logisticpoc.template.pack;

/**
 * 
 * @author rimac Receive Package Scan Package Deliver Normally Use Case: Regular
 *         shipments with no special requirements.
 * 
 */
public class StandardPackageProcess extends PackageProcess {

	void receivePackage(String packageId) {
		System.out.println("Received package: " + packageId);
	}

	void scanPackage(String packageId) {
		System.out.println("Scanning package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering package: " + packageId);
	}
}
