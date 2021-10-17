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
import com.magento.test.dao.SalesRefundedAggregatedOrderDao;
import com.magento.test.entity.SalesRefundedAggregatedOrder;
import com.magento.test.entity.SalesRefundedAggregatedOrderId;

@Stateless
@Named("DefaultSalesRefundedAggregatedOrderService")
public class DefaultSalesRefundedAggregatedOrderService
    implements SalesRefundedAggregatedOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesRefundedAggregatedOrderDao dao;

  @Inject
  @Named("DefaultSalesRefundedAggregatedOrderDao")
  public DefaultSalesRefundedAggregatedOrderService(final SalesRefundedAggregatedOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesRefundedAggregatedOrder find(SalesRefundedAggregatedOrderId id) {
    final SalesRefundedAggregatedOrder result = dao.find(id);
    logger.info("find(SalesRefundedAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesRefundedAggregatedOrder> select(int maxResult) {
    final List<SalesRefundedAggregatedOrder> result = dao.select(maxResult);
    logger.info("select(SalesRefundedAggregatedOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesRefundedAggregatedOrder> selectAll() {
    final List<SalesRefundedAggregatedOrder> results = dao.selectAll();
    logger.info("selectAll(SalesRefundedAggregatedOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesRefundedAggregatedOrder create(SalesRefundedAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("create(SalesRefundedAggregatedOrder={}) - entered bean ");

    final SalesRefundedAggregatedOrder result = dao.create(bean);

    logger.info("create(SalesRefundedAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesRefundedAggregatedOrder update(SalesRefundedAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("update(SalesRefundedAggregatedOrder={}) - entered bean ");

    final SalesRefundedAggregatedOrder result = dao.update(bean);

    logger.info("update(SalesRefundedAggregatedOrder) - exited - return value={} result ");
    return result;
  }
}
