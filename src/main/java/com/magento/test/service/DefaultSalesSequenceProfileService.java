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
import com.magento.test.dao.SalesSequenceProfileDao;
import com.magento.test.entity.SalesSequenceProfile;
import com.magento.test.entity.SalesSequenceProfileId;

@Stateless
@Named("DefaultSalesSequenceProfileService")
public class DefaultSalesSequenceProfileService implements SalesSequenceProfileService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesSequenceProfileDao dao;

  @Inject
  @Named("DefaultSalesSequenceProfileDao")
  public DefaultSalesSequenceProfileService(final SalesSequenceProfileDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesSequenceProfile find(SalesSequenceProfileId id) {
    final SalesSequenceProfile result = dao.find(id);
    logger.info("find(SalesSequenceProfile) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesSequenceProfile> select(int maxResult) {
    final List<SalesSequenceProfile> result = dao.select(maxResult);
    logger.info("select(SalesSequenceProfile) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesSequenceProfile> selectAll() {
    final List<SalesSequenceProfile> results = dao.selectAll();
    logger.info("selectAll(SalesSequenceProfile) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesSequenceProfile create(SalesSequenceProfile bean) {
    requireNonNull(bean);
    logger.info("create(SalesSequenceProfile={}) - entered bean ");

    final SalesSequenceProfile result = dao.create(bean);

    logger.info("create(SalesSequenceProfile) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesSequenceProfile update(SalesSequenceProfile bean) {
    requireNonNull(bean);
    logger.info("update(SalesSequenceProfile={}) - entered bean ");

    final SalesSequenceProfile result = dao.update(bean);

    logger.info("update(SalesSequenceProfile) - exited - return value={} result ");
    return result;
  }
}
