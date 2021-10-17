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
import com.magento.test.dao.CatalogProductIndexPriceOptAgrTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceOptAgrTmp;
import com.magento.test.entity.CatalogProductIndexPriceOptAgrTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceOptAgrTmpService")
public class DefaultCatalogProductIndexPriceOptAgrTmpService
    implements CatalogProductIndexPriceOptAgrTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceOptAgrTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceOptAgrTmpDao")
  public DefaultCatalogProductIndexPriceOptAgrTmpService(
      final CatalogProductIndexPriceOptAgrTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrTmp find(CatalogProductIndexPriceOptAgrTmpId id) {
    final CatalogProductIndexPriceOptAgrTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceOptAgrTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptAgrTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceOptAgrTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceOptAgrTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceOptAgrTmp> selectAll() {
    final List<CatalogProductIndexPriceOptAgrTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceOptAgrTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrTmp create(CatalogProductIndexPriceOptAgrTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceOptAgrTmp={}) - entered bean ");

    final CatalogProductIndexPriceOptAgrTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceOptAgrTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceOptAgrTmp update(CatalogProductIndexPriceOptAgrTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceOptAgrTmp={}) - entered bean ");

    final CatalogProductIndexPriceOptAgrTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceOptAgrTmp) - exited - return value={} result ");
    return result;
  }
}
