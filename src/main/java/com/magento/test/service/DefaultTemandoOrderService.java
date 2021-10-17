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
import com.magento.test.dao.TemandoOrderDao;
import com.magento.test.entity.TemandoOrder;

@Stateless
@Named("DefaultTemandoOrderService")
public class DefaultTemandoOrderService implements TemandoOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TemandoOrderDao dao;

  @Inject
  @Named("DefaultTemandoOrderDao")
  public DefaultTemandoOrderService(final TemandoOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoOrder find(java.lang.Integer id) {

    final TemandoOrder result = dao.find(id);
    logger.info("find(TemandoOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TemandoOrder> select(int maxResult) {
    final List<TemandoOrder> result = dao.select(maxResult);
    logger.info("select(TemandoOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TemandoOrder> selectAll() {
    final List<TemandoOrder> results = dao.selectAll();
    logger.info("selectAll(TemandoOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoOrder create(TemandoOrder bean) {
    requireNonNull(bean);
    logger.info("create(TemandoOrder={}) - entered bean ");

    final TemandoOrder result = dao.create(bean);

    logger.info("create(TemandoOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoOrder update(TemandoOrder bean) {
    requireNonNull(bean);
    logger.info("update(TemandoOrder={}) - entered bean ");

    final TemandoOrder result = dao.update(bean);

    logger.info("update(TemandoOrder) - exited - return value={} result ");
    return result;
  }
}
