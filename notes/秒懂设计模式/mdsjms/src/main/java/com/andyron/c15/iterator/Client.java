package com.andyron.c15.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DrivingRecorder dr = new DrivingRecorder();

        for (int i = 0; i < 12; i++) {
            dr.append("视频_" + i);
        }

        List<String > uStorage = new ArrayList<>();

        Iterator<String> it = dr.iterator();

        while (it.hasNext()) {
            String video = it.next();
            System.out.println(video);

            if("视频_10".equals(video) || "视频_8".equals(video)) {
                uStorage.add(video);
            }
        }

        System.out.println("事故证据：" + uStorage);
    }
}
