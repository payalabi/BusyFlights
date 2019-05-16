package com.travix.medusa.busyflights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.travix.medusa.busyflights.service.BusyFlightsService;
import com.travix.medusa.busyflights.service.BusyFlightsServiceImp;
import com.travix.medusa.busyflights.service.CrazyAirService;
import com.travix.medusa.busyflights.service.CrazyAirServiceImp;
import com.travix.medusa.busyflights.service.ToughJetService;
import com.travix.medusa.busyflights.service.ToughJetServiceImp;

@SpringBootApplication
public class BusyFlightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusyFlightsApplication.class, args);
	}
	
	
}
