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
import com.magento.test.dao.CataloginventoryStockStatusIdxDao;
import com.magento.test.entity.CataloginventoryStockStatusIdx;
import com.magento.test.entity.CataloginventoryStockStatusIdxId;

@Stateless
@Named("DefaultCataloginventoryStockStatusIdxService")
public class DefaultCataloginventoryStockStatusIdxService
    implements CataloginventoryStockStatusIdxService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CataloginventoryStockStatusIdxDao dao;

  @Inject
  @Named("DefaultCataloginventoryStockStatusIdxDao")
  public DefaultCataloginventoryStockStatusIdxService(final CataloginventoryStockStatusIdxDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusIdx find(CataloginventoryStockStatusIdxId id) {
    final CataloginventoryStockStatusIdx result = dao.find(id);
    logger.info("find(CataloginventoryStockStatusIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockStatusIdx> select(int maxResult) {
    final List<CataloginventoryStockStatusIdx> result = dao.select(maxResult);
    logger.info("select(CataloginventoryStockStatusIdx) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockStatusIdx> selectAll() {
    final List<CataloginventoryStockStatusIdx> results = dao.selectAll();
    logger.info("selectAll(CataloginventoryStockStatusIdx) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusIdx create(CataloginventoryStockStatusIdx bean) {
    requireNonNull(bean);
    logger.info("create(CataloginventoryStockStatusIdx={}) - entered bean ");

    final CataloginventoryStockStatusIdx result = dao.create(bean);

    logger.info("create(CataloginventoryStockStatusIdx) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusIdx update(CataloginventoryStockStatusIdx bean) {
    requireNonNull(bean);
    logger.info("update(CataloginventoryStockStatusIdx={}) - entered bean ");

    final CataloginventoryStockStatusIdx result = dao.update(bean);

    logger.info("update(CataloginventoryStockStatusIdx) - exited - return value={} result ");
    return result;
  }
}
