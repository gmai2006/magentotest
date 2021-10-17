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
import com.magento.test.dao.SequenceShipment0Dao;
import com.magento.test.entity.SequenceShipment0;

@Stateless
@Named("DefaultSequenceShipment0Service")
public class DefaultSequenceShipment0Service implements SequenceShipment0Service {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SequenceShipment0Dao dao;

  @Inject
  @Named("DefaultSequenceShipment0Dao")
  public DefaultSequenceShipment0Service(final SequenceShipment0Dao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment0 find(java.lang.Integer id) {

    final SequenceShipment0 result = dao.find(id);
    logger.info("find(SequenceShipment0) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceShipment0> select(int maxResult) {
    final List<SequenceShipment0> result = dao.select(maxResult);
    logger.info("select(SequenceShipment0) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceShipment0> selectAll() {
    final List<SequenceShipment0> results = dao.selectAll();
    logger.info("selectAll(SequenceShipment0) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment0 create(SequenceShipment0 bean) {
    requireNonNull(bean);
    logger.info("create(SequenceShipment0={}) - entered bean ");

    final SequenceShipment0 result = dao.create(bean);

    logger.info("create(SequenceShipment0) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment0 update(SequenceShipment0 bean) {
    requireNonNull(bean);
    logger.info("update(SequenceShipment0={}) - entered bean ");

    final SequenceShipment0 result = dao.update(bean);

    logger.info("update(SequenceShipment0) - exited - return value={} result ");
    return result;
  }
}
