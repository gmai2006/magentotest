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
import com.magento.test.entity.VaultPaymentTokenOrderPaymentLink;
import com.magento.test.entity.VaultPaymentTokenOrderPaymentLinkId;

public interface VaultPaymentTokenOrderPaymentLinkService {
  public VaultPaymentTokenOrderPaymentLink find(VaultPaymentTokenOrderPaymentLinkId id);
  /**
   * Select a list of VaultPaymentTokenOrderPaymentLink based on a given maximum number of returning
   * records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return VaultPaymentTokenOrderPaymentLink records.
   */
  public List<VaultPaymentTokenOrderPaymentLink> select(int maxResult);

  /**
   * Select all VaultPaymentTokenOrderPaymentLink.
   *
   * @return all VaultPaymentTokenOrderPaymentLink records.
   */
  public List<VaultPaymentTokenOrderPaymentLink> selectAll();

  /**
   * Create VaultPaymentTokenOrderPaymentLink.
   *
   * @param bean The VaultPaymentTokenOrderPaymentLink.
   * @return The VaultPaymentTokenOrderPaymentLink.
   */
  public VaultPaymentTokenOrderPaymentLink create(VaultPaymentTokenOrderPaymentLink bean);

  /**
   * Update a VaultPaymentTokenOrderPaymentLink.
   *
   * @param bean - The VaultPaymentTokenOrderPaymentLink.
   * @return VaultPaymentTokenOrderPaymentLink.
   */
  public VaultPaymentTokenOrderPaymentLink update(VaultPaymentTokenOrderPaymentLink bean);
}
