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
import com.magento.test.dao.CheckoutAgreementStoreDao;
import com.magento.test.entity.CheckoutAgreementStore;
import com.magento.test.entity.CheckoutAgreementStoreId;

@Stateless
@Named("DefaultCheckoutAgreementStoreService")
public class DefaultCheckoutAgreementStoreService implements CheckoutAgreementStoreService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CheckoutAgreementStoreDao dao;

  @Inject
  @Named("DefaultCheckoutAgreementStoreDao")
  public DefaultCheckoutAgreementStoreService(final CheckoutAgreementStoreDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreementStore find(CheckoutAgreementStoreId id) {
    final CheckoutAgreementStore result = dao.find(id);
    logger.info("find(CheckoutAgreementStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CheckoutAgreementStore> select(int maxResult) {
    final List<CheckoutAgreementStore> result = dao.select(maxResult);
    logger.info("select(CheckoutAgreementStore) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CheckoutAgreementStore> selectAll() {
    final List<CheckoutAgreementStore> results = dao.selectAll();
    logger.info("selectAll(CheckoutAgreementStore) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreementStore create(CheckoutAgreementStore bean) {
    requireNonNull(bean);
    logger.info("create(CheckoutAgreementStore={}) - entered bean ");

    final CheckoutAgreementStore result = dao.create(bean);

    logger.info("create(CheckoutAgreementStore) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CheckoutAgreementStore update(CheckoutAgreementStore bean) {
    requireNonNull(bean);
    logger.info("update(CheckoutAgreementStore={}) - entered bean ");

    final CheckoutAgreementStore result = dao.update(bean);

    logger.info("update(CheckoutAgreementStore) - exited - return value={} result ");
    return result;
  }
}
