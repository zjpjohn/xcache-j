package org.wg.xio.config;

import java.util.concurrent.Executor;

import org.wg.xio.MessageHandler;

/**
 * 支持者
 * @author enychen Oct 13, 2009
 */
public class Supporter {

    /** 是否运行 */
    private volatile boolean running = true;

    /** 配置 */
    private Config           config;

    /** 消息处理器 */
    private MessageHandler   messageHandler;

    /** 多线程执行器 */
    private Executor         executor;

    /**
     * 获取是否运行
     * @return 是否运行
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * 设置是否运行
     * @param running 是否运行
     */
    public void setRunning(boolean running) {
        this.running = running;
    }

    /**
     * 获取配置
     * @return 配置
     */
    public Config getConfig() {
        return config;
    }

    /**
     * 设置配置
     * @param config 配置
     */
    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * 获取消息处理器
     * @return 消息处理器
     */
    public MessageHandler getMessageHandler() {
        return messageHandler;
    }

    /**
     * 设置消息处理器
     * @param messageHandler 消息处理器
     */
    public void setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    /**
     * 获取多线程执行器
     * @return 多线程执行器
     */
    public Executor getExecutor() {
        return executor;
    }

    /**
     * 设置多线程执行器
     * @param executor 多线程执行器
     */
    public void setExecutor(Executor executor) {
        this.executor = executor;
    }

}
