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
package com.magento.test.dao;

import java.util.List;
import com.magento.test.entity.SequenceShipment1;

public interface SequenceShipment1Dao {
  /**
   * Retrieve all records SequenceShipment1.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of SequenceShipment1
   */
  public List<SequenceShipment1> select(int maxResult);

  /**
   * Retrieve all records SequenceShipment1.
   *
   * @return A list of SequenceShipment1
   */
  public List<SequenceShipment1> selectAll();

  /**
   * Find an entity.
   *
   * @param id An SequenceShipment1 id.
   * @return The same SequenceShipment1.
   */
  public SequenceShipment1 find(java.lang.Integer id);

  /**
   * Create an SequenceShipment1.
   *
   * @param e the SequenceShipment1.
   * @return The same SequenceShipment1.
   */
  public SequenceShipment1 create(SequenceShipment1 e);

  /**
   * Update the SequenceShipment1.
   *
   * @param e the SequenceShipment1.
   * @return The same SequenceShipment1.
   */
  public SequenceShipment1 update(SequenceShipment1 e);
}
