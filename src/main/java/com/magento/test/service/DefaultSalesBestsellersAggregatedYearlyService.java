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
import com.magento.test.dao.SalesBestsellersAggregatedYearlyDao;
import com.magento.test.entity.SalesBestsellersAggregatedYearly;
import com.magento.test.entity.SalesBestsellersAggregatedYearlyId;

@Stateless
@Named("DefaultSalesBestsellersAggregatedYearlyService")
public class DefaultSalesBestsellersAggregatedYearlyService
    implements SalesBestsellersAggregatedYearlyService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesBestsellersAggregatedYearlyDao dao;

  @Inject
  @Named("DefaultSalesBestsellersAggregatedYearlyDao")
  public DefaultSalesBestsellersAggregatedYearlyService(
      final SalesBestsellersAggregatedYearlyDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesBestsellersAggregatedYearly find(SalesBestsellersAggregatedYearlyId id) {
    final SalesBestsellersAggregatedYearly result = dao.find(id);
    logger.info("find(SalesBestsellersAggregatedYearly) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesBestsellersAggregatedYearly> select(int maxResult) {
    final List<SalesBestsellersAggregatedYearly> result = dao.select(maxResult);
    logger.info("select(SalesBestsellersAggregatedYearly) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesBestsellersAggregatedYearly> selectAll() {
    final List<SalesBestsellersAggregatedYearly> results = dao.selectAll();
    logger.info("selectAll(SalesBestsellersAggregatedYearly) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesBestsellersAggregatedYearly create(SalesBestsellersAggregatedYearly bean) {
    requireNonNull(bean);
    logger.info("create(SalesBestsellersAggregatedYearly={}) - entered bean ");

    final SalesBestsellersAggregatedYearly result = dao.create(bean);

    logger.info("create(SalesBestsellersAggregatedYearly) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesBestsellersAggregatedYearly update(SalesBestsellersAggregatedYearly bean) {
    requireNonNull(bean);
    logger.info("update(SalesBestsellersAggregatedYearly={}) - entered bean ");

    final SalesBestsellersAggregatedYearly result = dao.update(bean);

    logger.info("update(SalesBestsellersAggregatedYearly) - exited - return value={} result ");
    return result;
  }
}
