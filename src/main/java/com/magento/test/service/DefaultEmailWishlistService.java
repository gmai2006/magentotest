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
import com.magento.test.dao.EmailWishlistDao;
import com.magento.test.entity.EmailWishlist;

@Stateless
@Named("DefaultEmailWishlistService")
public class DefaultEmailWishlistService implements EmailWishlistService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EmailWishlistDao dao;

  @Inject
  @Named("DefaultEmailWishlistDao")
  public DefaultEmailWishlistService(final EmailWishlistDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EmailWishlist find(java.lang.Integer id) {

    final EmailWishlist result = dao.find(id);
    logger.info("find(EmailWishlist) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EmailWishlist> select(int maxResult) {
    final List<EmailWishlist> result = dao.select(maxResult);
    logger.info("select(EmailWishlist) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EmailWishlist> selectAll() {
    final List<EmailWishlist> results = dao.selectAll();
    logger.info("selectAll(EmailWishlist) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EmailWishlist create(EmailWishlist bean) {
    requireNonNull(bean);
    logger.info("create(EmailWishlist={}) - entered bean ");

    final EmailWishlist result = dao.create(bean);

    logger.info("create(EmailWishlist) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EmailWishlist update(EmailWishlist bean) {
    requireNonNull(bean);
    logger.info("update(EmailWishlist={}) - entered bean ");

    final EmailWishlist result = dao.update(bean);

    logger.info("update(EmailWishlist) - exited - return value={} result ");
    return result;
  }
}
