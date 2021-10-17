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
import com.magento.test.dao.LayoutLinkDao;
import com.magento.test.entity.LayoutLink;

@Stateless
@Named("DefaultLayoutLinkService")
public class DefaultLayoutLinkService implements LayoutLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final LayoutLinkDao dao;

  @Inject
  @Named("DefaultLayoutLinkDao")
  public DefaultLayoutLinkService(final LayoutLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public LayoutLink find(java.lang.Integer id) {

    final LayoutLink result = dao.find(id);
    logger.info("find(LayoutLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<LayoutLink> select(int maxResult) {
    final List<LayoutLink> result = dao.select(maxResult);
    logger.info("select(LayoutLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<LayoutLink> selectAll() {
    final List<LayoutLink> results = dao.selectAll();
    logger.info("selectAll(LayoutLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public LayoutLink create(LayoutLink bean) {
    requireNonNull(bean);
    logger.info("create(LayoutLink={}) - entered bean ");

    final LayoutLink result = dao.create(bean);

    logger.info("create(LayoutLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public LayoutLink update(LayoutLink bean) {
    requireNonNull(bean);
    logger.info("update(LayoutLink={}) - entered bean ");

    final LayoutLink result = dao.update(bean);

    logger.info("update(LayoutLink) - exited - return value={} result ");
    return result;
  }
}
