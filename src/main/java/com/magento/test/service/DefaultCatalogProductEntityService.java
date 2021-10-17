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
import com.magento.test.dao.CatalogProductEntityDao;
import com.magento.test.entity.CatalogProductEntity;

@Stateless
@Named("DefaultCatalogProductEntityService")
public class DefaultCatalogProductEntityService implements CatalogProductEntityService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityDao")
  public DefaultCatalogProductEntityService(final CatalogProductEntityDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntity find(java.lang.Integer id) {

    final CatalogProductEntity result = dao.find(id);
    logger.info("find(CatalogProductEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntity> select(int maxResult) {
    final List<CatalogProductEntity> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntity) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntity> selectAll() {
    final List<CatalogProductEntity> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntity) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntity create(CatalogProductEntity bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntity={}) - entered bean ");

    final CatalogProductEntity result = dao.create(bean);

    logger.info("create(CatalogProductEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntity update(CatalogProductEntity bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntity={}) - entered bean ");

    final CatalogProductEntity result = dao.update(bean);

    logger.info("update(CatalogProductEntity) - exited - return value={} result ");
    return result;
  }
}
