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
import com.magento.test.dao.CatalogProductOptionTitleDao;
import com.magento.test.entity.CatalogProductOptionTitle;
import com.magento.test.entity.CatalogProductOptionTitleId;

@Stateless
@Named("DefaultCatalogProductOptionTitleService")
public class DefaultCatalogProductOptionTitleService implements CatalogProductOptionTitleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductOptionTitleDao dao;

  @Inject
  @Named("DefaultCatalogProductOptionTitleDao")
  public DefaultCatalogProductOptionTitleService(final CatalogProductOptionTitleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTitle find(CatalogProductOptionTitleId id) {
    final CatalogProductOptionTitle result = dao.find(id);
    logger.info("find(CatalogProductOptionTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOptionTitle> select(int maxResult) {
    final List<CatalogProductOptionTitle> result = dao.select(maxResult);
    logger.info("select(CatalogProductOptionTitle) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOptionTitle> selectAll() {
    final List<CatalogProductOptionTitle> results = dao.selectAll();
    logger.info("selectAll(CatalogProductOptionTitle) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTitle create(CatalogProductOptionTitle bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductOptionTitle={}) - entered bean ");

    final CatalogProductOptionTitle result = dao.create(bean);

    logger.info("create(CatalogProductOptionTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOptionTitle update(CatalogProductOptionTitle bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductOptionTitle={}) - entered bean ");

    final CatalogProductOptionTitle result = dao.update(bean);

    logger.info("update(CatalogProductOptionTitle) - exited - return value={} result ");
    return result;
  }
}
