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
import com.magento.test.dao.EavFormTypeDao;
import com.magento.test.entity.EavFormType;
import com.magento.test.entity.EavFormTypeId;

@Stateless
@Named("DefaultEavFormTypeService")
public class DefaultEavFormTypeService implements EavFormTypeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavFormTypeDao dao;

  @Inject
  @Named("DefaultEavFormTypeDao")
  public DefaultEavFormTypeService(final EavFormTypeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormType find(EavFormTypeId id) {
    final EavFormType result = dao.find(id);
    logger.info("find(EavFormType) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavFormType> select(int maxResult) {
    final List<EavFormType> result = dao.select(maxResult);
    logger.info("select(EavFormType) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavFormType> selectAll() {
    final List<EavFormType> results = dao.selectAll();
    logger.info("selectAll(EavFormType) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormType create(EavFormType bean) {
    requireNonNull(bean);
    logger.info("create(EavFormType={}) - entered bean ");

    final EavFormType result = dao.create(bean);

    logger.info("create(EavFormType) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormType update(EavFormType bean) {
    requireNonNull(bean);
    logger.info("update(EavFormType={}) - entered bean ");

    final EavFormType result = dao.update(bean);

    logger.info("update(EavFormType) - exited - return value={} result ");
    return result;
  }
}
