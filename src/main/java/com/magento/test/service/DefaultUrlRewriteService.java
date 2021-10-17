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
import com.magento.test.dao.UrlRewriteDao;
import com.magento.test.entity.UrlRewrite;
import com.magento.test.entity.UrlRewriteId;

@Stateless
@Named("DefaultUrlRewriteService")
public class DefaultUrlRewriteService implements UrlRewriteService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UrlRewriteDao dao;

  @Inject
  @Named("DefaultUrlRewriteDao")
  public DefaultUrlRewriteService(final UrlRewriteDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public UrlRewrite find(UrlRewriteId id) {
    final UrlRewrite result = dao.find(id);
    logger.info("find(UrlRewrite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<UrlRewrite> select(int maxResult) {
    final List<UrlRewrite> result = dao.select(maxResult);
    logger.info("select(UrlRewrite) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<UrlRewrite> selectAll() {
    final List<UrlRewrite> results = dao.selectAll();
    logger.info("selectAll(UrlRewrite) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public UrlRewrite create(UrlRewrite bean) {
    requireNonNull(bean);
    logger.info("create(UrlRewrite={}) - entered bean ");

    final UrlRewrite result = dao.create(bean);

    logger.info("create(UrlRewrite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public UrlRewrite update(UrlRewrite bean) {
    requireNonNull(bean);
    logger.info("update(UrlRewrite={}) - entered bean ");

    final UrlRewrite result = dao.update(bean);

    logger.info("update(UrlRewrite) - exited - return value={} result ");
    return result;
  }
}
