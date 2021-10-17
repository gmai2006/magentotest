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
import com.magento.test.dao.SalesOrderTaxDao;
import com.magento.test.entity.SalesOrderTax;

@Stateless
@Named("DefaultSalesOrderTaxService")
public class DefaultSalesOrderTaxService implements SalesOrderTaxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesOrderTaxDao dao;

  @Inject
  @Named("DefaultSalesOrderTaxDao")
  public DefaultSalesOrderTaxService(final SalesOrderTaxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderTax find(java.lang.Integer id) {

    final SalesOrderTax result = dao.find(id);
    logger.info("find(SalesOrderTax) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderTax> select(int maxResult) {
    final List<SalesOrderTax> result = dao.select(maxResult);
    logger.info("select(SalesOrderTax) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesOrderTax> selectAll() {
    final List<SalesOrderTax> results = dao.selectAll();
    logger.info("selectAll(SalesOrderTax) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderTax create(SalesOrderTax bean) {
    requireNonNull(bean);
    logger.info("create(SalesOrderTax={}) - entered bean ");

    final SalesOrderTax result = dao.create(bean);

    logger.info("create(SalesOrderTax) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesOrderTax update(SalesOrderTax bean) {
    requireNonNull(bean);
    logger.info("update(SalesOrderTax={}) - entered bean ");

    final SalesOrderTax result = dao.update(bean);

    logger.info("update(SalesOrderTax) - exited - return value={} result ");
    return result;
  }
}
