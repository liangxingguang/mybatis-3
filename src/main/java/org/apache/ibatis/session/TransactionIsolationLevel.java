/**
 *    Copyright 2009-2018 the original author or authors.
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
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * @author Clinton Begin
 */
//事务隔离级别
public enum TransactionIsolationLevel {
  //没有事务支持
  NONE(Connection.TRANSACTION_NONE),
  //读提交 可能会出现不可重复读，幻读
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),
  //读没有提交 可能会出现脏读，不可重复读，幻读
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),
  //重复读 可能会出现幻读
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),
  //顺序读
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);

  private final int level;

  TransactionIsolationLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
