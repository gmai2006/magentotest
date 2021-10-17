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

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.magento.test.dao.PaypalBillingAgreementOrderDao;
import com.magento.test.entity.PaypalBillingAgreementOrder;
import com.magento.test.entity.PaypalBillingAgreementOrderId;

@Stateless
@Named("DefaultPaypalBillingAgreementOrderService")
public class DefaultPaypalBillingAgreementOrderService
    implements PaypalBillingAgreementOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PaypalBillingAgreementOrderDao dao;

  @Inject
  @Named("DefaultPaypalBillingAgreementOrderDao")
  public DefaultPaypalBillingAgreementOrderService(final PaypalBillingAgreementOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalBillingAgreementOrder find(PaypalBillingAgreementOrderId id) {
    final PaypalBillingAgreementOrder result = dao.find(id);
    logger.info("find(PaypalBillingAgreementOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalBillingAgreementOrder> select(int maxResult) {
    final List<PaypalBillingAgreementOrder> result = dao.select(maxResult);
    logger.info("select(PaypalBillingAgreementOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalBillingAgreementOrder> selectAll() {
    final List<PaypalBillingAgreementOrder> results = dao.selectAll();
    logger.info("selectAll(PaypalBillingAgreementOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalBillingAgreementOrder create(PaypalBillingAgreementOrder bean) {
    requireNonNull(bean);
    logger.info("create(PaypalBillingAgreementOrder={}) - entered bean ");

    final PaypalBillingAgreementOrder result = dao.create(bean);

    logger.info("create(PaypalBillingAgreementOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalBillingAgreementOrder update(PaypalBillingAgreementOrder bean) {
    requireNonNull(bean);
    logger.info("update(PaypalBillingAgreementOrder={}) - entered bean ");

    final PaypalBillingAgreementOrder result = dao.update(bean);

    logger.info("update(PaypalBillingAgreementOrder) - exited - return value={} result ");
    return result;
  }
}
