package com.andyron.c18;

public class Green implements State {
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("Error!!!已是绿灯无须切换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("OK...黄灯亮起5秒");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("Error!!!绿灯不能切换为红灯");
    }
}
