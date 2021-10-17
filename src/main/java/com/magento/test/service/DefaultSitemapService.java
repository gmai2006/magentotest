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
import com.magento.test.dao.SitemapDao;
import com.magento.test.entity.Sitemap;

@Stateless
@Named("DefaultSitemapService")
public class DefaultSitemapService implements SitemapService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final SitemapDao dao;

  @Inject
  @Named("DefaultSitemapDao")
  public DefaultSitemapService(final SitemapDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Sitemap find(java.lang.Integer id) {

    final Sitemap result = dao.find(id);
    logger.info("find(Sitemap) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Sitemap> select(int maxResult) {
    final List<Sitemap> result = dao.select(maxResult);
    logger.info("select(Sitemap) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Sitemap> selectAll() {
    final List<Sitemap> results = dao.selectAll();
    logger.info("selectAll(Sitemap) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Sitemap create(Sitemap bean) {
    requireNonNull(bean);
    logger.info("create(Sitemap={}) - entered bean ");

    final Sitemap result = dao.create(bean);

    logger.info("create(Sitemap) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Sitemap update(Sitemap bean) {
    requireNonNull(bean);
    logger.info("update(Sitemap={}) - entered bean ");

    final Sitemap result = dao.update(bean);

    logger.info("update(Sitemap) - exited - return value={} result ");
    return result;
  }
}
