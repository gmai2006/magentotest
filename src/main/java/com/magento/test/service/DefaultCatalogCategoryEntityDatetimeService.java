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
import com.magento.test.dao.CatalogCategoryEntityDatetimeDao;
import com.magento.test.entity.CatalogCategoryEntityDatetime;
import com.magento.test.entity.CatalogCategoryEntityDatetimeId;

@Stateless
@Named("DefaultCatalogCategoryEntityDatetimeService")
public class DefaultCatalogCategoryEntityDatetimeService
    implements CatalogCategoryEntityDatetimeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryEntityDatetimeDao dao;

  @Inject
  @Named("DefaultCatalogCategoryEntityDatetimeDao")
  public DefaultCatalogCategoryEntityDatetimeService(final CatalogCategoryEntityDatetimeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDatetime find(CatalogCategoryEntityDatetimeId id) {
    final CatalogCategoryEntityDatetime result = dao.find(id);
    logger.info("find(CatalogCategoryEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityDatetime> select(int maxResult) {
    final List<CatalogCategoryEntityDatetime> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryEntityDatetime) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityDatetime> selectAll() {
    final List<CatalogCategoryEntityDatetime> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryEntityDatetime) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDatetime create(CatalogCategoryEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryEntityDatetime={}) - entered bean ");

    final CatalogCategoryEntityDatetime result = dao.create(bean);

    logger.info("create(CatalogCategoryEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityDatetime update(CatalogCategoryEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryEntityDatetime={}) - entered bean ");

    final CatalogCategoryEntityDatetime result = dao.update(bean);

    logger.info("update(CatalogCategoryEntityDatetime) - exited - return value={} result ");
    return result;
  }
}
