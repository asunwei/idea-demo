package me.learn.designPattern.third_template;

/**
 * 抽象父类
 *
 * 定义处理流程
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/18 20:17
 */
public abstract class AbstractDisplay {

    /**
     * 交给子类去实现
     */
    public abstract void open();

    /**
     * 交给子类去实现
     */
    public abstract void print();

    /**
     * 交给子类去实现
     */
    public abstract void close();

    /**
     * final方法，本类实现的方法，具体操作流程
     */
    public final void display(){
        open();
        for(int i=0; i<5; i++){
            print();
        }
        close();
    }
}
