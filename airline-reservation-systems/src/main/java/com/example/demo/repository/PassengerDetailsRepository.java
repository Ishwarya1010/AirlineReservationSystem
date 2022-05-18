package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.PassengerDetailsEntity;

public interface PassengerDetailsRepository extends JpaRepository<PassengerDetailsEntity, Integer> {
	void save(Optional<PassengerDetailsEntity> passengerFromDb);
}