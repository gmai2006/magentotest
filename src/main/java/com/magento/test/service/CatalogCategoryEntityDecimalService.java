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
import com.magento.test.entity.CatalogCategoryEntityDecimal;
import com.magento.test.entity.CatalogCategoryEntityDecimalId;

public interface CatalogCategoryEntityDecimalService {
  public CatalogCategoryEntityDecimal find(CatalogCategoryEntityDecimalId id);
  /**
   * Select a list of CatalogCategoryEntityDecimal based on a given maximum number of returning
   * records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return CatalogCategoryEntityDecimal records.
   */
  public List<CatalogCategoryEntityDecimal> select(int maxResult);

  /**
   * Select all CatalogCategoryEntityDecimal.
   *
   * @return all CatalogCategoryEntityDecimal records.
   */
  public List<CatalogCategoryEntityDecimal> selectAll();

  /**
   * Create CatalogCategoryEntityDecimal.
   *
   * @param bean The CatalogCategoryEntityDecimal.
   * @return The CatalogCategoryEntityDecimal.
   */
  public CatalogCategoryEntityDecimal create(CatalogCategoryEntityDecimal bean);

  /**
   * Update a CatalogCategoryEntityDecimal.
   *
   * @param bean - The CatalogCategoryEntityDecimal.
   * @return CatalogCategoryEntityDecimal.
   */
  public CatalogCategoryEntityDecimal update(CatalogCategoryEntityDecimal bean);
}
