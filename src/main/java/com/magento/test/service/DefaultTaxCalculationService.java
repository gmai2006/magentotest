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
import com.magento.test.dao.TaxCalculationDao;
import com.magento.test.entity.TaxCalculation;

@Stateless
@Named("DefaultTaxCalculationService")
public class DefaultTaxCalculationService implements TaxCalculationService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaxCalculationDao dao;

  @Inject
  @Named("DefaultTaxCalculationDao")
  public DefaultTaxCalculationService(final TaxCalculationDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculation find(java.lang.Integer id) {

    final TaxCalculation result = dao.find(id);
    logger.info("find(TaxCalculation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TaxCalculation> select(int maxResult) {
    final List<TaxCalculation> result = dao.select(maxResult);
    logger.info("select(TaxCalculation) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TaxCalculation> selectAll() {
    final List<TaxCalculation> results = dao.selectAll();
    logger.info("selectAll(TaxCalculation) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculation create(TaxCalculation bean) {
    requireNonNull(bean);
    logger.info("create(TaxCalculation={}) - entered bean ");

    final TaxCalculation result = dao.create(bean);

    logger.info("create(TaxCalculation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TaxCalculation update(TaxCalculation bean) {
    requireNonNull(bean);
    logger.info("update(TaxCalculation={}) - entered bean ");

    final TaxCalculation result = dao.update(bean);

    logger.info("update(TaxCalculation) - exited - return value={} result ");
    return result;
  }
}
