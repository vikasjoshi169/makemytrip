package com.example.makemytrip;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FlightController {

    @GetMapping("/flight")
    public String getData() {
        return "Please book Flight from MMT, 25% discount in North India";
    }

    @PutMapping("/flight/{flightId}")
    public String updateFlight(@PathVariable String flightId, @RequestParam String status) {
        return "Hotel with ID: " + flightId + " is now " + status;
    }
}