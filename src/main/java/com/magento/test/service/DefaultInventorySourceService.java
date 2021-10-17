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
import com.magento.test.dao.InventorySourceDao;
import com.magento.test.entity.InventorySource;

@Stateless
@Named("DefaultInventorySourceService")
public class DefaultInventorySourceService implements InventorySourceService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventorySourceDao dao;

  @Inject
  @Named("DefaultInventorySourceDao")
  public DefaultInventorySourceService(final InventorySourceDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySource find(java.lang.String id) {

    final InventorySource result = dao.find(id);
    logger.info("find(InventorySource) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySource> select(int maxResult) {
    final List<InventorySource> result = dao.select(maxResult);
    logger.info("select(InventorySource) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventorySource> selectAll() {
    final List<InventorySource> results = dao.selectAll();
    logger.info("selectAll(InventorySource) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySource create(InventorySource bean) {
    requireNonNull(bean);
    logger.info("create(InventorySource={}) - entered bean ");

    final InventorySource result = dao.create(bean);

    logger.info("create(InventorySource) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventorySource update(InventorySource bean) {
    requireNonNull(bean);
    logger.info("update(InventorySource={}) - entered bean ");

    final InventorySource result = dao.update(bean);

    logger.info("update(InventorySource) - exited - return value={} result ");
    return result;
  }
}
