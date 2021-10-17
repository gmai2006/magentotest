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
import com.magento.test.dao.ShippingTablerateDao;
import com.magento.test.entity.ShippingTablerate;
import com.magento.test.entity.ShippingTablerateId;

@Stateless
@Named("DefaultShippingTablerateService")
public class DefaultShippingTablerateService implements ShippingTablerateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ShippingTablerateDao dao;

  @Inject
  @Named("DefaultShippingTablerateDao")
  public DefaultShippingTablerateService(final ShippingTablerateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ShippingTablerate find(ShippingTablerateId id) {
    final ShippingTablerate result = dao.find(id);
    logger.info("find(ShippingTablerate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ShippingTablerate> select(int maxResult) {
    final List<ShippingTablerate> result = dao.select(maxResult);
    logger.info("select(ShippingTablerate) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ShippingTablerate> selectAll() {
    final List<ShippingTablerate> results = dao.selectAll();
    logger.info("selectAll(ShippingTablerate) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ShippingTablerate create(ShippingTablerate bean) {
    requireNonNull(bean);
    logger.info("create(ShippingTablerate={}) - entered bean ");

    final ShippingTablerate result = dao.create(bean);

    logger.info("create(ShippingTablerate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ShippingTablerate update(ShippingTablerate bean) {
    requireNonNull(bean);
    logger.info("update(ShippingTablerate={}) - entered bean ");

    final ShippingTablerate result = dao.update(bean);

    logger.info("update(ShippingTablerate) - exited - return value={} result ");
    return result;
  }
}
