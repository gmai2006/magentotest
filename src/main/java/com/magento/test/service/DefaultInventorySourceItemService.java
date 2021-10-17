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
import com.magento.test.dao.InventorySourceItemDao;
import com.magento.test.entity.InventorySourceItem;
import com.magento.test.entity.InventorySourceItemId;

@Stateless
@Named("DefaultInventorySourceItemService")
public class DefaultInventorySourceItemService implements InventorySourceItemService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventorySourceItemDao dao;

  @Inject
  @Named("DefaultInventorySourceItemDao")
  public DefaultInventorySourceItemService(final InventorySourceItemDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceItem find(InventorySourceItemId id) {
    final InventorySourceItem result = dao.find(id);
    logger.info("find(InventorySourceItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySourceItem> select(int maxResult) {
    final List<InventorySourceItem> result = dao.select(maxResult);
    logger.info("select(InventorySourceItem) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySourceItem> selectAll() {
    final List<InventorySourceItem> results = dao.selectAll();
    logger.info("selectAll(InventorySourceItem) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceItem create(InventorySourceItem bean) {
    requireNonNull(bean);
    logger.info("create(InventorySourceItem={}) - entered bean ");

    final InventorySourceItem result = dao.create(bean);

    logger.info("create(InventorySourceItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySourceItem update(InventorySourceItem bean) {
    requireNonNull(bean);
    logger.info("update(InventorySourceItem={}) - entered bean ");

    final InventorySourceItem result = dao.update(bean);

    logger.info("update(InventorySourceItem) - exited - return value={} result ");
    return result;
  }
}
