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
import com.magento.test.dao.ReviewStoreDao;
import com.magento.test.entity.ReviewStore;
import com.magento.test.entity.ReviewStoreId;

@Stateless
@Named("DefaultReviewStoreService")
public class DefaultReviewStoreService implements ReviewStoreService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReviewStoreDao dao;

  @Inject
  @Named("DefaultReviewStoreDao")
  public DefaultReviewStoreService(final ReviewStoreDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewStore find(ReviewStoreId id) {
    final ReviewStore result = dao.find(id);
    logger.info("find(ReviewStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReviewStore> select(int maxResult) {
    final List<ReviewStore> result = dao.select(maxResult);
    logger.info("select(ReviewStore) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReviewStore> selectAll() {
    final List<ReviewStore> results = dao.selectAll();
    logger.info("selectAll(ReviewStore) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewStore create(ReviewStore bean) {
    requireNonNull(bean);
    logger.info("create(ReviewStore={}) - entered bean ");

    final ReviewStore result = dao.create(bean);

    logger.info("create(ReviewStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewStore update(ReviewStore bean) {
    requireNonNull(bean);
    logger.info("update(ReviewStore={}) - entered bean ");

    final ReviewStore result = dao.update(bean);

    logger.info("update(ReviewStore) - exited - return value={} result ");
    return result;
  }
}
