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
import com.magento.test.dao.AmazonSalesOrderDao;
import com.magento.test.entity.AmazonSalesOrder;
import com.magento.test.entity.AmazonSalesOrderId;

@Stateless
@Named("DefaultAmazonSalesOrderService")
public class DefaultAmazonSalesOrderService implements AmazonSalesOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AmazonSalesOrderDao dao;

  @Inject
  @Named("DefaultAmazonSalesOrderDao")
  public DefaultAmazonSalesOrderService(final AmazonSalesOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonSalesOrder find(AmazonSalesOrderId id) {
    final AmazonSalesOrder result = dao.find(id);
    logger.info("find(AmazonSalesOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<AmazonSalesOrder> select(int maxResult) {
    final List<AmazonSalesOrder> result = dao.select(maxResult);
    logger.info("select(AmazonSalesOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<AmazonSalesOrder> selectAll() {
    final List<AmazonSalesOrder> results = dao.selectAll();
    logger.info("selectAll(AmazonSalesOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonSalesOrder create(AmazonSalesOrder bean) {
    requireNonNull(bean);
    logger.info("create(AmazonSalesOrder={}) - entered bean ");

    final AmazonSalesOrder result = dao.create(bean);

    logger.info("create(AmazonSalesOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public AmazonSalesOrder update(AmazonSalesOrder bean) {
    requireNonNull(bean);
    logger.info("update(AmazonSalesOrder={}) - entered bean ");

    final AmazonSalesOrder result = dao.update(bean);

    logger.info("update(AmazonSalesOrder) - exited - return value={} result ");
    return result;
  }
}
