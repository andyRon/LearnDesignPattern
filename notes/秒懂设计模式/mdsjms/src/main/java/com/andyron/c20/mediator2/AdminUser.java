package com.andyron.c20.mediator2;

/**
 * 超级用户类
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
    }

    /**
     * 踢出某个用户
     */
    public void kick(User user) {
        user.logout();
    }
}
