package com.example.demo.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.PassengerDetailsEntity;
import com.example.demo.repository.PassengerDetailsRepository;

@Service
public class PassengerDetailsService {
	@Autowired
	PassengerDetailsRepository passengerDetailsRepository;

	public Optional<PassengerDetailsEntity> findById(int id) {
		return passengerDetailsRepository.findById(id);
	}

	public void save(PassengerDetailsEntity passengerFromDb) {
		passengerDetailsRepository.save(passengerFromDb);

	}
}
