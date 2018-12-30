package me.learn.designPattern.first_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用Product类来复制实例
 *
 * Manager类和Product接口完全没有出现具体实现类名称，这就意味着可以独立修改
 * Product和Manager,这就是解耦何，非常完美！！！
 *
 * @author: created by sunwei
 * @version: v1.0
 * @date:2018/12/17 20:45
 */
public class Manager {

    private Map<String, Product> showCase = new HashMap();

    /**
     * 用来注册Product类型到showCase中， 具体注册为Product的实现，
     * 这里会使用Product的use和createClone放
     *
     * @param name
     * @param product
     */
    public void register(String name, Product product){
        showCase.put(name, product);
    }

    /**
     * 用来创建一个Product实例
     *
     * @param prototyeName
     * @return
     */
    public Product create(String prototyeName){
        Product p = showCase.get(prototyeName);
        return p.createClone();
    }
}
