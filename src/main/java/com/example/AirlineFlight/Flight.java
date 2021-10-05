package com.example.AirlineFlight;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;

	private int flightNumber;
	private String fromPlace;
	private String toPlace;
	private String startDateTime;
	private String endDateTime;
	private ArrayList<String> scheduleDays;
	private String instrumentUsed;
	private int businessClassSeats;
	private int nonBusinessClassSeats;
	private int ticketCost;
	private int numberOfRows;
	private Meal meal;
	private Trip trip;

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer id) {
		this.flightId = id;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

	public ArrayList<String> getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(ArrayList<String> scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	public String getInstrumentUsed() {
		return instrumentUsed;
	}

	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}

	public int getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}

	public int getNonBusinessClassSeats() {
		return nonBusinessClassSeats;
	}

	public void setNonBusinessClassSeats(int nonBusinessClassSeats) {
		this.nonBusinessClassSeats = nonBusinessClassSeats;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getNumberOfRows() {
		return numberOfRows;
	}

	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}
}
