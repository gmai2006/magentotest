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
import com.magento.test.dao.GiftMessageDao;
import com.magento.test.entity.GiftMessage;

@Stateless
@Named("DefaultGiftMessageService")
public class DefaultGiftMessageService implements GiftMessageService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final GiftMessageDao dao;

  @Inject
  @Named("DefaultGiftMessageDao")
  public DefaultGiftMessageService(final GiftMessageDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public GiftMessage find(java.lang.Integer id) {

    final GiftMessage result = dao.find(id);
    logger.info("find(GiftMessage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<GiftMessage> select(int maxResult) {
    final List<GiftMessage> result = dao.select(maxResult);
    logger.info("select(GiftMessage) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<GiftMessage> selectAll() {
    final List<GiftMessage> results = dao.selectAll();
    logger.info("selectAll(GiftMessage) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public GiftMessage create(GiftMessage bean) {
    requireNonNull(bean);
    logger.info("create(GiftMessage={}) - entered bean ");

    final GiftMessage result = dao.create(bean);

    logger.info("create(GiftMessage) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public GiftMessage update(GiftMessage bean) {
    requireNonNull(bean);
    logger.info("update(GiftMessage={}) - entered bean ");

    final GiftMessage result = dao.update(bean);

    logger.info("update(GiftMessage) - exited - return value={} result ");
    return result;
  }
}
