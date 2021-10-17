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
import com.magento.test.dao.EavEntityTypeDao;
import com.magento.test.entity.EavEntityType;

@Stateless
@Named("DefaultEavEntityTypeService")
public class DefaultEavEntityTypeService implements EavEntityTypeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityTypeDao dao;

  @Inject
  @Named("DefaultEavEntityTypeDao")
  public DefaultEavEntityTypeService(final EavEntityTypeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityType find(java.lang.Integer id) {

    final EavEntityType result = dao.find(id);
    logger.info("find(EavEntityType) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityType> select(int maxResult) {
    final List<EavEntityType> result = dao.select(maxResult);
    logger.info("select(EavEntityType) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityType> selectAll() {
    final List<EavEntityType> results = dao.selectAll();
    logger.info("selectAll(EavEntityType) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityType create(EavEntityType bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityType={}) - entered bean ");

    final EavEntityType result = dao.create(bean);

    logger.info("create(EavEntityType) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityType update(EavEntityType bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityType={}) - entered bean ");

    final EavEntityType result = dao.update(bean);

    logger.info("update(EavEntityType) - exited - return value={} result ");
    return result;
  }
}
