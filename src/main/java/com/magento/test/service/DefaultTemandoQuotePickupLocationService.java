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
import com.magento.test.dao.TemandoQuotePickupLocationDao;
import com.magento.test.entity.TemandoQuotePickupLocation;

@Stateless
@Named("DefaultTemandoQuotePickupLocationService")
public class DefaultTemandoQuotePickupLocationService implements TemandoQuotePickupLocationService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TemandoQuotePickupLocationDao dao;

  @Inject
  @Named("DefaultTemandoQuotePickupLocationDao")
  public DefaultTemandoQuotePickupLocationService(final TemandoQuotePickupLocationDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoQuotePickupLocation find(java.lang.Integer id) {

    final TemandoQuotePickupLocation result = dao.find(id);
    logger.info("find(TemandoQuotePickupLocation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<TemandoQuotePickupLocation> select(int maxResult) {
    final List<TemandoQuotePickupLocation> result = dao.select(maxResult);
    logger.info("select(TemandoQuotePickupLocation) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<TemandoQuotePickupLocation> selectAll() {
    final List<TemandoQuotePickupLocation> results = dao.selectAll();
    logger.info("selectAll(TemandoQuotePickupLocation) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoQuotePickupLocation create(TemandoQuotePickupLocation bean) {
    requireNonNull(bean);
    logger.info("create(TemandoQuotePickupLocation={}) - entered bean ");

    final TemandoQuotePickupLocation result = dao.create(bean);

    logger.info("create(TemandoQuotePickupLocation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public TemandoQuotePickupLocation update(TemandoQuotePickupLocation bean) {
    requireNonNull(bean);
    logger.info("update(TemandoQuotePickupLocation={}) - entered bean ");

    final TemandoQuotePickupLocation result = dao.update(bean);

    logger.info("update(TemandoQuotePickupLocation) - exited - return value={} result ");
    return result;
  }
}
