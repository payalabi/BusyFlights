package com.travix.medusa.busyflights.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.service.CrazyAirService;

@RestController
public class CrazyAirController {
	@Autowired
	 CrazyAirService crazyService;
	
	@RequestMapping(value = "CrazyAir/flights", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody List<CrazyAirResponse> crazyAirFlights(BusyFlightsRequest request) {
		List<CrazyAirResponse> crazyServiceresponse = crazyService.addCrazyAirFlights();
		return crazyServiceresponse;
	}

	
	
	
	
}
