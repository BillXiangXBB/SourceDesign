package com.xbb.design.sourcedesign.templates.factorymethod;

/**
 * 抽象工厂类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public abstract class AbstractFactory {

    /**
     * 创建一个Product对象
     *
     * @return Product对象
     */
    public abstract Product newProduct();

}
