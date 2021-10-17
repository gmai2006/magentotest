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
import com.magento.test.dao.InventoryStockSalesChannelDao;
import com.magento.test.entity.InventoryStockSalesChannel;
import com.magento.test.entity.InventoryStockSalesChannelId;

@Stateless
@Named("DefaultInventoryStockSalesChannelService")
public class DefaultInventoryStockSalesChannelService implements InventoryStockSalesChannelService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventoryStockSalesChannelDao dao;

  @Inject
  @Named("DefaultInventoryStockSalesChannelDao")
  public DefaultInventoryStockSalesChannelService(final InventoryStockSalesChannelDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStockSalesChannel find(InventoryStockSalesChannelId id) {
    final InventoryStockSalesChannel result = dao.find(id);
    logger.info("find(InventoryStockSalesChannel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryStockSalesChannel> select(int maxResult) {
    final List<InventoryStockSalesChannel> result = dao.select(maxResult);
    logger.info("select(InventoryStockSalesChannel) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryStockSalesChannel> selectAll() {
    final List<InventoryStockSalesChannel> results = dao.selectAll();
    logger.info("selectAll(InventoryStockSalesChannel) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStockSalesChannel create(InventoryStockSalesChannel bean) {
    requireNonNull(bean);
    logger.info("create(InventoryStockSalesChannel={}) - entered bean ");

    final InventoryStockSalesChannel result = dao.create(bean);

    logger.info("create(InventoryStockSalesChannel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryStockSalesChannel update(InventoryStockSalesChannel bean) {
    requireNonNull(bean);
    logger.info("update(InventoryStockSalesChannel={}) - entered bean ");

    final InventoryStockSalesChannel result = dao.update(bean);

    logger.info("update(InventoryStockSalesChannel) - exited - return value={} result ");
    return result;
  }
}
