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
import com.magento.test.dao.PaypalPaymentTransactionDao;
import com.magento.test.entity.PaypalPaymentTransaction;
import com.magento.test.entity.PaypalPaymentTransactionId;

@Stateless
@Named("DefaultPaypalPaymentTransactionService")
public class DefaultPaypalPaymentTransactionService implements PaypalPaymentTransactionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PaypalPaymentTransactionDao dao;

  @Inject
  @Named("DefaultPaypalPaymentTransactionDao")
  public DefaultPaypalPaymentTransactionService(final PaypalPaymentTransactionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalPaymentTransaction find(PaypalPaymentTransactionId id) {
    final PaypalPaymentTransaction result = dao.find(id);
    logger.info("find(PaypalPaymentTransaction) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalPaymentTransaction> select(int maxResult) {
    final List<PaypalPaymentTransaction> result = dao.select(maxResult);
    logger.info("select(PaypalPaymentTransaction) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalPaymentTransaction> selectAll() {
    final List<PaypalPaymentTransaction> results = dao.selectAll();
    logger.info("selectAll(PaypalPaymentTransaction) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalPaymentTransaction create(PaypalPaymentTransaction bean) {
    requireNonNull(bean);
    logger.info("create(PaypalPaymentTransaction={}) - entered bean ");

    final PaypalPaymentTransaction result = dao.create(bean);

    logger.info("create(PaypalPaymentTransaction) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalPaymentTransaction update(PaypalPaymentTransaction bean) {
    requireNonNull(bean);
    logger.info("update(PaypalPaymentTransaction={}) - entered bean ");

    final PaypalPaymentTransaction result = dao.update(bean);

    logger.info("update(PaypalPaymentTransaction) - exited - return value={} result ");
    return result;
  }
}
