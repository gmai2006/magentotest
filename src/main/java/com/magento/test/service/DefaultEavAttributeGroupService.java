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
import com.magento.test.dao.EavAttributeGroupDao;
import com.magento.test.entity.EavAttributeGroup;
import com.magento.test.entity.EavAttributeGroupId;

@Stateless
@Named("DefaultEavAttributeGroupService")
public class DefaultEavAttributeGroupService implements EavAttributeGroupService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavAttributeGroupDao dao;

  @Inject
  @Named("DefaultEavAttributeGroupDao")
  public DefaultEavAttributeGroupService(final EavAttributeGroupDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeGroup find(EavAttributeGroupId id) {
    final EavAttributeGroup result = dao.find(id);
    logger.info("find(EavAttributeGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeGroup> select(int maxResult) {
    final List<EavAttributeGroup> result = dao.select(maxResult);
    logger.info("select(EavAttributeGroup) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeGroup> selectAll() {
    final List<EavAttributeGroup> results = dao.selectAll();
    logger.info("selectAll(EavAttributeGroup) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeGroup create(EavAttributeGroup bean) {
    requireNonNull(bean);
    logger.info("create(EavAttributeGroup={}) - entered bean ");

    final EavAttributeGroup result = dao.create(bean);

    logger.info("create(EavAttributeGroup) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeGroup update(EavAttributeGroup bean) {
    requireNonNull(bean);
    logger.info("update(EavAttributeGroup={}) - entered bean ");

    final EavAttributeGroup result = dao.update(bean);

    logger.info("update(EavAttributeGroup) - exited - return value={} result ");
    return result;
  }
}
