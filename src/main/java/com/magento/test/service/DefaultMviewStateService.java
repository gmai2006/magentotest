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
import com.magento.test.dao.MviewStateDao;
import com.magento.test.entity.MviewState;

@Stateless
@Named("DefaultMviewStateService")
public class DefaultMviewStateService implements MviewStateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MviewStateDao dao;

  @Inject
  @Named("DefaultMviewStateDao")
  public DefaultMviewStateService(final MviewStateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MviewState find(java.lang.Integer id) {

    final MviewState result = dao.find(id);
    logger.info("find(MviewState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MviewState> select(int maxResult) {
    final List<MviewState> result = dao.select(maxResult);
    logger.info("select(MviewState) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MviewState> selectAll() {
    final List<MviewState> results = dao.selectAll();
    logger.info("selectAll(MviewState) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MviewState create(MviewState bean) {
    requireNonNull(bean);
    logger.info("create(MviewState={}) - entered bean ");

    final MviewState result = dao.create(bean);

    logger.info("create(MviewState) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MviewState update(MviewState bean) {
    requireNonNull(bean);
    logger.info("update(MviewState={}) - entered bean ");

    final MviewState result = dao.update(bean);

    logger.info("update(MviewState) - exited - return value={} result ");
    return result;
  }
}
