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
import com.magento.test.dao.CatalogProductIndexEavDao;
import com.magento.test.entity.CatalogProductIndexEav;
import com.magento.test.entity.CatalogProductIndexEavId;

@Stateless
@Named("DefaultCatalogProductIndexEavService")
public class DefaultCatalogProductIndexEavService implements CatalogProductIndexEavService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavDao")
  public DefaultCatalogProductIndexEavService(final CatalogProductIndexEavDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEav find(CatalogProductIndexEavId id) {
    final CatalogProductIndexEav result = dao.find(id);
    logger.info("find(CatalogProductIndexEav) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEav> select(int maxResult) {
    final List<CatalogProductIndexEav> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEav) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEav> selectAll() {
    final List<CatalogProductIndexEav> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEav) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEav create(CatalogProductIndexEav bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEav={}) - entered bean ");

    final CatalogProductIndexEav result = dao.create(bean);

    logger.info("create(CatalogProductIndexEav) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEav update(CatalogProductIndexEav bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEav={}) - entered bean ");

    final CatalogProductIndexEav result = dao.update(bean);

    logger.info("update(CatalogProductIndexEav) - exited - return value={} result ");
    return result;
  }
}
