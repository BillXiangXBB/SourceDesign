package com.xbb.design.sourcedesign.utils;

import com.xbb.design.sourcedesign.exception.ConfigException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置工具类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class ConfigUtil {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigUtil.class);

    private static final String CONFIG_FILE = "config.properties";

    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream in = ConfigUtil.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            properties.load(in);
        } catch (IOException e) {
            LOG.error(ExceptionUtil.exceptionTrace(e, true));
        }
    }

    public static String getStringProperty(String name) throws ConfigException {
        try {
            return (String) properties.get(name);
        } catch (NullPointerException e) {
            throw new ConfigException(String.format("The config '%s' does not exist.", name));
        } catch (ClassCastException e) {
            throw new ConfigException(String.format("The config '%s' is not String.", name));
        }
    }

    public static int getIntegerProperty(String name) throws ConfigException {
        try {
            return (int) properties.get(name);
        } catch (NullPointerException e) {
            throw new ConfigException(String.format("The config '%s' does not exist.", name));
        } catch (ClassCastException e) {
            throw new ConfigException(String.format("The config '%s' is not Integer.", name));
        }

    }

}
