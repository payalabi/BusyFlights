package com.travix.medusa.busyflights.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;
@Service("busyFlightsService")
public class BusyFlightsServiceImp implements BusyFlightsService {
	@Autowired
	 CrazyAirService crazyService;
	@Autowired
	 ToughJetService toughService;
	
	@Override
	public List<BusyFlightsResponse> getFlights(BusyFlightsRequest request) {

		List<CrazyAirResponse> crazyServiceresponse = crazyService.getCrazyAirFlights(request);
		List<ToughJetResponse> toughJetServiceresponse = toughService.getToughJetFlights(request);

		List<BusyFlightsResponse> response = new ArrayList<BusyFlightsResponse>();

		int Index = 0;
		double price = 0.00;
		DecimalFormat df = new DecimalFormat("#.##");

		for (CrazyAirResponse crazyAirResponse : crazyServiceresponse) {

			price = crazyAirResponse.getPrice() * request.getNumberOfPassengers();
			price = Double.valueOf(df.format(price));
			BusyFlightsResponse obj = new BusyFlightsResponse(crazyAirResponse.getAirline(), price, "CrazyAirFlights",
					crazyAirResponse.getDepartureAirportCode(), crazyAirResponse.getDestinationAirportCode(),
					crazyAirResponse.getDepartureDate(), crazyAirResponse.getArrivalDate());
			response.add(Index, obj);
			Index++;
		}
		Index = 0;
		for (ToughJetResponse toughJetresponse : toughJetServiceresponse) {
			price = ((toughJetresponse.getBasePrice() + toughJetresponse.getTax()) * toughJetresponse.getDiscount())
					* request.getNumberOfPassengers();

			price = Double.valueOf(df.format(price));
			BusyFlightsResponse obj = new BusyFlightsResponse(toughJetresponse.getCarrier(), price, "ToughJetFlights",
					toughJetresponse.getDepartureAirportName(), toughJetresponse.getArrivalAirportName(),
					toughJetresponse.getOutboundDateTime(), toughJetresponse.getInboundDateTime());
			response.add(Index, obj);
			Index++;

		}
		Collections.sort(response, Comparator.comparingDouble(BusyFlightsResponse::getPrice));
		return response;
	}

}
