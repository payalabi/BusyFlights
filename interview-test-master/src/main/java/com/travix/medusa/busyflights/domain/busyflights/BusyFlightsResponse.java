package com.travix.medusa.busyflights.domain.busyflights;

public class BusyFlightsResponse {
	 private String airline;
	    private double price;
	    private String supplier;
	    private String departureAirportCode;
	    private String destinationAirportCode;
	    private String departureDate;
	    private String arrivalDate;
	    public String getSupplier() {
			return supplier;
		}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getDepartureAirportCode() {
			return departureAirportCode;
		}
		public void setDepartureAirportCode(String departureAirportCode) {
			this.departureAirportCode = departureAirportCode;
		}
		public String getDestinationAirportCode() {
			return destinationAirportCode;
		}
		public void setDestinationAirportCode(String destinationAirportCode) {
			this.destinationAirportCode = destinationAirportCode;
		}
		public String getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
		}
		public String getArrivalDate() {
			return arrivalDate;
		}
		
		public void setArrivalDate(String arrivalDate) {
			this.arrivalDate = arrivalDate;
		}
		

	    public BusyFlightsResponse(String airline, double price, String supplier, String departureAirportCode,
				String destinationAirportCode, String departureDate, String arrivalDate) {
			super();
			this.airline = airline;
			this.price = price;
			this.supplier = supplier;
			this.departureAirportCode = departureAirportCode;
			this.destinationAirportCode = destinationAirportCode;
			this.departureDate = departureDate;
			this.arrivalDate = arrivalDate;
		}
}
