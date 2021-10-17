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
import com.magento.test.dao.ReportComparedProductIndexDao;
import com.magento.test.entity.ReportComparedProductIndex;
import com.magento.test.entity.ReportComparedProductIndexId;

@Stateless
@Named("DefaultReportComparedProductIndexService")
public class DefaultReportComparedProductIndexService implements ReportComparedProductIndexService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReportComparedProductIndexDao dao;

  @Inject
  @Named("DefaultReportComparedProductIndexDao")
  public DefaultReportComparedProductIndexService(final ReportComparedProductIndexDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReportComparedProductIndex find(ReportComparedProductIndexId id) {
    final ReportComparedProductIndex result = dao.find(id);
    logger.info("find(ReportComparedProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReportComparedProductIndex> select(int maxResult) {
    final List<ReportComparedProductIndex> result = dao.select(maxResult);
    logger.info("select(ReportComparedProductIndex) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReportComparedProductIndex> selectAll() {
    final List<ReportComparedProductIndex> results = dao.selectAll();
    logger.info("selectAll(ReportComparedProductIndex) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReportComparedProductIndex create(ReportComparedProductIndex bean) {
    requireNonNull(bean);
    logger.info("create(ReportComparedProductIndex={}) - entered bean ");

    final ReportComparedProductIndex result = dao.create(bean);

    logger.info("create(ReportComparedProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReportComparedProductIndex update(ReportComparedProductIndex bean) {
    requireNonNull(bean);
    logger.info("update(ReportComparedProductIndex={}) - entered bean ");

    final ReportComparedProductIndex result = dao.update(bean);

    logger.info("update(ReportComparedProductIndex) - exited - return value={} result ");
    return result;
  }
}
