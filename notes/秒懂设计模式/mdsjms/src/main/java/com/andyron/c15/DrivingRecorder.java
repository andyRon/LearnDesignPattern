package com.andyron.c15;

import com.andyron.c13.bridge.Pen;

/**
 * 行车记录仪类
 */
public class DrivingRecorder {
    /**
     * 当前记录位置
     */
    private int index = -1;
    /**
     * 假设只能记录10条视频
     */
    private String[] records = new String[10];

    public void append(String record) {
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = record;
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + records[i]);
        }
    }

    /**
     * 按顺序从新到旧显示10条记录
     */
    public void displayByOrder() {
        for (int i = index, loopCount = 0;
             loopCount < 10;
             i = i == 0 ? i = 9 : i - 1, loopCount++) {
            System.out.println(records[i]);

        }
    }
}
