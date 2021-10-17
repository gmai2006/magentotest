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
import com.magento.test.dao.SearchSynonymsDao;
import com.magento.test.entity.SearchSynonyms;

@Stateless
@Named("DefaultSearchSynonymsService")
public class DefaultSearchSynonymsService implements SearchSynonymsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SearchSynonymsDao dao;

  @Inject
  @Named("DefaultSearchSynonymsDao")
  public DefaultSearchSynonymsService(final SearchSynonymsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SearchSynonyms find(java.lang.Long id) {

    final SearchSynonyms result = dao.find(id);
    logger.info("find(SearchSynonyms) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SearchSynonyms> select(int maxResult) {
    final List<SearchSynonyms> result = dao.select(maxResult);
    logger.info("select(SearchSynonyms) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SearchSynonyms> selectAll() {
    final List<SearchSynonyms> results = dao.selectAll();
    logger.info("selectAll(SearchSynonyms) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SearchSynonyms create(SearchSynonyms bean) {
    requireNonNull(bean);
    logger.info("create(SearchSynonyms={}) - entered bean ");

    final SearchSynonyms result = dao.create(bean);

    logger.info("create(SearchSynonyms) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SearchSynonyms update(SearchSynonyms bean) {
    requireNonNull(bean);
    logger.info("update(SearchSynonyms={}) - entered bean ");

    final SearchSynonyms result = dao.update(bean);

    logger.info("update(SearchSynonyms) - exited - return value={} result ");
    return result;
  }
}
