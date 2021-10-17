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
import com.magento.test.dao.CatalogProductIndexEavIdxDao;
import com.magento.test.entity.CatalogProductIndexEavIdx;
import com.magento.test.entity.CatalogProductIndexEavIdxId;

@Stateless
@Named("DefaultCatalogProductIndexEavIdxService")
public class DefaultCatalogProductIndexEavIdxService implements CatalogProductIndexEavIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavIdxDao")
  public DefaultCatalogProductIndexEavIdxService(final CatalogProductIndexEavIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavIdx find(CatalogProductIndexEavIdxId id) {
    final CatalogProductIndexEavIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexEavIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavIdx> select(int maxResult) {
    final List<CatalogProductIndexEavIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEavIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavIdx> selectAll() {
    final List<CatalogProductIndexEavIdx> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEavIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavIdx create(CatalogProductIndexEavIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEavIdx={}) - entered bean ");

    final CatalogProductIndexEavIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexEavIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavIdx update(CatalogProductIndexEavIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEavIdx={}) - entered bean ");

    final CatalogProductIndexEavIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexEavIdx) - exited - return value={} result ");
    return result;
  }
}
