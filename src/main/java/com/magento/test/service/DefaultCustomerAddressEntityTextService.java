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
import com.magento.test.dao.CustomerAddressEntityTextDao;
import com.magento.test.entity.CustomerAddressEntityText;
import com.magento.test.entity.CustomerAddressEntityTextId;

@Stateless
@Named("DefaultCustomerAddressEntityTextService")
public class DefaultCustomerAddressEntityTextService implements CustomerAddressEntityTextService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerAddressEntityTextDao dao;

  @Inject
  @Named("DefaultCustomerAddressEntityTextDao")
  public DefaultCustomerAddressEntityTextService(final CustomerAddressEntityTextDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityText find(CustomerAddressEntityTextId id) {
    final CustomerAddressEntityText result = dao.find(id);
    logger.info("find(CustomerAddressEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityText> select(int maxResult) {
    final List<CustomerAddressEntityText> result = dao.select(maxResult);
    logger.info("select(CustomerAddressEntityText) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityText> selectAll() {
    final List<CustomerAddressEntityText> results = dao.selectAll();
    logger.info("selectAll(CustomerAddressEntityText) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityText create(CustomerAddressEntityText bean) {
    requireNonNull(bean);
    logger.info("create(CustomerAddressEntityText={}) - entered bean ");

    final CustomerAddressEntityText result = dao.create(bean);

    logger.info("create(CustomerAddressEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityText update(CustomerAddressEntityText bean) {
    requireNonNull(bean);
    logger.info("update(CustomerAddressEntityText={}) - entered bean ");

    final CustomerAddressEntityText result = dao.update(bean);

    logger.info("update(CustomerAddressEntityText) - exited - return value={} result ");
    return result;
  }
}
