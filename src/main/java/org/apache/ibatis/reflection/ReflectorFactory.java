/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.reflection;

/**
 * Reflector 工厂接口
 * 默认实现类为DefaultReflectorFactory
 */
public interface ReflectorFactory {

  //class对象是否被缓存
  boolean isClassCacheEnabled();

  //设置缓存标记
  void setClassCacheEnabled(boolean classCacheEnabled);

  //构建Reflector对象
  Reflector findForClass(Class<?> type);
}