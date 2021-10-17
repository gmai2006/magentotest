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
import com.magento.test.dao.EmailAbandonedCartDao;
import com.magento.test.entity.EmailAbandonedCart;

@Stateless
@Named("DefaultEmailAbandonedCartService")
public class DefaultEmailAbandonedCartService implements EmailAbandonedCartService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EmailAbandonedCartDao dao;

  @Inject
  @Named("DefaultEmailAbandonedCartDao")
  public DefaultEmailAbandonedCartService(final EmailAbandonedCartDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EmailAbandonedCart find(java.lang.Integer id) {

    final EmailAbandonedCart result = dao.find(id);
    logger.info("find(EmailAbandonedCart) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EmailAbandonedCart> select(int maxResult) {
    final List<EmailAbandonedCart> result = dao.select(maxResult);
    logger.info("select(EmailAbandonedCart) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EmailAbandonedCart> selectAll() {
    final List<EmailAbandonedCart> results = dao.selectAll();
    logger.info("selectAll(EmailAbandonedCart) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EmailAbandonedCart create(EmailAbandonedCart bean) {
    requireNonNull(bean);
    logger.info("create(EmailAbandonedCart={}) - entered bean ");

    final EmailAbandonedCart result = dao.create(bean);

    logger.info("create(EmailAbandonedCart) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EmailAbandonedCart update(EmailAbandonedCart bean) {
    requireNonNull(bean);
    logger.info("update(EmailAbandonedCart={}) - entered bean ");

    final EmailAbandonedCart result = dao.update(bean);

    logger.info("update(EmailAbandonedCart) - exited - return value={} result ");
    return result;
  }
}
