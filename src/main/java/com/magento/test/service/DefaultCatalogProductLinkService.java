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
import com.magento.test.dao.CatalogProductLinkDao;
import com.magento.test.entity.CatalogProductLink;
import com.magento.test.entity.CatalogProductLinkId;

@Stateless
@Named("DefaultCatalogProductLinkService")
public class DefaultCatalogProductLinkService implements CatalogProductLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductLinkDao dao;

  @Inject
  @Named("DefaultCatalogProductLinkDao")
  public DefaultCatalogProductLinkService(final CatalogProductLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLink find(CatalogProductLinkId id) {
    final CatalogProductLink result = dao.find(id);
    logger.info("find(CatalogProductLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLink> select(int maxResult) {
    final List<CatalogProductLink> result = dao.select(maxResult);
    logger.info("select(CatalogProductLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLink> selectAll() {
    final List<CatalogProductLink> results = dao.selectAll();
    logger.info("selectAll(CatalogProductLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLink create(CatalogProductLink bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductLink={}) - entered bean ");

    final CatalogProductLink result = dao.create(bean);

    logger.info("create(CatalogProductLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLink update(CatalogProductLink bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductLink={}) - entered bean ");

    final CatalogProductLink result = dao.update(bean);

    logger.info("update(CatalogProductLink) - exited - return value={} result ");
    return result;
  }
}
