package com.rimac.logisticpoc.template.pack;

/**
 * 
 * @author rimac Extra Care During Receiving. Manual Scanning. Extra Padding in
 *         Delivery. Use Case: Glass items, electronics, artwork, and breakable
 *         products.
 **
 */
public class FragilePackageProcess extends PackageProcess {

	void receivePackage(String packageId) {
		System.out.println("Received fragile package: " + packageId + " with extra care");
	}

	void scanPackage(String packageId) {
		System.out.println("Manually scanning fragile package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering fragile package with extra padding: " + packageId);
	}
}
