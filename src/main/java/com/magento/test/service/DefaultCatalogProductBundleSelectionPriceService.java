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
import com.magento.test.dao.CatalogProductBundleSelectionPriceDao;
import com.magento.test.entity.CatalogProductBundleSelectionPrice;
import com.magento.test.entity.CatalogProductBundleSelectionPriceId;

@Stateless
@Named("DefaultCatalogProductBundleSelectionPriceService")
public class DefaultCatalogProductBundleSelectionPriceService
    implements CatalogProductBundleSelectionPriceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductBundleSelectionPriceDao dao;

  @Inject
  @Named("DefaultCatalogProductBundleSelectionPriceDao")
  public DefaultCatalogProductBundleSelectionPriceService(
      final CatalogProductBundleSelectionPriceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundleSelectionPrice find(CatalogProductBundleSelectionPriceId id) {
    final CatalogProductBundleSelectionPrice result = dao.find(id);
    logger.info("find(CatalogProductBundleSelectionPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductBundleSelectionPrice> select(int maxResult) {
    final List<CatalogProductBundleSelectionPrice> result = dao.select(maxResult);
    logger.info("select(CatalogProductBundleSelectionPrice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductBundleSelectionPrice> selectAll() {
    final List<CatalogProductBundleSelectionPrice> results = dao.selectAll();
    logger.info("selectAll(CatalogProductBundleSelectionPrice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundleSelectionPrice create(CatalogProductBundleSelectionPrice bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductBundleSelectionPrice={}) - entered bean ");

    final CatalogProductBundleSelectionPrice result = dao.create(bean);

    logger.info("create(CatalogProductBundleSelectionPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductBundleSelectionPrice update(CatalogProductBundleSelectionPrice bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductBundleSelectionPrice={}) - entered bean ");

    final CatalogProductBundleSelectionPrice result = dao.update(bean);

    logger.info("update(CatalogProductBundleSelectionPrice) - exited - return value={} result ");
    return result;
  }
}
