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
import com.magento.test.dao.SalesruleCouponUsageDao;
import com.magento.test.entity.SalesruleCouponUsage;
import com.magento.test.entity.SalesruleCouponUsageId;

@Stateless
@Named("DefaultSalesruleCouponUsageService")
public class DefaultSalesruleCouponUsageService implements SalesruleCouponUsageService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCouponUsageDao dao;

  @Inject
  @Named("DefaultSalesruleCouponUsageDao")
  public DefaultSalesruleCouponUsageService(final SalesruleCouponUsageDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponUsage find(SalesruleCouponUsageId id) {
    final SalesruleCouponUsage result = dao.find(id);
    logger.info("find(SalesruleCouponUsage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponUsage> select(int maxResult) {
    final List<SalesruleCouponUsage> result = dao.select(maxResult);
    logger.info("select(SalesruleCouponUsage) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCouponUsage> selectAll() {
    final List<SalesruleCouponUsage> results = dao.selectAll();
    logger.info("selectAll(SalesruleCouponUsage) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponUsage create(SalesruleCouponUsage bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCouponUsage={}) - entered bean ");

    final SalesruleCouponUsage result = dao.create(bean);

    logger.info("create(SalesruleCouponUsage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCouponUsage update(SalesruleCouponUsage bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCouponUsage={}) - entered bean ");

    final SalesruleCouponUsage result = dao.update(bean);

    logger.info("update(SalesruleCouponUsage) - exited - return value={} result ");
    return result;
  }
}
