package com.trek.starshipservice.controller;

import com.trek.starshipservice.model.Starship;
import com.trek.starshipservice.repository.StarshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/starships")
public class StarshipController {
    @Autowired
    private StarshipRepository starshipRepository;

    @GetMapping
    public List<Starship> getAllStarships() {
        return starshipRepository.findAll();
    }

    @PostMapping
    public Starship createStarship(@RequestBody Starship starship) {
        return starshipRepository.save(starship);
    }
}
