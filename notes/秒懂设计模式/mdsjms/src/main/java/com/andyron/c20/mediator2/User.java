package com.andyron.c20.mediator2;

import java.util.Objects;

public class User {

    private String name;

    protected ChatRoom chatRoom;

    protected User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void login(ChatRoom chatRoom) {
        chatRoom.register(this);
        this.chatRoom = chatRoom;
    }

    protected void logout() {
        chatRoom.deregister(this);
        this.chatRoom = null;
    }

    protected void talk(User to, String msg) {
        if (Objects.isNull(chatRoom)) {
            System.out.println("【" + name + "的对话框】" + "你还没有登录");
            return;
        }
        chatRoom.sendMsg(this, to, msg);
    }

    public void listen(User from, User to, String msg) {
        System.out.print("【" + this.getName() + "的对话框】");
        System.out.println(chatRoom.processMsg(from, to, msg));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name);
    }


}
