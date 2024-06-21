package com.trek.starshipservice.repository;

import com.trek.starshipservice.model.Starship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarshipRepository extends JpaRepository<Starship, Long> {
}
