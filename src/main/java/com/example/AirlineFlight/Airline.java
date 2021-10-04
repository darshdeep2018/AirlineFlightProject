package com.example.AirlineFlight;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer AirlineId;
	private String address;
	private ArrayList<Integer> flightsIds;
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

	public ArrayList<Integer> getFlightsIds() {
		return flightsIds;
	}

	public void setFlightsIds(ArrayList<Integer> flightsIds) {
		this.flightsIds = flightsIds;
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
