package com.ticketease.hotel.controller;

import com.ticketease.hotel.model.Hotel;
import com.ticketease.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hotels")
@RequiredArgsConstructor
public class HotelController {
    private final HotelRepository hotelRepository;

    @GetMapping("/search")
    public List<Hotel> search(@RequestParam String city) {
        return hotelRepository.findByCity(city);
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable Long id) {
        return hotelRepository.findById(id).orElse(null);
    }
}
