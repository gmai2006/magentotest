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
import com.magento.test.dao.EavEntityTextDao;
import com.magento.test.entity.EavEntityText;
import com.magento.test.entity.EavEntityTextId;

@Stateless
@Named("DefaultEavEntityTextService")
public class DefaultEavEntityTextService implements EavEntityTextService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityTextDao dao;

  @Inject
  @Named("DefaultEavEntityTextDao")
  public DefaultEavEntityTextService(final EavEntityTextDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityText find(EavEntityTextId id) {
    final EavEntityText result = dao.find(id);
    logger.info("find(EavEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityText> select(int maxResult) {
    final List<EavEntityText> result = dao.select(maxResult);
    logger.info("select(EavEntityText) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityText> selectAll() {
    final List<EavEntityText> results = dao.selectAll();
    logger.info("selectAll(EavEntityText) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityText create(EavEntityText bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityText={}) - entered bean ");

    final EavEntityText result = dao.create(bean);

    logger.info("create(EavEntityText) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityText update(EavEntityText bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityText={}) - entered bean ");

    final EavEntityText result = dao.update(bean);

    logger.info("update(EavEntityText) - exited - return value={} result ");
    return result;
  }
}
