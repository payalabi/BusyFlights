package com.travix.medusa.busyflights.domain.busyflights;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class BusyFlightsRequest {

	@NotNull(message = "Enter Origion")
	@Size(min = 3, max = 3, message = "Only three letter code allowed")
	private String origin;
	@NotNull(message = "Enter Destination")
	@Size(min = 3, max = 3, message = "Only three letter code allowed")
	private String destination;
	@NotNull(message = "Enter DepartureDate")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String departureDate;
	@NotNull(message = "Enter ReturnDate")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String returnDate;
	@Max(value = 4, message = "maximum 4 passengers allowed")
	private int numberOfPassengers;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(final String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(final String destination) {
		this.destination = destination;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(final String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {

		return returnDate;
	}

	public void setReturnDate(final String returnDate) {
		this.returnDate = returnDate;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(final int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
}
