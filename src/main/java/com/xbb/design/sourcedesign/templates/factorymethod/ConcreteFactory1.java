package com.xbb.design.sourcedesign.templates.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体工厂类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class ConcreteFactory1 extends AbstractFactory {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteFactory1.class);

    @Override
    public Product newProduct() {
        LOG.info("create ConcreteProduct1 factory.");
        return new ConcreteProduct1();
    }
}
