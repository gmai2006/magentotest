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
import com.magento.test.dao.StoreWebsiteDao;
import com.magento.test.entity.StoreWebsite;
import com.magento.test.entity.StoreWebsiteId;

@Stateless
@Named("DefaultStoreWebsiteService")
public class DefaultStoreWebsiteService implements StoreWebsiteService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final StoreWebsiteDao dao;

  @Inject
  @Named("DefaultStoreWebsiteDao")
  public DefaultStoreWebsiteService(final StoreWebsiteDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public StoreWebsite find(StoreWebsiteId id) {
    final StoreWebsite result = dao.find(id);
    logger.info("find(StoreWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<StoreWebsite> select(int maxResult) {
    final List<StoreWebsite> result = dao.select(maxResult);
    logger.info("select(StoreWebsite) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<StoreWebsite> selectAll() {
    final List<StoreWebsite> results = dao.selectAll();
    logger.info("selectAll(StoreWebsite) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public StoreWebsite create(StoreWebsite bean) {
    requireNonNull(bean);
    logger.info("create(StoreWebsite={}) - entered bean ");

    final StoreWebsite result = dao.create(bean);

    logger.info("create(StoreWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public StoreWebsite update(StoreWebsite bean) {
    requireNonNull(bean);
    logger.info("update(StoreWebsite={}) - entered bean ");

    final StoreWebsite result = dao.update(bean);

    logger.info("update(StoreWebsite) - exited - return value={} result ");
    return result;
  }
}
