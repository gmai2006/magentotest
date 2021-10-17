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
import com.magento.test.dao.ProductAlertPriceDao;
import com.magento.test.entity.ProductAlertPrice;

@Stateless
@Named("DefaultProductAlertPriceService")
public class DefaultProductAlertPriceService implements ProductAlertPriceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ProductAlertPriceDao dao;

  @Inject
  @Named("DefaultProductAlertPriceDao")
  public DefaultProductAlertPriceService(final ProductAlertPriceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ProductAlertPrice find(java.lang.Integer id) {

    final ProductAlertPrice result = dao.find(id);
    logger.info("find(ProductAlertPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ProductAlertPrice> select(int maxResult) {
    final List<ProductAlertPrice> result = dao.select(maxResult);
    logger.info("select(ProductAlertPrice) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ProductAlertPrice> selectAll() {
    final List<ProductAlertPrice> results = dao.selectAll();
    logger.info("selectAll(ProductAlertPrice) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ProductAlertPrice create(ProductAlertPrice bean) {
    requireNonNull(bean);
    logger.info("create(ProductAlertPrice={}) - entered bean ");

    final ProductAlertPrice result = dao.create(bean);

    logger.info("create(ProductAlertPrice) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ProductAlertPrice update(ProductAlertPrice bean) {
    requireNonNull(bean);
    logger.info("update(ProductAlertPrice={}) - entered bean ");

    final ProductAlertPrice result = dao.update(bean);

    logger.info("update(ProductAlertPrice) - exited - return value={} result ");
    return result;
  }
}
