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
import com.magento.test.dao.EavEntityAttributeDao;
import com.magento.test.entity.EavEntityAttribute;
import com.magento.test.entity.EavEntityAttributeId;

@Stateless
@Named("DefaultEavEntityAttributeService")
public class DefaultEavEntityAttributeService implements EavEntityAttributeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityAttributeDao dao;

  @Inject
  @Named("DefaultEavEntityAttributeDao")
  public DefaultEavEntityAttributeService(final EavEntityAttributeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityAttribute find(EavEntityAttributeId id) {
    final EavEntityAttribute result = dao.find(id);
    logger.info("find(EavEntityAttribute) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityAttribute> select(int maxResult) {
    final List<EavEntityAttribute> result = dao.select(maxResult);
    logger.info("select(EavEntityAttribute) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityAttribute> selectAll() {
    final List<EavEntityAttribute> results = dao.selectAll();
    logger.info("selectAll(EavEntityAttribute) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityAttribute create(EavEntityAttribute bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityAttribute={}) - entered bean ");

    final EavEntityAttribute result = dao.create(bean);

    logger.info("create(EavEntityAttribute) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityAttribute update(EavEntityAttribute bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityAttribute={}) - entered bean ");

    final EavEntityAttribute result = dao.update(bean);

    logger.info("update(EavEntityAttribute) - exited - return value={} result ");
    return result;
  }
}
