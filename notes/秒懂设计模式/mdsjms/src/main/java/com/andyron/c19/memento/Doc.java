package com.andyron.c19.memento;

public class Doc {

    private String title;
    private String body;

    public Doc(String title) {
        this.title = title;
        this.body = "";
    }

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

    public History createHistory() {
        return new History(body);
    }

    /**
     * 恢复历史记录
     */
    public void restoreHistory(History history) {
        this.body = history.getBody();
    }
}
