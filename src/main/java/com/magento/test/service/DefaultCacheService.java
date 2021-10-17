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
import com.magento.test.dao.CacheDao;
import com.magento.test.entity.Cache;

@Stateless
@Named("DefaultCacheService")
public class DefaultCacheService implements CacheService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CacheDao dao;

  @Inject
  @Named("DefaultCacheDao")
  public DefaultCacheService(final CacheDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Cache find(java.lang.String id) {

    final Cache result = dao.find(id);
    logger.info("find(Cache) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Cache> select(int maxResult) {
    final List<Cache> result = dao.select(maxResult);
    logger.info("select(Cache) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Cache> selectAll() {
    final List<Cache> results = dao.selectAll();
    logger.info("selectAll(Cache) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Cache create(Cache bean) {
    requireNonNull(bean);
    logger.info("create(Cache={}) - entered bean ");

    final Cache result = dao.create(bean);

    logger.info("create(Cache) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Cache update(Cache bean) {
    requireNonNull(bean);
    logger.info("update(Cache={}) - entered bean ");

    final Cache result = dao.update(bean);

    logger.info("update(Cache) - exited - return value={} result ");
    return result;
  }
}
