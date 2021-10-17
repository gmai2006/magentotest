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
import com.magento.test.dao.KlarnaCoreOrderDao;
import com.magento.test.entity.KlarnaCoreOrder;

@Stateless
@Named("DefaultKlarnaCoreOrderService")
public class DefaultKlarnaCoreOrderService implements KlarnaCoreOrderService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final KlarnaCoreOrderDao dao;

  @Inject
  @Named("DefaultKlarnaCoreOrderDao")
  public DefaultKlarnaCoreOrderService(final KlarnaCoreOrderDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public KlarnaCoreOrder find(java.lang.Integer id) {

    final KlarnaCoreOrder result = dao.find(id);
    logger.info("find(KlarnaCoreOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<KlarnaCoreOrder> select(int maxResult) {
    final List<KlarnaCoreOrder> result = dao.select(maxResult);
    logger.info("select(KlarnaCoreOrder) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<KlarnaCoreOrder> selectAll() {
    final List<KlarnaCoreOrder> results = dao.selectAll();
    logger.info("selectAll(KlarnaCoreOrder) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public KlarnaCoreOrder create(KlarnaCoreOrder bean) {
    requireNonNull(bean);
    logger.info("create(KlarnaCoreOrder={}) - entered bean ");

    final KlarnaCoreOrder result = dao.create(bean);

    logger.info("create(KlarnaCoreOrder) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public KlarnaCoreOrder update(KlarnaCoreOrder bean) {
    requireNonNull(bean);
    logger.info("update(KlarnaCoreOrder={}) - entered bean ");

    final KlarnaCoreOrder result = dao.update(bean);

    logger.info("update(KlarnaCoreOrder) - exited - return value={} result ");
    return result;
  }
}
