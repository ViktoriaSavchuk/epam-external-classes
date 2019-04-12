package com.stellar.system.service;

import com.stellar.system.entity.Planet;

public class PlanetService implements StarSystemElemsService {

    private Planet planet;

    public PlanetService(Planet planet) {
        this.planet = planet;
    }

    @Override
    public String move() {
        return "The planet "+planet.getName()+" rotates in orbit and around its axis";
    }
}
