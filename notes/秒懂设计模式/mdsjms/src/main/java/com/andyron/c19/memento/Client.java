package com.andyron.c19.memento;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("《AI的觉醒》"));

        editor.append("第一章 混沌初开");

        editor.append("\n 正文2000字....");

        editor.append("\n 第二章 荒漠");

        editor.delete();

        editor.undo();

    }
}
