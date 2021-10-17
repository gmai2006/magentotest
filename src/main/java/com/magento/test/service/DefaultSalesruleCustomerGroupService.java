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
import com.magento.test.dao.SalesruleCustomerGroupDao;
import com.magento.test.entity.SalesruleCustomerGroup;
import com.magento.test.entity.SalesruleCustomerGroupId;

@Stateless
@Named("DefaultSalesruleCustomerGroupService")
public class DefaultSalesruleCustomerGroupService implements SalesruleCustomerGroupService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleCustomerGroupDao dao;

  @Inject
  @Named("DefaultSalesruleCustomerGroupDao")
  public DefaultSalesruleCustomerGroupService(final SalesruleCustomerGroupDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomerGroup find(SalesruleCustomerGroupId id) {
    final SalesruleCustomerGroup result = dao.find(id);
    logger.info("find(SalesruleCustomerGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCustomerGroup> select(int maxResult) {
    final List<SalesruleCustomerGroup> result = dao.select(maxResult);
    logger.info("select(SalesruleCustomerGroup) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesruleCustomerGroup> selectAll() {
    final List<SalesruleCustomerGroup> results = dao.selectAll();
    logger.info("selectAll(SalesruleCustomerGroup) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomerGroup create(SalesruleCustomerGroup bean) {
    requireNonNull(bean);
    logger.info("create(SalesruleCustomerGroup={}) - entered bean ");

    final SalesruleCustomerGroup result = dao.create(bean);

    logger.info("create(SalesruleCustomerGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesruleCustomerGroup update(SalesruleCustomerGroup bean) {
    requireNonNull(bean);
    logger.info("update(SalesruleCustomerGroup={}) - entered bean ");

    final SalesruleCustomerGroup result = dao.update(bean);

    logger.info("update(SalesruleCustomerGroup) - exited - return value={} result ");
    return result;
  }
}
