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
import com.magento.test.dao.OauthTokenDao;
import com.magento.test.entity.OauthToken;
import com.magento.test.entity.OauthTokenId;

@Stateless
@Named("DefaultOauthTokenService")
public class DefaultOauthTokenService implements OauthTokenService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final OauthTokenDao dao;

  @Inject
  @Named("DefaultOauthTokenDao")
  public DefaultOauthTokenService(final OauthTokenDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public OauthToken find(OauthTokenId id) {
    final OauthToken result = dao.find(id);
    logger.info("find(OauthToken) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<OauthToken> select(int maxResult) {
    final List<OauthToken> result = dao.select(maxResult);
    logger.info("select(OauthToken) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<OauthToken> selectAll() {
    final List<OauthToken> results = dao.selectAll();
    logger.info("selectAll(OauthToken) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public OauthToken create(OauthToken bean) {
    requireNonNull(bean);
    logger.info("create(OauthToken={}) - entered bean ");

    final OauthToken result = dao.create(bean);

    logger.info("create(OauthToken) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public OauthToken update(OauthToken bean) {
    requireNonNull(bean);
    logger.info("update(OauthToken={}) - entered bean ");

    final OauthToken result = dao.update(bean);

    logger.info("update(OauthToken) - exited - return value={} result ");
    return result;
  }
}
