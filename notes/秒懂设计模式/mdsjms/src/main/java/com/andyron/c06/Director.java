package com.andyron.c06;

/**
 * 工程总监
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct() {
        System.out.println("=====工程项目启动=====");

        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();

        System.out.println("=====工程项目竣工=====");

        return builder.getBuilding();
    }
}
