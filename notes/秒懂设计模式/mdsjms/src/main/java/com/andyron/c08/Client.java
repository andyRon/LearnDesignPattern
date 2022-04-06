package com.andyron.c08;

public class Client {
    public static void main(String[] args) {
        Node driveD = new Folder("D盘");

        Node doc = new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目说明.ppt"));

        driveD.add(doc);

        Node music = new Folder("音乐");

        Node jay = new Folder("周杰伦");
        jay.add(new File("双截棍.mp3"));
        jay.add(new File("菊花台.mp3"));
        jay.add(new File("七里香"));

        Node jacky = new Folder("张学友");
        jacky.add(new File("一千个伤心的理由.mp3"));
        jacky.add(new File("慢慢.mp3"));

        music.add(jay);
        music.add(jacky);

        driveD.add(music);

        driveD.tree();
    }
}
