package com.carrental.controller;

import com.carrental.model.Booking;
import com.carrental.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking createBooking(@RequestHeader("Authorization") String token, @RequestBody Booking booking) {
        return bookingService.createBooking(token, booking);
    }

    @GetMapping("/user")
    public List<Booking> getUserBookings(@RequestHeader("Authorization") String token) {
        return bookingService.getUserBookings(token);
    }

    @GetMapping("/owner")
    public List<Booking> getOwnerBookings(@RequestHeader("Authorization") String token) {
        return bookingService.getOwnerBookings(token);
    }
}
