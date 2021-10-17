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
import com.magento.test.entity.CatalogruleProduct;
import com.magento.test.entity.CatalogruleProductId;

public interface CatalogruleProductDao {
  /**
   * Retrieve all records CatalogruleProduct.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of CatalogruleProduct
   */
  public List<CatalogruleProduct> select(int maxResult);

  /**
   * Retrieve all records CatalogruleProduct.
   *
   * @return A list of CatalogruleProduct
   */
  public List<CatalogruleProduct> selectAll();

  /**
   * Find an entity.
   *
   * @param id An CatalogruleProduct id.
   * @return The same CatalogruleProduct.
   */
  public CatalogruleProduct find(CatalogruleProductId id);
  /**
   * Create an CatalogruleProduct.
   *
   * @param e the CatalogruleProduct.
   * @return The same CatalogruleProduct.
   */
  public CatalogruleProduct create(CatalogruleProduct e);

  /**
   * Update the CatalogruleProduct.
   *
   * @param e the CatalogruleProduct.
   * @return The same CatalogruleProduct.
   */
  public CatalogruleProduct update(CatalogruleProduct e);
}
