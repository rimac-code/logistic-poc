package com.rimac.logisticpoc.service;

import java.util.function.Function;

/**
 * 
 * @author rimac
 *
 */
public class ShippingService {

	// Higher-Order Function: Returns a function based on shipping type
	// Shipping rates depend on destination zones (Domestic, International,
	// Express).
	// apply(10.0) dynamically calculates the shipping cost
	public static Function<Double, Double> getShippingRateCalculator(String zone) {
		switch (zone) {
		case "Domestic":
			return weight -> weight * 5.0; // $5 per kg
		case "International":
			return weight -> weight * 10.0; // $10 per kg
		case "Express":
			return weight -> weight * 15.0; // $15 per kg
		default:
			return weight -> weight; // No extra charge
		}
	}

	public class LogisticsShippingExample {
		public static void main(String[] args) {
			// Get shipping rate function for International shipping
			Function<Double, Double> shippingCalculator = ShippingService.getShippingRateCalculator("International");

			// Calculate shipping cost for a 10kg package
			double cost = shippingCalculator.apply(10.0);
			System.out.println("Shipping Cost (International, 10kg): $" + cost); // Output: $100.0
		}
	}
}
