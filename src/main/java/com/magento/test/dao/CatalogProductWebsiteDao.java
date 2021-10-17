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
import com.magento.test.entity.CatalogProductWebsite;
import com.magento.test.entity.CatalogProductWebsiteId;

public interface CatalogProductWebsiteDao {
  /**
   * Retrieve all records CatalogProductWebsite.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of CatalogProductWebsite
   */
  public List<CatalogProductWebsite> select(int maxResult);

  /**
   * Retrieve all records CatalogProductWebsite.
   *
   * @return A list of CatalogProductWebsite
   */
  public List<CatalogProductWebsite> selectAll();

  /**
   * Find an entity.
   *
   * @param id An CatalogProductWebsite id.
   * @return The same CatalogProductWebsite.
   */
  public CatalogProductWebsite find(CatalogProductWebsiteId id);
  /**
   * Create an CatalogProductWebsite.
   *
   * @param e the CatalogProductWebsite.
   * @return The same CatalogProductWebsite.
   */
  public CatalogProductWebsite create(CatalogProductWebsite e);

  /**
   * Update the CatalogProductWebsite.
   *
   * @param e the CatalogProductWebsite.
   * @return The same CatalogProductWebsite.
   */
  public CatalogProductWebsite update(CatalogProductWebsite e);
}
