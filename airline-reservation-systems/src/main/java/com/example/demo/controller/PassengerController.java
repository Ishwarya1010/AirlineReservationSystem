package com.example.demo.controller;

import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.BookingFlightEntity;
import com.example.demo.entity.PassengerDetailsEntity;
import com.example.demo.service.BookingDetailsService;
import com.example.demo.service.PassengerDetailsService;

@RestController
public class PassengerController {
	@Autowired
	BookingFlightEntity bookingFlightEntity;
	@Autowired
	PassengerDetailsEntity passengerDetailsEntity;
	@Autowired
	BookingDetailsService detailsService;
	@Autowired
	PassengerDetailsService passengerService;

	@GetMapping("/passengerDetails")
	public ModelAndView passengerDetails() {
		ModelAndView mav = new ModelAndView("passengerDetails");
		return mav;
	}

	@PostMapping("/addBookingFlight")
	public String addBookedFlight(@RequestBody BookingFlightEntity bookedFlight) {
		bookingFlightEntity = bookedFlight;
		return "Flight Details Saved";
	}

	@PostMapping("/addPassengers")
	public ModelAndView addPassengers(PassengerDetailsEntity passenger, HttpSession session) {
		ModelAndView mav = new ModelAndView("passengerDetails");
		ModelAndView mav1 = new ModelAndView("infoPage");
		bookingFlightEntity.getPassengerDetails().add(passenger);

		int no_of_person = (int) session.getAttribute("no_of_passengers");
		if (no_of_person > 1) {

			session.setAttribute("no_of_passengers", no_of_person - 1);

			return mav;
		} else {
			detailsService.saveBookedFlight(bookingFlightEntity);
			session.setAttribute("bid", bookingFlightEntity.getBooking_id());
			return mav1;
		}
	}

	@GetMapping("/viewBooking")
	public ModelAndView viewBooking(@RequestParam("booking_id") int booking_id, HttpSession session) {
		ModelAndView mv = new ModelAndView("viewBooking");
		session.setAttribute("bid", booking_id);
		mv.addObject("bookingdetails", detailsService.findDetails(booking_id));
		return mv;

	}

	@GetMapping("/selectBooking")
	public ModelAndView selectBooking() {
		ModelAndView mav = new ModelAndView("selectBooking");
		return mav;
	}

	@GetMapping("/editPassenger")
	public ModelAndView editPassenger(@RequestParam("pid") int pid, HttpSession session) {
		session.setAttribute("pid", pid);
		ModelAndView mav = new ModelAndView("editPassenger");
		return mav;
	}

	@PostMapping("/updatePassengers")
	@ResponseBody
	public String updatePassengers(PassengerDetailsEntity updatepassenger, HttpSession session) {
		int pid = (int) session.getAttribute("pid");
		Optional<PassengerDetailsEntity> passengerFromDb = passengerService.findById(pid);
		if (passengerFromDb.isPresent())
			passengerDetailsEntity = passengerFromDb.get();
		passengerDetailsEntity.setFirstName(updatepassenger.getFirstName());
		passengerDetailsEntity.setLastName(updatepassenger.getLastName());
		passengerDetailsEntity.setGender(updatepassenger.getGender());
		passengerDetailsEntity.setAddressLine1(updatepassenger.getAddressLine1());
		passengerDetailsEntity.setAddressLine2(updatepassenger.getAddressLine2());
		passengerDetailsEntity.setCity(updatepassenger.getCity());
		passengerDetailsEntity.setState(updatepassenger.getState());
		passengerDetailsEntity.setCountry(updatepassenger.getCountry());
		passengerDetailsEntity.setZip(updatepassenger.getZip());
		passengerDetailsEntity.setEmail(updatepassenger.getEmail());
		passengerDetailsEntity.setPrimaryPhone(updatepassenger.getPrimaryPhone());
		passengerDetailsEntity.setSecondaryPhone(updatepassenger.getSecondaryPhone());
		passengerService.save(passengerDetailsEntity);
		return "Passenger Details Successfully Updated";
	}

	@GetMapping("/deleteBooking")
	@ResponseBody
	public String deleteBooking(HttpSession session) {

		int bid = (int) session.getAttribute("bid");
		detailsService.deleteBooking(bid);
		return "Booking is suceessfully deleted";
	}
}