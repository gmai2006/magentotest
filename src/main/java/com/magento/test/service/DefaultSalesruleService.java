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
import com.magento.test.dao.SalesruleDao;
import com.magento.test.entity.Salesrule;

@Stateless
@Named("DefaultSalesruleService")
public class DefaultSalesruleService implements SalesruleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesruleDao dao;

  @Inject
  @Named("DefaultSalesruleDao")
  public DefaultSalesruleService(final SalesruleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Salesrule find(java.lang.Integer id) {

    final Salesrule result = dao.find(id);
    logger.info("find(Salesrule) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Salesrule> select(int maxResult) {
    final List<Salesrule> result = dao.select(maxResult);
    logger.info("select(Salesrule) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Salesrule> selectAll() {
    final List<Salesrule> results = dao.selectAll();
    logger.info("selectAll(Salesrule) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Salesrule create(Salesrule bean) {
    requireNonNull(bean);
    logger.info("create(Salesrule={}) - entered bean ");

    final Salesrule result = dao.create(bean);

    logger.info("create(Salesrule) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Salesrule update(Salesrule bean) {
    requireNonNull(bean);
    logger.info("update(Salesrule={}) - entered bean ");

    final Salesrule result = dao.update(bean);

    logger.info("update(Salesrule) - exited - return value={} result ");
    return result;
  }
}
