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
import com.magento.test.dao.TaxClassDao;
import com.magento.test.entity.TaxClass;

@Stateless
@Named("DefaultTaxClassService")
public class DefaultTaxClassService implements TaxClassService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TaxClassDao dao;

  @Inject
  @Named("DefaultTaxClassDao")
  public DefaultTaxClassService(final TaxClassDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TaxClass find(java.lang.Integer id) {

    final TaxClass result = dao.find(id);
    logger.info("find(TaxClass) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TaxClass> select(int maxResult) {
    final List<TaxClass> result = dao.select(maxResult);
    logger.info("select(TaxClass) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TaxClass> selectAll() {
    final List<TaxClass> results = dao.selectAll();
    logger.info("selectAll(TaxClass) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TaxClass create(TaxClass bean) {
    requireNonNull(bean);
    logger.info("create(TaxClass={}) - entered bean ");

    final TaxClass result = dao.create(bean);

    logger.info("create(TaxClass) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TaxClass update(TaxClass bean) {
    requireNonNull(bean);
    logger.info("update(TaxClass={}) - entered bean ");

    final TaxClass result = dao.update(bean);

    logger.info("update(TaxClass) - exited - return value={} result ");
    return result;
  }
}
