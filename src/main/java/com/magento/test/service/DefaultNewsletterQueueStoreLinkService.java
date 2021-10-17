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
import com.magento.test.dao.NewsletterQueueStoreLinkDao;
import com.magento.test.entity.NewsletterQueueStoreLink;
import com.magento.test.entity.NewsletterQueueStoreLinkId;

@Stateless
@Named("DefaultNewsletterQueueStoreLinkService")
public class DefaultNewsletterQueueStoreLinkService implements NewsletterQueueStoreLinkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final NewsletterQueueStoreLinkDao dao;

  @Inject
  @Named("DefaultNewsletterQueueStoreLinkDao")
  public DefaultNewsletterQueueStoreLinkService(final NewsletterQueueStoreLinkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public NewsletterQueueStoreLink find(NewsletterQueueStoreLinkId id) {
    final NewsletterQueueStoreLink result = dao.find(id);
    logger.info("find(NewsletterQueueStoreLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<NewsletterQueueStoreLink> select(int maxResult) {
    final List<NewsletterQueueStoreLink> result = dao.select(maxResult);
    logger.info("select(NewsletterQueueStoreLink) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<NewsletterQueueStoreLink> selectAll() {
    final List<NewsletterQueueStoreLink> results = dao.selectAll();
    logger.info("selectAll(NewsletterQueueStoreLink) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public NewsletterQueueStoreLink create(NewsletterQueueStoreLink bean) {
    requireNonNull(bean);
    logger.info("create(NewsletterQueueStoreLink={}) - entered bean ");

    final NewsletterQueueStoreLink result = dao.create(bean);

    logger.info("create(NewsletterQueueStoreLink) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public NewsletterQueueStoreLink update(NewsletterQueueStoreLink bean) {
    requireNonNull(bean);
    logger.info("update(NewsletterQueueStoreLink={}) - entered bean ");

    final NewsletterQueueStoreLink result = dao.update(bean);

    logger.info("update(NewsletterQueueStoreLink) - exited - return value={} result ");
    return result;
  }
}
