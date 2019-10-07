package com.mainacad.abs;

public abstract class AbstractShape implements Shape{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
