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
import com.magento.test.dao.SalesOrderStatusStateDao;
import com.magento.test.entity.SalesOrderStatusState;
import com.magento.test.entity.SalesOrderStatusStateId;

@Stateless
@Named("DefaultSalesOrderStatusStateService")
public class DefaultSalesOrderStatusStateService implements SalesOrderStatusStateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderStatusStateDao dao;

  @Inject
  @Named("DefaultSalesOrderStatusStateDao")
  public DefaultSalesOrderStatusStateService(final SalesOrderStatusStateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusState find(SalesOrderStatusStateId id) {
    final SalesOrderStatusState result = dao.find(id);
    logger.info("find(SalesOrderStatusState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatusState> select(int maxResult) {
    final List<SalesOrderStatusState> result = dao.select(maxResult);
    logger.info("select(SalesOrderStatusState) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatusState> selectAll() {
    final List<SalesOrderStatusState> results = dao.selectAll();
    logger.info("selectAll(SalesOrderStatusState) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusState create(SalesOrderStatusState bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderStatusState={}) - entered bean ");

    final SalesOrderStatusState result = dao.create(bean);

    logger.info("create(SalesOrderStatusState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatusState update(SalesOrderStatusState bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderStatusState={}) - entered bean ");

    final SalesOrderStatusState result = dao.update(bean);

    logger.info("update(SalesOrderStatusState) - exited - return value={} result ");
    return result;
  }
}
