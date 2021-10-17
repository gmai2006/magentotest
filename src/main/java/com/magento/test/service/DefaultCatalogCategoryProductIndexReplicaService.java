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
import com.magento.test.dao.CatalogCategoryProductIndexReplicaDao;
import com.magento.test.entity.CatalogCategoryProductIndexReplica;
import com.magento.test.entity.CatalogCategoryProductIndexReplicaId;

@Stateless
@Named("DefaultCatalogCategoryProductIndexReplicaService")
public class DefaultCatalogCategoryProductIndexReplicaService
    implements CatalogCategoryProductIndexReplicaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogCategoryProductIndexReplicaDao dao;

  @Inject
  @Named("DefaultCatalogCategoryProductIndexReplicaDao")
  public DefaultCatalogCategoryProductIndexReplicaService(
      final CatalogCategoryProductIndexReplicaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexReplica find(CatalogCategoryProductIndexReplicaId id) {
    final CatalogCategoryProductIndexReplica result = dao.find(id);
    logger.info("find(CatalogCategoryProductIndexReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexReplica> select(int maxResult) {
    final List<CatalogCategoryProductIndexReplica> result = dao.select(maxResult);
    logger.info("select(CatalogCategoryProductIndexReplica) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogCategoryProductIndexReplica> selectAll() {
    final List<CatalogCategoryProductIndexReplica> results = dao.selectAll();
    logger.info("selectAll(CatalogCategoryProductIndexReplica) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexReplica create(CatalogCategoryProductIndexReplica bean) {
    requireNonNull(bean);
    logger.info("create(CatalogCategoryProductIndexReplica={}) - entered bean ");

    final CatalogCategoryProductIndexReplica result = dao.create(bean);

    logger.info("create(CatalogCategoryProductIndexReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogCategoryProductIndexReplica update(CatalogCategoryProductIndexReplica bean) {
    requireNonNull(bean);
    logger.info("update(CatalogCategoryProductIndexReplica={}) - entered bean ");

    final CatalogCategoryProductIndexReplica result = dao.update(bean);

    logger.info("update(CatalogCategoryProductIndexReplica) - exited - return value={} result ");
    return result;
  }
}
