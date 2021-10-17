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
import com.magento.test.dao.CatalogsearchFulltextScope1Dao;
import com.magento.test.entity.CatalogsearchFulltextScope1;
import com.magento.test.entity.CatalogsearchFulltextScope1Id;

@Stateless
@Named("DefaultCatalogsearchFulltextScope1Service")
public class DefaultCatalogsearchFulltextScope1Service
    implements CatalogsearchFulltextScope1Service {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogsearchFulltextScope1Dao dao;

  @Inject
  @Named("DefaultCatalogsearchFulltextScope1Dao")
  public DefaultCatalogsearchFulltextScope1Service(final CatalogsearchFulltextScope1Dao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogsearchFulltextScope1 find(CatalogsearchFulltextScope1Id id) {
    final CatalogsearchFulltextScope1 result = dao.find(id);
    logger.info("find(CatalogsearchFulltextScope1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogsearchFulltextScope1> select(int maxResult) {
    final List<CatalogsearchFulltextScope1> result = dao.select(maxResult);
    logger.info("select(CatalogsearchFulltextScope1) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogsearchFulltextScope1> selectAll() {
    final List<CatalogsearchFulltextScope1> results = dao.selectAll();
    logger.info("selectAll(CatalogsearchFulltextScope1) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogsearchFulltextScope1 create(CatalogsearchFulltextScope1 bean) {
    requireNonNull(bean);
    logger.info("create(CatalogsearchFulltextScope1={}) - entered bean ");

    final CatalogsearchFulltextScope1 result = dao.create(bean);

    logger.info("create(CatalogsearchFulltextScope1) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogsearchFulltextScope1 update(CatalogsearchFulltextScope1 bean) {
    requireNonNull(bean);
    logger.info("update(CatalogsearchFulltextScope1={}) - entered bean ");

    final CatalogsearchFulltextScope1 result = dao.update(bean);

    logger.info("update(CatalogsearchFulltextScope1) - exited - return value={} result ");
    return result;
  }
}
