package com.andyron.c21.command;

public interface Command {
    /**
     * 执行命令
     */
    void exe();

    /**
     * 反向执行命令
     */
    void unexe();
}
