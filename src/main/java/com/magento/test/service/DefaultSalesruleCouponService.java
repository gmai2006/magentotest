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
import com.magento.test.dao.SalesruleCouponDao;
import com.magento.test.entity.SalesruleCoupon;
import com.magento.test.entity.SalesruleCouponId;

@Stateless
@Named("DefaultSalesruleCouponService")
public class DefaultSalesruleCouponService implements SalesruleCouponService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCouponDao dao;

  @Inject
  @Named("DefaultSalesruleCouponDao")
  public DefaultSalesruleCouponService(final SalesruleCouponDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCoupon find(SalesruleCouponId id) {
    final SalesruleCoupon result = dao.find(id);
    logger.info("find(SalesruleCoupon) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCoupon> select(int maxResult) {
    final List<SalesruleCoupon> result = dao.select(maxResult);
    logger.info("select(SalesruleCoupon) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCoupon> selectAll() {
    final List<SalesruleCoupon> results = dao.selectAll();
    logger.info("selectAll(SalesruleCoupon) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCoupon create(SalesruleCoupon bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCoupon={}) - entered bean ");

    final SalesruleCoupon result = dao.create(bean);

    logger.info("create(SalesruleCoupon) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCoupon update(SalesruleCoupon bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCoupon={}) - entered bean ");

    final SalesruleCoupon result = dao.update(bean);

    logger.info("update(SalesruleCoupon) - exited - return value={} result ");
    return result;
  }
}
