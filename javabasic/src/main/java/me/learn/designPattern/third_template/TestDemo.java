package me.learn.designPattern.third_template;

/**
 * 测试类
 *
 * 模板模式：像在父类中定义处理流程框架，在实现子类中具体处理的模式
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/18 20:09
 */
public class TestDemo {


    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('S');
        charDisplay.display();

        AbstractDisplay stringDisplay = new StringDisplay("Hello World");
        stringDisplay.display();
    }
}
