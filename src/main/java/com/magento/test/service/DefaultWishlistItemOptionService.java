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
import com.magento.test.dao.WishlistItemOptionDao;
import com.magento.test.entity.WishlistItemOption;

@Stateless
@Named("DefaultWishlistItemOptionService")
public class DefaultWishlistItemOptionService implements WishlistItemOptionService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final WishlistItemOptionDao dao;

  @Inject
  @Named("DefaultWishlistItemOptionDao")
  public DefaultWishlistItemOptionService(final WishlistItemOptionDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public WishlistItemOption find(java.lang.Integer id) {

    final WishlistItemOption result = dao.find(id);
    logger.info("find(WishlistItemOption) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<WishlistItemOption> select(int maxResult) {
    final List<WishlistItemOption> result = dao.select(maxResult);
    logger.info("select(WishlistItemOption) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<WishlistItemOption> selectAll() {
    final List<WishlistItemOption> results = dao.selectAll();
    logger.info("selectAll(WishlistItemOption) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public WishlistItemOption create(WishlistItemOption bean) {
    requireNonNull(bean);
    logger.info("create(WishlistItemOption={}) - entered bean ");

    final WishlistItemOption result = dao.create(bean);

    logger.info("create(WishlistItemOption) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public WishlistItemOption update(WishlistItemOption bean) {
    requireNonNull(bean);
    logger.info("update(WishlistItemOption={}) - entered bean ");

    final WishlistItemOption result = dao.update(bean);

    logger.info("update(WishlistItemOption) - exited - return value={} result ");
    return result;
  }
}
