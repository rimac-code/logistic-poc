package com.rimac.logisticpoc.template.pack;

/**
 * 
 * @author rimac Common and Mandatory steps for package processing. Each step
 *         can be customized by subclasses
 */
public abstract class PackageProcess {

	// Template Method defining the steps
	public final void processPackage(String packageId) {
		receivePackage(packageId);
		scanPackage(packageId);
		deliverPackage(packageId);
	}

	abstract void receivePackage(String packageId);

	abstract void scanPackage(String packageId);

	abstract void deliverPackage(String packageId);

	public class TemplateMethodPatternTest {
		public static void main(String[] args) {
			PackageProcess process = new StandardPackageProcess();
			process.processPackage("PKG456");
		}
	}
}