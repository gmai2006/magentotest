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
import com.magento.test.dao.QuoteAddressItemDao;
import com.magento.test.entity.QuoteAddressItem;

@Stateless
@Named("DefaultQuoteAddressItemService")
public class DefaultQuoteAddressItemService implements QuoteAddressItemService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final QuoteAddressItemDao dao;

  @Inject
  @Named("DefaultQuoteAddressItemDao")
  public DefaultQuoteAddressItemService(final QuoteAddressItemDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteAddressItem find(java.lang.Integer id) {

    final QuoteAddressItem result = dao.find(id);
    logger.info("find(QuoteAddressItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteAddressItem> select(int maxResult) {
    final List<QuoteAddressItem> result = dao.select(maxResult);
    logger.info("select(QuoteAddressItem) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<QuoteAddressItem> selectAll() {
    final List<QuoteAddressItem> results = dao.selectAll();
    logger.info("selectAll(QuoteAddressItem) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteAddressItem create(QuoteAddressItem bean) {
    requireNonNull(bean);
    logger.info("create(QuoteAddressItem={}) - entered bean ");

    final QuoteAddressItem result = dao.create(bean);

    logger.info("create(QuoteAddressItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public QuoteAddressItem update(QuoteAddressItem bean) {
    requireNonNull(bean);
    logger.info("update(QuoteAddressItem={}) - entered bean ");

    final QuoteAddressItem result = dao.update(bean);

    logger.info("update(QuoteAddressItem) - exited - return value={} result ");
    return result;
  }
}
