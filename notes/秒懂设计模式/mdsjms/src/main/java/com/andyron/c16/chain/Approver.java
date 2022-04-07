package com.andyron.c16.chain;

/**
 * 审批人
 */
public abstract class Approver {

    /**
     * 抽象出审批人的姓名
     */
    protected String name;
    /**
     * 下一位审批人，更高级别领导
     */
    protected Approver nextApprover;

    public Approver(String name) {
        this.name = name;
    }

    protected Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        // 返回下一位审批人，使其支持链式编程
        return this.nextApprover;
    }

    public abstract void approve(int amount);
}
