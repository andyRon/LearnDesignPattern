package com.andyron.c08;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 */
public class Folder extends Node{
    // 文件夹克包含子节点（子文件夹或文件）
    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);
    }

    @Override
    protected void tree(int space) {
        // 调用父类通用的tree方法列出自己的名字
        super.tree(space);

        // 在循环的子节点前，空格数要加1
        space++;
        for (Node node : childrenNodes) {
            node.tree(space);
        }
    }
}
