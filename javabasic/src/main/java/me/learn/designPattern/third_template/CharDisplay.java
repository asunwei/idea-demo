package me.learn.designPattern.third_template;

/**
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/18 20:26
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * 显示字符串"<<"
     */
    public void open() {
        System.out.print("<<");
    }

    /**
     * 显示构造函数接收的1个字符
     */
    public void print() {
        System.out.print(ch);

    }

    /**
     * 显示字符串">>"
     */
    public void close() {
        System.out.println(">>");
    }
}
