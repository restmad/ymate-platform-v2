/*
 * Copyright 2007-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.ymate.platform.cache;

import net.ymate.platform.core.YMP;

import java.util.List;
import java.util.Map;

/**
 * @author 刘镇 (suninformation@163.com) on 15/11/2 下午2:24
 * @version 1.0
 */
public interface ICaches {

    public static final String MODULE_NAME = "cache";

    /**
     * @return 返回所属YMP框架管理器实例
     */
    public YMP getOwner();

    /**
     * @return 返回缓存模块配置对象
     */
    public ICacheModuleCfg getModuleCfg();

    /**
     * 从缓存中获取对象
     *
     * @param cacheName 缓存名称
     * @param key       缓存Key
     * @return 返回缓存的对象，若不存在则返回null
     * @throws CacheException 可能产生的异常
     */
    public Object get(String cacheName, Object key) throws CacheException;

    /**
     * 从缓存中获取所有对象
     *
     * @param cacheName 缓存名称
     * @return 返回缓存内对象映射
     * @throws CacheException 可能产生的异常
     */
    public Map<Object, Object> getAll(String cacheName) throws CacheException;

    /**
     * 添加对象到缓存
     *
     * @param cacheName 缓存名称
     * @param key       缓存Key
     * @param value     预缓存的元素对象
     * @throws CacheException 可能产生的异常
     */
    public void put(String cacheName, Object key, Object value) throws CacheException;

    /**
     * 更新对象到缓存
     *
     * @param cacheName 缓存名称
     * @param key       缓存Key
     * @param value     缓存元素对象
     * @throws CacheException 可能产生的异常
     */
    public void update(String cacheName, Object key, Object value) throws CacheException;

    /**
     * @param cacheName 缓存名称
     * @return 返回缓存cacheName中缓存对象key的集合
     * @throws CacheException 可能产生的异常
     */
    @SuppressWarnings("rawtypes")
    public List keys(String cacheName) throws CacheException;

    /**
     * 从缓存中移除对象
     *
     * @param cacheName 缓存名称
     * @param key       缓存Key
     * @throws CacheException 可能产生的异常
     */
    public void remove(String cacheName, Object key) throws CacheException;

    /**
     * 批量从缓存中移除对象
     *
     * @param cacheName 缓存名称
     * @param keys      缓存Key
     * @throws CacheException 可能产生的异常
     */
    @SuppressWarnings("rawtypes")
    public void removeAll(String cacheName, List keys) throws CacheException;

    /**
     * 清理缓存
     *
     * @param cacheName 缓存名称
     * @throws CacheException 可能产生的异常
     */
    public void clear(String cacheName) throws CacheException;
}
