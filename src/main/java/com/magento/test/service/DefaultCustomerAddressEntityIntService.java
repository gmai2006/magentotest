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
import com.magento.test.dao.CustomerAddressEntityIntDao;
import com.magento.test.entity.CustomerAddressEntityInt;
import com.magento.test.entity.CustomerAddressEntityIntId;

@Stateless
@Named("DefaultCustomerAddressEntityIntService")
public class DefaultCustomerAddressEntityIntService implements CustomerAddressEntityIntService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerAddressEntityIntDao dao;

  @Inject
  @Named("DefaultCustomerAddressEntityIntDao")
  public DefaultCustomerAddressEntityIntService(final CustomerAddressEntityIntDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityInt find(CustomerAddressEntityIntId id) {
    final CustomerAddressEntityInt result = dao.find(id);
    logger.info("find(CustomerAddressEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityInt> select(int maxResult) {
    final List<CustomerAddressEntityInt> result = dao.select(maxResult);
    logger.info("select(CustomerAddressEntityInt) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityInt> selectAll() {
    final List<CustomerAddressEntityInt> results = dao.selectAll();
    logger.info("selectAll(CustomerAddressEntityInt) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityInt create(CustomerAddressEntityInt bean) {
    requireNonNull(bean);
    logger.info("create(CustomerAddressEntityInt={}) - entered bean ");

    final CustomerAddressEntityInt result = dao.create(bean);

    logger.info("create(CustomerAddressEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityInt update(CustomerAddressEntityInt bean) {
    requireNonNull(bean);
    logger.info("update(CustomerAddressEntityInt={}) - entered bean ");

    final CustomerAddressEntityInt result = dao.update(bean);

    logger.info("update(CustomerAddressEntityInt) - exited - return value={} result ");
    return result;
  }
}
