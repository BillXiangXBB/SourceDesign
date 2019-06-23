package com.xbb.design.sourcedesign.templates.factorymethod;

import com.xbb.design.sourcedesign.exception.ConfigException;
import com.xbb.design.sourcedesign.utils.ConfigUtil;
import com.xbb.design.sourcedesign.utils.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 客户端调用方式
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class FactoryMethodClient {

    private static final Logger LOG = LoggerFactory.getLogger(FactoryMethodClient.class);

    private static final String CLASS_NAME_CONFIG = "factorymethod.name";

    public static void main(String[] args) {
        try {
            String className = ConfigUtil.getStringProperty(CLASS_NAME_CONFIG);
            AbstractFactory factory = (AbstractFactory) Class.forName(className).newInstance();
            factory.newProduct().show();
        } catch (ConfigException | ClassNotFoundException
                | IllegalAccessException | InstantiationException e) {
            LOG.error(ExceptionUtil.exceptionTrace(e, false));
        }
    }

}
