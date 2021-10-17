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
import com.magento.test.dao.SalesCreditmemoCommentDao;
import com.magento.test.entity.SalesCreditmemoComment;

@Stateless
@Named("DefaultSalesCreditmemoCommentService")
public class DefaultSalesCreditmemoCommentService implements SalesCreditmemoCommentService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesCreditmemoCommentDao dao;

  @Inject
  @Named("DefaultSalesCreditmemoCommentDao")
  public DefaultSalesCreditmemoCommentService(final SalesCreditmemoCommentDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoComment find(java.lang.Integer id) {

    final SalesCreditmemoComment result = dao.find(id);
    logger.info("find(SalesCreditmemoComment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoComment> select(int maxResult) {
    final List<SalesCreditmemoComment> result = dao.select(maxResult);
    logger.info("select(SalesCreditmemoComment) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoComment> selectAll() {
    final List<SalesCreditmemoComment> results = dao.selectAll();
    logger.info("selectAll(SalesCreditmemoComment) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoComment create(SalesCreditmemoComment bean) {
    requireNonNull(bean);
    logger.info("create(SalesCreditmemoComment={}) - entered bean ");

    final SalesCreditmemoComment result = dao.create(bean);

    logger.info("create(SalesCreditmemoComment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoComment update(SalesCreditmemoComment bean) {
    requireNonNull(bean);
    logger.info("update(SalesCreditmemoComment={}) - entered bean ");

    final SalesCreditmemoComment result = dao.update(bean);

    logger.info("update(SalesCreditmemoComment) - exited - return value={} result ");
    return result;
  }
}
