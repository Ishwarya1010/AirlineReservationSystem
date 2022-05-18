package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.entity.BookingFlightEntity;
import com.example.demo.entity.PassengerDetailsEntity;

public interface BookedFlightRepository extends JpaRepository<BookingFlightEntity, Integer> {
	@Query("SELECT passenger FROM BookingFlightEntity booking " + "JOIN " + "booking.passengerDetails passenger "
			+ "WHERE " + "booking.booking_id=:booking_id")
	List<PassengerDetailsEntity> findPassengerDetails(@Param("booking_id") int booking_id);
}