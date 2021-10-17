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
import com.magento.test.dao.SalesOrderPaymentDao;
import com.magento.test.entity.SalesOrderPayment;

@Stateless
@Named("DefaultSalesOrderPaymentService")
public class DefaultSalesOrderPaymentService implements SalesOrderPaymentService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderPaymentDao dao;

  @Inject
  @Named("DefaultSalesOrderPaymentDao")
  public DefaultSalesOrderPaymentService(final SalesOrderPaymentDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderPayment find(java.lang.Integer id) {

    final SalesOrderPayment result = dao.find(id);
    logger.info("find(SalesOrderPayment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderPayment> select(int maxResult) {
    final List<SalesOrderPayment> result = dao.select(maxResult);
    logger.info("select(SalesOrderPayment) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderPayment> selectAll() {
    final List<SalesOrderPayment> results = dao.selectAll();
    logger.info("selectAll(SalesOrderPayment) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderPayment create(SalesOrderPayment bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderPayment={}) - entered bean ");

    final SalesOrderPayment result = dao.create(bean);

    logger.info("create(SalesOrderPayment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderPayment update(SalesOrderPayment bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderPayment={}) - entered bean ");

    final SalesOrderPayment result = dao.update(bean);

    logger.info("update(SalesOrderPayment) - exited - return value={} result ");
    return result;
  }
}
