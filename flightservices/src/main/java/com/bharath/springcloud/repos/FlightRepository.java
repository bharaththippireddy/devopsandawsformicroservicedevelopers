package com.bharath.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
