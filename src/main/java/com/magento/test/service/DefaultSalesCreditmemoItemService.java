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
import com.magento.test.dao.SalesCreditmemoItemDao;
import com.magento.test.entity.SalesCreditmemoItem;

@Stateless
@Named("DefaultSalesCreditmemoItemService")
public class DefaultSalesCreditmemoItemService implements SalesCreditmemoItemService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SalesCreditmemoItemDao dao;

  @Inject
  @Named("DefaultSalesCreditmemoItemDao")
  public DefaultSalesCreditmemoItemService(final SalesCreditmemoItemDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoItem find(java.lang.Integer id) {

    final SalesCreditmemoItem result = dao.find(id);
    logger.info("find(SalesCreditmemoItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoItem> select(int maxResult) {
    final List<SalesCreditmemoItem> result = dao.select(maxResult);
    logger.info("select(SalesCreditmemoItem) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<SalesCreditmemoItem> selectAll() {
    final List<SalesCreditmemoItem> results = dao.selectAll();
    logger.info("selectAll(SalesCreditmemoItem) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoItem create(SalesCreditmemoItem bean) {
    requireNonNull(bean);
    logger.info("create(SalesCreditmemoItem={}) - entered bean ");

    final SalesCreditmemoItem result = dao.create(bean);

    logger.info("create(SalesCreditmemoItem) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public SalesCreditmemoItem update(SalesCreditmemoItem bean) {
    requireNonNull(bean);
    logger.info("update(SalesCreditmemoItem={}) - entered bean ");

    final SalesCreditmemoItem result = dao.update(bean);

    logger.info("update(SalesCreditmemoItem) - exited - return value={} result ");
    return result;
  }
}
