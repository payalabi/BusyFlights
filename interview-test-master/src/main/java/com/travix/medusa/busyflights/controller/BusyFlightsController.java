package com.travix.medusa.busyflights.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.service.BusyFlightsService;

@RestController
public class BusyFlightsController {
	
	@Autowired
     BusyFlightsService busyFlightsService;

	@RequestMapping(value = "BusyAir/searchflights", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	List<BusyFlightsResponse> searchFlights(@RequestBody @Valid BusyFlightsRequest request) {
		return busyFlightsService.getFlights(request);

	}
}
