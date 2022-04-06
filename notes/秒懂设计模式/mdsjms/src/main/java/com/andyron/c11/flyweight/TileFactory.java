package com.andyron.c11.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 图件工厂类
 */
public class TileFactory {
    /**
     * 图库
     */
    private Map<String, Drawable> images;

    public TileFactory() {
        images = new HashMap<String, Drawable>();
    }

    public Drawable getDrawable(String image) {
        // 缓存池里如果没有图件，就实例化并放入缓存池
        if (!images.containsKey(image)) {
            switch (image) {
                case "河流":
                    images.put(image, new River());
                    break;
                case "草地":
                    images.put(image, new Grass());
                    break;
                case "道路":
                    images.put(image, new Road());
                    break;
                case "房屋":
                    images.put(image, new House());
                    break;
            }
        }
        // 缓存池里有图件，直接获取
        return images.get(image);
    }

}
