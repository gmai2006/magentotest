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
import com.magento.test.dao.CatalogProductIndexEavTmpDao;
import com.magento.test.entity.CatalogProductIndexEavTmp;
import com.magento.test.entity.CatalogProductIndexEavTmpId;

@Stateless
@Named("DefaultCatalogProductIndexEavTmpService")
public class DefaultCatalogProductIndexEavTmpService implements CatalogProductIndexEavTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavTmpDao")
  public DefaultCatalogProductIndexEavTmpService(final CatalogProductIndexEavTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavTmp find(CatalogProductIndexEavTmpId id) {
    final CatalogProductIndexEavTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexEavTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavTmp> select(int maxResult) {
    final List<CatalogProductIndexEavTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEavTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavTmp> selectAll() {
    final List<CatalogProductIndexEavTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEavTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavTmp create(CatalogProductIndexEavTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEavTmp={}) - entered bean ");

    final CatalogProductIndexEavTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexEavTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavTmp update(CatalogProductIndexEavTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEavTmp={}) - entered bean ");

    final CatalogProductIndexEavTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexEavTmp) - exited - return value={} result ");
    return result;
  }
}
