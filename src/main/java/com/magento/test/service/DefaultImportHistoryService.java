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
import com.magento.test.dao.ImportHistoryDao;
import com.magento.test.entity.ImportHistory;

@Stateless
@Named("DefaultImportHistoryService")
public class DefaultImportHistoryService implements ImportHistoryService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ImportHistoryDao dao;

  @Inject
  @Named("DefaultImportHistoryDao")
  public DefaultImportHistoryService(final ImportHistoryDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ImportHistory find(java.lang.Integer id) {

    final ImportHistory result = dao.find(id);
    logger.info("find(ImportHistory) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ImportHistory> select(int maxResult) {
    final List<ImportHistory> result = dao.select(maxResult);
    logger.info("select(ImportHistory) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ImportHistory> selectAll() {
    final List<ImportHistory> results = dao.selectAll();
    logger.info("selectAll(ImportHistory) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ImportHistory create(ImportHistory bean) {
    requireNonNull(bean);
    logger.info("create(ImportHistory={}) - entered bean ");

    final ImportHistory result = dao.create(bean);

    logger.info("create(ImportHistory) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ImportHistory update(ImportHistory bean) {
    requireNonNull(bean);
    logger.info("update(ImportHistory={}) - entered bean ");

    final ImportHistory result = dao.update(bean);

    logger.info("update(ImportHistory) - exited - return value={} result ");
    return result;
  }
}
