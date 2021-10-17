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
import com.magento.test.dao.SalesShipmentItemDao;
import com.magento.test.entity.SalesShipmentItem;

@Stateless
@Named("DefaultSalesShipmentItemService")
public class DefaultSalesShipmentItemService implements SalesShipmentItemService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShipmentItemDao dao;

  @Inject
  @Named("DefaultSalesShipmentItemDao")
  public DefaultSalesShipmentItemService(final SalesShipmentItemDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentItem find(java.lang.Integer id) {

    final SalesShipmentItem result = dao.find(id);
    logger.info("find(SalesShipmentItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentItem> select(int maxResult) {
    final List<SalesShipmentItem> result = dao.select(maxResult);
    logger.info("select(SalesShipmentItem) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentItem> selectAll() {
    final List<SalesShipmentItem> results = dao.selectAll();
    logger.info("selectAll(SalesShipmentItem) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentItem create(SalesShipmentItem bean) {
    requireNonNull(bean);
    logger.info("create(SalesShipmentItem={}) - entered bean ");

    final SalesShipmentItem result = dao.create(bean);

    logger.info("create(SalesShipmentItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentItem update(SalesShipmentItem bean) {
    requireNonNull(bean);
    logger.info("update(SalesShipmentItem={}) - entered bean ");

    final SalesShipmentItem result = dao.update(bean);

    logger.info("update(SalesShipmentItem) - exited - return value={} result ");
    return result;
  }
}
