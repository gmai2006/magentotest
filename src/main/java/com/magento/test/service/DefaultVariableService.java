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
import com.magento.test.dao.VariableDao;
import com.magento.test.entity.Variable;
import com.magento.test.entity.VariableId;

@Stateless
@Named("DefaultVariableService")
public class DefaultVariableService implements VariableService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VariableDao dao;

  @Inject
  @Named("DefaultVariableDao")
  public DefaultVariableService(final VariableDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Variable find(VariableId id) {
    final Variable result = dao.find(id);
    logger.info("find(Variable) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Variable> select(int maxResult) {
    final List<Variable> result = dao.select(maxResult);
    logger.info("select(Variable) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Variable> selectAll() {
    final List<Variable> results = dao.selectAll();
    logger.info("selectAll(Variable) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Variable create(Variable bean) {
    requireNonNull(bean);
    logger.info("create(Variable={}) - entered bean ");

    final Variable result = dao.create(bean);

    logger.info("create(Variable) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Variable update(Variable bean) {
    requireNonNull(bean);
    logger.info("update(Variable={}) - entered bean ");

    final Variable result = dao.update(bean);

    logger.info("update(Variable) - exited - return value={} result ");
    return result;
  }
}
