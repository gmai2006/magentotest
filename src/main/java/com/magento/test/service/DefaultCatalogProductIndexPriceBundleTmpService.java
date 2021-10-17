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
import com.magento.test.dao.CatalogProductIndexPriceBundleTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceBundleTmp;
import com.magento.test.entity.CatalogProductIndexPriceBundleTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceBundleTmpService")
public class DefaultCatalogProductIndexPriceBundleTmpService
    implements CatalogProductIndexPriceBundleTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceBundleTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceBundleTmpDao")
  public DefaultCatalogProductIndexPriceBundleTmpService(
      final CatalogProductIndexPriceBundleTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleTmp find(CatalogProductIndexPriceBundleTmpId id) {
    final CatalogProductIndexPriceBundleTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceBundleTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceBundleTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceBundleTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleTmp> selectAll() {
    final List<CatalogProductIndexPriceBundleTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceBundleTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleTmp create(CatalogProductIndexPriceBundleTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceBundleTmp={}) - entered bean ");

    final CatalogProductIndexPriceBundleTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceBundleTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleTmp update(CatalogProductIndexPriceBundleTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceBundleTmp={}) - entered bean ");

    final CatalogProductIndexPriceBundleTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceBundleTmp) - exited - return value={} result ");
    return result;
  }
}
