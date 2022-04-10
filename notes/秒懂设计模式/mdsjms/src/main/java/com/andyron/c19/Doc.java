package com.andyron.c19;

/**
 * 文档类
 */
public class Doc {
    private String title;
    private String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Doc(String title) {
        this.title = title;
        this.body = "";
    }
}
