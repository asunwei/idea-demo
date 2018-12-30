package me.learn.designPattern.first_prototype;

/**
 *
 * 具体的实现类
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/17 21:03
 */
public class MessageBox implements Product {

    /**
     * 该字段保存了像装饰方框那样的环绕字符
     */
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    /**
     * 该方法会使用decochar字段保存的字符用字符框显示，即具体如何使用
     *
     * @param s
     */
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i = 0; i< length + 4; i++){
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar + " " + s + " " +decochar);
        for (int i = 0; i < length + 4; i++){
            System.out.print(decochar);
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
