package com.stellar.system.entity;

import java.util.Objects;
import java.util.Set;

public class Planet extends StarSystemElem {

    private Set<NaturalSatellite> naturalSatellites;

    public Planet(String name, Set<NaturalSatellite> naturalSatellites) {
        super(name);
        this.naturalSatellites = naturalSatellites;
    }

    public Planet(String name) {
        super(name);
    }

    public Set<NaturalSatellite> getNaturalSatellites() {
        return naturalSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Objects.equals(naturalSatellites, planet.naturalSatellites);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "naturalSatellites=" + naturalSatellites +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(naturalSatellites);
    }

    public void setNaturalSatellites(Set<NaturalSatellite> naturalSatellites) {
        this.naturalSatellites = naturalSatellites;
    }
}
