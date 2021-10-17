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
import com.magento.test.dao.SalesInvoicedAggregatedOrderDao;
import com.magento.test.entity.SalesInvoicedAggregatedOrder;
import com.magento.test.entity.SalesInvoicedAggregatedOrderId;

@Stateless
@Named("DefaultSalesInvoicedAggregatedOrderService")
public class DefaultSalesInvoicedAggregatedOrderService
    implements SalesInvoicedAggregatedOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesInvoicedAggregatedOrderDao dao;

  @Inject
  @Named("DefaultSalesInvoicedAggregatedOrderDao")
  public DefaultSalesInvoicedAggregatedOrderService(final SalesInvoicedAggregatedOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoicedAggregatedOrder find(SalesInvoicedAggregatedOrderId id) {
    final SalesInvoicedAggregatedOrder result = dao.find(id);
    logger.info("find(SalesInvoicedAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesInvoicedAggregatedOrder> select(int maxResult) {
    final List<SalesInvoicedAggregatedOrder> result = dao.select(maxResult);
    logger.info("select(SalesInvoicedAggregatedOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesInvoicedAggregatedOrder> selectAll() {
    final List<SalesInvoicedAggregatedOrder> results = dao.selectAll();
    logger.info("selectAll(SalesInvoicedAggregatedOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoicedAggregatedOrder create(SalesInvoicedAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("create(SalesInvoicedAggregatedOrder={}) - entered bean ");

    final SalesInvoicedAggregatedOrder result = dao.create(bean);

    logger.info("create(SalesInvoicedAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoicedAggregatedOrder update(SalesInvoicedAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("update(SalesInvoicedAggregatedOrder={}) - entered bean ");

    final SalesInvoicedAggregatedOrder result = dao.update(bean);

    logger.info("update(SalesInvoicedAggregatedOrder) - exited - return value={} result ");
    return result;
  }
}
