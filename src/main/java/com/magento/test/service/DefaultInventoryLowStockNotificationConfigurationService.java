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
import com.magento.test.dao.InventoryLowStockNotificationConfigurationDao;
import com.magento.test.entity.InventoryLowStockNotificationConfiguration;
import com.magento.test.entity.InventoryLowStockNotificationConfigurationId;

@Stateless
@Named("DefaultInventoryLowStockNotificationConfigurationService")
public class DefaultInventoryLowStockNotificationConfigurationService
    implements InventoryLowStockNotificationConfigurationService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventoryLowStockNotificationConfigurationDao dao;

  @Inject
  @Named("DefaultInventoryLowStockNotificationConfigurationDao")
  public DefaultInventoryLowStockNotificationConfigurationService(
      final InventoryLowStockNotificationConfigurationDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryLowStockNotificationConfiguration find(
      InventoryLowStockNotificationConfigurationId id) {
    final InventoryLowStockNotificationConfiguration result = dao.find(id);
    logger.info(
        "find(InventoryLowStockNotificationConfiguration) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryLowStockNotificationConfiguration> select(int maxResult) {
    final List<InventoryLowStockNotificationConfiguration> result = dao.select(maxResult);
    logger.info(
        "select(InventoryLowStockNotificationConfiguration) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryLowStockNotificationConfiguration> selectAll() {
    final List<InventoryLowStockNotificationConfiguration> results = dao.selectAll();
    logger.info(
        "selectAll(InventoryLowStockNotificationConfiguration) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryLowStockNotificationConfiguration create(
      InventoryLowStockNotificationConfiguration bean) {
    requireNonNull(bean);
    logger.info("create(InventoryLowStockNotificationConfiguration={}) - entered bean ");

    final InventoryLowStockNotificationConfiguration result = dao.create(bean);

    logger.info(
        "create(InventoryLowStockNotificationConfiguration) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryLowStockNotificationConfiguration update(
      InventoryLowStockNotificationConfiguration bean) {
    requireNonNull(bean);
    logger.info("update(InventoryLowStockNotificationConfiguration={}) - entered bean ");

    final InventoryLowStockNotificationConfiguration result = dao.update(bean);

    logger.info(
        "update(InventoryLowStockNotificationConfiguration) - exited - return value={} result ");
    return result;
  }
}
