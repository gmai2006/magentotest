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
import com.magento.test.dao.ReviewDao;
import com.magento.test.entity.Review;

@Stateless
@Named("DefaultReviewService")
public class DefaultReviewService implements ReviewService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReviewDao dao;

  @Inject
  @Named("DefaultReviewDao")
  public DefaultReviewService(final ReviewDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Review find(java.lang.Long id) {

    final Review result = dao.find(id);
    logger.info("find(Review) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Review> select(int maxResult) {
    final List<Review> result = dao.select(maxResult);
    logger.info("select(Review) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Review> selectAll() {
    final List<Review> results = dao.selectAll();
    logger.info("selectAll(Review) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Review create(Review bean) {
    requireNonNull(bean);
    logger.info("create(Review={}) - entered bean ");

    final Review result = dao.create(bean);

    logger.info("create(Review) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Review update(Review bean) {
    requireNonNull(bean);
    logger.info("update(Review={}) - entered bean ");

    final Review result = dao.update(bean);

    logger.info("update(Review) - exited - return value={} result ");
    return result;
  }
}
