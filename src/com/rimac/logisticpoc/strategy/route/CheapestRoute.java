package com.rimac.logisticpoc.strategy.route;

/**
 * 
 * @author rimac
 *
 */
public class CheapestRoute implements RouteStrategy {

	public String getRoute(String destination) {
        return "Cheapest route to " + destination + " via Ground Shipping";
    }
	
}

