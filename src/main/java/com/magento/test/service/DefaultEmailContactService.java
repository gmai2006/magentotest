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
import com.magento.test.dao.EmailContactDao;
import com.magento.test.entity.EmailContact;

@Stateless
@Named("DefaultEmailContactService")
public class DefaultEmailContactService implements EmailContactService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EmailContactDao dao;

  @Inject
  @Named("DefaultEmailContactDao")
  public DefaultEmailContactService(final EmailContactDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EmailContact find(java.lang.Integer id) {

    final EmailContact result = dao.find(id);
    logger.info("find(EmailContact) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EmailContact> select(int maxResult) {
    final List<EmailContact> result = dao.select(maxResult);
    logger.info("select(EmailContact) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EmailContact> selectAll() {
    final List<EmailContact> results = dao.selectAll();
    logger.info("selectAll(EmailContact) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EmailContact create(EmailContact bean) {
    requireNonNull(bean);
    logger.info("create(EmailContact={}) - entered bean ");

    final EmailContact result = dao.create(bean);

    logger.info("create(EmailContact) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EmailContact update(EmailContact bean) {
    requireNonNull(bean);
    logger.info("update(EmailContact={}) - entered bean ");

    final EmailContact result = dao.update(bean);

    logger.info("update(EmailContact) - exited - return value={} result ");
    return result;
  }
}
