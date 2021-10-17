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
import com.magento.test.dao.CatalogProductIndexPriceOptIdxDao;
import com.magento.test.entity.CatalogProductIndexPriceOptIdx;
import com.magento.test.entity.CatalogProductIndexPriceOptIdxId;

@Stateless
@Named("DefaultCatalogProductIndexPriceOptIdxService")
public class DefaultCatalogProductIndexPriceOptIdxService
    implements CatalogProductIndexPriceOptIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceOptIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceOptIdxDao")
  public DefaultCatalogProductIndexPriceOptIdxService(final CatalogProductIndexPriceOptIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptIdx find(CatalogProductIndexPriceOptIdxId id) {
    final CatalogProductIndexPriceOptIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceOptIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptIdx> select(int maxResult) {
    final List<CatalogProductIndexPriceOptIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceOptIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptIdx> selectAll() {
    final List<CatalogProductIndexPriceOptIdx> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceOptIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptIdx create(CatalogProductIndexPriceOptIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceOptIdx={}) - entered bean ");

    final CatalogProductIndexPriceOptIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceOptIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptIdx update(CatalogProductIndexPriceOptIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceOptIdx={}) - entered bean ");

    final CatalogProductIndexPriceOptIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceOptIdx) - exited - return value={} result ");
    return result;
  }
}
