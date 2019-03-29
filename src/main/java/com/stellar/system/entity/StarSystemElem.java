package com.stellar.system.entity;

public abstract class StarSystemElem {

    protected String name;

    protected StarSystemElem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
