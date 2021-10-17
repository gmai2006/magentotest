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
import com.magento.test.dao.AdminPasswordsDao;
import com.magento.test.entity.AdminPasswords;

@Stateless
@Named("DefaultAdminPasswordsService")
public class DefaultAdminPasswordsService implements AdminPasswordsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AdminPasswordsDao dao;

  @Inject
  @Named("DefaultAdminPasswordsDao")
  public DefaultAdminPasswordsService(final AdminPasswordsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AdminPasswords find(java.lang.Integer id) {

    final AdminPasswords result = dao.find(id);
    logger.info("find(AdminPasswords) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AdminPasswords> select(int maxResult) {
    final List<AdminPasswords> result = dao.select(maxResult);
    logger.info("select(AdminPasswords) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AdminPasswords> selectAll() {
    final List<AdminPasswords> results = dao.selectAll();
    logger.info("selectAll(AdminPasswords) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AdminPasswords create(AdminPasswords bean) {
    requireNonNull(bean);
    logger.info("create(AdminPasswords={}) - entered bean ");

    final AdminPasswords result = dao.create(bean);

    logger.info("create(AdminPasswords) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AdminPasswords update(AdminPasswords bean) {
    requireNonNull(bean);
    logger.info("update(AdminPasswords={}) - entered bean ");

    final AdminPasswords result = dao.update(bean);

    logger.info("update(AdminPasswords) - exited - return value={} result ");
    return result;
  }
}
