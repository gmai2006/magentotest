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
import com.magento.test.dao.CatalogProductIndexEavReplicaDao;
import com.magento.test.entity.CatalogProductIndexEavReplica;
import com.magento.test.entity.CatalogProductIndexEavReplicaId;

@Stateless
@Named("DefaultCatalogProductIndexEavReplicaService")
public class DefaultCatalogProductIndexEavReplicaService
    implements CatalogProductIndexEavReplicaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductIndexEavReplicaDao dao;

  @Inject
  @Named("DefaultCatalogProductIndexEavReplicaDao")
  public DefaultCatalogProductIndexEavReplicaService(final CatalogProductIndexEavReplicaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavReplica find(CatalogProductIndexEavReplicaId id) {
    final CatalogProductIndexEavReplica result = dao.find(id);
    logger.info("find(CatalogProductIndexEavReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavReplica> select(int maxResult) {
    final List<CatalogProductIndexEavReplica> result = dao.select(maxResult);
    logger.info("select(CatalogProductIndexEavReplica) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductIndexEavReplica> selectAll() {
    final List<CatalogProductIndexEavReplica> results = dao.selectAll();
    logger.info("selectAll(CatalogProductIndexEavReplica) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavReplica create(CatalogProductIndexEavReplica bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductIndexEavReplica={}) - entered bean ");

    final CatalogProductIndexEavReplica result = dao.create(bean);

    logger.info("create(CatalogProductIndexEavReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductIndexEavReplica update(CatalogProductIndexEavReplica bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductIndexEavReplica={}) - entered bean ");

    final CatalogProductIndexEavReplica result = dao.update(bean);

    logger.info("update(CatalogProductIndexEavReplica) - exited - return value={} result ");
    return result;
  }
}
