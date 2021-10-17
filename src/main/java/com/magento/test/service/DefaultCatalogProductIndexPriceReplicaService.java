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
import com.magento.test.dao.CatalogProductIndexPriceReplicaDao;
import com.magento.test.entity.CatalogProductIndexPriceReplica;
import com.magento.test.entity.CatalogProductIndexPriceReplicaId;

@Stateless
@Named("DefaultCatalogProductIndexPriceReplicaService")
public class DefaultCatalogProductIndexPriceReplicaService
    implements CatalogProductIndexPriceReplicaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexPriceReplicaDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexPriceReplicaDao")
  public DefaultCatalogProductIndexPriceReplicaService(
      final CatalogProductIndexPriceReplicaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceReplica find(CatalogProductIndexPriceReplicaId id) {
    final CatalogProductIndexPriceReplica result = dao.find(id);
    logger.info("find(CatalogProductIndexPriceReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceReplica> select(int maxResult) {
    final List<CatalogProductIndexPriceReplica> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexPriceReplica) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexPriceReplica> selectAll() {
    final List<CatalogProductIndexPriceReplica> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexPriceReplica) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceReplica create(CatalogProductIndexPriceReplica bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexPriceReplica={}) - entered bean ");

    final CatalogProductIndexPriceReplica result = dao.create(bean);

    logger.info("create(CatalogProductIndexPriceReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexPriceReplica update(CatalogProductIndexPriceReplica bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexPriceReplica={}) - entered bean ");

    final CatalogProductIndexPriceReplica result = dao.update(bean);

    logger.info("update(CatalogProductIndexPriceReplica) - exited - return value={} result ");
    return result;
  }
}
