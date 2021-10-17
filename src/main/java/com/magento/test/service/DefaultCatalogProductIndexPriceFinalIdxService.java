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
import com.magento.test.dao.CatalogProductIndexPriceFinalIdxDao;
import com.magento.test.entity.CatalogProductIndexPriceFinalIdx;
import com.magento.test.entity.CatalogProductIndexPriceFinalIdxId;

@Stateless
@Named("DefaultCatalogProductIndexPriceFinalIdxService")
public class DefaultCatalogProductIndexPriceFinalIdxService
    implements CatalogProductIndexPriceFinalIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceFinalIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceFinalIdxDao")
  public DefaultCatalogProductIndexPriceFinalIdxService(
      final CatalogProductIndexPriceFinalIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalIdx find(CatalogProductIndexPriceFinalIdxId id) {
    final CatalogProductIndexPriceFinalIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceFinalIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceFinalIdx> select(int maxResult) {
    final List<CatalogProductIndexPriceFinalIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceFinalIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceFinalIdx> selectAll() {
    final List<CatalogProductIndexPriceFinalIdx> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceFinalIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalIdx create(CatalogProductIndexPriceFinalIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceFinalIdx={}) - entered bean ");

    final CatalogProductIndexPriceFinalIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceFinalIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalIdx update(CatalogProductIndexPriceFinalIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceFinalIdx={}) - entered bean ");

    final CatalogProductIndexPriceFinalIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceFinalIdx) - exited - return value={} result ");
    return result;
  }
}
