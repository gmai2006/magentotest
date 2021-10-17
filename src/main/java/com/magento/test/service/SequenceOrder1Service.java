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
import com.magento.test.entity.SequenceOrder1;

public interface SequenceOrder1Service {
  public SequenceOrder1 find(java.lang.Integer id);

  /**
   * Select a list of SequenceOrder1 based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return SequenceOrder1 records.
   */
  public List<SequenceOrder1> select(int maxResult);

  /**
   * Select all SequenceOrder1.
   *
   * @return all SequenceOrder1 records.
   */
  public List<SequenceOrder1> selectAll();

  /**
   * Create SequenceOrder1.
   *
   * @param bean The SequenceOrder1.
   * @return The SequenceOrder1.
   */
  public SequenceOrder1 create(SequenceOrder1 bean);

  /**
   * Update a SequenceOrder1.
   *
   * @param bean - The SequenceOrder1.
   * @return SequenceOrder1.
   */
  public SequenceOrder1 update(SequenceOrder1 bean);
}
