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
import com.magento.test.dao.CmsPageStoreDao;
import com.magento.test.entity.CmsPageStore;
import com.magento.test.entity.CmsPageStoreId;

@Stateless
@Named("DefaultCmsPageStoreService")
public class DefaultCmsPageStoreService implements CmsPageStoreService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CmsPageStoreDao dao;

  @Inject
  @Named("DefaultCmsPageStoreDao")
  public DefaultCmsPageStoreService(final CmsPageStoreDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CmsPageStore find(CmsPageStoreId id) {
    final CmsPageStore result = dao.find(id);
    logger.info("find(CmsPageStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CmsPageStore> select(int maxResult) {
    final List<CmsPageStore> result = dao.select(maxResult);
    logger.info("select(CmsPageStore) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CmsPageStore> selectAll() {
    final List<CmsPageStore> results = dao.selectAll();
    logger.info("selectAll(CmsPageStore) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CmsPageStore create(CmsPageStore bean) {
    requireNonNull(bean);
    logger.info("create(CmsPageStore={}) - entered bean ");

    final CmsPageStore result = dao.create(bean);

    logger.info("create(CmsPageStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CmsPageStore update(CmsPageStore bean) {
    requireNonNull(bean);
    logger.info("update(CmsPageStore={}) - entered bean ");

    final CmsPageStore result = dao.update(bean);

    logger.info("update(CmsPageStore) - exited - return value={} result ");
    return result;
  }
}
