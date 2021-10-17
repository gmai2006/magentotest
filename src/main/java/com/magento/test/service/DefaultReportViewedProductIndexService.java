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
import com.magento.test.dao.ReportViewedProductIndexDao;
import com.magento.test.entity.ReportViewedProductIndex;
import com.magento.test.entity.ReportViewedProductIndexId;

@Stateless
@Named("DefaultReportViewedProductIndexService")
public class DefaultReportViewedProductIndexService implements ReportViewedProductIndexService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReportViewedProductIndexDao dao;

  @Inject
  @Named("DefaultReportViewedProductIndexDao")
  public DefaultReportViewedProductIndexService(final ReportViewedProductIndexDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductIndex find(ReportViewedProductIndexId id) {
    final ReportViewedProductIndex result = dao.find(id);
    logger.info("find(ReportViewedProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReportViewedProductIndex> select(int maxResult) {
    final List<ReportViewedProductIndex> result = dao.select(maxResult);
    logger.info("select(ReportViewedProductIndex) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReportViewedProductIndex> selectAll() {
    final List<ReportViewedProductIndex> results = dao.selectAll();
    logger.info("selectAll(ReportViewedProductIndex) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductIndex create(ReportViewedProductIndex bean) {
    requireNonNull(bean);
    logger.info("create(ReportViewedProductIndex={}) - entered bean ");

    final ReportViewedProductIndex result = dao.create(bean);

    logger.info("create(ReportViewedProductIndex) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductIndex update(ReportViewedProductIndex bean) {
    requireNonNull(bean);
    logger.info("update(ReportViewedProductIndex={}) - entered bean ");

    final ReportViewedProductIndex result = dao.update(bean);

    logger.info("update(ReportViewedProductIndex) - exited - return value={} result ");
    return result;
  }
}
