package me.learn.designPattern.second_composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 表示文件夹的类，也是Entry子类
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/19 20:06
 */
public class Directory extends Entry {

    /**
     * 文件夹的名字
     */
    private String name;

    /**
     * 文件夹中目录条数的集合
     */
    private List directories = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = directories.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            size  += entry.getSize();
        }
        return size;
    }

    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        Iterator it = directories.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry){
        directories.add(entry);
        return this;
    }
}
