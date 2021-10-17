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
import com.magento.test.dao.CatalogProductOptionDao;
import com.magento.test.entity.CatalogProductOption;

@Stateless
@Named("DefaultCatalogProductOptionService")
public class DefaultCatalogProductOptionService implements CatalogProductOptionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductOptionDao dao;

  @Inject
  @Named("DefaultCatalogProductOptionDao")
  public DefaultCatalogProductOptionService(final CatalogProductOptionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOption find(java.lang.Integer id) {

    final CatalogProductOption result = dao.find(id);
    logger.info("find(CatalogProductOption) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOption> select(int maxResult) {
    final List<CatalogProductOption> result = dao.select(maxResult);
    logger.info("select(CatalogProductOption) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductOption> selectAll() {
    final List<CatalogProductOption> results = dao.selectAll();
    logger.info("selectAll(CatalogProductOption) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOption create(CatalogProductOption bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductOption={}) - entered bean ");

    final CatalogProductOption result = dao.create(bean);

    logger.info("create(CatalogProductOption) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductOption update(CatalogProductOption bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductOption={}) - entered bean ");

    final CatalogProductOption result = dao.update(bean);

    logger.info("update(CatalogProductOption) - exited - return value={} result ");
    return result;
  }
}
