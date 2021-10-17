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
import com.magento.test.dao.SalesShipmentTrackDao;
import com.magento.test.entity.SalesShipmentTrack;

@Stateless
@Named("DefaultSalesShipmentTrackService")
public class DefaultSalesShipmentTrackService implements SalesShipmentTrackService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesShipmentTrackDao dao;

  @Inject
  @Named("DefaultSalesShipmentTrackDao")
  public DefaultSalesShipmentTrackService(final SalesShipmentTrackDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentTrack find(java.lang.Integer id) {

    final SalesShipmentTrack result = dao.find(id);
    logger.info("find(SalesShipmentTrack) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentTrack> select(int maxResult) {
    final List<SalesShipmentTrack> result = dao.select(maxResult);
    logger.info("select(SalesShipmentTrack) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesShipmentTrack> selectAll() {
    final List<SalesShipmentTrack> results = dao.selectAll();
    logger.info("selectAll(SalesShipmentTrack) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentTrack create(SalesShipmentTrack bean) {
    requireNonNull(bean);
    logger.info("create(SalesShipmentTrack={}) - entered bean ");

    final SalesShipmentTrack result = dao.create(bean);

    logger.info("create(SalesShipmentTrack) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesShipmentTrack update(SalesShipmentTrack bean) {
    requireNonNull(bean);
    logger.info("update(SalesShipmentTrack={}) - entered bean ");

    final SalesShipmentTrack result = dao.update(bean);

    logger.info("update(SalesShipmentTrack) - exited - return value={} result ");
    return result;
  }
}
