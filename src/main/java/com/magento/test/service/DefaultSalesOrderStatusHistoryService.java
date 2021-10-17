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
import com.magento.test.dao.SalesOrderStatusHistoryDao;
import com.magento.test.entity.SalesOrderStatusHistory;

@Stateless
@Named("DefaultSalesOrderStatusHistoryService")
public class DefaultSalesOrderStatusHistoryService implements SalesOrderStatusHistoryService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderStatusHistoryDao dao;

  @Inject
  @Named("DefaultSalesOrderStatusHistoryDao")
  public DefaultSalesOrderStatusHistoryService(final SalesOrderStatusHistoryDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusHistory find(java.lang.Integer id) {

    final SalesOrderStatusHistory result = dao.find(id);
    logger.info("find(SalesOrderStatusHistory) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatusHistory> select(int maxResult) {
    final List<SalesOrderStatusHistory> result = dao.select(maxResult);
    logger.info("select(SalesOrderStatusHistory) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatusHistory> selectAll() {
    final List<SalesOrderStatusHistory> results = dao.selectAll();
    logger.info("selectAll(SalesOrderStatusHistory) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusHistory create(SalesOrderStatusHistory bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderStatusHistory={}) - entered bean ");

    final SalesOrderStatusHistory result = dao.create(bean);

    logger.info("create(SalesOrderStatusHistory) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusHistory update(SalesOrderStatusHistory bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderStatusHistory={}) - entered bean ");

    final SalesOrderStatusHistory result = dao.update(bean);

    logger.info("update(SalesOrderStatusHistory) - exited - return value={} result ");
    return result;
  }
}
