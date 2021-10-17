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
import com.magento.test.dao.SalesShipmentDao;
import com.magento.test.entity.SalesShipment;
import com.magento.test.entity.SalesShipmentId;

@Stateless
@Named("DefaultSalesShipmentService")
public class DefaultSalesShipmentService implements SalesShipmentService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShipmentDao dao;

  @Inject
  @Named("DefaultSalesShipmentDao")
  public DefaultSalesShipmentService(final SalesShipmentDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipment find(SalesShipmentId id) {
    final SalesShipment result = dao.find(id);
    logger.info("find(SalesShipment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipment> select(int maxResult) {
    final List<SalesShipment> result = dao.select(maxResult);
    logger.info("select(SalesShipment) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipment> selectAll() {
    final List<SalesShipment> results = dao.selectAll();
    logger.info("selectAll(SalesShipment) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipment create(SalesShipment bean) {
    requireNonNull(bean);
    logger.info("create(SalesShipment={}) - entered bean ");

    final SalesShipment result = dao.create(bean);

    logger.info("create(SalesShipment) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipment update(SalesShipment bean) {
    requireNonNull(bean);
    logger.info("update(SalesShipment={}) - entered bean ");

    final SalesShipment result = dao.update(bean);

    logger.info("update(SalesShipment) - exited - return value={} result ");
    return result;
  }
}
