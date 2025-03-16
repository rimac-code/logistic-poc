package com.rimac.logisticpoc.strategy.route;

/**
 * 
 * @author rimac
 *
 */
public class FastestRoute implements RouteStrategy {

	public String getRoute(String destination) {
		return "Fastest route to " + destination + " via Express Air";
	}
}
