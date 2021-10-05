package com.example.AirlineFlight;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AirlineId;
	private String address;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Flight> flights;
	private String airlineName;
	private String contactNumber;

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlightsIds(Set<Flight> flights) {
		this.flights = flights;
	}

	public Integer getAirlineId() {
		return AirlineId;
	}

	public void setAirlineId(Integer airlineId) {
		AirlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
}
