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
import com.magento.test.dao.CatalogProductIndexPriceOptAgrIdxDao;
import com.magento.test.entity.CatalogProductIndexPriceOptAgrIdx;
import com.magento.test.entity.CatalogProductIndexPriceOptAgrIdxId;

@Stateless
@Named("DefaultCatalogProductIndexPriceOptAgrIdxService")
public class DefaultCatalogProductIndexPriceOptAgrIdxService
    implements CatalogProductIndexPriceOptAgrIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceOptAgrIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceOptAgrIdxDao")
  public DefaultCatalogProductIndexPriceOptAgrIdxService(
      final CatalogProductIndexPriceOptAgrIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrIdx find(CatalogProductIndexPriceOptAgrIdxId id) {
    final CatalogProductIndexPriceOptAgrIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceOptAgrIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptAgrIdx> select(int maxResult) {
    final List<CatalogProductIndexPriceOptAgrIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceOptAgrIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptAgrIdx> selectAll() {
    final List<CatalogProductIndexPriceOptAgrIdx> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceOptAgrIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrIdx create(CatalogProductIndexPriceOptAgrIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceOptAgrIdx={}) - entered bean ");

    final CatalogProductIndexPriceOptAgrIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceOptAgrIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrIdx update(CatalogProductIndexPriceOptAgrIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceOptAgrIdx={}) - entered bean ");

    final CatalogProductIndexPriceOptAgrIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceOptAgrIdx) - exited - return value={} result ");
    return result;
  }
}
