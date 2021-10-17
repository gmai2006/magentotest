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
import com.magento.test.dao.CatalogProductLinkAttributeDecimalDao;
import com.magento.test.entity.CatalogProductLinkAttributeDecimal;
import com.magento.test.entity.CatalogProductLinkAttributeDecimalId;

@Stateless
@Named("DefaultCatalogProductLinkAttributeDecimalService")
public class DefaultCatalogProductLinkAttributeDecimalService
    implements CatalogProductLinkAttributeDecimalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductLinkAttributeDecimalDao dao;

  @Inject
  @Named("DefaultCatalogProductLinkAttributeDecimalDao")
  public DefaultCatalogProductLinkAttributeDecimalService(
      final CatalogProductLinkAttributeDecimalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeDecimal find(CatalogProductLinkAttributeDecimalId id) {
    final CatalogProductLinkAttributeDecimal result = dao.find(id);
    logger.info("find(CatalogProductLinkAttributeDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLinkAttributeDecimal> select(int maxResult) {
    final List<CatalogProductLinkAttributeDecimal> result = dao.select(maxResult);
    logger.info("select(CatalogProductLinkAttributeDecimal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLinkAttributeDecimal> selectAll() {
    final List<CatalogProductLinkAttributeDecimal> results = dao.selectAll();
    logger.info("selectAll(CatalogProductLinkAttributeDecimal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeDecimal create(CatalogProductLinkAttributeDecimal bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductLinkAttributeDecimal={}) - entered bean ");

    final CatalogProductLinkAttributeDecimal result = dao.create(bean);

    logger.info("create(CatalogProductLinkAttributeDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeDecimal update(CatalogProductLinkAttributeDecimal bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductLinkAttributeDecimal={}) - entered bean ");

    final CatalogProductLinkAttributeDecimal result = dao.update(bean);

    logger.info("update(CatalogProductLinkAttributeDecimal) - exited - return value={} result ");
    return result;
  }
}
