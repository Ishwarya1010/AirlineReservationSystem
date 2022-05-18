package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.BookingFlightEntity;
import com.example.demo.entity.PassengerDetailsEntity;
import com.example.demo.repository.BookedFlightRepository;

@Service
public class BookingDetailsService {
	@Autowired
	private BookedFlightRepository flightRepository;

	public void saveBookedFlight(BookingFlightEntity flight) {
		flightRepository.save(flight);
	}

	public List<PassengerDetailsEntity> findDetails(int booking_id) {
		return flightRepository.findPassengerDetails(booking_id);
	}

	public void deleteBooking(int booking_id) {
		flightRepository.deleteById(booking_id);
	}

	public BookingFlightEntity findById(int bid) {

		return flightRepository.getById(bid);
	}

}
