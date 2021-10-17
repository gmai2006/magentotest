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
import com.magento.test.dao.TaxOrderAggregatedCreatedDao;
import com.magento.test.entity.TaxOrderAggregatedCreated;
import com.magento.test.entity.TaxOrderAggregatedCreatedId;

@Stateless
@Named("DefaultTaxOrderAggregatedCreatedService")
public class DefaultTaxOrderAggregatedCreatedService implements TaxOrderAggregatedCreatedService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaxOrderAggregatedCreatedDao dao;

  @Inject
  @Named("DefaultTaxOrderAggregatedCreatedDao")
  public DefaultTaxOrderAggregatedCreatedService(final TaxOrderAggregatedCreatedDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TaxOrderAggregatedCreated find(TaxOrderAggregatedCreatedId id) {
    final TaxOrderAggregatedCreated result = dao.find(id);
    logger.info("find(TaxOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TaxOrderAggregatedCreated> select(int maxResult) {
    final List<TaxOrderAggregatedCreated> result = dao.select(maxResult);
    logger.info("select(TaxOrderAggregatedCreated) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TaxOrderAggregatedCreated> selectAll() {
    final List<TaxOrderAggregatedCreated> results = dao.selectAll();
    logger.info("selectAll(TaxOrderAggregatedCreated) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TaxOrderAggregatedCreated create(TaxOrderAggregatedCreated bean) {
    requireNonNull(bean);
    logger.info("create(TaxOrderAggregatedCreated={}) - entered bean ");

    final TaxOrderAggregatedCreated result = dao.create(bean);

    logger.info("create(TaxOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TaxOrderAggregatedCreated update(TaxOrderAggregatedCreated bean) {
    requireNonNull(bean);
    logger.info("update(TaxOrderAggregatedCreated={}) - entered bean ");

    final TaxOrderAggregatedCreated result = dao.update(bean);

    logger.info("update(TaxOrderAggregatedCreated) - exited - return value={} result ");
    return result;
  }
}
