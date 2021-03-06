package com.flightuser.shared;

import java.util.Date;
import java.util.List;

import com.flightuser.dto.PassengerDTO;
import com.flightuser.dto.TypeOfMeal;

public class UserDTO {

	private String pNR_Number;
	private int flightId;
	private String name;
	private String emailId;
	private Date journeyDate;
	private Date returnJourneyDate;
	private String source;
	private String destination;
	private String gender;
	private int age;
	private String seatNo;
	private List<PassengerDTO> passengers;
	private int noOfPassenger;
	private String meal;
	private TypeOfMeal typeOfMeal;
	
	public String getPNR_Number() {
		return pNR_Number;
	}
	public void setPNR_Number(String pNR_Number) {
		this.pNR_Number = pNR_Number;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public String isMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public TypeOfMeal getTypeOfMeal() {
		return typeOfMeal;
	}
	public void setTypeOfMeal(TypeOfMeal typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
	}
	public String getpNR_Number() {
		return pNR_Number;
	}
	public void setpNR_Number(String pNR_Number) {
		this.pNR_Number = pNR_Number;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public Date getReturnJourneyDate() {
		return returnJourneyDate;
	}
	public void setReturnJourneyDate(Date returnJourneyDate) {
		this.returnJourneyDate = returnJourneyDate;
	}
	public String getMeal() {
		return meal;
	}
	
	

}


