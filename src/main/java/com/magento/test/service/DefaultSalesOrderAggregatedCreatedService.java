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
import com.magento.test.dao.SalesOrderAggregatedCreatedDao;
import com.magento.test.entity.SalesOrderAggregatedCreated;
import com.magento.test.entity.SalesOrderAggregatedCreatedId;

@Stateless
@Named("DefaultSalesOrderAggregatedCreatedService")
public class DefaultSalesOrderAggregatedCreatedService
    implements SalesOrderAggregatedCreatedService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderAggregatedCreatedDao dao;

  @Inject
  @Named("DefaultSalesOrderAggregatedCreatedDao")
  public DefaultSalesOrderAggregatedCreatedService(final SalesOrderAggregatedCreatedDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderAggregatedCreated find(SalesOrderAggregatedCreatedId id) {
    final SalesOrderAggregatedCreated result = dao.find(id);
    logger.info("find(SalesOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderAggregatedCreated> select(int maxResult) {
    final List<SalesOrderAggregatedCreated> result = dao.select(maxResult);
    logger.info("select(SalesOrderAggregatedCreated) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderAggregatedCreated> selectAll() {
    final List<SalesOrderAggregatedCreated> results = dao.selectAll();
    logger.info("selectAll(SalesOrderAggregatedCreated) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderAggregatedCreated create(SalesOrderAggregatedCreated bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderAggregatedCreated={}) - entered bean ");

    final SalesOrderAggregatedCreated result = dao.create(bean);

    logger.info("create(SalesOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderAggregatedCreated update(SalesOrderAggregatedCreated bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderAggregatedCreated={}) - entered bean ");

    final SalesOrderAggregatedCreated result = dao.update(bean);

    logger.info("update(SalesOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }
}
