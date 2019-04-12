package com.stellar.system.repository;

import com.stellar.system.entity.NaturalSatellite;
import com.stellar.system.entity.Planet;
import com.stellar.system.entity.Star;
import com.stellar.system.entity.StarSystem;

import java.util.HashSet;
import java.util.Set;

public class StarSystemRepository {

    private Set<StarSystem> starSystems=new HashSet<>();

    public StarSystemRepository() {

    }

    public void addStarSystem(StarSystem starSystem) {
        starSystems.add(starSystem);
    }

    public Set<Planet> findPlanetsInTheSystem(String starSystemName) {
        for (StarSystem starSystem : starSystems) {
            if (starSystem.getName().equalsIgnoreCase(starSystemName)) {
                return starSystem.getPlanets();
            }
        }
        return null;
    }

    public String findTheStarNameOfTheStarSystem(String starSystemName) {
        for (StarSystem starSystem : starSystems) {
            if (starSystem.getName().equalsIgnoreCase(starSystemName)) {
                return starSystem.getStar().getName();
            }
        }
        return null;
    }

    public void addPlanetToTheStarSystem(String starSystemName, Planet newPlanet) {
        for (StarSystem starSystem : starSystems) {
            if (starSystem.getName().equalsIgnoreCase(starSystemName)) {
                starSystem.getPlanets().add(newPlanet);
            }
        }
    }

    public Star findStarOfTheSatellite(NaturalSatellite naturalSatellite) {
        for (StarSystem starSystem : starSystems) {
            if (starSystem.getStar().getNaturalSatellites().contains(naturalSatellite)) {
                return starSystem.getStar();
            }

        }
        return null;
    }

    public Planet findPlanetOfTheSatellite(NaturalSatellite naturalSatellite) {
        for (StarSystem starSystem : starSystems) {
            for (Planet planet : starSystem.getPlanets()) {
                if (planet.getNaturalSatellites().contains(naturalSatellite)) {
                    return planet;
                }
            }
        }
        return null;
    }
}
