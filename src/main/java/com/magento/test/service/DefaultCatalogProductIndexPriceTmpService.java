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
import com.magento.test.dao.CatalogProductIndexPriceTmpDao;
import com.magento.test.entity.CatalogProductIndexPriceTmp;
import com.magento.test.entity.CatalogProductIndexPriceTmpId;

@Stateless
@Named("DefaultCatalogProductIndexPriceTmpService")
public class DefaultCatalogProductIndexPriceTmpService
    implements CatalogProductIndexPriceTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceTmpDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceTmpDao")
  public DefaultCatalogProductIndexPriceTmpService(final CatalogProductIndexPriceTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceTmp find(CatalogProductIndexPriceTmpId id) {
    final CatalogProductIndexPriceTmp result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceTmp> select(int maxResult) {
    final List<CatalogProductIndexPriceTmp> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceTmp> selectAll() {
    final List<CatalogProductIndexPriceTmp> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceTmp create(CatalogProductIndexPriceTmp bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceTmp={}) - entered bean ");

    final CatalogProductIndexPriceTmp result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceTmp update(CatalogProductIndexPriceTmp bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceTmp={}) - entered bean ");

    final CatalogProductIndexPriceTmp result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceTmp) - exited - return value={} result ");
    return result;
  }
}
