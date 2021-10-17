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
import com.magento.test.dao.CatalogProductIndexTierPriceDao;
import com.magento.test.entity.CatalogProductIndexTierPrice;
import com.magento.test.entity.CatalogProductIndexTierPriceId;

@Stateless
@Named("DefaultCatalogProductIndexTierPriceService")
public class DefaultCatalogProductIndexTierPriceService
    implements CatalogProductIndexTierPriceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexTierPriceDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexTierPriceDao")
  public DefaultCatalogProductIndexTierPriceService(final CatalogProductIndexTierPriceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexTierPrice find(CatalogProductIndexTierPriceId id) {
    final CatalogProductIndexTierPrice result = dao.find(id);
    logger.info("find(CatalogProductIndexTierPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexTierPrice> select(int maxResult) {
    final List<CatalogProductIndexTierPrice> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexTierPrice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexTierPrice> selectAll() {
    final List<CatalogProductIndexTierPrice> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexTierPrice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexTierPrice create(CatalogProductIndexTierPrice bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexTierPrice={}) - entered bean ");

    final CatalogProductIndexTierPrice result = dao.create(bean);

    logger.info("create(CatalogProductIndexTierPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexTierPrice update(CatalogProductIndexTierPrice bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexTierPrice={}) - entered bean ");

    final CatalogProductIndexTierPrice result = dao.update(bean);

    logger.info("update(CatalogProductIndexTierPrice) - exited - return value={} result ");
    return result;
  }
}
