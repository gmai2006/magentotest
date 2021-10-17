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
import com.magento.test.dao.InventorySourceStockLinkDao;
import com.magento.test.entity.InventorySourceStockLink;
import com.magento.test.entity.InventorySourceStockLinkId;

@Stateless
@Named("DefaultInventorySourceStockLinkService")
public class DefaultInventorySourceStockLinkService implements InventorySourceStockLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventorySourceStockLinkDao dao;

  @Inject
  @Named("DefaultInventorySourceStockLinkDao")
  public DefaultInventorySourceStockLinkService(final InventorySourceStockLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceStockLink find(InventorySourceStockLinkId id) {
    final InventorySourceStockLink result = dao.find(id);
    logger.info("find(InventorySourceStockLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySourceStockLink> select(int maxResult) {
    final List<InventorySourceStockLink> result = dao.select(maxResult);
    logger.info("select(InventorySourceStockLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySourceStockLink> selectAll() {
    final List<InventorySourceStockLink> results = dao.selectAll();
    logger.info("selectAll(InventorySourceStockLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceStockLink create(InventorySourceStockLink bean) {
    requireNonNull(bean);
    logger.info("create(InventorySourceStockLink={}) - entered bean ");

    final InventorySourceStockLink result = dao.create(bean);

    logger.info("create(InventorySourceStockLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceStockLink update(InventorySourceStockLink bean) {
    requireNonNull(bean);
    logger.info("update(InventorySourceStockLink={}) - entered bean ");

    final InventorySourceStockLink result = dao.update(bean);

    logger.info("update(InventorySourceStockLink) - exited - return value={} result ");
    return result;
  }
}
