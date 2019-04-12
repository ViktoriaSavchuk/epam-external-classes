package com.stellar.system.ui;

import com.stellar.system.entity.StarSystem;
import com.stellar.system.service.NaturalSatelliteService;
import com.stellar.system.service.StarSystemService;

public class ConsoleUI {

    private StarSystemService starSystemService;
    private NaturalSatelliteService naturalSatelliteService;

    public ConsoleUI(NaturalSatelliteService naturalSatelliteService) {
        this.naturalSatelliteService = naturalSatelliteService;
    }

    public ConsoleUI(StarSystemService starSystemService) {
        this.starSystemService = starSystemService;
    }

    public void showPlanetsQuantityInTheStarSystem(String starSystemName) {
        System.out.println(starSystemService.planetsQuantityInTheStarSystem(starSystemName) +
                " planets are in the " + starSystemName);
    }

    public void showTheStarNameOfTheStarSystem(String starSystemName) {
        System.out.println(starSystemService.findTheStarNameOfTheStarSystem(starSystemName) +
                " is the star of the " + starSystemName);
    }

    public void showTheStarNameOfTheStarSystem(StarSystem starSystem) {
        System.out.println(starSystemService.findTheStarNameOfTheStarSystem(starSystem.getName()) +
                " is the star of the " + starSystem.getName());
    }

    public void move() {
        System.out.println(naturalSatelliteService.move());
    }
}
