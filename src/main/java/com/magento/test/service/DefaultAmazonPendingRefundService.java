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
import com.magento.test.dao.AmazonPendingRefundDao;
import com.magento.test.entity.AmazonPendingRefund;
import com.magento.test.entity.AmazonPendingRefundId;

@Stateless
@Named("DefaultAmazonPendingRefundService")
public class DefaultAmazonPendingRefundService implements AmazonPendingRefundService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AmazonPendingRefundDao dao;

  @Inject
  @Named("DefaultAmazonPendingRefundDao")
  public DefaultAmazonPendingRefundService(final AmazonPendingRefundDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonPendingRefund find(AmazonPendingRefundId id) {
    final AmazonPendingRefund result = dao.find(id);
    logger.info("find(AmazonPendingRefund) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AmazonPendingRefund> select(int maxResult) {
    final List<AmazonPendingRefund> result = dao.select(maxResult);
    logger.info("select(AmazonPendingRefund) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AmazonPendingRefund> selectAll() {
    final List<AmazonPendingRefund> results = dao.selectAll();
    logger.info("selectAll(AmazonPendingRefund) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonPendingRefund create(AmazonPendingRefund bean) {
    requireNonNull(bean);
    logger.info("create(AmazonPendingRefund={}) - entered bean ");

    final AmazonPendingRefund result = dao.create(bean);

    logger.info("create(AmazonPendingRefund) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonPendingRefund update(AmazonPendingRefund bean) {
    requireNonNull(bean);
    logger.info("update(AmazonPendingRefund={}) - entered bean ");

    final AmazonPendingRefund result = dao.update(bean);

    logger.info("update(AmazonPendingRefund) - exited - return value={} result ");
    return result;
  }
}
