package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.entity.FlightEntity;

@Service
public class FlightsService {
	String uri = "https://test.api.amadeus.com/v2/shopping/flight-offers?";
	Logger logger = LoggerFactory.getLogger(CommandLineRunner.class);
	@Autowired
	private WebClient webClient;

	@Scheduled(fixedRate = 5000)
	public String scheduledRequest(FlightEntity flightEntity) {
		String responseJson = webClient.get()
				.uri(uri + "originLocationCode=" + flightEntity.getOriginLocationCode() + "&destinationLocationCode="
						+ flightEntity.getDestinationLocationCode() + "&departureDate="
						+ flightEntity.getDepartureDate() + "&adults=" + flightEntity.getNo_of_persons() + "&max=5")
				.retrieve().bodyToMono(String.class).block();
		return responseJson;

	}
}
