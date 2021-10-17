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
import com.magento.test.dao.InventoryGeonameDao;
import com.magento.test.entity.InventoryGeoname;

@Stateless
@Named("DefaultInventoryGeonameService")
public class DefaultInventoryGeonameService implements InventoryGeonameService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final InventoryGeonameDao dao;

  @Inject
  @Named("DefaultInventoryGeonameDao")
  public DefaultInventoryGeonameService(final InventoryGeonameDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryGeoname find(java.lang.String id) {

    final InventoryGeoname result = dao.find(id);
    logger.info("find(InventoryGeoname) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryGeoname> select(int maxResult) {
    final List<InventoryGeoname> result = dao.select(maxResult);
    logger.info("select(InventoryGeoname) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<InventoryGeoname> selectAll() {
    final List<InventoryGeoname> results = dao.selectAll();
    logger.info("selectAll(InventoryGeoname) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryGeoname create(InventoryGeoname bean) {
    requireNonNull(bean);
    logger.info("create(InventoryGeoname={}) - entered bean ");

    final InventoryGeoname result = dao.create(bean);

    logger.info("create(InventoryGeoname) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public InventoryGeoname update(InventoryGeoname bean) {
    requireNonNull(bean);
    logger.info("update(InventoryGeoname={}) - entered bean ");

    final InventoryGeoname result = dao.update(bean);

    logger.info("update(InventoryGeoname) - exited - return value={} result ");
    return result;
  }
}
