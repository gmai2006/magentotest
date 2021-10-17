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
import com.magento.test.dao.PatchListDao;
import com.magento.test.entity.PatchList;

@Stateless
@Named("DefaultPatchListService")
public class DefaultPatchListService implements PatchListService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final PatchListDao dao;

  @Inject
  @Named("DefaultPatchListDao")
  public DefaultPatchListService(final PatchListDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public PatchList find(java.lang.Integer id) {

    final PatchList result = dao.find(id);
    logger.info("find(PatchList) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<PatchList> select(int maxResult) {
    final List<PatchList> result = dao.select(maxResult);
    logger.info("select(PatchList) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<PatchList> selectAll() {
    final List<PatchList> results = dao.selectAll();
    logger.info("selectAll(PatchList) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public PatchList create(PatchList bean) {
    requireNonNull(bean);
    logger.info("create(PatchList={}) - entered bean ");

    final PatchList result = dao.create(bean);

    logger.info("create(PatchList) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public PatchList update(PatchList bean) {
    requireNonNull(bean);
    logger.info("update(PatchList={}) - entered bean ");

    final PatchList result = dao.update(bean);

    logger.info("update(PatchList) - exited - return value={} result ");
    return result;
  }
}
