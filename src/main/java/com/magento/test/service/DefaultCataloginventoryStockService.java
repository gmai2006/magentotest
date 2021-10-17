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
import com.magento.test.dao.CataloginventoryStockDao;
import com.magento.test.entity.CataloginventoryStock;

@Stateless
@Named("DefaultCataloginventoryStockService")
public class DefaultCataloginventoryStockService implements CataloginventoryStockService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CataloginventoryStockDao dao;

  @Inject
  @Named("DefaultCataloginventoryStockDao")
  public DefaultCataloginventoryStockService(final CataloginventoryStockDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStock find(java.lang.Integer id) {

    final CataloginventoryStock result = dao.find(id);
    logger.info("find(CataloginventoryStock) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStock> select(int maxResult) {
    final List<CataloginventoryStock> result = dao.select(maxResult);
    logger.info("select(CataloginventoryStock) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStock> selectAll() {
    final List<CataloginventoryStock> results = dao.selectAll();
    logger.info("selectAll(CataloginventoryStock) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStock create(CataloginventoryStock bean) {
    requireNonNull(bean);
    logger.info("create(CataloginventoryStock={}) - entered bean ");

    final CataloginventoryStock result = dao.create(bean);

    logger.info("create(CataloginventoryStock) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStock update(CataloginventoryStock bean) {
    requireNonNull(bean);
    logger.info("update(CataloginventoryStock={}) - entered bean ");

    final CataloginventoryStock result = dao.update(bean);

    logger.info("update(CataloginventoryStock) - exited - return value={} result ");
    return result;
  }
}
