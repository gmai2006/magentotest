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
import com.magento.test.dao.CatalogProductIndexPriceBundleOptIdxDao;
import com.magento.test.entity.CatalogProductIndexPriceBundleOptIdx;
import com.magento.test.entity.CatalogProductIndexPriceBundleOptIdxId;

@Stateless
@Named("DefaultCatalogProductIndexPriceBundleOptIdxService")
public class DefaultCatalogProductIndexPriceBundleOptIdxService
    implements CatalogProductIndexPriceBundleOptIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceBundleOptIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceBundleOptIdxDao")
  public DefaultCatalogProductIndexPriceBundleOptIdxService(
      final CatalogProductIndexPriceBundleOptIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleOptIdx find(CatalogProductIndexPriceBundleOptIdxId id) {
    final CatalogProductIndexPriceBundleOptIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceBundleOptIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleOptIdx> select(int maxResult) {
    final List<CatalogProductIndexPriceBundleOptIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceBundleOptIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleOptIdx> selectAll() {
    final List<CatalogProductIndexPriceBundleOptIdx> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogProductIndexPriceBundleOptIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleOptIdx create(CatalogProductIndexPriceBundleOptIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceBundleOptIdx={}) - entered bean ");

    final CatalogProductIndexPriceBundleOptIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceBundleOptIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleOptIdx update(CatalogProductIndexPriceBundleOptIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceBundleOptIdx={}) - entered bean ");

    final CatalogProductIndexPriceBundleOptIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceBundleOptIdx) - exited - return value={} result ");
    return result;
  }
}
