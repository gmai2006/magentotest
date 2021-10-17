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
import com.magento.test.dao.EavAttributeSetDao;
import com.magento.test.entity.EavAttributeSet;
import com.magento.test.entity.EavAttributeSetId;

@Stateless
@Named("DefaultEavAttributeSetService")
public class DefaultEavAttributeSetService implements EavAttributeSetService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavAttributeSetDao dao;

  @Inject
  @Named("DefaultEavAttributeSetDao")
  public DefaultEavAttributeSetService(final EavAttributeSetDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeSet find(EavAttributeSetId id) {
    final EavAttributeSet result = dao.find(id);
    logger.info("find(EavAttributeSet) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeSet> select(int maxResult) {
    final List<EavAttributeSet> result = dao.select(maxResult);
    logger.info("select(EavAttributeSet) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeSet> selectAll() {
    final List<EavAttributeSet> results = dao.selectAll();
    logger.info("selectAll(EavAttributeSet) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeSet create(EavAttributeSet bean) {
    requireNonNull(bean);
    logger.info("create(EavAttributeSet={}) - entered bean ");

    final EavAttributeSet result = dao.create(bean);

    logger.info("create(EavAttributeSet) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeSet update(EavAttributeSet bean) {
    requireNonNull(bean);
    logger.info("update(EavAttributeSet={}) - entered bean ");

    final EavAttributeSet result = dao.update(bean);

    logger.info("update(EavAttributeSet) - exited - return value={} result ");
    return result;
  }
}
