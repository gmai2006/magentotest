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
import com.magento.test.dao.ReportViewedProductAggregatedYearlyDao;
import com.magento.test.entity.ReportViewedProductAggregatedYearly;
import com.magento.test.entity.ReportViewedProductAggregatedYearlyId;

@Stateless
@Named("DefaultReportViewedProductAggregatedYearlyService")
public class DefaultReportViewedProductAggregatedYearlyService
    implements ReportViewedProductAggregatedYearlyService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReportViewedProductAggregatedYearlyDao dao;

  @Inject
  @Named("DefaultReportViewedProductAggregatedYearlyDao")
  public DefaultReportViewedProductAggregatedYearlyService(
      final ReportViewedProductAggregatedYearlyDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductAggregatedYearly find(ReportViewedProductAggregatedYearlyId id) {
    final ReportViewedProductAggregatedYearly result = dao.find(id);
    logger.info("find(ReportViewedProductAggregatedYearly) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReportViewedProductAggregatedYearly> select(int maxResult) {
    final List<ReportViewedProductAggregatedYearly> result = dao.select(maxResult);
    logger.info("select(ReportViewedProductAggregatedYearly) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReportViewedProductAggregatedYearly> selectAll() {
    final List<ReportViewedProductAggregatedYearly> results = dao.selectAll();
    logger.info(
        "selectAll(ReportViewedProductAggregatedYearly) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductAggregatedYearly create(ReportViewedProductAggregatedYearly bean) {
    requireNonNull(bean);
    logger.info("create(ReportViewedProductAggregatedYearly={}) - entered bean ");

    final ReportViewedProductAggregatedYearly result = dao.create(bean);

    logger.info("create(ReportViewedProductAggregatedYearly) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReportViewedProductAggregatedYearly update(ReportViewedProductAggregatedYearly bean) {
    requireNonNull(bean);
    logger.info("update(ReportViewedProductAggregatedYearly={}) - entered bean ");

    final ReportViewedProductAggregatedYearly result = dao.update(bean);

    logger.info("update(ReportViewedProductAggregatedYearly) - exited - return value={} result ");
    return result;
  }
}
