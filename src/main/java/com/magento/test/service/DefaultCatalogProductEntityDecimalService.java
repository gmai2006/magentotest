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
import com.magento.test.dao.CatalogProductEntityDecimalDao;
import com.magento.test.entity.CatalogProductEntityDecimal;
import com.magento.test.entity.CatalogProductEntityDecimalId;

@Stateless
@Named("DefaultCatalogProductEntityDecimalService")
public class DefaultCatalogProductEntityDecimalService
    implements CatalogProductEntityDecimalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityDecimalDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityDecimalDao")
  public DefaultCatalogProductEntityDecimalService(final CatalogProductEntityDecimalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDecimal find(CatalogProductEntityDecimalId id) {
    final CatalogProductEntityDecimal result = dao.find(id);
    logger.info("find(CatalogProductEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityDecimal> select(int maxResult) {
    final List<CatalogProductEntityDecimal> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntityDecimal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityDecimal> selectAll() {
    final List<CatalogProductEntityDecimal> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntityDecimal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDecimal create(CatalogProductEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityDecimal={}) - entered bean ");

    final CatalogProductEntityDecimal result = dao.create(bean);

    logger.info("create(CatalogProductEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityDecimal update(CatalogProductEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityDecimal={}) - entered bean ");

    final CatalogProductEntityDecimal result = dao.update(bean);

    logger.info("update(CatalogProductEntityDecimal) - exited - return value={} result ");
    return result;
  }
}
