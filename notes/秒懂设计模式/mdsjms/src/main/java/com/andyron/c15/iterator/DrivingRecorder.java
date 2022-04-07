package com.andyron.c15.iterator;

import java.util.Iterator;

public class DrivingRecorder implements Iterable<String> {

    private int index = -1;
    private String[] records = new String[10];

    public void append(String record) {
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = record;
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String > {
        int cursor = index;
        int loopCount = 0;

        @Override
        public String next() {
            int i = cursor;
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }
    }
}
