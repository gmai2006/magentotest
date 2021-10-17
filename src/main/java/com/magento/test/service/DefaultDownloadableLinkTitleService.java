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
import com.magento.test.dao.DownloadableLinkTitleDao;
import com.magento.test.entity.DownloadableLinkTitle;
import com.magento.test.entity.DownloadableLinkTitleId;

@Stateless
@Named("DefaultDownloadableLinkTitleService")
public class DefaultDownloadableLinkTitleService implements DownloadableLinkTitleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DownloadableLinkTitleDao dao;

  @Inject
  @Named("DefaultDownloadableLinkTitleDao")
  public DefaultDownloadableLinkTitleService(final DownloadableLinkTitleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLinkTitle find(DownloadableLinkTitleId id) {
    final DownloadableLinkTitle result = dao.find(id);
    logger.info("find(DownloadableLinkTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableLinkTitle> select(int maxResult) {
    final List<DownloadableLinkTitle> result = dao.select(maxResult);
    logger.info("select(DownloadableLinkTitle) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableLinkTitle> selectAll() {
    final List<DownloadableLinkTitle> results = dao.selectAll();
    logger.info("selectAll(DownloadableLinkTitle) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLinkTitle create(DownloadableLinkTitle bean) {
    requireNonNull(bean);
    logger.info("create(DownloadableLinkTitle={}) - entered bean ");

    final DownloadableLinkTitle result = dao.create(bean);

    logger.info("create(DownloadableLinkTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLinkTitle update(DownloadableLinkTitle bean) {
    requireNonNull(bean);
    logger.info("update(DownloadableLinkTitle={}) - entered bean ");

    final DownloadableLinkTitle result = dao.update(bean);

    logger.info("update(DownloadableLinkTitle) - exited - return value={} result ");
    return result;
  }
}
