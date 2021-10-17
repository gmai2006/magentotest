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
import com.magento.test.dao.CatalogCategoryEntityVarcharDao;
import com.magento.test.entity.CatalogCategoryEntityVarchar;
import com.magento.test.entity.CatalogCategoryEntityVarcharId;

@Stateless
@Named("DefaultCatalogCategoryEntityVarcharService")
public class DefaultCatalogCategoryEntityVarcharService
    implements CatalogCategoryEntityVarcharService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryEntityVarcharDao dao;

  @Inject
  @Named("DefaultCatalogCategoryEntityVarcharDao")
  public DefaultCatalogCategoryEntityVarcharService(final CatalogCategoryEntityVarcharDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityVarchar find(CatalogCategoryEntityVarcharId id) {
    final CatalogCategoryEntityVarchar result = dao.find(id);
    logger.info("find(CatalogCategoryEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityVarchar> select(int maxResult) {
    final List<CatalogCategoryEntityVarchar> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryEntityVarchar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryEntityVarchar> selectAll() {
    final List<CatalogCategoryEntityVarchar> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryEntityVarchar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityVarchar create(CatalogCategoryEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryEntityVarchar={}) - entered bean ");

    final CatalogCategoryEntityVarchar result = dao.create(bean);

    logger.info("create(CatalogCategoryEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryEntityVarchar update(CatalogCategoryEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryEntityVarchar={}) - entered bean ");

    final CatalogCategoryEntityVarchar result = dao.update(bean);

    logger.info("update(CatalogCategoryEntityVarchar) - exited - return value={} result ");
    return result;
  }
}
