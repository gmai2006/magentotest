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
import com.magento.test.dao.CaptchaLogDao;
import com.magento.test.entity.CaptchaLog;
import com.magento.test.entity.CaptchaLogId;

@Stateless
@Named("DefaultCaptchaLogService")
public class DefaultCaptchaLogService implements CaptchaLogService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CaptchaLogDao dao;

  @Inject
  @Named("DefaultCaptchaLogDao")
  public DefaultCaptchaLogService(final CaptchaLogDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CaptchaLog find(CaptchaLogId id) {
    final CaptchaLog result = dao.find(id);
    logger.info("find(CaptchaLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CaptchaLog> select(int maxResult) {
    final List<CaptchaLog> result = dao.select(maxResult);
    logger.info("select(CaptchaLog) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CaptchaLog> selectAll() {
    final List<CaptchaLog> results = dao.selectAll();
    logger.info("selectAll(CaptchaLog) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CaptchaLog create(CaptchaLog bean) {
    requireNonNull(bean);
    logger.info("create(CaptchaLog={}) - entered bean ");

    final CaptchaLog result = dao.create(bean);

    logger.info("create(CaptchaLog) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CaptchaLog update(CaptchaLog bean) {
    requireNonNull(bean);
    logger.info("update(CaptchaLog={}) - entered bean ");

    final CaptchaLog result = dao.update(bean);

    logger.info("update(CaptchaLog) - exited - return value={} result ");
    return result;
  }
}
