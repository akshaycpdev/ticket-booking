package com.ticketease.booking.controller;
import com.ticketease.booking.model.Booking;
import com.ticketease.booking.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingRepository repo;
    @PostMapping public Booking create(@RequestBody Booking b){return repo.save(b);}
    @GetMapping public List<Booking> all(){return repo.findAll();}
}
