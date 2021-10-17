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
import com.magento.test.dao.CatalogCategoryEntityTextDao;
import com.magento.test.entity.CatalogCategoryEntityText;
import com.magento.test.entity.CatalogCategoryEntityTextId;

@Stateless
@Named("DefaultCatalogCategoryEntityTextService")
public class DefaultCatalogCategoryEntityTextService implements CatalogCategoryEntityTextService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryEntityTextDao dao;

  @Inject
  @Named("DefaultCatalogCategoryEntityTextDao")
  public DefaultCatalogCategoryEntityTextService(final CatalogCategoryEntityTextDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityText find(CatalogCategoryEntityTextId id) {
    final CatalogCategoryEntityText result = dao.find(id);
    logger.info("find(CatalogCategoryEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityText> select(int maxResult) {
    final List<CatalogCategoryEntityText> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryEntityText) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityText> selectAll() {
    final List<CatalogCategoryEntityText> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryEntityText) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityText create(CatalogCategoryEntityText bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryEntityText={}) - entered bean ");

    final CatalogCategoryEntityText result = dao.create(bean);

    logger.info("create(CatalogCategoryEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityText update(CatalogCategoryEntityText bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryEntityText={}) - entered bean ");

    final CatalogCategoryEntityText result = dao.update(bean);

    logger.info("update(CatalogCategoryEntityText) - exited - return value={} result ");
    return result;
  }
}
