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
import com.magento.test.dao.WishlistDao;
import com.magento.test.entity.Wishlist;
import com.magento.test.entity.WishlistId;

@Stateless
@Named("DefaultWishlistService")
public class DefaultWishlistService implements WishlistService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final WishlistDao dao;

  @Inject
  @Named("DefaultWishlistDao")
  public DefaultWishlistService(final WishlistDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Wishlist find(WishlistId id) {
    final Wishlist result = dao.find(id);
    logger.info("find(Wishlist) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Wishlist> select(int maxResult) {
    final List<Wishlist> result = dao.select(maxResult);
    logger.info("select(Wishlist) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Wishlist> selectAll() {
    final List<Wishlist> results = dao.selectAll();
    logger.info("selectAll(Wishlist) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Wishlist create(Wishlist bean) {
    requireNonNull(bean);
    logger.info("create(Wishlist={}) - entered bean ");

    final Wishlist result = dao.create(bean);

    logger.info("create(Wishlist) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Wishlist update(Wishlist bean) {
    requireNonNull(bean);
    logger.info("update(Wishlist={}) - entered bean ");

    final Wishlist result = dao.update(bean);

    logger.info("update(Wishlist) - exited - return value={} result ");
    return result;
  }
}
