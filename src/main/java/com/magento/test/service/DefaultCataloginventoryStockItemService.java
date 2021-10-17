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
import com.magento.test.dao.CataloginventoryStockItemDao;
import com.magento.test.entity.CataloginventoryStockItem;
import com.magento.test.entity.CataloginventoryStockItemId;

@Stateless
@Named("DefaultCataloginventoryStockItemService")
public class DefaultCataloginventoryStockItemService implements CataloginventoryStockItemService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CataloginventoryStockItemDao dao;

  @Inject
  @Named("DefaultCataloginventoryStockItemDao")
  public DefaultCataloginventoryStockItemService(final CataloginventoryStockItemDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockItem find(CataloginventoryStockItemId id) {
    final CataloginventoryStockItem result = dao.find(id);
    logger.info("find(CataloginventoryStockItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockItem> select(int maxResult) {
    final List<CataloginventoryStockItem> result = dao.select(maxResult);
    logger.info("select(CataloginventoryStockItem) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockItem> selectAll() {
    final List<CataloginventoryStockItem> results = dao.selectAll();
    logger.info("selectAll(CataloginventoryStockItem) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockItem create(CataloginventoryStockItem bean) {
    requireNonNull(bean);
    logger.info("create(CataloginventoryStockItem={}) - entered bean ");

    final CataloginventoryStockItem result = dao.create(bean);

    logger.info("create(CataloginventoryStockItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockItem update(CataloginventoryStockItem bean) {
    requireNonNull(bean);
    logger.info("update(CataloginventoryStockItem={}) - entered bean ");

    final CataloginventoryStockItem result = dao.update(bean);

    logger.info("update(CataloginventoryStockItem) - exited - return value={} result ");
    return result;
  }
}
