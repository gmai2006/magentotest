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
import com.magento.test.dao.EavAttributeOptionSwatchDao;
import com.magento.test.entity.EavAttributeOptionSwatch;
import com.magento.test.entity.EavAttributeOptionSwatchId;

@Stateless
@Named("DefaultEavAttributeOptionSwatchService")
public class DefaultEavAttributeOptionSwatchService implements EavAttributeOptionSwatchService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavAttributeOptionSwatchDao dao;

  @Inject
  @Named("DefaultEavAttributeOptionSwatchDao")
  public DefaultEavAttributeOptionSwatchService(final EavAttributeOptionSwatchDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeOptionSwatch find(EavAttributeOptionSwatchId id) {
    final EavAttributeOptionSwatch result = dao.find(id);
    logger.info("find(EavAttributeOptionSwatch) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeOptionSwatch> select(int maxResult) {
    final List<EavAttributeOptionSwatch> result = dao.select(maxResult);
    logger.info("select(EavAttributeOptionSwatch) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavAttributeOptionSwatch> selectAll() {
    final List<EavAttributeOptionSwatch> results = dao.selectAll();
    logger.info("selectAll(EavAttributeOptionSwatch) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeOptionSwatch create(EavAttributeOptionSwatch bean) {
    requireNonNull(bean);
    logger.info("create(EavAttributeOptionSwatch={}) - entered bean ");

    final EavAttributeOptionSwatch result = dao.create(bean);

    logger.info("create(EavAttributeOptionSwatch) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavAttributeOptionSwatch update(EavAttributeOptionSwatch bean) {
    requireNonNull(bean);
    logger.info("update(EavAttributeOptionSwatch={}) - entered bean ");

    final EavAttributeOptionSwatch result = dao.update(bean);

    logger.info("update(EavAttributeOptionSwatch) - exited - return value={} result ");
    return result;
  }
}
