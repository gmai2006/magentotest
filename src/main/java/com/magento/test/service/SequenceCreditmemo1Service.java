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
import com.magento.test.entity.SequenceCreditmemo1;

public interface SequenceCreditmemo1Service {
  public SequenceCreditmemo1 find(java.lang.Integer id);

  /**
   * Select a list of SequenceCreditmemo1 based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return SequenceCreditmemo1 records.
   */
  public List<SequenceCreditmemo1> select(int maxResult);

  /**
   * Select all SequenceCreditmemo1.
   *
   * @return all SequenceCreditmemo1 records.
   */
  public List<SequenceCreditmemo1> selectAll();

  /**
   * Create SequenceCreditmemo1.
   *
   * @param bean The SequenceCreditmemo1.
   * @return The SequenceCreditmemo1.
   */
  public SequenceCreditmemo1 create(SequenceCreditmemo1 bean);

  /**
   * Update a SequenceCreditmemo1.
   *
   * @param bean - The SequenceCreditmemo1.
   * @return SequenceCreditmemo1.
   */
  public SequenceCreditmemo1 update(SequenceCreditmemo1 bean);
}
