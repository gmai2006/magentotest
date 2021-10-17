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
import com.magento.test.dao.CatalogProductIndexPriceBundleSelIdxDao;
import com.magento.test.entity.CatalogProductIndexPriceBundleSelIdx;
import com.magento.test.entity.CatalogProductIndexPriceBundleSelIdxId;

@Stateless
@Named("DefaultCatalogProductIndexPriceBundleSelIdxService")
public class DefaultCatalogProductIndexPriceBundleSelIdxService
    implements CatalogProductIndexPriceBundleSelIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceBundleSelIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceBundleSelIdxDao")
  public DefaultCatalogProductIndexPriceBundleSelIdxService(
      final CatalogProductIndexPriceBundleSelIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelIdx find(CatalogProductIndexPriceBundleSelIdxId id) {
    final CatalogProductIndexPriceBundleSelIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceBundleSelIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleSelIdx> select(int maxResult) {
    final List<CatalogProductIndexPriceBundleSelIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceBundleSelIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleSelIdx> selectAll() {
    final List<CatalogProductIndexPriceBundleSelIdx> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogProductIndexPriceBundleSelIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelIdx create(CatalogProductIndexPriceBundleSelIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceBundleSelIdx={}) - entered bean ");

    final CatalogProductIndexPriceBundleSelIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceBundleSelIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelIdx update(CatalogProductIndexPriceBundleSelIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceBundleSelIdx={}) - entered bean ");

    final CatalogProductIndexPriceBundleSelIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceBundleSelIdx) - exited - return value={} result ");
    return result;
  }
}
