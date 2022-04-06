package com.andyron.c08;

/**
 * 抽象节点类
 */
public abstract class Node {

    protected String name;

    public Node(String name) {
        this.name = name;
    }

    /**
     * 添加下级子节点方法
     */
    protected abstract void add(Node child);

    /**
     *
     * @param space
     */
    protected void tree(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(name);
    }

    /**
     * 无参重载方法
     */
    protected void tree() {
        this.tree(0);
    }
}
