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
import com.magento.test.dao.CatalogProductIndexPriceCfgOptAgrTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceCfgOptAgrTmp;
import com.magento.test.entity.CatalogProductIndexPriceCfgOptAgrTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceCfgOptAgrTmpService")
public class DefaultCatalogProductIndexPriceCfgOptAgrTmpService
    implements CatalogProductIndexPriceCfgOptAgrTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceCfgOptAgrTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceCfgOptAgrTmpDao")
  public DefaultCatalogProductIndexPriceCfgOptAgrTmpService(
      final CatalogProductIndexPriceCfgOptAgrTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptAgrTmp find(CatalogProductIndexPriceCfgOptAgrTmpId id) {
    final CatalogProductIndexPriceCfgOptAgrTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceCfgOptAgrTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceCfgOptAgrTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceCfgOptAgrTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceCfgOptAgrTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceCfgOptAgrTmp> selectAll() {
    final List<CatalogProductIndexPriceCfgOptAgrTmp> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogProductIndexPriceCfgOptAgrTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptAgrTmp create(CatalogProductIndexPriceCfgOptAgrTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceCfgOptAgrTmp={}) - entered bean ");

    final CatalogProductIndexPriceCfgOptAgrTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceCfgOptAgrTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceCfgOptAgrTmp update(CatalogProductIndexPriceCfgOptAgrTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceCfgOptAgrTmp={}) - entered bean ");

    final CatalogProductIndexPriceCfgOptAgrTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceCfgOptAgrTmp) - exited - return value={} result ");
    return result;
  }
}
