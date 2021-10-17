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
import com.magento.test.dao.VaultPaymentTokenOrderPaymentLinkDao;
import com.magento.test.entity.VaultPaymentTokenOrderPaymentLink;
import com.magento.test.entity.VaultPaymentTokenOrderPaymentLinkId;

@Stateless
@Named("DefaultVaultPaymentTokenOrderPaymentLinkService")
public class DefaultVaultPaymentTokenOrderPaymentLinkService
    implements VaultPaymentTokenOrderPaymentLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final VaultPaymentTokenOrderPaymentLinkDao dao;

  @Inject
  @Named("DefaultVaultPaymentTokenOrderPaymentLinkDao")
  public DefaultVaultPaymentTokenOrderPaymentLinkService(
      final VaultPaymentTokenOrderPaymentLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentTokenOrderPaymentLink find(VaultPaymentTokenOrderPaymentLinkId id) {
    final VaultPaymentTokenOrderPaymentLink result = dao.find(id);
    logger.info("find(VaultPaymentTokenOrderPaymentLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<VaultPaymentTokenOrderPaymentLink> select(int maxResult) {
    final List<VaultPaymentTokenOrderPaymentLink> result = dao.select(maxResult);
    logger.info("select(VaultPaymentTokenOrderPaymentLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<VaultPaymentTokenOrderPaymentLink> selectAll() {
    final List<VaultPaymentTokenOrderPaymentLink> results = dao.selectAll();
    logger.info("selectAll(VaultPaymentTokenOrderPaymentLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentTokenOrderPaymentLink create(VaultPaymentTokenOrderPaymentLink bean) {
    requireNonNull(bean);
    logger.info("create(VaultPaymentTokenOrderPaymentLink={}) - entered bean ");

    final VaultPaymentTokenOrderPaymentLink result = dao.create(bean);

    logger.info("create(VaultPaymentTokenOrderPaymentLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public VaultPaymentTokenOrderPaymentLink update(VaultPaymentTokenOrderPaymentLink bean) {
    requireNonNull(bean);
    logger.info("update(VaultPaymentTokenOrderPaymentLink={}) - entered bean ");

    final VaultPaymentTokenOrderPaymentLink result = dao.update(bean);

    logger.info("update(VaultPaymentTokenOrderPaymentLink) - exited - return value={} result ");
    return result;
  }
}
