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
import com.magento.test.dao.CatalogCategoryProductIndexTmpDao;
import com.magento.test.entity.CatalogCategoryProductIndexTmp;
import com.magento.test.entity.CatalogCategoryProductIndexTmpId;

@Stateless
@Named("DefaultCatalogCategoryProductIndexTmpService")
public class DefaultCatalogCategoryProductIndexTmpService
    implements CatalogCategoryProductIndexTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryProductIndexTmpDao dao;

  @Inject
  @Named("DefaultCatalogCategoryProductIndexTmpDao")
  public DefaultCatalogCategoryProductIndexTmpService(final CatalogCategoryProductIndexTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexTmp find(CatalogCategoryProductIndexTmpId id) {
    final CatalogCategoryProductIndexTmp result = dao.find(id);
    logger.info("find(CatalogCategoryProductIndexTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexTmp> select(int maxResult) {
    final List<CatalogCategoryProductIndexTmp> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryProductIndexTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexTmp> selectAll() {
    final List<CatalogCategoryProductIndexTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryProductIndexTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexTmp create(CatalogCategoryProductIndexTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryProductIndexTmp={}) - entered bean ");

    final CatalogCategoryProductIndexTmp result = dao.create(bean);

    logger.info("create(CatalogCategoryProductIndexTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexTmp update(CatalogCategoryProductIndexTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryProductIndexTmp={}) - entered bean ");

    final CatalogCategoryProductIndexTmp result = dao.update(bean);

    logger.info("update(CatalogCategoryProductIndexTmp) - exited - return value={} result ");
    return result;
  }
}
