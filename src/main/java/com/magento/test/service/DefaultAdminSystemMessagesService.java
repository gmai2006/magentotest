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
import com.magento.test.dao.AdminSystemMessagesDao;
import com.magento.test.entity.AdminSystemMessages;

@Stateless
@Named("DefaultAdminSystemMessagesService")
public class DefaultAdminSystemMessagesService implements AdminSystemMessagesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AdminSystemMessagesDao dao;

  @Inject
  @Named("DefaultAdminSystemMessagesDao")
  public DefaultAdminSystemMessagesService(final AdminSystemMessagesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AdminSystemMessages find(java.lang.String id) {

    final AdminSystemMessages result = dao.find(id);
    logger.info("find(AdminSystemMessages) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AdminSystemMessages> select(int maxResult) {
    final List<AdminSystemMessages> result = dao.select(maxResult);
    logger.info("select(AdminSystemMessages) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AdminSystemMessages> selectAll() {
    final List<AdminSystemMessages> results = dao.selectAll();
    logger.info("selectAll(AdminSystemMessages) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AdminSystemMessages create(AdminSystemMessages bean) {
    requireNonNull(bean);
    logger.info("create(AdminSystemMessages={}) - entered bean ");

    final AdminSystemMessages result = dao.create(bean);

    logger.info("create(AdminSystemMessages) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AdminSystemMessages update(AdminSystemMessages bean) {
    requireNonNull(bean);
    logger.info("update(AdminSystemMessages={}) - entered bean ");

    final AdminSystemMessages result = dao.update(bean);

    logger.info("update(AdminSystemMessages) - exited - return value={} result ");
    return result;
  }
}