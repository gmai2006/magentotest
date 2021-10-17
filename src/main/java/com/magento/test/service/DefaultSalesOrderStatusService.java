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
import com.magento.test.dao.SalesOrderStatusDao;
import com.magento.test.entity.SalesOrderStatus;

@Stateless
@Named("DefaultSalesOrderStatusService")
public class DefaultSalesOrderStatusService implements SalesOrderStatusService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderStatusDao dao;

  @Inject
  @Named("DefaultSalesOrderStatusDao")
  public DefaultSalesOrderStatusService(final SalesOrderStatusDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatus find(java.lang.String id) {

    final SalesOrderStatus result = dao.find(id);
    logger.info("find(SalesOrderStatus) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatus> select(int maxResult) {
    final List<SalesOrderStatus> result = dao.select(maxResult);
    logger.info("select(SalesOrderStatus) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderStatus> selectAll() {
    final List<SalesOrderStatus> results = dao.selectAll();
    logger.info("selectAll(SalesOrderStatus) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatus create(SalesOrderStatus bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderStatus={}) - entered bean ");

    final SalesOrderStatus result = dao.create(bean);

    logger.info("create(SalesOrderStatus) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderStatus update(SalesOrderStatus bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderStatus={}) - entered bean ");

    final SalesOrderStatus result = dao.update(bean);

    logger.info("update(SalesOrderStatus) - exited - return value={} result ");
    return result;
  }
}
