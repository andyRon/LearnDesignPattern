package com.andyron.c18;

/**
 * 红灯状态
 */
public class Red implements State {
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("Error!!!红灯不能切换绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("OK...黄灯亮起5秒");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("Error!!!已是红灯状态无须切换");
    }
}
