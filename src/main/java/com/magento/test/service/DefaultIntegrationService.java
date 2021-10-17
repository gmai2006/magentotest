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
import com.magento.test.dao.IntegrationDao;
import com.magento.test.entity.Integration;
import com.magento.test.entity.IntegrationId;

@Stateless
@Named("DefaultIntegrationService")
public class DefaultIntegrationService implements IntegrationService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final IntegrationDao dao;

  @Inject
  @Named("DefaultIntegrationDao")
  public DefaultIntegrationService(final IntegrationDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Integration find(IntegrationId id) {
    final Integration result = dao.find(id);
    logger.info("find(Integration) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Integration> select(int maxResult) {
    final List<Integration> result = dao.select(maxResult);
    logger.info("select(Integration) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Integration> selectAll() {
    final List<Integration> results = dao.selectAll();
    logger.info("selectAll(Integration) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Integration create(Integration bean) {
    requireNonNull(bean);
    logger.info("create(Integration={}) - entered bean ");

    final Integration result = dao.create(bean);

    logger.info("create(Integration) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Integration update(Integration bean) {
    requireNonNull(bean);
    logger.info("update(Integration={}) - entered bean ");

    final Integration result = dao.update(bean);

    logger.info("update(Integration) - exited - return value={} result ");
    return result;
  }
}
