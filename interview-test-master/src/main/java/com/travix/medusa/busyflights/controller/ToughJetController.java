package com.travix.medusa.busyflights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
import com.travix.medusa.busyflights.service.ToughJetService;

@RestController
public class ToughJetController {
	@Autowired
	ToughJetService toughService;

	@RequestMapping(value = "ToughJet/flights", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody List<ToughJetResponse> toughJetFlights(BusyFlightsRequest request) {

		List<ToughJetResponse> toughJetServiceresponse = toughService.addToughJetFlights();

		return toughJetServiceresponse;
	}
}
