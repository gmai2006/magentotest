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
import com.magento.test.dao.AdminUserDao;
import com.magento.test.entity.AdminUser;
import com.magento.test.entity.AdminUserId;

@Stateless
@Named("DefaultAdminUserService")
public class DefaultAdminUserService implements AdminUserService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AdminUserDao dao;

  @Inject
  @Named("DefaultAdminUserDao")
  public DefaultAdminUserService(final AdminUserDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AdminUser find(AdminUserId id) {
    final AdminUser result = dao.find(id);
    logger.info("find(AdminUser) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AdminUser> select(int maxResult) {
    final List<AdminUser> result = dao.select(maxResult);
    logger.info("select(AdminUser) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AdminUser> selectAll() {
    final List<AdminUser> results = dao.selectAll();
    logger.info("selectAll(AdminUser) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AdminUser create(AdminUser bean) {
    requireNonNull(bean);
    logger.info("create(AdminUser={}) - entered bean ");

    final AdminUser result = dao.create(bean);

    logger.info("create(AdminUser) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AdminUser update(AdminUser bean) {
    requireNonNull(bean);
    logger.info("update(AdminUser={}) - entered bean ");

    final AdminUser result = dao.update(bean);

    logger.info("update(AdminUser) - exited - return value={} result ");
    return result;
  }
}
