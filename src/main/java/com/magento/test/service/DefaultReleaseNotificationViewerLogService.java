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
import com.magento.test.dao.ReleaseNotificationViewerLogDao;
import com.magento.test.entity.ReleaseNotificationViewerLog;
import com.magento.test.entity.ReleaseNotificationViewerLogId;

@Stateless
@Named("DefaultReleaseNotificationViewerLogService")
public class DefaultReleaseNotificationViewerLogService
    implements ReleaseNotificationViewerLogService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ReleaseNotificationViewerLogDao dao;

  @Inject
  @Named("DefaultReleaseNotificationViewerLogDao")
  public DefaultReleaseNotificationViewerLogService(final ReleaseNotificationViewerLogDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ReleaseNotificationViewerLog find(ReleaseNotificationViewerLogId id) {
    final ReleaseNotificationViewerLog result = dao.find(id);
    logger.info("find(ReleaseNotificationViewerLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ReleaseNotificationViewerLog> select(int maxResult) {
    final List<ReleaseNotificationViewerLog> result = dao.select(maxResult);
    logger.info("select(ReleaseNotificationViewerLog) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ReleaseNotificationViewerLog> selectAll() {
    final List<ReleaseNotificationViewerLog> results = dao.selectAll();
    logger.info("selectAll(ReleaseNotificationViewerLog) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ReleaseNotificationViewerLog create(ReleaseNotificationViewerLog bean) {
    requireNonNull(bean);
    logger.info("create(ReleaseNotificationViewerLog={}) - entered bean ");

    final ReleaseNotificationViewerLog result = dao.create(bean);

    logger.info("create(ReleaseNotificationViewerLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ReleaseNotificationViewerLog update(ReleaseNotificationViewerLog bean) {
    requireNonNull(bean);
    logger.info("update(ReleaseNotificationViewerLog={}) - entered bean ");

    final ReleaseNotificationViewerLog result = dao.update(bean);

    logger.info("update(ReleaseNotificationViewerLog) - exited - return value={} result ");
    return result;
  }
}
