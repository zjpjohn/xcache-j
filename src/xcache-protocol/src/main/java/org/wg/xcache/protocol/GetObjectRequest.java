package org.wg.xcache.protocol;

import java.io.Serializable;

/**
 * 获取缓存中对象请求
 * @author enychen Nov 12, 2009
 */
public class GetObjectRequest implements Serializable {

    /** serialVersionUID = -1502654417064193743L */
    private static final long serialVersionUID = -1502654417064193743L;

    /** 缓存名 */
    protected String          cacheName;

    /** 缓存键 */
    protected String          key;

    /**
     * 获取缓存名
     * @return 缓存名
     */
    public String getCacheName() {
        return cacheName;
    }

    /**
     * 设置缓存名
     * @param cacheName 缓存名
     */
    public void setCacheName(String cacheName) {
        this.cacheName = cacheName;
    }

    /**
     * 获取缓存键
     * @return 缓存键
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置缓存键
     * @param key 缓存键
     */
    public void setKey(String key) {
        this.key = key;
    }

}
