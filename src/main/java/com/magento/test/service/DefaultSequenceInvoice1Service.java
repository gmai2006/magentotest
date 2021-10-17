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
import com.magento.test.dao.SequenceInvoice1Dao;
import com.magento.test.entity.SequenceInvoice1;

@Stateless
@Named("DefaultSequenceInvoice1Service")
public class DefaultSequenceInvoice1Service implements SequenceInvoice1Service {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SequenceInvoice1Dao dao;

  @Inject
  @Named("DefaultSequenceInvoice1Dao")
  public DefaultSequenceInvoice1Service(final SequenceInvoice1Dao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceInvoice1 find(java.lang.Integer id) {

    final SequenceInvoice1 result = dao.find(id);
    logger.info("find(SequenceInvoice1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceInvoice1> select(int maxResult) {
    final List<SequenceInvoice1> result = dao.select(maxResult);
    logger.info("select(SequenceInvoice1) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SequenceInvoice1> selectAll() {
    final List<SequenceInvoice1> results = dao.selectAll();
    logger.info("selectAll(SequenceInvoice1) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceInvoice1 create(SequenceInvoice1 bean) {
    requireNonNull(bean);
    logger.info("create(SequenceInvoice1={}) - entered bean ");

    final SequenceInvoice1 result = dao.create(bean);

    logger.info("create(SequenceInvoice1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SequenceInvoice1 update(SequenceInvoice1 bean) {
    requireNonNull(bean);
    logger.info("update(SequenceInvoice1={}) - entered bean ");

    final SequenceInvoice1 result = dao.update(bean);

    logger.info("update(SequenceInvoice1) - exited - return value={} result ");
    return result;
  }
}
