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
import com.magento.test.dao.CatalogProductIndexEavDecimalTmpDao;
import com.magento.test.entity.CatalogProductIndexEavDecimalTmp;
import com.magento.test.entity.CatalogProductIndexEavDecimalTmpId;

@Stateless
@Named("DefaultCatalogProductIndexEavDecimalTmpService")
public class DefaultCatalogProductIndexEavDecimalTmpService
    implements CatalogProductIndexEavDecimalTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavDecimalTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavDecimalTmpDao")
  public DefaultCatalogProductIndexEavDecimalTmpService(
      final CatalogProductIndexEavDecimalTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalTmp find(CatalogProductIndexEavDecimalTmpId id) {
    final CatalogProductIndexEavDecimalTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexEavDecimalTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavDecimalTmp> select(int maxResult) {
    final List<CatalogProductIndexEavDecimalTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEavDecimalTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavDecimalTmp> selectAll() {
    final List<CatalogProductIndexEavDecimalTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEavDecimalTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalTmp create(CatalogProductIndexEavDecimalTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEavDecimalTmp={}) - entered bean ");

    final CatalogProductIndexEavDecimalTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexEavDecimalTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavDecimalTmp update(CatalogProductIndexEavDecimalTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEavDecimalTmp={}) - entered bean ");

    final CatalogProductIndexEavDecimalTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexEavDecimalTmp) - exited - return value={} result ");
    return result;
  }
}
