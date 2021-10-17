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
import com.magento.test.dao.CatalogProductLinkAttributeIntDao;
import com.magento.test.entity.CatalogProductLinkAttributeInt;
import com.magento.test.entity.CatalogProductLinkAttributeIntId;

@Stateless
@Named("DefaultCatalogProductLinkAttributeIntService")
public class DefaultCatalogProductLinkAttributeIntService
    implements CatalogProductLinkAttributeIntService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductLinkAttributeIntDao dao;

  @Inject
  @Named("DefaultCatalogProductLinkAttributeIntDao")
  public DefaultCatalogProductLinkAttributeIntService(final CatalogProductLinkAttributeIntDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeInt find(CatalogProductLinkAttributeIntId id) {
    final CatalogProductLinkAttributeInt result = dao.find(id);
    logger.info("find(CatalogProductLinkAttributeInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLinkAttributeInt> select(int maxResult) {
    final List<CatalogProductLinkAttributeInt> result = dao.select(maxResult);
    logger.info("select(CatalogProductLinkAttributeInt) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductLinkAttributeInt> selectAll() {
    final List<CatalogProductLinkAttributeInt> results = dao.selectAll();
    logger.info("selectAll(CatalogProductLinkAttributeInt) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeInt create(CatalogProductLinkAttributeInt bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductLinkAttributeInt={}) - entered bean ");

    final CatalogProductLinkAttributeInt result = dao.create(bean);

    logger.info("create(CatalogProductLinkAttributeInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductLinkAttributeInt update(CatalogProductLinkAttributeInt bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductLinkAttributeInt={}) - entered bean ");

    final CatalogProductLinkAttributeInt result = dao.update(bean);

    logger.info("update(CatalogProductLinkAttributeInt) - exited - return value={} result ");
    return result;
  }
}
