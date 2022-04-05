package com.andyron.c06;

/**
 * 施工方接口
 */
public interface Builder {

    public void buildBasement();

    public void buildWall();

    public void buildRoof();

    public Building getBuilding();
}
