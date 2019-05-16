package com.travix.medusa.busyflights.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.crazyair.CrazyAirResponse;

@Service("crazyService")
public class CrazyAirServiceImp implements CrazyAirService {

	@Override
	public List<CrazyAirResponse> getCrazyAirFlights(BusyFlightsRequest request) {

		List<CrazyAirResponse> crazyairList = addCrazyAirFlights();
		List<CrazyAirResponse> list = crazyairList.stream()
				.filter((Predicate<CrazyAirResponse>) response -> response.getDepartureAirportCode()
						.equals(request.getOrigin()))
				.filter(response -> response.getDestinationAirportCode().equals(request.getDestination()))
				.filter(response -> LocalDateTime.parse(response.getArrivalDate()).toLocalDate().toString()
						.equals(request.getReturnDate()))
				.filter(response -> LocalDateTime.parse(response.getDepartureDate()).toLocalDate().toString()
						.equals(request.getDepartureDate()))
				.collect(Collectors.toList());

		return list;
	}
	
	@Override
	public List<CrazyAirResponse>  addCrazyAirFlights() {
		
		List<CrazyAirResponse> crazyairList = new ArrayList<CrazyAirResponse>();
		crazyairList
				.add(new CrazyAirResponse("KLM", 200, "E", "LHR", "AMS", "2019-05-12T09:50:00", "2019-05-13T11:50:00"));
		crazyairList
				.add(new CrazyAirResponse("Jet", 200, "E", "AMS", "LHR", "2019-05-12T09:50:00", "2019-05-13T11:50:00"));
		crazyairList.add(
				new CrazyAirResponse("Indigo", 20, "E", "LHR", "AMS", "2019-05-12T09:30:00", "2019-05-13T11:30:00"));
		return crazyairList;
	}

}
