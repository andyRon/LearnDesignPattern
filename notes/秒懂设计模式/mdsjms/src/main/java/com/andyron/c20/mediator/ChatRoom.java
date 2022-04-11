package com.andyron.c20.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室类
 */
public class ChatRoom {

    /**
     * 聊天室命名
     */
    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }

    /**
     * 加入聊天室的用户们
     */
    List<User> users = new ArrayList<>();

    public void register(User user) {
        this.users.add(user);
        System.out.print("系统信息：欢迎【");
        System.out.print(user.getName());
        System.out.println("】加入聊天室【" + this.name + "】");
    }

    public void sendMsg(User fromWhom, String msg) {
        // 循环users，将消息发送给所有用户
        users.stream().forEach(toWhom -> toWhom.listen(fromWhom, msg));
    }
}
