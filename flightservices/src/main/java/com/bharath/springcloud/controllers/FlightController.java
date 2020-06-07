package com.bharath.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.springcloud.model.Flight;
import com.bharath.springcloud.repos.FlightRepository;

@RestController
public class FlightController {

	@Autowired
	FlightRepository repo;

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repo.findAll();

	}

}
