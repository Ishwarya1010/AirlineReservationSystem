package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "PASSENGER_DETAILS")
public class PassengerDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passenger_id;
	private String title;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String country;
	private String state;
	private String zip;
	private String email;
	private String primaryPhone;
	private String secondaryPhone;

	public PassengerDetailsEntity() {

	}

	public PassengerDetailsEntity(String title, String firstName, String lastName, String gender, String dob,
			String addressLine1, String addressLine2, String city, String country, String state, String zip,
			String email, String primaryPhone, String secondaryPhone) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.primaryPhone = primaryPhone;
		this.secondaryPhone = secondaryPhone;
	}

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

}
