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
import com.magento.test.dao.VertexSalesCreditmemoItemVertexTaxCodeDao;
import com.magento.test.entity.VertexSalesCreditmemoItemVertexTaxCode;
import com.magento.test.entity.VertexSalesCreditmemoItemVertexTaxCodeId;

@Stateless
@Named("DefaultVertexSalesCreditmemoItemVertexTaxCodeService")
public class DefaultVertexSalesCreditmemoItemVertexTaxCodeService
    implements VertexSalesCreditmemoItemVertexTaxCodeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VertexSalesCreditmemoItemVertexTaxCodeDao dao;

  @Inject
  @Named("DefaultVertexSalesCreditmemoItemVertexTaxCodeDao")
  public DefaultVertexSalesCreditmemoItemVertexTaxCodeService(
      final VertexSalesCreditmemoItemVertexTaxCodeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemVertexTaxCode find(VertexSalesCreditmemoItemVertexTaxCodeId id) {
    final VertexSalesCreditmemoItemVertexTaxCode result = dao.find(id);
    logger.info("find(VertexSalesCreditmemoItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesCreditmemoItemVertexTaxCode> select(int maxResult) {
    final List<VertexSalesCreditmemoItemVertexTaxCode> result = dao.select(maxResult);
    logger.info(
        "select(VertexSalesCreditmemoItemVertexTaxCode) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesCreditmemoItemVertexTaxCode> selectAll() {
    final List<VertexSalesCreditmemoItemVertexTaxCode> results = dao.selectAll();
    logger.info(
        "selectAll(VertexSalesCreditmemoItemVertexTaxCode) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemVertexTaxCode create(
      VertexSalesCreditmemoItemVertexTaxCode bean) {
    requireNonNull(bean);
    logger.info("create(VertexSalesCreditmemoItemVertexTaxCode={}) - entered bean ");

    final VertexSalesCreditmemoItemVertexTaxCode result = dao.create(bean);

    logger.info(
        "create(VertexSalesCreditmemoItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemVertexTaxCode update(
      VertexSalesCreditmemoItemVertexTaxCode bean) {
    requireNonNull(bean);
    logger.info("update(VertexSalesCreditmemoItemVertexTaxCode={}) - entered bean ");

    final VertexSalesCreditmemoItemVertexTaxCode result = dao.update(bean);

    logger.info(
        "update(VertexSalesCreditmemoItemVertexTaxCode) - exited - return value={} result ");
    return result;
  }
}
