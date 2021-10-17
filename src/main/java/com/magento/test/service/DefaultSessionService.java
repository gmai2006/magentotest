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
import com.magento.test.dao.SessionDao;
import com.magento.test.entity.Session;

@Stateless
@Named("DefaultSessionService")
public class DefaultSessionService implements SessionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SessionDao dao;

  @Inject
  @Named("DefaultSessionDao")
  public DefaultSessionService(final SessionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Session find(java.lang.String id) {

    final Session result = dao.find(id);
    logger.info("find(Session) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Session> select(int maxResult) {
    final List<Session> result = dao.select(maxResult);
    logger.info("select(Session) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Session> selectAll() {
    final List<Session> results = dao.selectAll();
    logger.info("selectAll(Session) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Session create(Session bean) {
    requireNonNull(bean);
    logger.info("create(Session={}) - entered bean ");

    final Session result = dao.create(bean);

    logger.info("create(Session) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Session update(Session bean) {
    requireNonNull(bean);
    logger.info("update(Session={}) - entered bean ");

    final Session result = dao.update(bean);

    logger.info("update(Session) - exited - return value={} result ");
    return result;
  }
}
