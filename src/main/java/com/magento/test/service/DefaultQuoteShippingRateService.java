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
import com.magento.test.dao.QuoteShippingRateDao;
import com.magento.test.entity.QuoteShippingRate;

@Stateless
@Named("DefaultQuoteShippingRateService")
public class DefaultQuoteShippingRateService implements QuoteShippingRateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuoteShippingRateDao dao;

  @Inject
  @Named("DefaultQuoteShippingRateDao")
  public DefaultQuoteShippingRateService(final QuoteShippingRateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteShippingRate find(java.lang.Integer id) {

    final QuoteShippingRate result = dao.find(id);
    logger.info("find(QuoteShippingRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteShippingRate> select(int maxResult) {
    final List<QuoteShippingRate> result = dao.select(maxResult);
    logger.info("select(QuoteShippingRate) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteShippingRate> selectAll() {
    final List<QuoteShippingRate> results = dao.selectAll();
    logger.info("selectAll(QuoteShippingRate) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteShippingRate create(QuoteShippingRate bean) {
    requireNonNull(bean);
    logger.info("create(QuoteShippingRate={}) - entered bean ");

    final QuoteShippingRate result = dao.create(bean);

    logger.info("create(QuoteShippingRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteShippingRate update(QuoteShippingRate bean) {
    requireNonNull(bean);
    logger.info("update(QuoteShippingRate={}) - entered bean ");

    final QuoteShippingRate result = dao.update(bean);

    logger.info("update(QuoteShippingRate) - exited - return value={} result ");
    return result;
  }
}
