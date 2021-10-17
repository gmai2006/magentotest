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
import com.magento.test.dao.CatalogCategoryProductIndexDao;
import com.magento.test.entity.CatalogCategoryProductIndex;
import com.magento.test.entity.CatalogCategoryProductIndexId;

@Stateless
@Named("DefaultCatalogCategoryProductIndexService")
public class DefaultCatalogCategoryProductIndexService
    implements CatalogCategoryProductIndexService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryProductIndexDao dao;

  @Inject
  @Named("DefaultCatalogCategoryProductIndexDao")
  public DefaultCatalogCategoryProductIndexService(final CatalogCategoryProductIndexDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndex find(CatalogCategoryProductIndexId id) {
    final CatalogCategoryProductIndex result = dao.find(id);
    logger.info("find(CatalogCategoryProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndex> select(int maxResult) {
    final List<CatalogCategoryProductIndex> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryProductIndex) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndex> selectAll() {
    final List<CatalogCategoryProductIndex> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryProductIndex) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndex create(CatalogCategoryProductIndex bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryProductIndex={}) - entered bean ");

    final CatalogCategoryProductIndex result = dao.create(bean);

    logger.info("create(CatalogCategoryProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndex update(CatalogCategoryProductIndex bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryProductIndex={}) - entered bean ");

    final CatalogCategoryProductIndex result = dao.update(bean);

    logger.info("update(CatalogCategoryProductIndex) - exited - return value={} result ");
    return result;
  }
}
