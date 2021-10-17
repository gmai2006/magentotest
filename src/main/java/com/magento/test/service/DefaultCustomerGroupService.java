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
import com.magento.test.dao.CustomerGroupDao;
import com.magento.test.entity.CustomerGroup;

@Stateless
@Named("DefaultCustomerGroupService")
public class DefaultCustomerGroupService implements CustomerGroupService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerGroupDao dao;

  @Inject
  @Named("DefaultCustomerGroupDao")
  public DefaultCustomerGroupService(final CustomerGroupDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGroup find(java.lang.Integer id) {

    final CustomerGroup result = dao.find(id);
    logger.info("find(CustomerGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerGroup> select(int maxResult) {
    final List<CustomerGroup> result = dao.select(maxResult);
    logger.info("select(CustomerGroup) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerGroup> selectAll() {
    final List<CustomerGroup> results = dao.selectAll();
    logger.info("selectAll(CustomerGroup) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGroup create(CustomerGroup bean) {
    requireNonNull(bean);
    logger.info("create(CustomerGroup={}) - entered bean ");

    final CustomerGroup result = dao.create(bean);

    logger.info("create(CustomerGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGroup update(CustomerGroup bean) {
    requireNonNull(bean);
    logger.info("update(CustomerGroup={}) - entered bean ");

    final CustomerGroup result = dao.update(bean);

    logger.info("update(CustomerGroup) - exited - return value={} result ");
    return result;
  }
}
