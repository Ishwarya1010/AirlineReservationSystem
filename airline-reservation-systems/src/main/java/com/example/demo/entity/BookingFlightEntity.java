package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="BOOKING_DETAILS")
public class BookingFlightEntity {
@Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
@Column(name="booking_id")
private int booking_id;
private String carrierCode;
private int no_of_stops;
private String duration;
private int grandTotal;
@OneToMany(cascade = CascadeType.ALL,orphanRemoval=true)
@JoinColumn(name="Bookingfid",referencedColumnName = "booking_id")
public Set<PassengerDetailsEntity> passengerDetails= new HashSet<>();

public BookingFlightEntity(int booking_id, String carrierCode, int no_of_stops, String duration, int grandTotal) {
	super();
	this.booking_id = booking_id;
	this.carrierCode = carrierCode;
	this.no_of_stops = no_of_stops;
	this.duration = duration;
	this.grandTotal = grandTotal;
	
}

public BookingFlightEntity() {
	
}

public int getBooking_id() {
	return booking_id;
}
public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}
public String getCarrierCode() {
	return carrierCode;
}
public void setCarrierCode(String carrierCode) {
	this.carrierCode = carrierCode;
}
public int getNo_of_stops() {
	return no_of_stops;
}
public void setNo_of_stops(int no_of_stops) {
	this.no_of_stops = no_of_stops;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public int getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(int grandTotal) {
	this.grandTotal = grandTotal;
}
public Set<PassengerDetailsEntity> getPassengerDetails() {
	return passengerDetails;
}

public void setPassengerDetails(Set<PassengerDetailsEntity> passengerDetails) {
	this.passengerDetails = passengerDetails;
}




}
