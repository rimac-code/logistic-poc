package com.rimac.logisticpoc.factory.pack;

import com.rimac.logisticpoc.handler.pack.HighPriorityHandler;
import com.rimac.logisticpoc.handler.pack.LowPriorityHandler;
import com.rimac.logisticpoc.handler.pack.MediumPriorityHandler;
import com.rimac.logisticpoc.handler.pack.PackageHandler;

/**
 * 
 * @author rimac Encapsulates object creation within PackageHandlingFactory.
 *         Uses a factory method to return an appropriate handler object based
 *         on priority level.
 */
public class PackageHandlingFactory {

	public static PackageHandler getPackageHandler(String priorityLevel) {
		switch (priorityLevel) {
		case "High":
			return new HighPriorityHandler();
		case "Medium":
			return new MediumPriorityHandler();
		case "Low":
			return new LowPriorityHandler();
		default:
			throw new IllegalArgumentException("Invalid priority level");
		}
	}

	public class FactoryPatternTest {
		public static void main(String[] args) {
			PackageHandler handler = PackageHandlingFactory.getPackageHandler("High");
			System.out.println(handler.handle("PKG123"));
		}
	}
}
