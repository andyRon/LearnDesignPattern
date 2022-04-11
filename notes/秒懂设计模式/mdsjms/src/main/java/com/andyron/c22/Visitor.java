package com.andyron.c22;

/**
 * 访问者接口
 */
public interface Visitor {

    public void visit(Candy candy);

    public void visit(Wine wine);

    public void visit(Fruit fruit);
}
