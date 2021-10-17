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
import com.magento.test.dao.FlagDao;
import com.magento.test.entity.Flag;

@Stateless
@Named("DefaultFlagService")
public class DefaultFlagService implements FlagService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final FlagDao dao;

  @Inject
  @Named("DefaultFlagDao")
  public DefaultFlagService(final FlagDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Flag find(java.lang.Integer id) {

    final Flag result = dao.find(id);
    logger.info("find(Flag) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Flag> select(int maxResult) {
    final List<Flag> result = dao.select(maxResult);
    logger.info("select(Flag) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Flag> selectAll() {
    final List<Flag> results = dao.selectAll();
    logger.info("selectAll(Flag) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Flag create(Flag bean) {
    requireNonNull(bean);
    logger.info("create(Flag={}) - entered bean ");

    final Flag result = dao.create(bean);

    logger.info("create(Flag) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Flag update(Flag bean) {
    requireNonNull(bean);
    logger.info("update(Flag={}) - entered bean ");

    final Flag result = dao.update(bean);

    logger.info("update(Flag) - exited - return value={} result ");
    return result;
  }
}
