package com.andyron.c14.pm;

/**
 * 瀑布模型项目管理类
 * 项目周期分为5个阶段：需求分析、软件设计、代码开发、质量测试、上线发布
 */
public abstract class PM {

    /**
     * 需求分析
     */
    public abstract String analyze();

    /**
     * 软件设计
     */
    public abstract String design(String project);

    /**
     * 代码开发
     */
    public abstract String develop(String project);

    /**
     * 质量测试
     */
    public abstract boolean test(String project);

    /**
     * 上线发布
     */
    public abstract void release(String project);

    /**
     * 模板方法，在项目启动方法kickoff()中从宏观上制订了整个项目的固定流程
     */
    protected final void kickoff() {
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        } while (!test(designCode)); // 如果测试失败则需修改代码
        release(designCode);
    }
}
