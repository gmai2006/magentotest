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
import com.magento.test.dao.DownloadableSampleTitleDao;
import com.magento.test.entity.DownloadableSampleTitle;
import com.magento.test.entity.DownloadableSampleTitleId;

@Stateless
@Named("DefaultDownloadableSampleTitleService")
public class DefaultDownloadableSampleTitleService implements DownloadableSampleTitleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DownloadableSampleTitleDao dao;

  @Inject
  @Named("DefaultDownloadableSampleTitleDao")
  public DefaultDownloadableSampleTitleService(final DownloadableSampleTitleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSampleTitle find(DownloadableSampleTitleId id) {
    final DownloadableSampleTitle result = dao.find(id);
    logger.info("find(DownloadableSampleTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableSampleTitle> select(int maxResult) {
    final List<DownloadableSampleTitle> result = dao.select(maxResult);
    logger.info("select(DownloadableSampleTitle) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableSampleTitle> selectAll() {
    final List<DownloadableSampleTitle> results = dao.selectAll();
    logger.info("selectAll(DownloadableSampleTitle) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSampleTitle create(DownloadableSampleTitle bean) {
    requireNonNull(bean);
    logger.info("create(DownloadableSampleTitle={}) - entered bean ");

    final DownloadableSampleTitle result = dao.create(bean);

    logger.info("create(DownloadableSampleTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSampleTitle update(DownloadableSampleTitle bean) {
    requireNonNull(bean);
    logger.info("update(DownloadableSampleTitle={}) - entered bean ");

    final DownloadableSampleTitle result = dao.update(bean);

    logger.info("update(DownloadableSampleTitle) - exited - return value={} result ");
    return result;
  }
}
