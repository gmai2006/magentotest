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
import com.magento.test.dao.CheckoutAgreementDao;
import com.magento.test.entity.CheckoutAgreement;

@Stateless
@Named("DefaultCheckoutAgreementService")
public class DefaultCheckoutAgreementService implements CheckoutAgreementService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CheckoutAgreementDao dao;

  @Inject
  @Named("DefaultCheckoutAgreementDao")
  public DefaultCheckoutAgreementService(final CheckoutAgreementDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreement find(java.lang.Integer id) {

    final CheckoutAgreement result = dao.find(id);
    logger.info("find(CheckoutAgreement) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CheckoutAgreement> select(int maxResult) {
    final List<CheckoutAgreement> result = dao.select(maxResult);
    logger.info("select(CheckoutAgreement) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CheckoutAgreement> selectAll() {
    final List<CheckoutAgreement> results = dao.selectAll();
    logger.info("selectAll(CheckoutAgreement) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreement create(CheckoutAgreement bean) {
    requireNonNull(bean);
    logger.info("create(CheckoutAgreement={}) - entered bean ");

    final CheckoutAgreement result = dao.create(bean);

    logger.info("create(CheckoutAgreement) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreement update(CheckoutAgreement bean) {
    requireNonNull(bean);
    logger.info("update(CheckoutAgreement={}) - entered bean ");

    final CheckoutAgreement result = dao.update(bean);

    logger.info("update(CheckoutAgreement) - exited - return value={} result ");
    return result;
  }
}
