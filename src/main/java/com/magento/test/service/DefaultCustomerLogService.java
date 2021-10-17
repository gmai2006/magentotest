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
import com.magento.test.dao.CustomerLogDao;
import com.magento.test.entity.CustomerLog;
import com.magento.test.entity.CustomerLogId;

@Stateless
@Named("DefaultCustomerLogService")
public class DefaultCustomerLogService implements CustomerLogService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerLogDao dao;

  @Inject
  @Named("DefaultCustomerLogDao")
  public DefaultCustomerLogService(final CustomerLogDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerLog find(CustomerLogId id) {
    final CustomerLog result = dao.find(id);
    logger.info("find(CustomerLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerLog> select(int maxResult) {
    final List<CustomerLog> result = dao.select(maxResult);
    logger.info("select(CustomerLog) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerLog> selectAll() {
    final List<CustomerLog> results = dao.selectAll();
    logger.info("selectAll(CustomerLog) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerLog create(CustomerLog bean) {
    requireNonNull(bean);
    logger.info("create(CustomerLog={}) - entered bean ");

    final CustomerLog result = dao.create(bean);

    logger.info("create(CustomerLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerLog update(CustomerLog bean) {
    requireNonNull(bean);
    logger.info("update(CustomerLog={}) - entered bean ");

    final CustomerLog result = dao.update(bean);

    logger.info("update(CustomerLog) - exited - return value={} result ");
    return result;
  }
}
