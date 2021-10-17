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
import com.magento.test.dao.CatalogProductIndexPriceDao;
import com.magento.test.entity.CatalogProductIndexPrice;
import com.magento.test.entity.CatalogProductIndexPriceId;

@Stateless
@Named("DefaultCatalogProductIndexPriceService")
public class DefaultCatalogProductIndexPriceService implements CatalogProductIndexPriceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceDao")
  public DefaultCatalogProductIndexPriceService(final CatalogProductIndexPriceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPrice find(CatalogProductIndexPriceId id) {
    final CatalogProductIndexPrice result = dao.find(id);
    logger.info("find(CatalogProductIndexPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPrice> select(int maxResult) {
    final List<CatalogProductIndexPrice> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPrice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPrice> selectAll() {
    final List<CatalogProductIndexPrice> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPrice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPrice create(CatalogProductIndexPrice bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPrice={}) - entered bean ");

    final CatalogProductIndexPrice result = dao.create(bean);

    logger.info("create(CatalogProductIndexPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPrice update(CatalogProductIndexPrice bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPrice={}) - entered bean ");

    final CatalogProductIndexPrice result = dao.update(bean);

    logger.info("update(CatalogProductIndexPrice) - exited - return value={} result ");
    return result;
  }
}
