package com.xbb.design.sourcedesign.templates.factorymethod;

/**
 * 具体工厂类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
