package com.andyron.c14.pm;

import java.util.Random;

/**
 * 人力资源管理系统项目类
 */
public class HRProject extends PM{

    private Random rnd = new Random();

    @Override
    public String analyze() {
        System.out.println("分析师：需求分析...");
        return "人力资源管理系统需求";
    }

    @Override
    public String design(String project) {
        System.out.println("架构师：程序设计...");
        return "设计(" + project + ")";
    }

    @Override
    public String develop(String project) {
        // 修复bug
        if (project.contains("bug")) {
            System.out.println("开发：修复bug...");
            project = project.replace("bug", "");
            project = "修复(" + project + ")";
            // 可能会引起另一个bug
            if (rnd.nextBoolean()) {
                project += "bug";
            }
            return project;
        }
        // 开发系统功能
        System.out.println("开发：写代码...");
        if (rnd.nextBoolean()) {
            project += "bug";
        }
         return "开发(" + project + ")";
    }

    @Override
    public boolean test(String project) {
        if (project.contains("bug")) {
            System.out.println("测试：发现bug...");
            return false;
        }
        System.out.println("测试：用例通过...");
        return true;
    }

    @Override
    public void release(String code) {
        System.out.println("管理员：上线发布...");
        System.out.println("===============最终产品=============");
        System.out.println(code);
        System.out.println("===================================");
    }
}
