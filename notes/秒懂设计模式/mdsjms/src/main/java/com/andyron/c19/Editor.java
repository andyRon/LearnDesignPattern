package com.andyron.c19;

public class Editor {

    private Doc doc;

    public Editor(Doc doc) {
        System.out.println("<<<打开文档" + doc.getTitle());
        this.doc = doc;
        show();
    }

    public void append(String txt) {
        System.out.println("<<<插入操作");
        doc.setBody(doc.getBody() + txt);
        show();
    }

    public void delete() {
        System.out.println("<<<删除操作");
        doc.setBody("");
        show();
    }

    public void save() {
        System.out.println("<<<存盘操作");
    }
    private void show() {
        System.out.println(doc.getBody());
        System.out.println("文档结束>>>\n");
    }
}
