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
import com.magento.test.dao.CustomerAddressEntityVarcharDao;
import com.magento.test.entity.CustomerAddressEntityVarchar;
import com.magento.test.entity.CustomerAddressEntityVarcharId;

@Stateless
@Named("DefaultCustomerAddressEntityVarcharService")
public class DefaultCustomerAddressEntityVarcharService
    implements CustomerAddressEntityVarcharService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerAddressEntityVarcharDao dao;

  @Inject
  @Named("DefaultCustomerAddressEntityVarcharDao")
  public DefaultCustomerAddressEntityVarcharService(final CustomerAddressEntityVarcharDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityVarchar find(CustomerAddressEntityVarcharId id) {
    final CustomerAddressEntityVarchar result = dao.find(id);
    logger.info("find(CustomerAddressEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityVarchar> select(int maxResult) {
    final List<CustomerAddressEntityVarchar> result = dao.select(maxResult);
    logger.info("select(CustomerAddressEntityVarchar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerAddressEntityVarchar> selectAll() {
    final List<CustomerAddressEntityVarchar> results = dao.selectAll();
    logger.info("selectAll(CustomerAddressEntityVarchar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityVarchar create(CustomerAddressEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("create(CustomerAddressEntityVarchar={}) - entered bean ");

    final CustomerAddressEntityVarchar result = dao.create(bean);

    logger.info("create(CustomerAddressEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerAddressEntityVarchar update(CustomerAddressEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("update(CustomerAddressEntityVarchar={}) - entered bean ");

    final CustomerAddressEntityVarchar result = dao.update(bean);

    logger.info("update(CustomerAddressEntityVarchar) - exited - return value={} result ");
    return result;
  }
}
