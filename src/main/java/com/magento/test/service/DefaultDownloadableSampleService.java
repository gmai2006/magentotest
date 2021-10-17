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
import com.magento.test.dao.DownloadableSampleDao;
import com.magento.test.entity.DownloadableSample;

@Stateless
@Named("DefaultDownloadableSampleService")
public class DefaultDownloadableSampleService implements DownloadableSampleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DownloadableSampleDao dao;

  @Inject
  @Named("DefaultDownloadableSampleDao")
  public DefaultDownloadableSampleService(final DownloadableSampleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSample find(java.lang.Integer id) {

    final DownloadableSample result = dao.find(id);
    logger.info("find(DownloadableSample) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableSample> select(int maxResult) {
    final List<DownloadableSample> result = dao.select(maxResult);
    logger.info("select(DownloadableSample) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DownloadableSample> selectAll() {
    final List<DownloadableSample> results = dao.selectAll();
    logger.info("selectAll(DownloadableSample) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSample create(DownloadableSample bean) {
    requireNonNull(bean);
    logger.info("create(DownloadableSample={}) - entered bean ");

    final DownloadableSample result = dao.create(bean);

    logger.info("create(DownloadableSample) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DownloadableSample update(DownloadableSample bean) {
    requireNonNull(bean);
    logger.info("update(DownloadableSample={}) - entered bean ");

    final DownloadableSample result = dao.update(bean);

    logger.info("update(DownloadableSample) - exited - return value={} result ");
    return result;
  }
}
