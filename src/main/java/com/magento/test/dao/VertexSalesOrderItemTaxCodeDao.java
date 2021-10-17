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
import com.magento.test.entity.VertexSalesOrderItemTaxCode;
import com.magento.test.entity.VertexSalesOrderItemTaxCodeId;

public interface VertexSalesOrderItemTaxCodeDao {
  /**
   * Retrieve all records VertexSalesOrderItemTaxCode.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of VertexSalesOrderItemTaxCode
   */
  public List<VertexSalesOrderItemTaxCode> select(int maxResult);

  /**
   * Retrieve all records VertexSalesOrderItemTaxCode.
   *
   * @return A list of VertexSalesOrderItemTaxCode
   */
  public List<VertexSalesOrderItemTaxCode> selectAll();

  /**
   * Find an entity.
   *
   * @param id An VertexSalesOrderItemTaxCode id.
   * @return The same VertexSalesOrderItemTaxCode.
   */
  public VertexSalesOrderItemTaxCode find(VertexSalesOrderItemTaxCodeId id);
  /**
   * Create an VertexSalesOrderItemTaxCode.
   *
   * @param e the VertexSalesOrderItemTaxCode.
   * @return The same VertexSalesOrderItemTaxCode.
   */
  public VertexSalesOrderItemTaxCode create(VertexSalesOrderItemTaxCode e);

  /**
   * Update the VertexSalesOrderItemTaxCode.
   *
   * @param e the VertexSalesOrderItemTaxCode.
   * @return The same VertexSalesOrderItemTaxCode.
   */
  public VertexSalesOrderItemTaxCode update(VertexSalesOrderItemTaxCode e);
}
