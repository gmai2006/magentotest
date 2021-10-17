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
import com.magento.test.dao.SalesCreditmemoDao;
import com.magento.test.entity.SalesCreditmemo;
import com.magento.test.entity.SalesCreditmemoId;

@Stateless
@Named("DefaultSalesCreditmemoService")
public class DefaultSalesCreditmemoService implements SalesCreditmemoService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesCreditmemoDao dao;

  @Inject
  @Named("DefaultSalesCreditmemoDao")
  public DefaultSalesCreditmemoService(final SalesCreditmemoDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemo find(SalesCreditmemoId id) {
    final SalesCreditmemo result = dao.find(id);
    logger.info("find(SalesCreditmemo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemo> select(int maxResult) {
    final List<SalesCreditmemo> result = dao.select(maxResult);
    logger.info("select(SalesCreditmemo) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemo> selectAll() {
    final List<SalesCreditmemo> results = dao.selectAll();
    logger.info("selectAll(SalesCreditmemo) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemo create(SalesCreditmemo bean) {
    requireNonNull(bean);
    logger.info("create(SalesCreditmemo={}) - entered bean ");

    final SalesCreditmemo result = dao.create(bean);

    logger.info("create(SalesCreditmemo) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemo update(SalesCreditmemo bean) {
    requireNonNull(bean);
    logger.info("update(SalesCreditmemo={}) - entered bean ");

    final SalesCreditmemo result = dao.update(bean);

    logger.info("update(SalesCreditmemo) - exited - return value={} result ");
    return result;
  }
}
