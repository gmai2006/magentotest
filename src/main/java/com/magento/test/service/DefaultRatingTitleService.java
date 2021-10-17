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
import com.magento.test.dao.RatingTitleDao;
import com.magento.test.entity.RatingTitle;
import com.magento.test.entity.RatingTitleId;

@Stateless
@Named("DefaultRatingTitleService")
public class DefaultRatingTitleService implements RatingTitleService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final RatingTitleDao dao;

  @Inject
  @Named("DefaultRatingTitleDao")
  public DefaultRatingTitleService(final RatingTitleDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public RatingTitle find(RatingTitleId id) {
    final RatingTitle result = dao.find(id);
    logger.info("find(RatingTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<RatingTitle> select(int maxResult) {
    final List<RatingTitle> result = dao.select(maxResult);
    logger.info("select(RatingTitle) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<RatingTitle> selectAll() {
    final List<RatingTitle> results = dao.selectAll();
    logger.info("selectAll(RatingTitle) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public RatingTitle create(RatingTitle bean) {
    requireNonNull(bean);
    logger.info("create(RatingTitle={}) - entered bean ");

    final RatingTitle result = dao.create(bean);

    logger.info("create(RatingTitle) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public RatingTitle update(RatingTitle bean) {
    requireNonNull(bean);
    logger.info("update(RatingTitle={}) - entered bean ");

    final RatingTitle result = dao.update(bean);

    logger.info("update(RatingTitle) - exited - return value={} result ");
    return result;
  }
}
