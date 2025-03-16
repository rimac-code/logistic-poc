package com.rimac.logisticpoc.template.pack;

/**
 * @author rimac Arrange Equipment for Receiving. Manual Scanning. Special
 *         Vehicle Delivery. Use Case: Furniture, industrial machinery, large
 *         appliances.
 **/
public class OversizedPackageProcess extends PackageProcess {
	void receivePackage(String packageId) {
		System.out.println("Received oversized package: " + packageId + " - Arranging special equipment");
	}

	void scanPackage(String packageId) {
		System.out.println("Manual scanning for oversized package: " + packageId);
	}

	void deliverPackage(String packageId) {
		System.out.println("Delivering oversized package via heavy-duty vehicle: " + packageId);
	}
}