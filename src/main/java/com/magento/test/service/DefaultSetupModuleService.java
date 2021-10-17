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
import com.magento.test.dao.SetupModuleDao;
import com.magento.test.entity.SetupModule;

@Stateless
@Named("DefaultSetupModuleService")
public class DefaultSetupModuleService implements SetupModuleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SetupModuleDao dao;

  @Inject
  @Named("DefaultSetupModuleDao")
  public DefaultSetupModuleService(final SetupModuleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SetupModule find(java.lang.String id) {

    final SetupModule result = dao.find(id);
    logger.info("find(SetupModule) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SetupModule> select(int maxResult) {
    final List<SetupModule> result = dao.select(maxResult);
    logger.info("select(SetupModule) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SetupModule> selectAll() {
    final List<SetupModule> results = dao.selectAll();
    logger.info("selectAll(SetupModule) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SetupModule create(SetupModule bean) {
    requireNonNull(bean);
    logger.info("create(SetupModule={}) - entered bean ");

    final SetupModule result = dao.create(bean);

    logger.info("create(SetupModule) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SetupModule update(SetupModule bean) {
    requireNonNull(bean);
    logger.info("update(SetupModule={}) - entered bean ");

    final SetupModule result = dao.update(bean);

    logger.info("update(SetupModule) - exited - return value={} result ");
    return result;
  }
}
