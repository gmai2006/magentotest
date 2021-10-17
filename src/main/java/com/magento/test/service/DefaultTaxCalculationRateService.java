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
import com.magento.test.dao.TaxCalculationRateDao;
import com.magento.test.entity.TaxCalculationRate;

@Stateless
@Named("DefaultTaxCalculationRateService")
public class DefaultTaxCalculationRateService implements TaxCalculationRateService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaxCalculationRateDao dao;

  @Inject
  @Named("DefaultTaxCalculationRateDao")
  public DefaultTaxCalculationRateService(final TaxCalculationRateDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculationRate find(java.lang.Integer id) {

    final TaxCalculationRate result = dao.find(id);
    logger.info("find(TaxCalculationRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TaxCalculationRate> select(int maxResult) {
    final List<TaxCalculationRate> result = dao.select(maxResult);
    logger.info("select(TaxCalculationRate) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TaxCalculationRate> selectAll() {
    final List<TaxCalculationRate> results = dao.selectAll();
    logger.info("selectAll(TaxCalculationRate) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculationRate create(TaxCalculationRate bean) {
    requireNonNull(bean);
    logger.info("create(TaxCalculationRate={}) - entered bean ");

    final TaxCalculationRate result = dao.create(bean);

    logger.info("create(TaxCalculationRate) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculationRate update(TaxCalculationRate bean) {
    requireNonNull(bean);
    logger.info("update(TaxCalculationRate={}) - entered bean ");

    final TaxCalculationRate result = dao.update(bean);

    logger.info("update(TaxCalculationRate) - exited - return value={} result ");
    return result;
  }
}
