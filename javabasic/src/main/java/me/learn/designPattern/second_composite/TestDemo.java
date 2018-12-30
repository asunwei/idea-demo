package me.learn.designPattern.second_composite;

/**
 *组合模式：能够使容器和内容具有一致性，创造出递归结构的模式，或者类似树形关系
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/19 19:36
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println("making root entries...");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tempDir = new Directory("tem");
        Directory userDir = new Directory("user");

        rootDir.add(binDir);
        rootDir.add(tempDir);
        rootDir.add(userDir);
        binDir.add(new File("vi", 1000));
        tempDir.add(new File("lex", 3000));
        userDir.add(new File("lex", 3000));
         
        rootDir.printList();

    }
}
