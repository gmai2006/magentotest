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
import com.magento.test.dao.CatalogCategoryEntityDecimalDao;
import com.magento.test.entity.CatalogCategoryEntityDecimal;
import com.magento.test.entity.CatalogCategoryEntityDecimalId;

@Stateless
@Named("DefaultCatalogCategoryEntityDecimalService")
public class DefaultCatalogCategoryEntityDecimalService
    implements CatalogCategoryEntityDecimalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryEntityDecimalDao dao;

  @Inject
  @Named("DefaultCatalogCategoryEntityDecimalDao")
  public DefaultCatalogCategoryEntityDecimalService(final CatalogCategoryEntityDecimalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDecimal find(CatalogCategoryEntityDecimalId id) {
    final CatalogCategoryEntityDecimal result = dao.find(id);
    logger.info("find(CatalogCategoryEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityDecimal> select(int maxResult) {
    final List<CatalogCategoryEntityDecimal> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryEntityDecimal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityDecimal> selectAll() {
    final List<CatalogCategoryEntityDecimal> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryEntityDecimal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDecimal create(CatalogCategoryEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryEntityDecimal={}) - entered bean ");

    final CatalogCategoryEntityDecimal result = dao.create(bean);

    logger.info("create(CatalogCategoryEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDecimal update(CatalogCategoryEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryEntityDecimal={}) - entered bean ");

    final CatalogCategoryEntityDecimal result = dao.update(bean);

    logger.info("update(CatalogCategoryEntityDecimal) - exited - return value={} result ");
    return result;
  }
}
