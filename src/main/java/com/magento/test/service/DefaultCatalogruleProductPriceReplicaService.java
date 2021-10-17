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
import com.magento.test.dao.CatalogruleProductPriceReplicaDao;
import com.magento.test.entity.CatalogruleProductPriceReplica;
import com.magento.test.entity.CatalogruleProductPriceReplicaId;

@Stateless
@Named("DefaultCatalogruleProductPriceReplicaService")
public class DefaultCatalogruleProductPriceReplicaService
    implements CatalogruleProductPriceReplicaService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogruleProductPriceReplicaDao dao;

  @Inject
  @Named("DefaultCatalogruleProductPriceReplicaDao")
  public DefaultCatalogruleProductPriceReplicaService(final CatalogruleProductPriceReplicaDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProductPriceReplica find(CatalogruleProductPriceReplicaId id) {
    final CatalogruleProductPriceReplica result = dao.find(id);
    logger.info("find(CatalogruleProductPriceReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleProductPriceReplica> select(int maxResult) {
    final List<CatalogruleProductPriceReplica> result = dao.select(maxResult);
    logger.info("select(CatalogruleProductPriceReplica) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleProductPriceReplica> selectAll() {
    final List<CatalogruleProductPriceReplica> results = dao.selectAll();
    logger.info("selectAll(CatalogruleProductPriceReplica) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProductPriceReplica create(CatalogruleProductPriceReplica bean) {
    requireNonNull(bean);
    logger.info("create(CatalogruleProductPriceReplica={}) - entered bean ");

    final CatalogruleProductPriceReplica result = dao.create(bean);

    logger.info("create(CatalogruleProductPriceReplica) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProductPriceReplica update(CatalogruleProductPriceReplica bean) {
    requireNonNull(bean);
    logger.info("update(CatalogruleProductPriceReplica={}) - entered bean ");

    final CatalogruleProductPriceReplica result = dao.update(bean);

    logger.info("update(CatalogruleProductPriceReplica) - exited - return value={} result ");
    return result;
  }
}
