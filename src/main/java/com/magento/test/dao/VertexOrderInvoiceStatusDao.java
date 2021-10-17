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
import com.magento.test.entity.VertexOrderInvoiceStatus;

public interface VertexOrderInvoiceStatusDao {
  /**
   * Retrieve all records VertexOrderInvoiceStatus.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of VertexOrderInvoiceStatus
   */
  public List<VertexOrderInvoiceStatus> select(int maxResult);

  /**
   * Retrieve all records VertexOrderInvoiceStatus.
   *
   * @return A list of VertexOrderInvoiceStatus
   */
  public List<VertexOrderInvoiceStatus> selectAll();

  /**
   * Find an entity.
   *
   * @param id An VertexOrderInvoiceStatus id.
   * @return The same VertexOrderInvoiceStatus.
   */
  public VertexOrderInvoiceStatus find(java.lang.Integer id);

  /**
   * Create an VertexOrderInvoiceStatus.
   *
   * @param e the VertexOrderInvoiceStatus.
   * @return The same VertexOrderInvoiceStatus.
   */
  public VertexOrderInvoiceStatus create(VertexOrderInvoiceStatus e);

  /**
   * Update the VertexOrderInvoiceStatus.
   *
   * @param e the VertexOrderInvoiceStatus.
   * @return The same VertexOrderInvoiceStatus.
   */
  public VertexOrderInvoiceStatus update(VertexOrderInvoiceStatus e);
}
