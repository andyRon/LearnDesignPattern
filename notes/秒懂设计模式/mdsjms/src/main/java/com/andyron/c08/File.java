package com.andyron.c08;

/**
 * 文件类
 */
public class File extends Node{

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        // 其实更好的方式是以抛出异常的形式来确保此处逻辑的正确性
        System.out.println("不能添加子节点。");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}
