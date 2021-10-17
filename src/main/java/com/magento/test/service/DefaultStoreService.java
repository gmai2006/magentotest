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
import com.magento.test.dao.StoreDao;
import com.magento.test.entity.Store;
import com.magento.test.entity.StoreId;

@Stateless
@Named("DefaultStoreService")
public class DefaultStoreService implements StoreService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StoreDao dao;

  @Inject
  @Named("DefaultStoreDao")
  public DefaultStoreService(final StoreDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Store find(StoreId id) {
    final Store result = dao.find(id);
    logger.info("find(Store) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Store> select(int maxResult) {
    final List<Store> result = dao.select(maxResult);
    logger.info("select(Store) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Store> selectAll() {
    final List<Store> results = dao.selectAll();
    logger.info("selectAll(Store) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Store create(Store bean) {
    requireNonNull(bean);
    logger.info("create(Store={}) - entered bean ");

    final Store result = dao.create(bean);

    logger.info("create(Store) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Store update(Store bean) {
    requireNonNull(bean);
    logger.info("update(Store={}) - entered bean ");

    final Store result = dao.update(bean);

    logger.info("update(Store) - exited - return value={} result ");
    return result;
  }
}
