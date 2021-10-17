/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.magento.test.service;

import java.util.List;
import com.magento.test.entity.QueueLock;
import com.magento.test.entity.QueueLockId;

public interface QueueLockService {
  public QueueLock find(QueueLockId id);
  /**
   * Select a list of QueueLock based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return QueueLock records.
   */
  public List<QueueLock> select(int maxResult);

  /**
   * Select all QueueLock.
   *
   * @return all QueueLock records.
   */
  public List<QueueLock> selectAll();

  /**
   * Create QueueLock.
   *
   * @param bean The QueueLock.
   * @return The QueueLock.
   */
  public QueueLock create(QueueLock bean);

  /**
   * Update a QueueLock.
   *
   * @param bean - The QueueLock.
   * @return QueueLock.
   */
  public QueueLock update(QueueLock bean);
}
