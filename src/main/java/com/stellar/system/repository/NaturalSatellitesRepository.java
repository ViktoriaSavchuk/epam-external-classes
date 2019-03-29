package com.stellar.system.repository;

import com.stellar.system.entity.NaturalSatellite;
import com.stellar.system.entity.StarSystem;
import com.stellar.system.entity.StarSystemElem;

import java.util.HashSet;
import java.util.Set;

public class NaturalSatellitesRepository {

    private Set<NaturalSatellite> naturalSatellites=new HashSet<>();

    public void addNaturalSatellite(NaturalSatellite naturalSatellite) {
        naturalSatellites.add(naturalSatellite);
    }

    public Set<NaturalSatellite> getNaturalSatellites() {
        return naturalSatellites;
    }
}
