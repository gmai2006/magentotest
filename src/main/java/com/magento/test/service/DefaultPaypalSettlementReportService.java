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
import com.magento.test.dao.PaypalSettlementReportDao;
import com.magento.test.entity.PaypalSettlementReport;
import com.magento.test.entity.PaypalSettlementReportId;

@Stateless
@Named("DefaultPaypalSettlementReportService")
public class DefaultPaypalSettlementReportService implements PaypalSettlementReportService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PaypalSettlementReportDao dao;

  @Inject
  @Named("DefaultPaypalSettlementReportDao")
  public DefaultPaypalSettlementReportService(final PaypalSettlementReportDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalSettlementReport find(PaypalSettlementReportId id) {
    final PaypalSettlementReport result = dao.find(id);
    logger.info("find(PaypalSettlementReport) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalSettlementReport> select(int maxResult) {
    final List<PaypalSettlementReport> result = dao.select(maxResult);
    logger.info("select(PaypalSettlementReport) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<PaypalSettlementReport> selectAll() {
    final List<PaypalSettlementReport> results = dao.selectAll();
    logger.info("selectAll(PaypalSettlementReport) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalSettlementReport create(PaypalSettlementReport bean) {
    requireNonNull(bean);
    logger.info("create(PaypalSettlementReport={}) - entered bean ");

    final PaypalSettlementReport result = dao.create(bean);

    logger.info("create(PaypalSettlementReport) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public PaypalSettlementReport update(PaypalSettlementReport bean) {
    requireNonNull(bean);
    logger.info("update(PaypalSettlementReport={}) - entered bean ");

    final PaypalSettlementReport result = dao.update(bean);

    logger.info("update(PaypalSettlementReport) - exited - return value={} result ");
    return result;
  }
}
