package com.stellar.system.repository;

import com.stellar.system.entity.Planet;

import java.util.HashSet;
import java.util.Set;

public class PlanetsRepository {

    private Set<Planet> planets=new HashSet<>();

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public Set<Planet> getPlanets() {
        return planets;
    }
}
