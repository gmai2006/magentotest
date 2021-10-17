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
import com.magento.test.dao.IndexerStateDao;
import com.magento.test.entity.IndexerState;

@Stateless
@Named("DefaultIndexerStateService")
public class DefaultIndexerStateService implements IndexerStateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final IndexerStateDao dao;

  @Inject
  @Named("DefaultIndexerStateDao")
  public DefaultIndexerStateService(final IndexerStateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public IndexerState find(java.lang.Integer id) {

    final IndexerState result = dao.find(id);
    logger.info("find(IndexerState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<IndexerState> select(int maxResult) {
    final List<IndexerState> result = dao.select(maxResult);
    logger.info("select(IndexerState) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<IndexerState> selectAll() {
    final List<IndexerState> results = dao.selectAll();
    logger.info("selectAll(IndexerState) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public IndexerState create(IndexerState bean) {
    requireNonNull(bean);
    logger.info("create(IndexerState={}) - entered bean ");

    final IndexerState result = dao.create(bean);

    logger.info("create(IndexerState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public IndexerState update(IndexerState bean) {
    requireNonNull(bean);
    logger.info("update(IndexerState={}) - entered bean ");

    final IndexerState result = dao.update(bean);

    logger.info("update(IndexerState) - exited - return value={} result ");
    return result;
  }
}
