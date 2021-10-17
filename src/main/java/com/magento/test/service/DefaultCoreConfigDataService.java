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
import com.magento.test.dao.CoreConfigDataDao;
import com.magento.test.entity.CoreConfigData;
import com.magento.test.entity.CoreConfigDataId;

@Stateless
@Named("DefaultCoreConfigDataService")
public class DefaultCoreConfigDataService implements CoreConfigDataService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CoreConfigDataDao dao;

  @Inject
  @Named("DefaultCoreConfigDataDao")
  public DefaultCoreConfigDataService(final CoreConfigDataDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CoreConfigData find(CoreConfigDataId id) {
    final CoreConfigData result = dao.find(id);
    logger.info("find(CoreConfigData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CoreConfigData> select(int maxResult) {
    final List<CoreConfigData> result = dao.select(maxResult);
    logger.info("select(CoreConfigData) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CoreConfigData> selectAll() {
    final List<CoreConfigData> results = dao.selectAll();
    logger.info("selectAll(CoreConfigData) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CoreConfigData create(CoreConfigData bean) {
    requireNonNull(bean);
    logger.info("create(CoreConfigData={}) - entered bean ");

    final CoreConfigData result = dao.create(bean);

    logger.info("create(CoreConfigData) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CoreConfigData update(CoreConfigData bean) {
    requireNonNull(bean);
    logger.info("update(CoreConfigData={}) - entered bean ");

    final CoreConfigData result = dao.update(bean);

    logger.info("update(CoreConfigData) - exited - return value={} result ");
    return result;
  }
}
