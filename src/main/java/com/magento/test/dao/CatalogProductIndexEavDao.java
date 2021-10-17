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
import com.magento.test.entity.CatalogProductIndexEav;
import com.magento.test.entity.CatalogProductIndexEavId;

public interface CatalogProductIndexEavDao {
  /**
   * Retrieve all records CatalogProductIndexEav.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of CatalogProductIndexEav
   */
  public List<CatalogProductIndexEav> select(int maxResult);

  /**
   * Retrieve all records CatalogProductIndexEav.
   *
   * @return A list of CatalogProductIndexEav
   */
  public List<CatalogProductIndexEav> selectAll();

  /**
   * Find an entity.
   *
   * @param id An CatalogProductIndexEav id.
   * @return The same CatalogProductIndexEav.
   */
  public CatalogProductIndexEav find(CatalogProductIndexEavId id);
  /**
   * Create an CatalogProductIndexEav.
   *
   * @param e the CatalogProductIndexEav.
   * @return The same CatalogProductIndexEav.
   */
  public CatalogProductIndexEav create(CatalogProductIndexEav e);

  /**
   * Update the CatalogProductIndexEav.
   *
   * @param e the CatalogProductIndexEav.
   * @return The same CatalogProductIndexEav.
   */
  public CatalogProductIndexEav update(CatalogProductIndexEav e);
}
