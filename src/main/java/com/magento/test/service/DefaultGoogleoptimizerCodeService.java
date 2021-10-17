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
import com.magento.test.dao.GoogleoptimizerCodeDao;
import com.magento.test.entity.GoogleoptimizerCode;
import com.magento.test.entity.GoogleoptimizerCodeId;

@Stateless
@Named("DefaultGoogleoptimizerCodeService")
public class DefaultGoogleoptimizerCodeService implements GoogleoptimizerCodeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final GoogleoptimizerCodeDao dao;

  @Inject
  @Named("DefaultGoogleoptimizerCodeDao")
  public DefaultGoogleoptimizerCodeService(final GoogleoptimizerCodeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public GoogleoptimizerCode find(GoogleoptimizerCodeId id) {
    final GoogleoptimizerCode result = dao.find(id);
    logger.info("find(GoogleoptimizerCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<GoogleoptimizerCode> select(int maxResult) {
    final List<GoogleoptimizerCode> result = dao.select(maxResult);
    logger.info("select(GoogleoptimizerCode) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<GoogleoptimizerCode> selectAll() {
    final List<GoogleoptimizerCode> results = dao.selectAll();
    logger.info("selectAll(GoogleoptimizerCode) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public GoogleoptimizerCode create(GoogleoptimizerCode bean) {
    requireNonNull(bean);
    logger.info("create(GoogleoptimizerCode={}) - entered bean ");

    final GoogleoptimizerCode result = dao.create(bean);

    logger.info("create(GoogleoptimizerCode) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public GoogleoptimizerCode update(GoogleoptimizerCode bean) {
    requireNonNull(bean);
    logger.info("update(GoogleoptimizerCode={}) - entered bean ");

    final GoogleoptimizerCode result = dao.update(bean);

    logger.info("update(GoogleoptimizerCode) - exited - return value={} result ");
    return result;
  }
}
