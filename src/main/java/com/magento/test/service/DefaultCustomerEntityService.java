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
import com.magento.test.dao.CustomerEntityDao;
import com.magento.test.entity.CustomerEntity;
import com.magento.test.entity.CustomerEntityId;

@Stateless
@Named("DefaultCustomerEntityService")
public class DefaultCustomerEntityService implements CustomerEntityService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerEntityDao dao;

  @Inject
  @Named("DefaultCustomerEntityDao")
  public DefaultCustomerEntityService(final CustomerEntityDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntity find(CustomerEntityId id) {
    final CustomerEntity result = dao.find(id);
    logger.info("find(CustomerEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntity> select(int maxResult) {
    final List<CustomerEntity> result = dao.select(maxResult);
    logger.info("select(CustomerEntity) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntity> selectAll() {
    final List<CustomerEntity> results = dao.selectAll();
    logger.info("selectAll(CustomerEntity) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntity create(CustomerEntity bean) {
    requireNonNull(bean);
    logger.info("create(CustomerEntity={}) - entered bean ");

    final CustomerEntity result = dao.create(bean);

    logger.info("create(CustomerEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntity update(CustomerEntity bean) {
    requireNonNull(bean);
    logger.info("update(CustomerEntity={}) - entered bean ");

    final CustomerEntity result = dao.update(bean);

    logger.info("update(CustomerEntity) - exited - return value={} result ");
    return result;
  }
}
