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
import com.magento.test.dao.CatalogProductOptionTypeTitleDao;
import com.magento.test.entity.CatalogProductOptionTypeTitle;
import com.magento.test.entity.CatalogProductOptionTypeTitleId;

@Stateless
@Named("DefaultCatalogProductOptionTypeTitleService")
public class DefaultCatalogProductOptionTypeTitleService
    implements CatalogProductOptionTypeTitleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductOptionTypeTitleDao dao;

  @Inject
  @Named("DefaultCatalogProductOptionTypeTitleDao")
  public DefaultCatalogProductOptionTypeTitleService(final CatalogProductOptionTypeTitleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTypeTitle find(CatalogProductOptionTypeTitleId id) {
    final CatalogProductOptionTypeTitle result = dao.find(id);
    logger.info("find(CatalogProductOptionTypeTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOptionTypeTitle> select(int maxResult) {
    final List<CatalogProductOptionTypeTitle> result = dao.select(maxResult);
    logger.info("select(CatalogProductOptionTypeTitle) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOptionTypeTitle> selectAll() {
    final List<CatalogProductOptionTypeTitle> results = dao.selectAll();
    logger.info("selectAll(CatalogProductOptionTypeTitle) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTypeTitle create(CatalogProductOptionTypeTitle bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductOptionTypeTitle={}) - entered bean ");

    final CatalogProductOptionTypeTitle result = dao.create(bean);

    logger.info("create(CatalogProductOptionTypeTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTypeTitle update(CatalogProductOptionTypeTitle bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductOptionTypeTitle={}) - entered bean ");

    final CatalogProductOptionTypeTitle result = dao.update(bean);

    logger.info("update(CatalogProductOptionTypeTitle) - exited - return value={} result ");
    return result;
  }
}
