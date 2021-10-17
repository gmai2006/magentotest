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
import com.magento.test.dao.SalesruleCouponAggregatedOrderDao;
import com.magento.test.entity.SalesruleCouponAggregatedOrder;
import com.magento.test.entity.SalesruleCouponAggregatedOrderId;

@Stateless
@Named("DefaultSalesruleCouponAggregatedOrderService")
public class DefaultSalesruleCouponAggregatedOrderService
    implements SalesruleCouponAggregatedOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCouponAggregatedOrderDao dao;

  @Inject
  @Named("DefaultSalesruleCouponAggregatedOrderDao")
  public DefaultSalesruleCouponAggregatedOrderService(final SalesruleCouponAggregatedOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedOrder find(SalesruleCouponAggregatedOrderId id) {
    final SalesruleCouponAggregatedOrder result = dao.find(id);
    logger.info("find(SalesruleCouponAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponAggregatedOrder> select(int maxResult) {
    final List<SalesruleCouponAggregatedOrder> result = dao.select(maxResult);
    logger.info("select(SalesruleCouponAggregatedOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponAggregatedOrder> selectAll() {
    final List<SalesruleCouponAggregatedOrder> results = dao.selectAll();
    logger.info("selectAll(SalesruleCouponAggregatedOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedOrder create(SalesruleCouponAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCouponAggregatedOrder={}) - entered bean ");

    final SalesruleCouponAggregatedOrder result = dao.create(bean);

    logger.info("create(SalesruleCouponAggregatedOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedOrder update(SalesruleCouponAggregatedOrder bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCouponAggregatedOrder={}) - entered bean ");

    final SalesruleCouponAggregatedOrder result = dao.update(bean);

    logger.info("update(SalesruleCouponAggregatedOrder) - exited - return value={} result ");
    return result;
  }
}
