package com.xbb.design.sourcedesign.templates.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体产品类
 *
 * @author BillXiang
 */
public class ConcreteProduct2 implements Product {

    private static final Logger LOG = LoggerFactory.getLogger(ConcreteProduct2.class);

    @Override
    public void show() {
        LOG.info("ConcreteProduct2 show method.");
    }
}
