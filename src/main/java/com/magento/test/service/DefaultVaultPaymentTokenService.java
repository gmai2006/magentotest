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
import com.magento.test.dao.VaultPaymentTokenDao;
import com.magento.test.entity.VaultPaymentToken;
import com.magento.test.entity.VaultPaymentTokenId;

@Stateless
@Named("DefaultVaultPaymentTokenService")
public class DefaultVaultPaymentTokenService implements VaultPaymentTokenService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VaultPaymentTokenDao dao;

  @Inject
  @Named("DefaultVaultPaymentTokenDao")
  public DefaultVaultPaymentTokenService(final VaultPaymentTokenDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentToken find(VaultPaymentTokenId id) {
    final VaultPaymentToken result = dao.find(id);
    logger.info("find(VaultPaymentToken) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VaultPaymentToken> select(int maxResult) {
    final List<VaultPaymentToken> result = dao.select(maxResult);
    logger.info("select(VaultPaymentToken) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VaultPaymentToken> selectAll() {
    final List<VaultPaymentToken> results = dao.selectAll();
    logger.info("selectAll(VaultPaymentToken) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentToken create(VaultPaymentToken bean) {
    requireNonNull(bean);
    logger.info("create(VaultPaymentToken={}) - entered bean ");

    final VaultPaymentToken result = dao.create(bean);

    logger.info("create(VaultPaymentToken) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentToken update(VaultPaymentToken bean) {
    requireNonNull(bean);
    logger.info("update(VaultPaymentToken={}) - entered bean ");

    final VaultPaymentToken result = dao.update(bean);

    logger.info("update(VaultPaymentToken) - exited - return value={} result ");
    return result;
  }
}
