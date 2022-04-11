package com.andyron.c20.mediator;

public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom("设计模式");

        User user3 = new User("张三");
        User user4 = new User("李四");
        User user5 = new User("王五");

        user3.login(chatRoom);
        user4.login(chatRoom);

        user3.talk("你好，李四，就你一个人吗？");

        user4.talk("是啊，三哥");

        user5.login(chatRoom);

        user3.talk("瞧，老五来了。");
    }
}
