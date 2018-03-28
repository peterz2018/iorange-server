package com.iorange.web.config;

import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.util.Strings;

import java.util.UUID;

/**
 * 基于 log4j2 实现操作线程上下文记录日志
 * <p>
 * 在日志线程中存放 TRACE_LOG_ID, 用来跟踪业务请求的日志信息
 *
 * @author 谢烟客
 * @version 5.0 createTime: 2018/3/27
 */
public class MDC {

    /**
     * 变量名
     */
    private static final String TRACE_LOG_ID = "traceLogId";

    /**
     * 指定值存入变量
     *
     * @param v TRACE_LOG_ID 变量的值
     */
    public static void put(String v) {
        if (Strings.isNotBlank(v)) {
            ThreadContext.put(TRACE_LOG_ID, v);
        }
    }

    /**
     * 生成 UUID 作为 TRADE_LOG_ID 变量的值
     */
    public static void putUUID() {
        ThreadContext.put(TRACE_LOG_ID, UUID.randomUUID().toString());
    }

    /**
     * 获取 TRACE_LOG_ID 变量的值
     *
     * @return TRACE_LOG_ID 变量的值
     */
    public static String get() {
        return ThreadContext.get(TRACE_LOG_ID);
    }
}
