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
import com.magento.test.dao.SequenceShipment1Dao;
import com.magento.test.entity.SequenceShipment1;

@Stateless
@Named("DefaultSequenceShipment1Service")
public class DefaultSequenceShipment1Service implements SequenceShipment1Service {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SequenceShipment1Dao dao;

  @Inject
  @Named("DefaultSequenceShipment1Dao")
  public DefaultSequenceShipment1Service(final SequenceShipment1Dao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment1 find(java.lang.Integer id) {

    final SequenceShipment1 result = dao.find(id);
    logger.info("find(SequenceShipment1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceShipment1> select(int maxResult) {
    final List<SequenceShipment1> result = dao.select(maxResult);
    logger.info("select(SequenceShipment1) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceShipment1> selectAll() {
    final List<SequenceShipment1> results = dao.selectAll();
    logger.info("selectAll(SequenceShipment1) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment1 create(SequenceShipment1 bean) {
    requireNonNull(bean);
    logger.info("create(SequenceShipment1={}) - entered bean ");

    final SequenceShipment1 result = dao.create(bean);

    logger.info("create(SequenceShipment1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceShipment1 update(SequenceShipment1 bean) {
    requireNonNull(bean);
    logger.info("update(SequenceShipment1={}) - entered bean ");

    final SequenceShipment1 result = dao.update(bean);

    logger.info("update(SequenceShipment1) - exited - return value={} result ");
    return result;
  }
}
