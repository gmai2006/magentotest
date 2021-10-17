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
import com.magento.test.dao.SearchQueryDao;
import com.magento.test.entity.SearchQuery;
import com.magento.test.entity.SearchQueryId;

@Stateless
@Named("DefaultSearchQueryService")
public class DefaultSearchQueryService implements SearchQueryService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SearchQueryDao dao;

  @Inject
  @Named("DefaultSearchQueryDao")
  public DefaultSearchQueryService(final SearchQueryDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SearchQuery find(SearchQueryId id) {
    final SearchQuery result = dao.find(id);
    logger.info("find(SearchQuery) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SearchQuery> select(int maxResult) {
    final List<SearchQuery> result = dao.select(maxResult);
    logger.info("select(SearchQuery) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SearchQuery> selectAll() {
    final List<SearchQuery> results = dao.selectAll();
    logger.info("selectAll(SearchQuery) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SearchQuery create(SearchQuery bean) {
    requireNonNull(bean);
    logger.info("create(SearchQuery={}) - entered bean ");

    final SearchQuery result = dao.create(bean);

    logger.info("create(SearchQuery) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SearchQuery update(SearchQuery bean) {
    requireNonNull(bean);
    logger.info("update(SearchQuery={}) - entered bean ");

    final SearchQuery result = dao.update(bean);

    logger.info("update(SearchQuery) - exited - return value={} result ");
    return result;
  }
}
