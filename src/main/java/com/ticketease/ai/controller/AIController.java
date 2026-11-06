package com.ticketease.ai.controller;

import com.ticketease.ai.service.TripPlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/ai")
@RequiredArgsConstructor
public class AIController {
    private final TripPlannerService tripPlannerService;

    @PostMapping("/plan-trip")
    public Map<String, Object> planTrip(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        String plan = tripPlannerService.plan(prompt);
        return Map.of(
            "itinerary", plan,
            "language", "en",
            "estimatedCost", 40000
        );
    }

    @PostMapping("/chat")
    public Map<String, String> chat(@RequestBody Map<String, String> request) {
        String message = request.get("message");
        return Map.of("response", "AI response to: " + message);
    }
}
