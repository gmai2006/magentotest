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
import com.magento.test.dao.MagentoAcknowledgedBulkDao;
import com.magento.test.entity.MagentoAcknowledgedBulk;
import com.magento.test.entity.MagentoAcknowledgedBulkId;

@Stateless
@Named("DefaultMagentoAcknowledgedBulkService")
public class DefaultMagentoAcknowledgedBulkService implements MagentoAcknowledgedBulkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MagentoAcknowledgedBulkDao dao;

  @Inject
  @Named("DefaultMagentoAcknowledgedBulkDao")
  public DefaultMagentoAcknowledgedBulkService(final MagentoAcknowledgedBulkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MagentoAcknowledgedBulk find(MagentoAcknowledgedBulkId id) {
    final MagentoAcknowledgedBulk result = dao.find(id);
    logger.info("find(MagentoAcknowledgedBulk) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MagentoAcknowledgedBulk> select(int maxResult) {
    final List<MagentoAcknowledgedBulk> result = dao.select(maxResult);
    logger.info("select(MagentoAcknowledgedBulk) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MagentoAcknowledgedBulk> selectAll() {
    final List<MagentoAcknowledgedBulk> results = dao.selectAll();
    logger.info("selectAll(MagentoAcknowledgedBulk) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MagentoAcknowledgedBulk create(MagentoAcknowledgedBulk bean) {
    requireNonNull(bean);
    logger.info("create(MagentoAcknowledgedBulk={}) - entered bean ");

    final MagentoAcknowledgedBulk result = dao.create(bean);

    logger.info("create(MagentoAcknowledgedBulk) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MagentoAcknowledgedBulk update(MagentoAcknowledgedBulk bean) {
    requireNonNull(bean);
    logger.info("update(MagentoAcknowledgedBulk={}) - entered bean ");

    final MagentoAcknowledgedBulk result = dao.update(bean);

    logger.info("update(MagentoAcknowledgedBulk) - exited - return value={} result ");
    return result;
  }
}
