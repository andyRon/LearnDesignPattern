package com.andyron.c19.memento;

/**
 * 历史快照类
 */
public class History {
    /**
     * 用于备忘文档内容
     */
    private String body;

    public History(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
