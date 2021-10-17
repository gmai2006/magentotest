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
import com.magento.test.dao.UiBookmarkDao;
import com.magento.test.entity.UiBookmark;

@Stateless
@Named("DefaultUiBookmarkService")
public class DefaultUiBookmarkService implements UiBookmarkService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final UiBookmarkDao dao;

  @Inject
  @Named("DefaultUiBookmarkDao")
  public DefaultUiBookmarkService(final UiBookmarkDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public UiBookmark find(java.lang.Integer id) {

    final UiBookmark result = dao.find(id);
    logger.info("find(UiBookmark) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<UiBookmark> select(int maxResult) {
    final List<UiBookmark> result = dao.select(maxResult);
    logger.info("select(UiBookmark) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<UiBookmark> selectAll() {
    final List<UiBookmark> results = dao.selectAll();
    logger.info("selectAll(UiBookmark) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public UiBookmark create(UiBookmark bean) {
    requireNonNull(bean);
    logger.info("create(UiBookmark={}) - entered bean ");

    final UiBookmark result = dao.create(bean);

    logger.info("create(UiBookmark) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public UiBookmark update(UiBookmark bean) {
    requireNonNull(bean);
    logger.info("update(UiBookmark={}) - entered bean ");

    final UiBookmark result = dao.update(bean);

    logger.info("update(UiBookmark) - exited - return value={} result ");
    return result;
  }
}
