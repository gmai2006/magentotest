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
import com.magento.test.dao.CustomerEntityIntDao;
import com.magento.test.entity.CustomerEntityInt;
import com.magento.test.entity.CustomerEntityIntId;

@Stateless
@Named("DefaultCustomerEntityIntService")
public class DefaultCustomerEntityIntService implements CustomerEntityIntService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerEntityIntDao dao;

  @Inject
  @Named("DefaultCustomerEntityIntDao")
  public DefaultCustomerEntityIntService(final CustomerEntityIntDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityInt find(CustomerEntityIntId id) {
    final CustomerEntityInt result = dao.find(id);
    logger.info("find(CustomerEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityInt> select(int maxResult) {
    final List<CustomerEntityInt> result = dao.select(maxResult);
    logger.info("select(CustomerEntityInt) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityInt> selectAll() {
    final List<CustomerEntityInt> results = dao.selectAll();
    logger.info("selectAll(CustomerEntityInt) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityInt create(CustomerEntityInt bean) {
    requireNonNull(bean);
    logger.info("create(CustomerEntityInt={}) - entered bean ");

    final CustomerEntityInt result = dao.create(bean);

    logger.info("create(CustomerEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityInt update(CustomerEntityInt bean) {
    requireNonNull(bean);
    logger.info("update(CustomerEntityInt={}) - entered bean ");

    final CustomerEntityInt result = dao.update(bean);

    logger.info("update(CustomerEntityInt) - exited - return value={} result ");
    return result;
  }
}
