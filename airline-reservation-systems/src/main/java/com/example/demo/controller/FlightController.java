package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.FlightDetailsEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.service.FlightsService;
import com.google.gson.Gson;

@Controller
public class FlightController {
	@Autowired
	FlightsService flightsService;

	@RequestMapping("/findFlights")
	public String findFlights() {
		return "findFlights";
	}

	@RequestMapping("/getFlights")
	public ModelAndView getFlightsService(FlightEntity flightEntity, HttpSession session) {
		session.setAttribute("no_of_passengers", flightEntity.getNo_of_persons());
		ModelAndView mv = new ModelAndView("selectFlight");
		String responseJson = flightsService.scheduledRequest(flightEntity);
		FlightDetailsEntity flightDetails = new Gson().fromJson(responseJson, FlightDetailsEntity.class);	
		mv.addObject("flights", flightDetails);
		return mv;
	}
}
