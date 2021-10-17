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
import com.magento.test.dao.QuoteIdMaskDao;
import com.magento.test.entity.QuoteIdMask;
import com.magento.test.entity.QuoteIdMaskId;

@Stateless
@Named("DefaultQuoteIdMaskService")
public class DefaultQuoteIdMaskService implements QuoteIdMaskService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuoteIdMaskDao dao;

  @Inject
  @Named("DefaultQuoteIdMaskDao")
  public DefaultQuoteIdMaskService(final QuoteIdMaskDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteIdMask find(QuoteIdMaskId id) {
    final QuoteIdMask result = dao.find(id);
    logger.info("find(QuoteIdMask) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteIdMask> select(int maxResult) {
    final List<QuoteIdMask> result = dao.select(maxResult);
    logger.info("select(QuoteIdMask) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteIdMask> selectAll() {
    final List<QuoteIdMask> results = dao.selectAll();
    logger.info("selectAll(QuoteIdMask) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteIdMask create(QuoteIdMask bean) {
    requireNonNull(bean);
    logger.info("create(QuoteIdMask={}) - entered bean ");

    final QuoteIdMask result = dao.create(bean);

    logger.info("create(QuoteIdMask) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteIdMask update(QuoteIdMask bean) {
    requireNonNull(bean);
    logger.info("update(QuoteIdMask={}) - entered bean ");

    final QuoteIdMask result = dao.update(bean);

    logger.info("update(QuoteIdMask) - exited - return value={} result ");
    return result;
  }
}
