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
import com.magento.test.dao.VariableValueDao;
import com.magento.test.entity.VariableValue;
import com.magento.test.entity.VariableValueId;

@Stateless
@Named("DefaultVariableValueService")
public class DefaultVariableValueService implements VariableValueService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VariableValueDao dao;

  @Inject
  @Named("DefaultVariableValueDao")
  public DefaultVariableValueService(final VariableValueDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VariableValue find(VariableValueId id) {
    final VariableValue result = dao.find(id);
    logger.info("find(VariableValue) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VariableValue> select(int maxResult) {
    final List<VariableValue> result = dao.select(maxResult);
    logger.info("select(VariableValue) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VariableValue> selectAll() {
    final List<VariableValue> results = dao.selectAll();
    logger.info("selectAll(VariableValue) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VariableValue create(VariableValue bean) {
    requireNonNull(bean);
    logger.info("create(VariableValue={}) - entered bean ");

    final VariableValue result = dao.create(bean);

    logger.info("create(VariableValue) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VariableValue update(VariableValue bean) {
    requireNonNull(bean);
    logger.info("update(VariableValue={}) - entered bean ");

    final VariableValue result = dao.update(bean);

    logger.info("update(VariableValue) - exited - return value={} result ");
    return result;
  }
}
