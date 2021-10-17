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
import com.magento.test.dao.CatalogruleProductDao;
import com.magento.test.entity.CatalogruleProduct;
import com.magento.test.entity.CatalogruleProductId;

@Stateless
@Named("DefaultCatalogruleProductService")
public class DefaultCatalogruleProductService implements CatalogruleProductService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogruleProductDao dao;

  @Inject
  @Named("DefaultCatalogruleProductDao")
  public DefaultCatalogruleProductService(final CatalogruleProductDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProduct find(CatalogruleProductId id) {
    final CatalogruleProduct result = dao.find(id);
    logger.info("find(CatalogruleProduct) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleProduct> select(int maxResult) {
    final List<CatalogruleProduct> result = dao.select(maxResult);
    logger.info("select(CatalogruleProduct) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogruleProduct> selectAll() {
    final List<CatalogruleProduct> results = dao.selectAll();
    logger.info("selectAll(CatalogruleProduct) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProduct create(CatalogruleProduct bean) {
    requireNonNull(bean);
    logger.info("create(CatalogruleProduct={}) - entered bean ");

    final CatalogruleProduct result = dao.create(bean);

    logger.info("create(CatalogruleProduct) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogruleProduct update(CatalogruleProduct bean) {
    requireNonNull(bean);
    logger.info("update(CatalogruleProduct={}) - entered bean ");

    final CatalogruleProduct result = dao.update(bean);

    logger.info("update(CatalogruleProduct) - exited - return value={} result ");
    return result;
  }
}
