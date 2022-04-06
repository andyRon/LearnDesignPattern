package com.andyron.c10;

/**
 * 三相插孔接口
 */
public interface TriplePin {
    /**
     *
     * @param l live 火线
     * @param n null 零线
     * @param e earth 地线
     */
    public void electrify(int l, int n, int e);
}
