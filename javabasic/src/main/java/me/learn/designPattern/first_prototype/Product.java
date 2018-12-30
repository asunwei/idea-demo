package me.learn.designPattern.first_prototype;

/**
 *
 * 具有复制功能的接口
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/17 20:43
 */
public interface Product  extends Cloneable{

    /**
     * 具体实现类的使用方法
     *
     * @param s
     */
    abstract void use(String s);

    /**
     * 用于复制实例的方法
     *
     * @return
     */
    abstract  Product createClone();
}
