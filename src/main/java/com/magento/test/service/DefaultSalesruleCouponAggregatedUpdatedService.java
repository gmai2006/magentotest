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
import com.magento.test.dao.SalesruleCouponAggregatedUpdatedDao;
import com.magento.test.entity.SalesruleCouponAggregatedUpdated;
import com.magento.test.entity.SalesruleCouponAggregatedUpdatedId;

@Stateless
@Named("DefaultSalesruleCouponAggregatedUpdatedService")
public class DefaultSalesruleCouponAggregatedUpdatedService
    implements SalesruleCouponAggregatedUpdatedService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCouponAggregatedUpdatedDao dao;

  @Inject
  @Named("DefaultSalesruleCouponAggregatedUpdatedDao")
  public DefaultSalesruleCouponAggregatedUpdatedService(
      final SalesruleCouponAggregatedUpdatedDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedUpdated find(SalesruleCouponAggregatedUpdatedId id) {
    final SalesruleCouponAggregatedUpdated result = dao.find(id);
    logger.info("find(SalesruleCouponAggregatedUpdated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponAggregatedUpdated> select(int maxResult) {
    final List<SalesruleCouponAggregatedUpdated> result = dao.select(maxResult);
    logger.info("select(SalesruleCouponAggregatedUpdated) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponAggregatedUpdated> selectAll() {
    final List<SalesruleCouponAggregatedUpdated> results = dao.selectAll();
    logger.info("selectAll(SalesruleCouponAggregatedUpdated) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedUpdated create(SalesruleCouponAggregatedUpdated bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCouponAggregatedUpdated={}) - entered bean ");

    final SalesruleCouponAggregatedUpdated result = dao.create(bean);

    logger.info("create(SalesruleCouponAggregatedUpdated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponAggregatedUpdated update(SalesruleCouponAggregatedUpdated bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCouponAggregatedUpdated={}) - entered bean ");

    final SalesruleCouponAggregatedUpdated result = dao.update(bean);

    logger.info("update(SalesruleCouponAggregatedUpdated) - exited - return value={} result ");
    return result;
  }
}
