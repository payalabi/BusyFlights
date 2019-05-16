package com.travix.medusa.busyflights.service;

import java.util.List;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;

public interface CrazyAirService {
	
	  List<CrazyAirResponse> getCrazyAirFlights( BusyFlightsRequest request);
	  List<CrazyAirResponse>  addCrazyAirFlights();
	
}
