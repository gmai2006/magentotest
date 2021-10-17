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
import com.magento.test.dao.StoreGroupDao;
import com.magento.test.entity.StoreGroup;
import com.magento.test.entity.StoreGroupId;

@Stateless
@Named("DefaultStoreGroupService")
public class DefaultStoreGroupService implements StoreGroupService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StoreGroupDao dao;

  @Inject
  @Named("DefaultStoreGroupDao")
  public DefaultStoreGroupService(final StoreGroupDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public StoreGroup find(StoreGroupId id) {
    final StoreGroup result = dao.find(id);
    logger.info("find(StoreGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<StoreGroup> select(int maxResult) {
    final List<StoreGroup> result = dao.select(maxResult);
    logger.info("select(StoreGroup) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<StoreGroup> selectAll() {
    final List<StoreGroup> results = dao.selectAll();
    logger.info("selectAll(StoreGroup) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public StoreGroup create(StoreGroup bean) {
    requireNonNull(bean);
    logger.info("create(StoreGroup={}) - entered bean ");

    final StoreGroup result = dao.create(bean);

    logger.info("create(StoreGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public StoreGroup update(StoreGroup bean) {
    requireNonNull(bean);
    logger.info("update(StoreGroup={}) - entered bean ");

    final StoreGroup result = dao.update(bean);

    logger.info("update(StoreGroup) - exited - return value={} result ");
    return result;
  }
}
