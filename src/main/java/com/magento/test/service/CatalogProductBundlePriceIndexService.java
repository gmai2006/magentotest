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
import com.magento.test.entity.CatalogProductBundlePriceIndex;
import com.magento.test.entity.CatalogProductBundlePriceIndexId;

public interface CatalogProductBundlePriceIndexService {
  public CatalogProductBundlePriceIndex find(CatalogProductBundlePriceIndexId id);
  /**
   * Select a list of CatalogProductBundlePriceIndex based on a given maximum number of returning
   * records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return CatalogProductBundlePriceIndex records.
   */
  public List<CatalogProductBundlePriceIndex> select(int maxResult);

  /**
   * Select all CatalogProductBundlePriceIndex.
   *
   * @return all CatalogProductBundlePriceIndex records.
   */
  public List<CatalogProductBundlePriceIndex> selectAll();

  /**
   * Create CatalogProductBundlePriceIndex.
   *
   * @param bean The CatalogProductBundlePriceIndex.
   * @return The CatalogProductBundlePriceIndex.
   */
  public CatalogProductBundlePriceIndex create(CatalogProductBundlePriceIndex bean);

  /**
   * Update a CatalogProductBundlePriceIndex.
   *
   * @param bean - The CatalogProductBundlePriceIndex.
   * @return CatalogProductBundlePriceIndex.
   */
  public CatalogProductBundlePriceIndex update(CatalogProductBundlePriceIndex bean);
}
