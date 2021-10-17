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
import com.magento.test.dao.CatalogProductFrontendActionDao;
import com.magento.test.entity.CatalogProductFrontendAction;
import com.magento.test.entity.CatalogProductFrontendActionId;

@Stateless
@Named("DefaultCatalogProductFrontendActionService")
public class DefaultCatalogProductFrontendActionService
    implements CatalogProductFrontendActionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductFrontendActionDao dao;

  @Inject
  @Named("DefaultCatalogProductFrontendActionDao")
  public DefaultCatalogProductFrontendActionService(final CatalogProductFrontendActionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductFrontendAction find(CatalogProductFrontendActionId id) {
    final CatalogProductFrontendAction result = dao.find(id);
    logger.info("find(CatalogProductFrontendAction) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductFrontendAction> select(int maxResult) {
    final List<CatalogProductFrontendAction> result = dao.select(maxResult);
    logger.info("select(CatalogProductFrontendAction) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductFrontendAction> selectAll() {
    final List<CatalogProductFrontendAction> results = dao.selectAll();
    logger.info("selectAll(CatalogProductFrontendAction) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductFrontendAction create(CatalogProductFrontendAction bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductFrontendAction={}) - entered bean ");

    final CatalogProductFrontendAction result = dao.create(bean);

    logger.info("create(CatalogProductFrontendAction) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductFrontendAction update(CatalogProductFrontendAction bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductFrontendAction={}) - entered bean ");

    final CatalogProductFrontendAction result = dao.update(bean);

    logger.info("update(CatalogProductFrontendAction) - exited - return value={} result ");
    return result;
  }
}
