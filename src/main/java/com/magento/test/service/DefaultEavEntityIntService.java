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
import com.magento.test.dao.EavEntityIntDao;
import com.magento.test.entity.EavEntityInt;
import com.magento.test.entity.EavEntityIntId;

@Stateless
@Named("DefaultEavEntityIntService")
public class DefaultEavEntityIntService implements EavEntityIntService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityIntDao dao;

  @Inject
  @Named("DefaultEavEntityIntDao")
  public DefaultEavEntityIntService(final EavEntityIntDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityInt find(EavEntityIntId id) {
    final EavEntityInt result = dao.find(id);
    logger.info("find(EavEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityInt> select(int maxResult) {
    final List<EavEntityInt> result = dao.select(maxResult);
    logger.info("select(EavEntityInt) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityInt> selectAll() {
    final List<EavEntityInt> results = dao.selectAll();
    logger.info("selectAll(EavEntityInt) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityInt create(EavEntityInt bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityInt={}) - entered bean ");

    final EavEntityInt result = dao.create(bean);

    logger.info("create(EavEntityInt) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityInt update(EavEntityInt bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityInt={}) - entered bean ");

    final EavEntityInt result = dao.update(bean);

    logger.info("update(EavEntityInt) - exited - return value={} result ");
    return result;
  }
}
