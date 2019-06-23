package com.xbb.design.sourcedesign.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 异常处理类
 *
 * @version 1.0.0
 * @author BillXiang
 */
public class ExceptionUtil {

    /**
     * 打印异常堆栈
     *
     * @param e 异常
     * @param isMix 是否对异常信息进行脱敏化处理
     * @return 异常堆栈信息
     */
    public static String exceptionTrace(Throwable e, boolean isMix) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Occur exception: ")
                .append(e.getClass().getName())
                .append(": ")
                .append(mixMessage(e.getMessage(), isMix))
                .append("\n");
        exceptionTrace(strBuilder, e);
        return strBuilder.toString();
    }

    private static String exceptionTrace(StringBuilder builder, Throwable e) {
        StackTraceElement[] traces = e.getStackTrace();
        for (StackTraceElement trace : traces) {
            builder.append("\tat ")
                    .append(trace.toString())
                    .append("\n");
        }
        if (null != e.getCause()) {
            builder.append("Caused by: ")
                    .append(exceptionTrace(builder, e.getCause()));
        }
        return builder.toString();
    }

    private static String mixMessage(String message, boolean isMix) {
        if (StringUtils.isBlank(message)) {
            return "";
        }
        if (!isMix) {
            return message;
        }
        char[] messages = message.toCharArray();
        for (int i = 0; i < messages.length; i++) {
            if (i % 3 == 0) {
                messages[i] = '*';
            }
        }
        return new String(messages);
    }

}
