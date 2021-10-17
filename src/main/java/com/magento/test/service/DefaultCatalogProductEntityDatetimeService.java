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
import com.magento.test.dao.CatalogProductEntityDatetimeDao;
import com.magento.test.entity.CatalogProductEntityDatetime;
import com.magento.test.entity.CatalogProductEntityDatetimeId;

@Stateless
@Named("DefaultCatalogProductEntityDatetimeService")
public class DefaultCatalogProductEntityDatetimeService
    implements CatalogProductEntityDatetimeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityDatetimeDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityDatetimeDao")
  public DefaultCatalogProductEntityDatetimeService(final CatalogProductEntityDatetimeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDatetime find(CatalogProductEntityDatetimeId id) {
    final CatalogProductEntityDatetime result = dao.find(id);
    logger.info("find(CatalogProductEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityDatetime> select(int maxResult) {
    final List<CatalogProductEntityDatetime> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntityDatetime) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityDatetime> selectAll() {
    final List<CatalogProductEntityDatetime> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntityDatetime) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDatetime create(CatalogProductEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityDatetime={}) - entered bean ");

    final CatalogProductEntityDatetime result = dao.create(bean);

    logger.info("create(CatalogProductEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDatetime update(CatalogProductEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityDatetime={}) - entered bean ");

    final CatalogProductEntityDatetime result = dao.update(bean);

    logger.info("update(CatalogProductEntityDatetime) - exited - return value={} result ");
    return result;
  }
}
