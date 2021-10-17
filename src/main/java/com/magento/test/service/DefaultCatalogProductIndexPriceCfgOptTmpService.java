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
import com.magento.test.dao.CatalogProductIndexPriceCfgOptTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceCfgOptTmp;
import com.magento.test.entity.CatalogProductIndexPriceCfgOptTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceCfgOptTmpService")
public class DefaultCatalogProductIndexPriceCfgOptTmpService
    implements CatalogProductIndexPriceCfgOptTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceCfgOptTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceCfgOptTmpDao")
  public DefaultCatalogProductIndexPriceCfgOptTmpService(
      final CatalogProductIndexPriceCfgOptTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptTmp find(CatalogProductIndexPriceCfgOptTmpId id) {
    final CatalogProductIndexPriceCfgOptTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceCfgOptTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceCfgOptTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceCfgOptTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceCfgOptTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceCfgOptTmp> selectAll() {
    final List<CatalogProductIndexPriceCfgOptTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceCfgOptTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptTmp create(CatalogProductIndexPriceCfgOptTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceCfgOptTmp={}) - entered bean ");

    final CatalogProductIndexPriceCfgOptTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceCfgOptTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptTmp update(CatalogProductIndexPriceCfgOptTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceCfgOptTmp={}) - entered bean ");

    final CatalogProductIndexPriceCfgOptTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceCfgOptTmp) - exited - return value={} result ");
    return result;
  }
}
