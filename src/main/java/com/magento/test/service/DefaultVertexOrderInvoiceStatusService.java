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
import com.magento.test.dao.VertexOrderInvoiceStatusDao;
import com.magento.test.entity.VertexOrderInvoiceStatus;

@Stateless
@Named("DefaultVertexOrderInvoiceStatusService")
public class DefaultVertexOrderInvoiceStatusService implements VertexOrderInvoiceStatusService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VertexOrderInvoiceStatusDao dao;

  @Inject
  @Named("DefaultVertexOrderInvoiceStatusDao")
  public DefaultVertexOrderInvoiceStatusService(final VertexOrderInvoiceStatusDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VertexOrderInvoiceStatus find(java.lang.Integer id) {

    final VertexOrderInvoiceStatus result = dao.find(id);
    logger.info("find(VertexOrderInvoiceStatus) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VertexOrderInvoiceStatus> select(int maxResult) {
    final List<VertexOrderInvoiceStatus> result = dao.select(maxResult);
    logger.info("select(VertexOrderInvoiceStatus) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VertexOrderInvoiceStatus> selectAll() {
    final List<VertexOrderInvoiceStatus> results = dao.selectAll();
    logger.info("selectAll(VertexOrderInvoiceStatus) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VertexOrderInvoiceStatus create(VertexOrderInvoiceStatus bean) {
    requireNonNull(bean);
    logger.info("create(VertexOrderInvoiceStatus={}) - entered bean ");

    final VertexOrderInvoiceStatus result = dao.create(bean);

    logger.info("create(VertexOrderInvoiceStatus) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VertexOrderInvoiceStatus update(VertexOrderInvoiceStatus bean) {
    requireNonNull(bean);
    logger.info("update(VertexOrderInvoiceStatus={}) - entered bean ");

    final VertexOrderInvoiceStatus result = dao.update(bean);

    logger.info("update(VertexOrderInvoiceStatus) - exited - return value={} result ");
    return result;
  }
}
