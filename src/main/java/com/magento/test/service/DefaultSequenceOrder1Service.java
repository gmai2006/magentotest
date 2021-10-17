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
import com.magento.test.dao.SequenceOrder1Dao;
import com.magento.test.entity.SequenceOrder1;

@Stateless
@Named("DefaultSequenceOrder1Service")
public class DefaultSequenceOrder1Service implements SequenceOrder1Service {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SequenceOrder1Dao dao;

  @Inject
  @Named("DefaultSequenceOrder1Dao")
  public DefaultSequenceOrder1Service(final SequenceOrder1Dao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceOrder1 find(java.lang.Integer id) {

    final SequenceOrder1 result = dao.find(id);
    logger.info("find(SequenceOrder1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceOrder1> select(int maxResult) {
    final List<SequenceOrder1> result = dao.select(maxResult);
    logger.info("select(SequenceOrder1) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceOrder1> selectAll() {
    final List<SequenceOrder1> results = dao.selectAll();
    logger.info("selectAll(SequenceOrder1) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceOrder1 create(SequenceOrder1 bean) {
    requireNonNull(bean);
    logger.info("create(SequenceOrder1={}) - entered bean ");

    final SequenceOrder1 result = dao.create(bean);

    logger.info("create(SequenceOrder1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceOrder1 update(SequenceOrder1 bean) {
    requireNonNull(bean);
    logger.info("update(SequenceOrder1={}) - entered bean ");

    final SequenceOrder1 result = dao.update(bean);

    logger.info("update(SequenceOrder1) - exited - return value={} result ");
    return result;
  }
}
