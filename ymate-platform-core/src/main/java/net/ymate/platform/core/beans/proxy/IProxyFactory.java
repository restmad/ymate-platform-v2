/*
 * Copyright 2007-2107 the original author or authors.
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
package net.ymate.platform.core.beans.proxy;

import java.util.Collection;
import java.util.List;

/**
 * 代理工厂接口定义
 *
 * @author 刘镇 (suninformation@163.com) on 15-3-3 下午4:38
 * @version 1.0
 */
public interface IProxyFactory {

    /**
     * 向工厂注册代理类对象
     *
     * @param proxy
     * @return
     */
    public IProxyFactory registerProxy(IProxy proxy);

    public IProxyFactory registerProxy(Collection<? extends IProxy> proxies);

    /**
     * @return 获取当前工厂已注册的代理类对象集合
     */
    public List<IProxy> getProxies();

    /**
     * @param filter
     * @return 返回通过filter过滤后的代理对象集合
     */
    public List<IProxy> getProxies(IProxyFilter filter);

    /**
     * @param targetClass 被代理目标类型
     * @param <T>
     * @return 创建并返回代理对象
     */
    public <T> T createProxy(Class<?> targetClass);

    /**
     * @param targetClass
     * @param proxies
     * @param <T>
     * @return 创建并返回代理对象
     */
    public <T> T createProxy(Class<?> targetClass, List<IProxy> proxies);
}