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
import com.magento.test.dao.SalesShipmentGridDao;
import com.magento.test.entity.SalesShipmentGrid;
import com.magento.test.entity.SalesShipmentGridId;

@Stateless
@Named("DefaultSalesShipmentGridService")
public class DefaultSalesShipmentGridService implements SalesShipmentGridService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShipmentGridDao dao;

  @Inject
  @Named("DefaultSalesShipmentGridDao")
  public DefaultSalesShipmentGridService(final SalesShipmentGridDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentGrid find(SalesShipmentGridId id) {
    final SalesShipmentGrid result = dao.find(id);
    logger.info("find(SalesShipmentGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentGrid> select(int maxResult) {
    final List<SalesShipmentGrid> result = dao.select(maxResult);
    logger.info("select(SalesShipmentGrid) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentGrid> selectAll() {
    final List<SalesShipmentGrid> results = dao.selectAll();
    logger.info("selectAll(SalesShipmentGrid) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentGrid create(SalesShipmentGrid bean) {
    requireNonNull(bean);
    logger.info("create(SalesShipmentGrid={}) - entered bean ");

    final SalesShipmentGrid result = dao.create(bean);

    logger.info("create(SalesShipmentGrid) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentGrid update(SalesShipmentGrid bean) {
    requireNonNull(bean);
    logger.info("update(SalesShipmentGrid={}) - entered bean ");

    final SalesShipmentGrid result = dao.update(bean);

    logger.info("update(SalesShipmentGrid) - exited - return value={} result ");
    return result;
  }
}
