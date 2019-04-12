package com.stellar.system.service;

import com.stellar.system.entity.Planet;
import com.stellar.system.entity.StarSystem;
import com.stellar.system.repository.StarSystemRepository;

public class StarSystemService {

    private StarSystemRepository starSystemRepository;

    public StarSystemService(StarSystemRepository starSystemRepository) {
        this.starSystemRepository = starSystemRepository;
    }

    public int planetsQuantityInTheStarSystem(String starSystemName) {
        return starSystemRepository.findPlanetsInTheSystem(starSystemName).size();
    }

    public String findTheStarNameOfTheStarSystem(String starSystemName) {
        return starSystemRepository.findTheStarNameOfTheStarSystem(starSystemName);
    }

    public String findTheStarNameOfTheStarSystem(StarSystem starSystem) {
        return starSystemRepository.findTheStarNameOfTheStarSystem(starSystem.getName());
    }

    public void addPlanetToTheStarSystem(String starSystemName, Planet newPlanet) {
        starSystemRepository.addPlanetToTheStarSystem(starSystemName, newPlanet);
    }
}
