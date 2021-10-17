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
import com.magento.test.dao.CataloginventoryStockStatusTmpDao;
import com.magento.test.entity.CataloginventoryStockStatusTmp;
import com.magento.test.entity.CataloginventoryStockStatusTmpId;

@Stateless
@Named("DefaultCataloginventoryStockStatusTmpService")
public class DefaultCataloginventoryStockStatusTmpService
    implements CataloginventoryStockStatusTmpService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CataloginventoryStockStatusTmpDao dao;

  @Inject
  @Named("DefaultCataloginventoryStockStatusTmpDao")
  public DefaultCataloginventoryStockStatusTmpService(final CataloginventoryStockStatusTmpDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusTmp find(CataloginventoryStockStatusTmpId id) {
    final CataloginventoryStockStatusTmp result = dao.find(id);
    logger.info("find(CataloginventoryStockStatusTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockStatusTmp> select(int maxResult) {
    final List<CataloginventoryStockStatusTmp> result = dao.select(maxResult);
    logger.info("select(CataloginventoryStockStatusTmp) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CataloginventoryStockStatusTmp> selectAll() {
    final List<CataloginventoryStockStatusTmp> results = dao.selectAll();
    logger.info("selectAll(CataloginventoryStockStatusTmp) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusTmp create(CataloginventoryStockStatusTmp bean) {
    requireNonNull(bean);
    logger.info("create(CataloginventoryStockStatusTmp={}) - entered bean ");

    final CataloginventoryStockStatusTmp result = dao.create(bean);

    logger.info("create(CataloginventoryStockStatusTmp) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CataloginventoryStockStatusTmp update(CataloginventoryStockStatusTmp bean) {
    requireNonNull(bean);
    logger.info("update(CataloginventoryStockStatusTmp={}) - entered bean ");

    final CataloginventoryStockStatusTmp result = dao.update(bean);

    logger.info("update(CataloginventoryStockStatusTmp) - exited - return value={} result ");
    return result;
  }
}
