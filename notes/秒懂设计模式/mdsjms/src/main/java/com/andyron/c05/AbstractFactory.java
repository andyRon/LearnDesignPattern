package com.andyron.c05;

public interface AbstractFactory {
    /**
     * 初级兵种制造标准
     */
    LowClassUnit createLowClass();

    /**
     * 中级兵种制造标准
     */
    MidClassUnit createMidClass();

    /**
     * 高级兵种制造标准
     */
    HighClassUnit createHighClass();
}
