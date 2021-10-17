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
import com.magento.test.dao.EavEntityDecimalDao;
import com.magento.test.entity.EavEntityDecimal;
import com.magento.test.entity.EavEntityDecimalId;

@Stateless
@Named("DefaultEavEntityDecimalService")
public class DefaultEavEntityDecimalService implements EavEntityDecimalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityDecimalDao dao;

  @Inject
  @Named("DefaultEavEntityDecimalDao")
  public DefaultEavEntityDecimalService(final EavEntityDecimalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDecimal find(EavEntityDecimalId id) {
    final EavEntityDecimal result = dao.find(id);
    logger.info("find(EavEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityDecimal> select(int maxResult) {
    final List<EavEntityDecimal> result = dao.select(maxResult);
    logger.info("select(EavEntityDecimal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityDecimal> selectAll() {
    final List<EavEntityDecimal> results = dao.selectAll();
    logger.info("selectAll(EavEntityDecimal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDecimal create(EavEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityDecimal={}) - entered bean ");

    final EavEntityDecimal result = dao.create(bean);

    logger.info("create(EavEntityDecimal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityDecimal update(EavEntityDecimal bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityDecimal={}) - entered bean ");

    final EavEntityDecimal result = dao.update(bean);

    logger.info("update(EavEntityDecimal) - exited - return value={} result ");
    return result;
  }
}
