package com.andyron.c18;

/**
 * 状态接口
 */
public interface State {

    /**
     * 切换为绿灯状态
     */
    void switchToGreen(TrafficLight trafficLight);

    /**
     * 切换为黄灯状态
     */
    void switchToYellow(TrafficLight trafficLight);

    /**
     * 切换为红灯状态
     */
    void switchToRed(TrafficLight trafficLight);
}
