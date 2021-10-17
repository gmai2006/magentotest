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
import com.magento.test.entity.AmazonSalesOrder;
import com.magento.test.entity.AmazonSalesOrderId;

public interface AmazonSalesOrderDao {
  /**
   * Retrieve all records AmazonSalesOrder.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of AmazonSalesOrder
   */
  public List<AmazonSalesOrder> select(int maxResult);

  /**
   * Retrieve all records AmazonSalesOrder.
   *
   * @return A list of AmazonSalesOrder
   */
  public List<AmazonSalesOrder> selectAll();

  /**
   * Find an entity.
   *
   * @param id An AmazonSalesOrder id.
   * @return The same AmazonSalesOrder.
   */
  public AmazonSalesOrder find(AmazonSalesOrderId id);
  /**
   * Create an AmazonSalesOrder.
   *
   * @param e the AmazonSalesOrder.
   * @return The same AmazonSalesOrder.
   */
  public AmazonSalesOrder create(AmazonSalesOrder e);

  /**
   * Update the AmazonSalesOrder.
   *
   * @param e the AmazonSalesOrder.
   * @return The same AmazonSalesOrder.
   */
  public AmazonSalesOrder update(AmazonSalesOrder e);
}
