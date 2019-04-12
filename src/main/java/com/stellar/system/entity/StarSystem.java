package com.stellar.system.entity;

import java.util.Set;

public class StarSystem extends StarSystemElem{

    private Star star;
    private Set<Planet> planets;

    public StarSystem(String starSystemName,Star star, Set<Planet> planets) {
        super(starSystemName);
        this.star = star;
        this.planets = planets;
    }

    public Star getStar() {
        return star;
    }

    public Set<Planet> getPlanets() {
        return planets;
    }

}
