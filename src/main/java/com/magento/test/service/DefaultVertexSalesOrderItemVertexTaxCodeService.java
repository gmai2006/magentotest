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
import com.magento.test.dao.VertexSalesOrderItemVertexTaxCodeDao;
import com.magento.test.entity.VertexSalesOrderItemVertexTaxCode;
import com.magento.test.entity.VertexSalesOrderItemVertexTaxCodeId;

@Stateless
@Named("DefaultVertexSalesOrderItemVertexTaxCodeService")
public class DefaultVertexSalesOrderItemVertexTaxCodeService
    implements VertexSalesOrderItemVertexTaxCodeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VertexSalesOrderItemVertexTaxCodeDao dao;

  @Inject
  @Named("DefaultVertexSalesOrderItemVertexTaxCodeDao")
  public DefaultVertexSalesOrderItemVertexTaxCodeService(
      final VertexSalesOrderItemVertexTaxCodeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesOrderItemVertexTaxCode find(VertexSalesOrderItemVertexTaxCodeId id) {
    final VertexSalesOrderItemVertexTaxCode result = dao.find(id);
    logger.info("find(VertexSalesOrderItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesOrderItemVertexTaxCode> select(int maxResult) {
    final List<VertexSalesOrderItemVertexTaxCode> result = dao.select(maxResult);
    logger.info("select(VertexSalesOrderItemVertexTaxCode) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesOrderItemVertexTaxCode> selectAll() {
    final List<VertexSalesOrderItemVertexTaxCode> results = dao.selectAll();
    logger.info("selectAll(VertexSalesOrderItemVertexTaxCode) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesOrderItemVertexTaxCode create(VertexSalesOrderItemVertexTaxCode bean) {
    requireNonNull(bean);
    logger.info("create(VertexSalesOrderItemVertexTaxCode={}) - entered bean ");

    final VertexSalesOrderItemVertexTaxCode result = dao.create(bean);

    logger.info("create(VertexSalesOrderItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesOrderItemVertexTaxCode update(VertexSalesOrderItemVertexTaxCode bean) {
    requireNonNull(bean);
    logger.info("update(VertexSalesOrderItemVertexTaxCode={}) - entered bean ");

    final VertexSalesOrderItemVertexTaxCode result = dao.update(bean);

    logger.info("update(VertexSalesOrderItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }
}
