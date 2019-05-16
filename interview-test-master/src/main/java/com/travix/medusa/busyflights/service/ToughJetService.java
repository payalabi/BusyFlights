package com.travix.medusa.busyflights.service;

import java.util.List;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;

public interface ToughJetService {
	
	 List<ToughJetResponse>  getToughJetFlights(BusyFlightsRequest request);
	 List<ToughJetResponse> addToughJetFlights();

}
