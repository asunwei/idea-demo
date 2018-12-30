package me.learn.designPattern.third_template;

/**
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/18 20:32
 */
public class StringDisplay extends AbstractDisplay{

    /**
     * 需要显示的字符串
     */
    private String string;

    /**
     * 以字节为单位计算出字符串的长度
     */
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 显示字符串"+------------+"
     */
    public void open() {
        printSomething();
    }

    /**
     * 给保存测字符串前后加上"|"
     */
    public void print() {
        System.out.println("|" + string + "|");
    }

    /**
     * 显示字符串"+------------+"
     */
    public void close() {
        printSomething();
    }

    private void printSomething(){
        System.out.print("+");
        for(int i=0; i<width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
