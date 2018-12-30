package me.learn.designPattern.second_composite;

/**
 * 表示文件的类，是目录子类
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/19 19:46
 */
public class File extends Entry{

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
