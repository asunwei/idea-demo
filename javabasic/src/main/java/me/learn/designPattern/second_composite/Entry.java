package me.learn.designPattern.second_composite;

/**
 * 表示目录的抽象类，File和Directory是它的子类
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/19 19:45
 */
public abstract class Entry {

    /**
     * 获取名字
     *
     * @return
     */
    public abstract String getName();

    /**
     * 获取大小
     *
     * @return
     */
    public abstract int getSize();

    /**
     * 加入目录条数
     *
     * @param entry
     * @return
     * @throws Exception
     */
    public Entry add(Entry entry) throws FileTrementException {
        throw new FileTrementException();
    }

    /**
     * 显示目录条目一览
     */
    public void printList(){
        printList("");
    }

    /**
     * 为一览加上前缀并显示一览
     * @param prefix
     */
    protected abstract void printList(String prefix);

    /**
     * 显示代表类的文字
     * @return
     */
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
