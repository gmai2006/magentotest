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
import com.magento.test.dao.CatalogProductEntityTierPriceDao;
import com.magento.test.entity.CatalogProductEntityTierPrice;
import com.magento.test.entity.CatalogProductEntityTierPriceId;

@Stateless
@Named("DefaultCatalogProductEntityTierPriceService")
public class DefaultCatalogProductEntityTierPriceService
    implements CatalogProductEntityTierPriceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityTierPriceDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityTierPriceDao")
  public DefaultCatalogProductEntityTierPriceService(final CatalogProductEntityTierPriceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityTierPrice find(CatalogProductEntityTierPriceId id) {
    final CatalogProductEntityTierPrice result = dao.find(id);
    logger.info("find(CatalogProductEntityTierPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityTierPrice> select(int maxResult) {
    final List<CatalogProductEntityTierPrice> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntityTierPrice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityTierPrice> selectAll() {
    final List<CatalogProductEntityTierPrice> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntityTierPrice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityTierPrice create(CatalogProductEntityTierPrice bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityTierPrice={}) - entered bean ");

    final CatalogProductEntityTierPrice result = dao.create(bean);

    logger.info("create(CatalogProductEntityTierPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityTierPrice update(CatalogProductEntityTierPrice bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityTierPrice={}) - entered bean ");

    final CatalogProductEntityTierPrice result = dao.update(bean);

    logger.info("update(CatalogProductEntityTierPrice) - exited - return value={} result ");
    return result;
  }
}
