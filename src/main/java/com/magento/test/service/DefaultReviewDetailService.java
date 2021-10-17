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
import com.magento.test.dao.ReviewDetailDao;
import com.magento.test.entity.ReviewDetail;

@Stateless
@Named("DefaultReviewDetailService")
public class DefaultReviewDetailService implements ReviewDetailService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReviewDetailDao dao;

  @Inject
  @Named("DefaultReviewDetailDao")
  public DefaultReviewDetailService(final ReviewDetailDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewDetail find(java.lang.Long id) {

    final ReviewDetail result = dao.find(id);
    logger.info("find(ReviewDetail) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReviewDetail> select(int maxResult) {
    final List<ReviewDetail> result = dao.select(maxResult);
    logger.info("select(ReviewDetail) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReviewDetail> selectAll() {
    final List<ReviewDetail> results = dao.selectAll();
    logger.info("selectAll(ReviewDetail) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewDetail create(ReviewDetail bean) {
    requireNonNull(bean);
    logger.info("create(ReviewDetail={}) - entered bean ");

    final ReviewDetail result = dao.create(bean);

    logger.info("create(ReviewDetail) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReviewDetail update(ReviewDetail bean) {
    requireNonNull(bean);
    logger.info("update(ReviewDetail={}) - entered bean ");

    final ReviewDetail result = dao.update(bean);

    logger.info("update(ReviewDetail) - exited - return value={} result ");
    return result;
  }
}
