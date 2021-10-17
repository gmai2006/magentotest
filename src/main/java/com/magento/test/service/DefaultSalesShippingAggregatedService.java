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
import com.magento.test.dao.SalesShippingAggregatedDao;
import com.magento.test.entity.SalesShippingAggregated;
import com.magento.test.entity.SalesShippingAggregatedId;

@Stateless
@Named("DefaultSalesShippingAggregatedService")
public class DefaultSalesShippingAggregatedService implements SalesShippingAggregatedService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShippingAggregatedDao dao;

  @Inject
  @Named("DefaultSalesShippingAggregatedDao")
  public DefaultSalesShippingAggregatedService(final SalesShippingAggregatedDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregated find(SalesShippingAggregatedId id) {
    final SalesShippingAggregated result = dao.find(id);
    logger.info("find(SalesShippingAggregated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShippingAggregated> select(int maxResult) {
    final List<SalesShippingAggregated> result = dao.select(maxResult);
    logger.info("select(SalesShippingAggregated) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShippingAggregated> selectAll() {
    final List<SalesShippingAggregated> results = dao.selectAll();
    logger.info("selectAll(SalesShippingAggregated) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregated create(SalesShippingAggregated bean) {
    requireNonNull(bean);
    logger.info("create(SalesShippingAggregated={}) - entered bean ");

    final SalesShippingAggregated result = dao.create(bean);

    logger.info("create(SalesShippingAggregated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShippingAggregated update(SalesShippingAggregated bean) {
    requireNonNull(bean);
    logger.info("update(SalesShippingAggregated={}) - entered bean ");

    final SalesShippingAggregated result = dao.update(bean);

    logger.info("update(SalesShippingAggregated) - exited - return value={} result ");
    return result;
  }
}
