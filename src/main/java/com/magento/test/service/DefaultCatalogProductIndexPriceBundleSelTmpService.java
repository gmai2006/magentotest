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
import com.magento.test.dao.CatalogProductIndexPriceBundleSelTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceBundleSelTmp;
import com.magento.test.entity.CatalogProductIndexPriceBundleSelTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceBundleSelTmpService")
public class DefaultCatalogProductIndexPriceBundleSelTmpService
    implements CatalogProductIndexPriceBundleSelTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceBundleSelTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceBundleSelTmpDao")
  public DefaultCatalogProductIndexPriceBundleSelTmpService(
      final CatalogProductIndexPriceBundleSelTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelTmp find(CatalogProductIndexPriceBundleSelTmpId id) {
    final CatalogProductIndexPriceBundleSelTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceBundleSelTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleSelTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceBundleSelTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceBundleSelTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceBundleSelTmp> selectAll() {
    final List<CatalogProductIndexPriceBundleSelTmp> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogProductIndexPriceBundleSelTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelTmp create(CatalogProductIndexPriceBundleSelTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceBundleSelTmp={}) - entered bean ");

    final CatalogProductIndexPriceBundleSelTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceBundleSelTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceBundleSelTmp update(CatalogProductIndexPriceBundleSelTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceBundleSelTmp={}) - entered bean ");

    final CatalogProductIndexPriceBundleSelTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceBundleSelTmp) - exited - return value={} result ");
    return result;
  }
}
