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
import com.magento.test.dao.CatalogProductEntityVarcharDao;
import com.magento.test.entity.CatalogProductEntityVarchar;
import com.magento.test.entity.CatalogProductEntityVarcharId;

@Stateless
@Named("DefaultCatalogProductEntityVarcharService")
public class DefaultCatalogProductEntityVarcharService
    implements CatalogProductEntityVarcharService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityVarcharDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityVarcharDao")
  public DefaultCatalogProductEntityVarcharService(final CatalogProductEntityVarcharDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityVarchar find(CatalogProductEntityVarcharId id) {
    final CatalogProductEntityVarchar result = dao.find(id);
    logger.info("find(CatalogProductEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityVarchar> select(int maxResult) {
    final List<CatalogProductEntityVarchar> result = dao.select(maxResult);
    logger.info("select(CatalogProductEntityVarchar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityVarchar> selectAll() {
    final List<CatalogProductEntityVarchar> results = dao.selectAll();
    logger.info("selectAll(CatalogProductEntityVarchar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityVarchar create(CatalogProductEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityVarchar={}) - entered bean ");

    final CatalogProductEntityVarchar result = dao.create(bean);

    logger.info("create(CatalogProductEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityVarchar update(CatalogProductEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityVarchar={}) - entered bean ");

    final CatalogProductEntityVarchar result = dao.update(bean);

    logger.info("update(CatalogProductEntityVarchar) - exited - return value={} result ");
    return result;
  }
}
