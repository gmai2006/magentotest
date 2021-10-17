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
import com.magento.test.dao.SignifydCaseDao;
import com.magento.test.entity.SignifydCase;
import com.magento.test.entity.SignifydCaseId;

@Stateless
@Named("DefaultSignifydCaseService")
public class DefaultSignifydCaseService implements SignifydCaseService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SignifydCaseDao dao;

  @Inject
  @Named("DefaultSignifydCaseDao")
  public DefaultSignifydCaseService(final SignifydCaseDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SignifydCase find(SignifydCaseId id) {
    final SignifydCase result = dao.find(id);
    logger.info("find(SignifydCase) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SignifydCase> select(int maxResult) {
    final List<SignifydCase> result = dao.select(maxResult);
    logger.info("select(SignifydCase) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SignifydCase> selectAll() {
    final List<SignifydCase> results = dao.selectAll();
    logger.info("selectAll(SignifydCase) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SignifydCase create(SignifydCase bean) {
    requireNonNull(bean);
    logger.info("create(SignifydCase={}) - entered bean ");

    final SignifydCase result = dao.create(bean);

    logger.info("create(SignifydCase) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SignifydCase update(SignifydCase bean) {
    requireNonNull(bean);
    logger.info("update(SignifydCase={}) - entered bean ");

    final SignifydCase result = dao.update(bean);

    logger.info("update(SignifydCase) - exited - return value={} result ");
    return result;
  }
}
