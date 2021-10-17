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
import com.magento.test.dao.DownloadableLinkDao;
import com.magento.test.entity.DownloadableLink;

@Stateless
@Named("DefaultDownloadableLinkService")
public class DefaultDownloadableLinkService implements DownloadableLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DownloadableLinkDao dao;

  @Inject
  @Named("DefaultDownloadableLinkDao")
  public DefaultDownloadableLinkService(final DownloadableLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLink find(java.lang.Integer id) {

    final DownloadableLink result = dao.find(id);
    logger.info("find(DownloadableLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableLink> select(int maxResult) {
    final List<DownloadableLink> result = dao.select(maxResult);
    logger.info("select(DownloadableLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableLink> selectAll() {
    final List<DownloadableLink> results = dao.selectAll();
    logger.info("selectAll(DownloadableLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLink create(DownloadableLink bean) {
    requireNonNull(bean);
    logger.info("create(DownloadableLink={}) - entered bean ");

    final DownloadableLink result = dao.create(bean);

    logger.info("create(DownloadableLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableLink update(DownloadableLink bean) {
    requireNonNull(bean);
    logger.info("update(DownloadableLink={}) - entered bean ");

    final DownloadableLink result = dao.update(bean);

    logger.info("update(DownloadableLink) - exited - return value={} result ");
    return result;
  }
}
