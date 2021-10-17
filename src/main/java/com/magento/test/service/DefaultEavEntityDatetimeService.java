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
import com.magento.test.dao.EavEntityDatetimeDao;
import com.magento.test.entity.EavEntityDatetime;
import com.magento.test.entity.EavEntityDatetimeId;

@Stateless
@Named("DefaultEavEntityDatetimeService")
public class DefaultEavEntityDatetimeService implements EavEntityDatetimeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityDatetimeDao dao;

  @Inject
  @Named("DefaultEavEntityDatetimeDao")
  public DefaultEavEntityDatetimeService(final EavEntityDatetimeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDatetime find(EavEntityDatetimeId id) {
    final EavEntityDatetime result = dao.find(id);
    logger.info("find(EavEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityDatetime> select(int maxResult) {
    final List<EavEntityDatetime> result = dao.select(maxResult);
    logger.info("select(EavEntityDatetime) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityDatetime> selectAll() {
    final List<EavEntityDatetime> results = dao.selectAll();
    logger.info("selectAll(EavEntityDatetime) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDatetime create(EavEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityDatetime={}) - entered bean ");

    final EavEntityDatetime result = dao.create(bean);

    logger.info("create(EavEntityDatetime) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDatetime update(EavEntityDatetime bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityDatetime={}) - entered bean ");

    final EavEntityDatetime result = dao.update(bean);

    logger.info("update(EavEntityDatetime) - exited - return value={} result ");
    return result;
  }
}
