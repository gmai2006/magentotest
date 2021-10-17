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
import com.magento.test.dao.QuoteDao;
import com.magento.test.entity.Quote;

@Stateless
@Named("DefaultQuoteService")
public class DefaultQuoteService implements QuoteService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuoteDao dao;

  @Inject
  @Named("DefaultQuoteDao")
  public DefaultQuoteService(final QuoteDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Quote find(java.lang.Integer id) {

    final Quote result = dao.find(id);
    logger.info("find(Quote) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Quote> select(int maxResult) {
    final List<Quote> result = dao.select(maxResult);
    logger.info("select(Quote) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Quote> selectAll() {
    final List<Quote> results = dao.selectAll();
    logger.info("selectAll(Quote) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Quote create(Quote bean) {
    requireNonNull(bean);
    logger.info("create(Quote={}) - entered bean ");

    final Quote result = dao.create(bean);

    logger.info("create(Quote) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Quote update(Quote bean) {
    requireNonNull(bean);
    logger.info("update(Quote={}) - entered bean ");

    final Quote result = dao.update(bean);

    logger.info("update(Quote) - exited - return value={} result ");
    return result;
  }
}
