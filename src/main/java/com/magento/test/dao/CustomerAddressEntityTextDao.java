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
import com.magento.test.entity.CustomerAddressEntityText;
import com.magento.test.entity.CustomerAddressEntityTextId;

public interface CustomerAddressEntityTextDao {
  /**
   * Retrieve all records CustomerAddressEntityText.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of CustomerAddressEntityText
   */
  public List<CustomerAddressEntityText> select(int maxResult);

  /**
   * Retrieve all records CustomerAddressEntityText.
   *
   * @return A list of CustomerAddressEntityText
   */
  public List<CustomerAddressEntityText> selectAll();

  /**
   * Find an entity.
   *
   * @param id An CustomerAddressEntityText id.
   * @return The same CustomerAddressEntityText.
   */
  public CustomerAddressEntityText find(CustomerAddressEntityTextId id);
  /**
   * Create an CustomerAddressEntityText.
   *
   * @param e the CustomerAddressEntityText.
   * @return The same CustomerAddressEntityText.
   */
  public CustomerAddressEntityText create(CustomerAddressEntityText e);

  /**
   * Update the CustomerAddressEntityText.
   *
   * @param e the CustomerAddressEntityText.
   * @return The same CustomerAddressEntityText.
   */
  public CustomerAddressEntityText update(CustomerAddressEntityText e);
}
