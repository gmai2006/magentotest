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
import com.magento.test.dao.CatalogProductBundlePriceIndexDao;
import com.magento.test.entity.CatalogProductBundlePriceIndex;
import com.magento.test.entity.CatalogProductBundlePriceIndexId;

@Stateless
@Named("DefaultCatalogProductBundlePriceIndexService")
public class DefaultCatalogProductBundlePriceIndexService
    implements CatalogProductBundlePriceIndexService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductBundlePriceIndexDao dao;

  @Inject
  @Named("DefaultCatalogProductBundlePriceIndexDao")
  public DefaultCatalogProductBundlePriceIndexService(final CatalogProductBundlePriceIndexDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundlePriceIndex find(CatalogProductBundlePriceIndexId id) {
    final CatalogProductBundlePriceIndex result = dao.find(id);
    logger.info("find(CatalogProductBundlePriceIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductBundlePriceIndex> select(int maxResult) {
    final List<CatalogProductBundlePriceIndex> result = dao.select(maxResult);
    logger.info("select(CatalogProductBundlePriceIndex) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductBundlePriceIndex> selectAll() {
    final List<CatalogProductBundlePriceIndex> results = dao.selectAll();
    logger.info("selectAll(CatalogProductBundlePriceIndex) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundlePriceIndex create(CatalogProductBundlePriceIndex bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductBundlePriceIndex={}) - entered bean ");

    final CatalogProductBundlePriceIndex result = dao.create(bean);

    logger.info("create(CatalogProductBundlePriceIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundlePriceIndex update(CatalogProductBundlePriceIndex bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductBundlePriceIndex={}) - entered bean ");

    final CatalogProductBundlePriceIndex result = dao.update(bean);

    logger.info("update(CatalogProductBundlePriceIndex) - exited - return value={} result ");
    return result;
  }
}
