package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class FlightEntity {
	private String originLocationCode;
	private String destinationLocationCode;
	private String departureDate;
	private String returnDate;
	private int no_of_persons;
	private String travelClass;
	private String oneWay;

	public FlightEntity() {

	}

	public FlightEntity(String originLocationCode, String destinationLocationCode, String departureDate,
			String returnDate, int no_of_persons, String travelClass, String oneWay) {
		super();
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.no_of_persons = no_of_persons;
		this.travelClass = travelClass;
		this.oneWay = oneWay;

	}

	public String getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public int getNo_of_persons() {
		return no_of_persons;
	}

	public void setNo_of_persons(int no_of_persons) {
		this.no_of_persons = no_of_persons;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public String isOneWay() {
		return oneWay;
	}

	public void setOneWay(String oneWay) {
		this.oneWay = oneWay;
	}

}
