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
import com.magento.test.dao.SalesShippingAggregatedOrderDao;
import com.magento.test.entity.SalesShippingAggregatedOrder;
import com.magento.test.entity.SalesShippingAggregatedOrderId;

@Stateless
@Named("DefaultSalesShippingAggregatedOrderService")
public class DefaultSalesShippingAggregatedOrderService
    implements SalesShippingAggregatedOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShippingAggregatedOrderDao dao;

  @Inject
  @Named("DefaultSalesShippingAggregatedOrderDao")
  public DefaultSalesShippingAggregatedOrderService(final SalesShippingAggregatedOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregatedOrder find(SalesShippingAggregatedOrderId id) {
    final SalesShippingAggregatedOrder result = dao.find(id);
    logger.info("find(SalesShippingAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShippingAggregatedOrder> select(int maxResult) {
    final List<SalesShippingAggregatedOrder> result = dao.select(maxResult);
    logger.info("select(SalesShippingAggregatedOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShippingAggregatedOrder> selectAll() {
    final List<SalesShippingAggregatedOrder> results = dao.selectAll();
    logger.info("selectAll(SalesShippingAggregatedOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregatedOrder create(SalesShippingAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("create(SalesShippingAggregatedOrder={}) - entered bean ");

    final SalesShippingAggregatedOrder result = dao.create(bean);

    logger.info("create(SalesShippingAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregatedOrder update(SalesShippingAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("update(SalesShippingAggregatedOrder={}) - entered bean ");

    final SalesShippingAggregatedOrder result = dao.update(bean);

    logger.info("update(SalesShippingAggregatedOrder) - exited - return value={} result ");
    return result;
  }
}
