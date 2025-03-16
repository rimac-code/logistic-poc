package com.rimac.logisticpoc.strategy.route;

/**
 * 
 * @author rimac Defines a family of algorithms (FastestRoute, CheapestRoute).
 *         RouteService can choose the strategy dynamically.
 */
public interface RouteStrategy {

	String getRoute(String destination);

}
