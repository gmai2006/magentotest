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
import com.magento.test.entity.Wishlist;
import com.magento.test.entity.WishlistId;

public interface WishlistService {
  public Wishlist find(WishlistId id);
  /**
   * Select a list of Wishlist based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return Wishlist records.
   */
  public List<Wishlist> select(int maxResult);

  /**
   * Select all Wishlist.
   *
   * @return all Wishlist records.
   */
  public List<Wishlist> selectAll();

  /**
   * Create Wishlist.
   *
   * @param bean The Wishlist.
   * @return The Wishlist.
   */
  public Wishlist create(Wishlist bean);

  /**
   * Update a Wishlist.
   *
   * @param bean - The Wishlist.
   * @return Wishlist.
   */
  public Wishlist update(Wishlist bean);
}
