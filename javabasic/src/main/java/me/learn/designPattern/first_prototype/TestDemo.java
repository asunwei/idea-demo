package me.learn.designPattern.first_prototype;

/**
 * 测试类
 *
 * 原型模式 - 根据实例生成新的实例
 * 1.当对象种类繁多，无法将他们整合到一个类中。
 * 2.难以根据类生成实例
 * 3.想解耦框架与生成实例时
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/17 21:34
 */
public class TestDemo {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        Product underLineBox = new UnderLineBox('-');
        Product messageBox = new MessageBox('*');
        manager.register("warningBox", underLineBox);
        manager.register("stringBox", messageBox);

        //生成
        Product p1 = manager.create("warningBox");
        p1.use("HAHAHAAH");

        Product p2 = manager.create("stringBox");
        p2.use("Hello Java");
    }
}
