package com.stellar.system.entity;

import java.util.Set;

public class Star extends StarSystemElem {

    private Set<NaturalSatellite> naturalSatellites;
    private Set<Planet> planets;


    public Star(String name, Set<NaturalSatellite> naturalSatellites) {
        super(name);
        this.naturalSatellites = naturalSatellites;
    }

    public Star(String name) {
        super(name);
    }

    public Star(String name, Set<NaturalSatellite> naturalSatellites, Set<Planet> planets) {
        super(name);
        this.naturalSatellites = naturalSatellites;
        this.planets = planets;
    }

    public Set<NaturalSatellite> getNaturalSatellites() {
        return naturalSatellites;
    }

    public Set<Planet> getPlanets() {
        return planets;
    }

}
