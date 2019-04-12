package com.stellar.system;

import com.stellar.system.entity.NaturalSatellite;
import com.stellar.system.entity.Planet;
import com.stellar.system.entity.Star;
import com.stellar.system.entity.StarSystem;
import com.stellar.system.repository.NaturalSatellitesRepository;
import com.stellar.system.repository.PlanetsRepository;
import com.stellar.system.repository.StarSystemRepository;
import com.stellar.system.service.NaturalSatelliteService;
import com.stellar.system.service.StarSystemService;
import com.stellar.system.ui.ConsoleUI;

public class ConsoleApplication {

    public static void main(String[] args) {

        Planet earth=new Planet("Earth");
        NaturalSatellite moon=new NaturalSatellite("Moon");

        NaturalSatellitesRepository earthNaturalSatellitesRepository = new NaturalSatellitesRepository();
        earthNaturalSatellitesRepository.addNaturalSatellite(moon);
        earth.setNaturalSatellites(earthNaturalSatellitesRepository.getNaturalSatellites());

        Planet mars = new Planet("Mars");
        NaturalSatellite phobos = new NaturalSatellite("Phobos");
        NaturalSatellite deimos = new NaturalSatellite("Deimos");

        NaturalSatellitesRepository marsNaturalSatellitesRepository = new NaturalSatellitesRepository();
        marsNaturalSatellitesRepository.addNaturalSatellite(phobos);
        marsNaturalSatellitesRepository.addNaturalSatellite(deimos);
        mars.setNaturalSatellites(marsNaturalSatellitesRepository.getNaturalSatellites());

        PlanetsRepository planetsRepository = new PlanetsRepository();
        planetsRepository.addPlanet(earth);
        planetsRepository.addPlanet(mars);

        Star sun = new Star("Sun");

        StarSystem solarSystem = new StarSystem("Solar system", sun, planetsRepository.getPlanets());
        StarSystemRepository starSystemRepository = new StarSystemRepository();
        starSystemRepository.addStarSystem(solarSystem);

        StarSystemService starSystemService=new StarSystemService(starSystemRepository);

        ConsoleUI consoleUI = new ConsoleUI(starSystemService);
        consoleUI.showTheStarNameOfTheStarSystem("Solar system");
        consoleUI.showPlanetsQuantityInTheStarSystem("Solar system");


        NaturalSatelliteService moonService=new NaturalSatelliteService(moon,starSystemRepository);
        ConsoleUI moonConsoleUI=new ConsoleUI(moonService);
        moonConsoleUI.move();

    }
}
