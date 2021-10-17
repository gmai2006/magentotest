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
import com.magento.test.dao.VertexSalesCreditmemoItemTaxCodeDao;
import com.magento.test.entity.VertexSalesCreditmemoItemTaxCode;
import com.magento.test.entity.VertexSalesCreditmemoItemTaxCodeId;

@Stateless
@Named("DefaultVertexSalesCreditmemoItemTaxCodeService")
public class DefaultVertexSalesCreditmemoItemTaxCodeService
    implements VertexSalesCreditmemoItemTaxCodeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VertexSalesCreditmemoItemTaxCodeDao dao;

  @Inject
  @Named("DefaultVertexSalesCreditmemoItemTaxCodeDao")
  public DefaultVertexSalesCreditmemoItemTaxCodeService(
      final VertexSalesCreditmemoItemTaxCodeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemTaxCode find(VertexSalesCreditmemoItemTaxCodeId id) {
    final VertexSalesCreditmemoItemTaxCode result = dao.find(id);
    logger.info("find(VertexSalesCreditmemoItemTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesCreditmemoItemTaxCode> select(int maxResult) {
    final List<VertexSalesCreditmemoItemTaxCode> result = dao.select(maxResult);
    logger.info("select(VertexSalesCreditmemoItemTaxCode) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VertexSalesCreditmemoItemTaxCode> selectAll() {
    final List<VertexSalesCreditmemoItemTaxCode> results = dao.selectAll();
    logger.info("selectAll(VertexSalesCreditmemoItemTaxCode) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemTaxCode create(VertexSalesCreditmemoItemTaxCode bean) {
    requireNonNull(bean);
    logger.info("create(VertexSalesCreditmemoItemTaxCode={}) - entered bean ");

    final VertexSalesCreditmemoItemTaxCode result = dao.create(bean);

    logger.info("create(VertexSalesCreditmemoItemTaxCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VertexSalesCreditmemoItemTaxCode update(VertexSalesCreditmemoItemTaxCode bean) {
    requireNonNull(bean);
    logger.info("update(VertexSalesCreditmemoItemTaxCode={}) - entered bean ");

    final VertexSalesCreditmemoItemTaxCode result = dao.update(bean);

    logger.info("update(VertexSalesCreditmemoItemTaxCode) - exited - return value={} result ");
    return result;
  }
}
