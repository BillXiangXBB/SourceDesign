package com.xbb.design.sourcedesign.templates.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体产品类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class ConcreteProduct1 implements Product {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteProduct1.class);

    @Override
    public void show() {
        LOG.info("ConcreteProduct1 show method.");
    }
}
