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
import com.magento.test.dao.SalesOrderGridDao;
import com.magento.test.entity.SalesOrderGrid;
import com.magento.test.entity.SalesOrderGridId;

@Stateless
@Named("DefaultSalesOrderGridService")
public class DefaultSalesOrderGridService implements SalesOrderGridService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderGridDao dao;

  @Inject
  @Named("DefaultSalesOrderGridDao")
  public DefaultSalesOrderGridService(final SalesOrderGridDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderGrid find(SalesOrderGridId id) {
    final SalesOrderGrid result = dao.find(id);
    logger.info("find(SalesOrderGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderGrid> select(int maxResult) {
    final List<SalesOrderGrid> result = dao.select(maxResult);
    logger.info("select(SalesOrderGrid) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderGrid> selectAll() {
    final List<SalesOrderGrid> results = dao.selectAll();
    logger.info("selectAll(SalesOrderGrid) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderGrid create(SalesOrderGrid bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderGrid={}) - entered bean ");

    final SalesOrderGrid result = dao.create(bean);

    logger.info("create(SalesOrderGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderGrid update(SalesOrderGrid bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderGrid={}) - entered bean ");

    final SalesOrderGrid result = dao.update(bean);

    logger.info("update(SalesOrderGrid) - exited - return value={} result ");
    return result;
  }
}
