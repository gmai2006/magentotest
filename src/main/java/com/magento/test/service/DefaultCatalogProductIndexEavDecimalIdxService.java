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
import com.magento.test.dao.CatalogProductIndexEavDecimalIdxDao;
import com.magento.test.entity.CatalogProductIndexEavDecimalIdx;
import com.magento.test.entity.CatalogProductIndexEavDecimalIdxId;

@Stateless
@Named("DefaultCatalogProductIndexEavDecimalIdxService")
public class DefaultCatalogProductIndexEavDecimalIdxService
    implements CatalogProductIndexEavDecimalIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavDecimalIdxDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavDecimalIdxDao")
  public DefaultCatalogProductIndexEavDecimalIdxService(
      final CatalogProductIndexEavDecimalIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalIdx find(CatalogProductIndexEavDecimalIdxId id) {
    final CatalogProductIndexEavDecimalIdx result = dao.find(id);
    logger.info("find(CatalogProductIndexEavDecimalIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavDecimalIdx> select(int maxResult) {
    final List<CatalogProductIndexEavDecimalIdx> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEavDecimalIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavDecimalIdx> selectAll() {
    final List<CatalogProductIndexEavDecimalIdx> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEavDecimalIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalIdx create(CatalogProductIndexEavDecimalIdx bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEavDecimalIdx={}) - entered bean ");

    final CatalogProductIndexEavDecimalIdx result = dao.create(bean);

    logger.info("create(CatalogProductIndexEavDecimalIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalIdx update(CatalogProductIndexEavDecimalIdx bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEavDecimalIdx={}) - entered bean ");

    final CatalogProductIndexEavDecimalIdx result = dao.update(bean);

    logger.info("update(CatalogProductIndexEavDecimalIdx) - exited - return value={} result ");
    return result;
  }
}
