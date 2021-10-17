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
import com.magento.test.dao.CustomerEntityVarcharDao;
import com.magento.test.entity.CustomerEntityVarchar;
import com.magento.test.entity.CustomerEntityVarcharId;

@Stateless
@Named("DefaultCustomerEntityVarcharService")
public class DefaultCustomerEntityVarcharService implements CustomerEntityVarcharService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerEntityVarcharDao dao;

  @Inject
  @Named("DefaultCustomerEntityVarcharDao")
  public DefaultCustomerEntityVarcharService(final CustomerEntityVarcharDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityVarchar find(CustomerEntityVarcharId id) {
    final CustomerEntityVarchar result = dao.find(id);
    logger.info("find(CustomerEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityVarchar> select(int maxResult) {
    final List<CustomerEntityVarchar> result = dao.select(maxResult);
    logger.info("select(CustomerEntityVarchar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityVarchar> selectAll() {
    final List<CustomerEntityVarchar> results = dao.selectAll();
    logger.info("selectAll(CustomerEntityVarchar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityVarchar create(CustomerEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("create(CustomerEntityVarchar={}) - entered bean ");

    final CustomerEntityVarchar result = dao.create(bean);

    logger.info("create(CustomerEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityVarchar update(CustomerEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("update(CustomerEntityVarchar={}) - entered bean ");

    final CustomerEntityVarchar result = dao.update(bean);

    logger.info("update(CustomerEntityVarchar) - exited - return value={} result ");
    return result;
  }
}
