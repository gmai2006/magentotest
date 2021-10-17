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
import com.magento.test.dao.DesignChangeDao;
import com.magento.test.entity.DesignChange;

@Stateless
@Named("DefaultDesignChangeService")
public class DefaultDesignChangeService implements DesignChangeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DesignChangeDao dao;

  @Inject
  @Named("DefaultDesignChangeDao")
  public DefaultDesignChangeService(final DesignChangeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DesignChange find(java.lang.Integer id) {

    final DesignChange result = dao.find(id);
    logger.info("find(DesignChange) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DesignChange> select(int maxResult) {
    final List<DesignChange> result = dao.select(maxResult);
    logger.info("select(DesignChange) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DesignChange> selectAll() {
    final List<DesignChange> results = dao.selectAll();
    logger.info("selectAll(DesignChange) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DesignChange create(DesignChange bean) {
    requireNonNull(bean);
    logger.info("create(DesignChange={}) - entered bean ");

    final DesignChange result = dao.create(bean);

    logger.info("create(DesignChange) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DesignChange update(DesignChange bean) {
    requireNonNull(bean);
    logger.info("update(DesignChange={}) - entered bean ");

    final DesignChange result = dao.update(bean);

    logger.info("update(DesignChange) - exited - return value={} result ");
    return result;
  }
}
