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
import com.magento.test.dao.DirectoryCurrencyRateDao;
import com.magento.test.entity.DirectoryCurrencyRate;
import com.magento.test.entity.DirectoryCurrencyRateId;

@Stateless
@Named("DefaultDirectoryCurrencyRateService")
public class DefaultDirectoryCurrencyRateService implements DirectoryCurrencyRateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DirectoryCurrencyRateDao dao;

  @Inject
  @Named("DefaultDirectoryCurrencyRateDao")
  public DefaultDirectoryCurrencyRateService(final DirectoryCurrencyRateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCurrencyRate find(DirectoryCurrencyRateId id) {
    final DirectoryCurrencyRate result = dao.find(id);
    logger.info("find(DirectoryCurrencyRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DirectoryCurrencyRate> select(int maxResult) {
    final List<DirectoryCurrencyRate> result = dao.select(maxResult);
    logger.info("select(DirectoryCurrencyRate) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DirectoryCurrencyRate> selectAll() {
    final List<DirectoryCurrencyRate> results = dao.selectAll();
    logger.info("selectAll(DirectoryCurrencyRate) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCurrencyRate create(DirectoryCurrencyRate bean) {
    requireNonNull(bean);
    logger.info("create(DirectoryCurrencyRate={}) - entered bean ");

    final DirectoryCurrencyRate result = dao.create(bean);

    logger.info("create(DirectoryCurrencyRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCurrencyRate update(DirectoryCurrencyRate bean) {
    requireNonNull(bean);
    logger.info("update(DirectoryCurrencyRate={}) - entered bean ");

    final DirectoryCurrencyRate result = dao.update(bean);

    logger.info("update(DirectoryCurrencyRate) - exited - return value={} result ");
    return result;
  }
}
