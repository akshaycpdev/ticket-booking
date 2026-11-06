package com.ticketease.restaurant.controller;

import com.ticketease.restaurant.model.Restaurant;
import com.ticketease.restaurant.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantRepository restaurantRepository;

    @GetMapping("/search")
    public List<Restaurant> search(@RequestParam String city) {
        return restaurantRepository.findByCity(city);
    }
}
