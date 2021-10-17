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
import com.magento.test.dao.CacheTagDao;
import com.magento.test.entity.CacheTag;
import com.magento.test.entity.CacheTagId;

@Stateless
@Named("DefaultCacheTagService")
public class DefaultCacheTagService implements CacheTagService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CacheTagDao dao;

  @Inject
  @Named("DefaultCacheTagDao")
  public DefaultCacheTagService(final CacheTagDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CacheTag find(CacheTagId id) {
    final CacheTag result = dao.find(id);
    logger.info("find(CacheTag) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CacheTag> select(int maxResult) {
    final List<CacheTag> result = dao.select(maxResult);
    logger.info("select(CacheTag) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CacheTag> selectAll() {
    final List<CacheTag> results = dao.selectAll();
    logger.info("selectAll(CacheTag) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CacheTag create(CacheTag bean) {
    requireNonNull(bean);
    logger.info("create(CacheTag={}) - entered bean ");

    final CacheTag result = dao.create(bean);

    logger.info("create(CacheTag) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CacheTag update(CacheTag bean) {
    requireNonNull(bean);
    logger.info("update(CacheTag={}) - entered bean ");

    final CacheTag result = dao.update(bean);

    logger.info("update(CacheTag) - exited - return value={} result ");
    return result;
  }
}
