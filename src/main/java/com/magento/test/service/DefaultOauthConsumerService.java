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
import com.magento.test.dao.OauthConsumerDao;
import com.magento.test.entity.OauthConsumer;
import com.magento.test.entity.OauthConsumerId;

@Stateless
@Named("DefaultOauthConsumerService")
public class DefaultOauthConsumerService implements OauthConsumerService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OauthConsumerDao dao;

  @Inject
  @Named("DefaultOauthConsumerDao")
  public DefaultOauthConsumerService(final OauthConsumerDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public OauthConsumer find(OauthConsumerId id) {
    final OauthConsumer result = dao.find(id);
    logger.info("find(OauthConsumer) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<OauthConsumer> select(int maxResult) {
    final List<OauthConsumer> result = dao.select(maxResult);
    logger.info("select(OauthConsumer) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<OauthConsumer> selectAll() {
    final List<OauthConsumer> results = dao.selectAll();
    logger.info("selectAll(OauthConsumer) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public OauthConsumer create(OauthConsumer bean) {
    requireNonNull(bean);
    logger.info("create(OauthConsumer={}) - entered bean ");

    final OauthConsumer result = dao.create(bean);

    logger.info("create(OauthConsumer) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public OauthConsumer update(OauthConsumer bean) {
    requireNonNull(bean);
    logger.info("update(OauthConsumer={}) - entered bean ");

    final OauthConsumer result = dao.update(bean);

    logger.info("update(OauthConsumer) - exited - return value={} result ");
    return result;
  }
}
