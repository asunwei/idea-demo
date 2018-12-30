package me.learn.designPattern.first_prototype;

/**
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/17 21:29
 */
public class UnderLineBox implements Product{

    /**
     * 下划线样式的字符
     */
    private char underLine;

    public UnderLineBox(char underLine) {
        this.underLine = underLine;
    }

    /**
     *将字符串用“”括起来，底部有下划线
     * @param s
     */
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i< length; i++){
            System.out.print(underLine);
        }

        System.out.println("");
    }

    /**
     * 用于复制自己，内部调用clone方法式JAVA语言定义的方法
     * @return
     */
    public Product createClone() {
        Product p = null;

        try {
            p = (Product)clone();
        } catch (Exception e){
            e.printStackTrace();
        }

        return p;
    }
}
