package com.github.trang.copiers.inter;

/**
 * 拷贝数组底层接口
 *
 * @author trang
 */
public interface ArrayCopier<F, T> {

    /**
     * 将 source 对象数组拷贝到新数组
     *
     * @param sourceArray 源对象数组
     * @param targetArray 目标对象数组
     */
    void map(F[] sourceArray, T[] targetArray);

}