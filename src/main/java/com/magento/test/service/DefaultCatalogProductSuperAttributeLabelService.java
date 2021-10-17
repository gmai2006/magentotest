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
import com.magento.test.dao.CatalogProductSuperAttributeLabelDao;
import com.magento.test.entity.CatalogProductSuperAttributeLabel;
import com.magento.test.entity.CatalogProductSuperAttributeLabelId;

@Stateless
@Named("DefaultCatalogProductSuperAttributeLabelService")
public class DefaultCatalogProductSuperAttributeLabelService
    implements CatalogProductSuperAttributeLabelService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductSuperAttributeLabelDao dao;

  @Inject
  @Named("DefaultCatalogProductSuperAttributeLabelDao")
  public DefaultCatalogProductSuperAttributeLabelService(
      final CatalogProductSuperAttributeLabelDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductSuperAttributeLabel find(CatalogProductSuperAttributeLabelId id) {
    final CatalogProductSuperAttributeLabel result = dao.find(id);
    logger.info("find(CatalogProductSuperAttributeLabel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductSuperAttributeLabel> select(int maxResult) {
    final List<CatalogProductSuperAttributeLabel> result = dao.select(maxResult);
    logger.info("select(CatalogProductSuperAttributeLabel) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductSuperAttributeLabel> selectAll() {
    final List<CatalogProductSuperAttributeLabel> results = dao.selectAll();
    logger.info("selectAll(CatalogProductSuperAttributeLabel) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductSuperAttributeLabel create(CatalogProductSuperAttributeLabel bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductSuperAttributeLabel={}) - entered bean ");

    final CatalogProductSuperAttributeLabel result = dao.create(bean);

    logger.info("create(CatalogProductSuperAttributeLabel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductSuperAttributeLabel update(CatalogProductSuperAttributeLabel bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductSuperAttributeLabel={}) - entered bean ");

    final CatalogProductSuperAttributeLabel result = dao.update(bean);

    logger.info("update(CatalogProductSuperAttributeLabel) - exited - return value={} result ");
    return result;
  }
}
