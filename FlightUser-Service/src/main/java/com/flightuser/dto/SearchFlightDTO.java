package com.flightuser.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SearchFlightDTO {
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private String date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private String returnDate;
	private String fromPlace;
	private String toPlace;
	private String roundTrip;
	private String oneWayTrip;
	public SearchFlightDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchFlightDTO(String date, String fromPlace, String toPlace, String roundTrip, String oneWayTrip,
			String returnDate) {
		super();
		this.date = date;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.roundTrip = roundTrip;
		this.oneWayTrip = oneWayTrip;
		this.returnDate=returnDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String isRoundTrip() {
		return roundTrip;
	}
	public void setRoundTrip(String roundTrip) {
		this.roundTrip = roundTrip;
	}
	public String isOneWayTrip() {
		return oneWayTrip;
	}
	public void setOneWayTrip(String oneWayTrip) {
		this.oneWayTrip = oneWayTrip;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getRoundTrip() {
		return roundTrip;
	}
	public String getOneWayTrip() {
		return oneWayTrip;
	}
	
	
	
	
}
