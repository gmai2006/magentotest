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
import com.magento.test.entity.PaypalBillingAgreementOrder;
import com.magento.test.entity.PaypalBillingAgreementOrderId;

public interface PaypalBillingAgreementOrderService {
  public PaypalBillingAgreementOrder find(PaypalBillingAgreementOrderId id);
  /**
   * Select a list of PaypalBillingAgreementOrder based on a given maximum number of returning
   * records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return PaypalBillingAgreementOrder records.
   */
  public List<PaypalBillingAgreementOrder> select(int maxResult);

  /**
   * Select all PaypalBillingAgreementOrder.
   *
   * @return all PaypalBillingAgreementOrder records.
   */
  public List<PaypalBillingAgreementOrder> selectAll();

  /**
   * Create PaypalBillingAgreementOrder.
   *
   * @param bean The PaypalBillingAgreementOrder.
   * @return The PaypalBillingAgreementOrder.
   */
  public PaypalBillingAgreementOrder create(PaypalBillingAgreementOrder bean);

  /**
   * Update a PaypalBillingAgreementOrder.
   *
   * @param bean - The PaypalBillingAgreementOrder.
   * @return PaypalBillingAgreementOrder.
   */
  public PaypalBillingAgreementOrder update(PaypalBillingAgreementOrder bean);
}
