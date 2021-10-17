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
import com.magento.test.dao.CustomerEntityDecimalDao;
import com.magento.test.entity.CustomerEntityDecimal;
import com.magento.test.entity.CustomerEntityDecimalId;

@Stateless
@Named("DefaultCustomerEntityDecimalService")
public class DefaultCustomerEntityDecimalService implements CustomerEntityDecimalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerEntityDecimalDao dao;

  @Inject
  @Named("DefaultCustomerEntityDecimalDao")
  public DefaultCustomerEntityDecimalService(final CustomerEntityDecimalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityDecimal find(CustomerEntityDecimalId id) {
    final CustomerEntityDecimal result = dao.find(id);
    logger.info("find(CustomerEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityDecimal> select(int maxResult) {
    final List<CustomerEntityDecimal> result = dao.select(maxResult);
    logger.info("select(CustomerEntityDecimal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEntityDecimal> selectAll() {
    final List<CustomerEntityDecimal> results = dao.selectAll();
    logger.info("selectAll(CustomerEntityDecimal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityDecimal create(CustomerEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("create(CustomerEntityDecimal={}) - entered bean ");

    final CustomerEntityDecimal result = dao.create(bean);

    logger.info("create(CustomerEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEntityDecimal update(CustomerEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("update(CustomerEntityDecimal={}) - entered bean ");

    final CustomerEntityDecimal result = dao.update(bean);

    logger.info("update(CustomerEntityDecimal) - exited - return value={} result ");
    return result;
  }
}
