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
import com.magento.test.dao.CatalogProductEntityTextDao;
import com.magento.test.entity.CatalogProductEntityText;
import com.magento.test.entity.CatalogProductEntityTextId;

@Stateless
@Named("DefaultCatalogProductEntityTextService")
public class DefaultCatalogProductEntityTextService implements CatalogProductEntityTextService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityTextDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityTextDao")
  public DefaultCatalogProductEntityTextService(final CatalogProductEntityTextDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityText find(CatalogProductEntityTextId id) {
    final CatalogProductEntityText result = dao.find(id);
    logger.info("find(CatalogProductEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityText> select(int maxResult) {
    final List<CatalogProductEntityText> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntityText) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityText> selectAll() {
    final List<CatalogProductEntityText> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntityText) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityText create(CatalogProductEntityText bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityText={}) - entered bean ");

    final CatalogProductEntityText result = dao.create(bean);

    logger.info("create(CatalogProductEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityText update(CatalogProductEntityText bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityText={}) - entered bean ");

    final CatalogProductEntityText result = dao.update(bean);

    logger.info("update(CatalogProductEntityText) - exited - return value={} result ");
    return result;
  }
}
