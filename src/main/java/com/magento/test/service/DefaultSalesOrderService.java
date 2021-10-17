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
import com.magento.test.dao.SalesOrderDao;
import com.magento.test.entity.SalesOrder;
import com.magento.test.entity.SalesOrderId;

@Stateless
@Named("DefaultSalesOrderService")
public class DefaultSalesOrderService implements SalesOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderDao dao;

  @Inject
  @Named("DefaultSalesOrderDao")
  public DefaultSalesOrderService(final SalesOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrder find(SalesOrderId id) {
    final SalesOrder result = dao.find(id);
    logger.info("find(SalesOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrder> select(int maxResult) {
    final List<SalesOrder> result = dao.select(maxResult);
    logger.info("select(SalesOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrder> selectAll() {
    final List<SalesOrder> results = dao.selectAll();
    logger.info("selectAll(SalesOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrder create(SalesOrder bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrder={}) - entered bean ");

    final SalesOrder result = dao.create(bean);

    logger.info("create(SalesOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrder update(SalesOrder bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrder={}) - entered bean ");

    final SalesOrder result = dao.update(bean);

    logger.info("update(SalesOrder) - exited - return value={} result ");
    return result;
  }
}
