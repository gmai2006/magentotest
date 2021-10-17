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
import com.magento.test.dao.InventoryStockDao;
import com.magento.test.entity.InventoryStock;

@Stateless
@Named("DefaultInventoryStockService")
public class DefaultInventoryStockService implements InventoryStockService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventoryStockDao dao;

  @Inject
  @Named("DefaultInventoryStockDao")
  public DefaultInventoryStockService(final InventoryStockDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStock find(java.lang.Integer id) {

    final InventoryStock result = dao.find(id);
    logger.info("find(InventoryStock) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryStock> select(int maxResult) {
    final List<InventoryStock> result = dao.select(maxResult);
    logger.info("select(InventoryStock) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryStock> selectAll() {
    final List<InventoryStock> results = dao.selectAll();
    logger.info("selectAll(InventoryStock) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStock create(InventoryStock bean) {
    requireNonNull(bean);
    logger.info("create(InventoryStock={}) - entered bean ");

    final InventoryStock result = dao.create(bean);

    logger.info("create(InventoryStock) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStock update(InventoryStock bean) {
    requireNonNull(bean);
    logger.info("update(InventoryStock={}) - entered bean ");

    final InventoryStock result = dao.update(bean);

    logger.info("update(InventoryStock) - exited - return value={} result ");
    return result;
  }
}
