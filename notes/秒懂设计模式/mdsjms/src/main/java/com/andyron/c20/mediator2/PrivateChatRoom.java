package com.andyron.c20.mediator2;

/**
 * 私密聊天室类
 */
public class PrivateChatRoom extends ChatRoom {

    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    protected synchronized void register(User user) {
        // 聊天室最多容纳2人
        if (users.size() == 2) {
            System.out.println("系统消息：聊天室已满");
            return;
        }
        super.register(user);
        System.out.print("系统消息：欢迎【");
        System.out.print(user.getName());
        System.out.println("】加入2人聊天室【" + name + "】");
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.println("系统消息：" + user.getName() + "离开聊天室。");
    }

    @Override
    public void sendMsg(User from, User to, String msg) {
        users.forEach(user -> user.listen(from, null, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        return from.getName() + "说： " + msg;
    }
}
