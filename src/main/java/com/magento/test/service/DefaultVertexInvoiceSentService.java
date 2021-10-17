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
import com.magento.test.dao.VertexInvoiceSentDao;
import com.magento.test.entity.VertexInvoiceSent;

@Stateless
@Named("DefaultVertexInvoiceSentService")
public class DefaultVertexInvoiceSentService implements VertexInvoiceSentService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VertexInvoiceSentDao dao;

  @Inject
  @Named("DefaultVertexInvoiceSentDao")
  public DefaultVertexInvoiceSentService(final VertexInvoiceSentDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VertexInvoiceSent find(java.lang.Integer id) {

    final VertexInvoiceSent result = dao.find(id);
    logger.info("find(VertexInvoiceSent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VertexInvoiceSent> select(int maxResult) {
    final List<VertexInvoiceSent> result = dao.select(maxResult);
    logger.info("select(VertexInvoiceSent) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VertexInvoiceSent> selectAll() {
    final List<VertexInvoiceSent> results = dao.selectAll();
    logger.info("selectAll(VertexInvoiceSent) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VertexInvoiceSent create(VertexInvoiceSent bean) {
    requireNonNull(bean);
    logger.info("create(VertexInvoiceSent={}) - entered bean ");

    final VertexInvoiceSent result = dao.create(bean);

    logger.info("create(VertexInvoiceSent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VertexInvoiceSent update(VertexInvoiceSent bean) {
    requireNonNull(bean);
    logger.info("update(VertexInvoiceSent={}) - entered bean ");

    final VertexInvoiceSent result = dao.update(bean);

    logger.info("update(VertexInvoiceSent) - exited - return value={} result ");
    return result;
  }
}
