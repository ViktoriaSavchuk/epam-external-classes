package com.stellar.system.service;

import com.stellar.system.entity.Star;

public class StarService implements StarSystemElemsService {

    private Star star;

    @Override
    public String move() {
        return star.getName()+"rotates around its axis";
    }


}
