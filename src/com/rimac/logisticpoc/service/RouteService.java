package com.rimac.logisticpoc.service;

import java.util.function.Function;

import com.rimac.logisticpoc.strategy.route.*;

/**
 * 
 * @author rimac
 *
 */
public class RouteService {

	private RouteStrategy strategy;

	public RouteService(RouteStrategy strategy) {
		this.strategy = strategy;
	}

	public String executeRoute(String destination) {
		return strategy.getRoute(destination);
	}

	public class StrategyPatternExample {
		public static void main(String[] args) {
			RouteService fastestRouteService = new RouteService(new FastestRoute());
			RouteService cheapestRouteService = new RouteService(new CheapestRoute());

			System.out.println(fastestRouteService.executeRoute("New York"));
			System.out.println(cheapestRouteService.executeRoute("Los Angeles"));
		}
	}

	// Higher-Order Function: Selects route based on function argument
	// selectBestRoute(destination, routeStrategy) accepts a function as an argument
	// Returns different delivery routes based on priority (Fastest, Cheapest,
	// Balanced).
	// We pass different lambda functions to define different route strategies
	public static String selectBestRoute(String destination, Function<String, String> routeStrategy) {
		return routeStrategy.apply(destination);
	}

	// With Lambda, we avoid creating extra classes and just pass a function
	// instead!
	public class LogisticsRouteExample {
		public static void main(String[] args) {
			// Different route strategies
			Function<String, String> fastestRoute = dest -> "Fastest route to " + dest + " via Express Air";
			Function<String, String> cheapestRoute = dest -> "Cheapest route to " + dest + " via Ground Shipping";

			// Choose routes dynamically
			String selectedRoute1 = RouteService.selectBestRoute("New York", fastestRoute);
			String selectedRoute2 = RouteService.selectBestRoute("Los Angeles", cheapestRoute);

			System.out.println(selectedRoute1); // Output: Fastest route to New York via Express Air
			System.out.println(selectedRoute2); // Output: Cheapest route to Los Angeles via Ground Shipping
		}
	}
}
