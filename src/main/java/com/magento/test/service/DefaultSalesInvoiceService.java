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
import com.magento.test.dao.SalesInvoiceDao;
import com.magento.test.entity.SalesInvoice;
import com.magento.test.entity.SalesInvoiceId;

@Stateless
@Named("DefaultSalesInvoiceService")
public class DefaultSalesInvoiceService implements SalesInvoiceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesInvoiceDao dao;

  @Inject
  @Named("DefaultSalesInvoiceDao")
  public DefaultSalesInvoiceService(final SalesInvoiceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoice find(SalesInvoiceId id) {
    final SalesInvoice result = dao.find(id);
    logger.info("find(SalesInvoice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesInvoice> select(int maxResult) {
    final List<SalesInvoice> result = dao.select(maxResult);
    logger.info("select(SalesInvoice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesInvoice> selectAll() {
    final List<SalesInvoice> results = dao.selectAll();
    logger.info("selectAll(SalesInvoice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoice create(SalesInvoice bean) {
    requireNonNull(bean);
    logger.info("create(SalesInvoice={}) - entered bean ");

    final SalesInvoice result = dao.create(bean);

    logger.info("create(SalesInvoice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesInvoice update(SalesInvoice bean) {
    requireNonNull(bean);
    logger.info("update(SalesInvoice={}) - entered bean ");

    final SalesInvoice result = dao.update(bean);

    logger.info("update(SalesInvoice) - exited - return value={} result ");
    return result;
  }
}
