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
import com.magento.test.dao.CatalogProductIndexPriceFinalTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceFinalTmp;
import com.magento.test.entity.CatalogProductIndexPriceFinalTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceFinalTmpService")
public class DefaultCatalogProductIndexPriceFinalTmpService
    implements CatalogProductIndexPriceFinalTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceFinalTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceFinalTmpDao")
  public DefaultCatalogProductIndexPriceFinalTmpService(
      final CatalogProductIndexPriceFinalTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalTmp find(CatalogProductIndexPriceFinalTmpId id) {
    final CatalogProductIndexPriceFinalTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceFinalTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceFinalTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceFinalTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceFinalTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceFinalTmp> selectAll() {
    final List<CatalogProductIndexPriceFinalTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceFinalTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalTmp create(CatalogProductIndexPriceFinalTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceFinalTmp={}) - entered bean ");

    final CatalogProductIndexPriceFinalTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceFinalTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceFinalTmp update(CatalogProductIndexPriceFinalTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceFinalTmp={}) - entered bean ");

    final CatalogProductIndexPriceFinalTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceFinalTmp) - exited - return value={} result ");
    return result;
  }
}
