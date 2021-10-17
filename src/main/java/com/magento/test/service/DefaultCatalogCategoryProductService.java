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
import com.magento.test.dao.CatalogCategoryProductDao;
import com.magento.test.entity.CatalogCategoryProduct;
import com.magento.test.entity.CatalogCategoryProductId;

@Stateless
@Named("DefaultCatalogCategoryProductService")
public class DefaultCatalogCategoryProductService implements CatalogCategoryProductService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryProductDao dao;

  @Inject
  @Named("DefaultCatalogCategoryProductDao")
  public DefaultCatalogCategoryProductService(final CatalogCategoryProductDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProduct find(CatalogCategoryProductId id) {
    final CatalogCategoryProduct result = dao.find(id);
    logger.info("find(CatalogCategoryProduct) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProduct> select(int maxResult) {
    final List<CatalogCategoryProduct> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryProduct) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProduct> selectAll() {
    final List<CatalogCategoryProduct> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryProduct) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProduct create(CatalogCategoryProduct bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryProduct={}) - entered bean ");

    final CatalogCategoryProduct result = dao.create(bean);

    logger.info("create(CatalogCategoryProduct) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProduct update(CatalogCategoryProduct bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryProduct={}) - entered bean ");

    final CatalogCategoryProduct result = dao.update(bean);

    logger.info("update(CatalogCategoryProduct) - exited - return value={} result ");
    return result;
  }
}
