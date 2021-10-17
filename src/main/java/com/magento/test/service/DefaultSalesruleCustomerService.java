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
import com.magento.test.dao.SalesruleCustomerDao;
import com.magento.test.entity.SalesruleCustomer;

@Stateless
@Named("DefaultSalesruleCustomerService")
public class DefaultSalesruleCustomerService implements SalesruleCustomerService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCustomerDao dao;

  @Inject
  @Named("DefaultSalesruleCustomerDao")
  public DefaultSalesruleCustomerService(final SalesruleCustomerDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomer find(java.lang.Integer id) {

    final SalesruleCustomer result = dao.find(id);
    logger.info("find(SalesruleCustomer) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCustomer> select(int maxResult) {
    final List<SalesruleCustomer> result = dao.select(maxResult);
    logger.info("select(SalesruleCustomer) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCustomer> selectAll() {
    final List<SalesruleCustomer> results = dao.selectAll();
    logger.info("selectAll(SalesruleCustomer) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomer create(SalesruleCustomer bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCustomer={}) - entered bean ");

    final SalesruleCustomer result = dao.create(bean);

    logger.info("create(SalesruleCustomer) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomer update(SalesruleCustomer bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCustomer={}) - entered bean ");

    final SalesruleCustomer result = dao.update(bean);

    logger.info("update(SalesruleCustomer) - exited - return value={} result ");
    return result;
  }
}
