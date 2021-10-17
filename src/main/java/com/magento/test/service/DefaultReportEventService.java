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
import com.magento.test.dao.ReportEventDao;
import com.magento.test.entity.ReportEvent;

@Stateless
@Named("DefaultReportEventService")
public class DefaultReportEventService implements ReportEventService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReportEventDao dao;

  @Inject
  @Named("DefaultReportEventDao")
  public DefaultReportEventService(final ReportEventDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReportEvent find(java.lang.Long id) {

    final ReportEvent result = dao.find(id);
    logger.info("find(ReportEvent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReportEvent> select(int maxResult) {
    final List<ReportEvent> result = dao.select(maxResult);
    logger.info("select(ReportEvent) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReportEvent> selectAll() {
    final List<ReportEvent> results = dao.selectAll();
    logger.info("selectAll(ReportEvent) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReportEvent create(ReportEvent bean) {
    requireNonNull(bean);
    logger.info("create(ReportEvent={}) - entered bean ");

    final ReportEvent result = dao.create(bean);

    logger.info("create(ReportEvent) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReportEvent update(ReportEvent bean) {
    requireNonNull(bean);
    logger.info("update(ReportEvent={}) - entered bean ");

    final ReportEvent result = dao.update(bean);

    logger.info("update(ReportEvent) - exited - return value={} result ");
    return result;
  }
}
