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
import com.magento.test.dao.CustomerGridFlatDao;
import com.magento.test.entity.CustomerGridFlat;

@Stateless
@Named("DefaultCustomerGridFlatService")
public class DefaultCustomerGridFlatService implements CustomerGridFlatService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerGridFlatDao dao;

  @Inject
  @Named("DefaultCustomerGridFlatDao")
  public DefaultCustomerGridFlatService(final CustomerGridFlatDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGridFlat find(java.lang.Integer id) {

    final CustomerGridFlat result = dao.find(id);
    logger.info("find(CustomerGridFlat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerGridFlat> select(int maxResult) {
    final List<CustomerGridFlat> result = dao.select(maxResult);
    logger.info("select(CustomerGridFlat) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerGridFlat> selectAll() {
    final List<CustomerGridFlat> results = dao.selectAll();
    logger.info("selectAll(CustomerGridFlat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGridFlat create(CustomerGridFlat bean) {
    requireNonNull(bean);
    logger.info("create(CustomerGridFlat={}) - entered bean ");

    final CustomerGridFlat result = dao.create(bean);

    logger.info("create(CustomerGridFlat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerGridFlat update(CustomerGridFlat bean) {
    requireNonNull(bean);
    logger.info("update(CustomerGridFlat={}) - entered bean ");

    final CustomerGridFlat result = dao.update(bean);

    logger.info("update(CustomerGridFlat) - exited - return value={} result ");
    return result;
  }
}
