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
import com.magento.test.dao.CatalogCategoryProductIndexStore1ReplicaDao;
import com.magento.test.entity.CatalogCategoryProductIndexStore1Replica;
import com.magento.test.entity.CatalogCategoryProductIndexStore1ReplicaId;

@Stateless
@Named("DefaultCatalogCategoryProductIndexStore1ReplicaService")
public class DefaultCatalogCategoryProductIndexStore1ReplicaService
    implements CatalogCategoryProductIndexStore1ReplicaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryProductIndexStore1ReplicaDao dao;

  @Inject
  @Named("DefaultCatalogCategoryProductIndexStore1ReplicaDao")
  public DefaultCatalogCategoryProductIndexStore1ReplicaService(
      final CatalogCategoryProductIndexStore1ReplicaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexStore1Replica find(
      CatalogCategoryProductIndexStore1ReplicaId id) {
    final CatalogCategoryProductIndexStore1Replica result = dao.find(id);
    logger.info(
        "find(CatalogCategoryProductIndexStore1Replica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexStore1Replica> select(int maxResult) {
    final List<CatalogCategoryProductIndexStore1Replica> result = dao.select(maxResult);
    logger.info(
        "select(CatalogCategoryProductIndexStore1Replica) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexStore1Replica> selectAll() {
    final List<CatalogCategoryProductIndexStore1Replica> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogCategoryProductIndexStore1Replica) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexStore1Replica create(
      CatalogCategoryProductIndexStore1Replica bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryProductIndexStore1Replica={}) - entered bean ");

    final CatalogCategoryProductIndexStore1Replica result = dao.create(bean);

    logger.info(
        "create(CatalogCategoryProductIndexStore1Replica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexStore1Replica update(
      CatalogCategoryProductIndexStore1Replica bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryProductIndexStore1Replica={}) - entered bean ");

    final CatalogCategoryProductIndexStore1Replica result = dao.update(bean);

    logger.info(
        "update(CatalogCategoryProductIndexStore1Replica) - exited - return value={} result ");
    return result;
  }
}
