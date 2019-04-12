package com.stellar.system.service;

import com.stellar.system.entity.NaturalSatellite;
import com.stellar.system.entity.StarSystemElem;
import com.stellar.system.repository.NaturalSatellitesRepository;
import com.stellar.system.repository.StarSystemRepository;

public class NaturalSatelliteService implements StarSystemElemsService {

    private NaturalSatellite naturalSatellite;
    private StarSystemRepository starSystemRepository;

    public NaturalSatelliteService(NaturalSatellite naturalSatellite, StarSystemRepository starSystemRepository) {
        this.naturalSatellite= naturalSatellite;
        this.starSystemRepository = starSystemRepository;
    }


    @Override
    public String move() {
        return starSystemRepository.findPlanetOfTheSatellite(naturalSatellite)!=null?
                "Satellite " + naturalSatellite.getName() + " rotates around planet " +
                        starSystemRepository.findPlanetOfTheSatellite(naturalSatellite).getName():
                "Satellite " + naturalSatellite.getName() + " rotates around star " +
                        starSystemRepository.findStarOfTheSatellite(naturalSatellite).getName();
    }
}
