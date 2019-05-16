package com.travix.medusa.busyflights.service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetResponse;

@Service("toughService")
public class ToughJetServiceImp implements ToughJetService {

	@Override
	public List<ToughJetResponse> getToughJetFlights(BusyFlightsRequest request) {
		List<ToughJetResponse> toughJetList = addToughJetFlights();
		List<ToughJetResponse> list = toughJetList.stream()
				.filter((Predicate<ToughJetResponse>) response -> response.getDepartureAirportName()
						.equals(request.getOrigin()))
				.filter(response -> response.getArrivalAirportName().equals(request.getDestination()))
				.filter(response -> LocalDateTime.parse(response.getOutboundDateTime()).toLocalDate().toString()
						.equals(request.getDepartureDate()))
				.filter(response -> LocalDateTime.parse(response.getInboundDateTime()).toLocalDate().toString()
						.equals(request.getReturnDate()))
				.collect(Collectors.toList());

		return list;
	}

	@Override
	public List<ToughJetResponse> addToughJetFlights() {
		List<ToughJetResponse> toughJetList = new ArrayList<ToughJetResponse>();
		toughJetList.add(
				new ToughJetResponse("Jet", 200, 100, 0.2, "LHR", "AMS", "2019-05-12T09:50:00", "2019-05-13T11:50:00"));
		toughJetList.add(
				new ToughJetResponse("KLM", 200, 100, 0.2, "AMS", "LHR", "2019-05-12T09:50:00", "2019-05-13T11:50:00"));
return toughJetList;
	}

}
