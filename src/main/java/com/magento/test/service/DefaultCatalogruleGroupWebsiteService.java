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
import com.magento.test.dao.CatalogruleGroupWebsiteDao;
import com.magento.test.entity.CatalogruleGroupWebsite;
import com.magento.test.entity.CatalogruleGroupWebsiteId;

@Stateless
@Named("DefaultCatalogruleGroupWebsiteService")
public class DefaultCatalogruleGroupWebsiteService implements CatalogruleGroupWebsiteService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogruleGroupWebsiteDao dao;

  @Inject
  @Named("DefaultCatalogruleGroupWebsiteDao")
  public DefaultCatalogruleGroupWebsiteService(final CatalogruleGroupWebsiteDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleGroupWebsite find(CatalogruleGroupWebsiteId id) {
    final CatalogruleGroupWebsite result = dao.find(id);
    logger.info("find(CatalogruleGroupWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleGroupWebsite> select(int maxResult) {
    final List<CatalogruleGroupWebsite> result = dao.select(maxResult);
    logger.info("select(CatalogruleGroupWebsite) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleGroupWebsite> selectAll() {
    final List<CatalogruleGroupWebsite> results = dao.selectAll();
    logger.info("selectAll(CatalogruleGroupWebsite) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleGroupWebsite create(CatalogruleGroupWebsite bean) {
    requireNonNull(bean);
    logger.info("create(CatalogruleGroupWebsite={}) - entered bean ");

    final CatalogruleGroupWebsite result = dao.create(bean);

    logger.info("create(CatalogruleGroupWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleGroupWebsite update(CatalogruleGroupWebsite bean) {
    requireNonNull(bean);
    logger.info("update(CatalogruleGroupWebsite={}) - entered bean ");

    final CatalogruleGroupWebsite result = dao.update(bean);

    logger.info("update(CatalogruleGroupWebsite) - exited - return value={} result ");
    return result;
  }
}
