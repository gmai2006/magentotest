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
import com.magento.test.dao.SalesCreditmemoGridDao;
import com.magento.test.entity.SalesCreditmemoGrid;
import com.magento.test.entity.SalesCreditmemoGridId;

@Stateless
@Named("DefaultSalesCreditmemoGridService")
public class DefaultSalesCreditmemoGridService implements SalesCreditmemoGridService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesCreditmemoGridDao dao;

  @Inject
  @Named("DefaultSalesCreditmemoGridDao")
  public DefaultSalesCreditmemoGridService(final SalesCreditmemoGridDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoGrid find(SalesCreditmemoGridId id) {
    final SalesCreditmemoGrid result = dao.find(id);
    logger.info("find(SalesCreditmemoGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoGrid> select(int maxResult) {
    final List<SalesCreditmemoGrid> result = dao.select(maxResult);
    logger.info("select(SalesCreditmemoGrid) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoGrid> selectAll() {
    final List<SalesCreditmemoGrid> results = dao.selectAll();
    logger.info("selectAll(SalesCreditmemoGrid) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoGrid create(SalesCreditmemoGrid bean) {
    requireNonNull(bean);
    logger.info("create(SalesCreditmemoGrid={}) - entered bean ");

    final SalesCreditmemoGrid result = dao.create(bean);

    logger.info("create(SalesCreditmemoGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoGrid update(SalesCreditmemoGrid bean) {
    requireNonNull(bean);
    logger.info("update(SalesCreditmemoGrid={}) - entered bean ");

    final SalesCreditmemoGrid result = dao.update(bean);

    logger.info("update(SalesCreditmemoGrid) - exited - return value={} result ");
    return result;
  }
}
