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
import com.magento.test.dao.EavEntityVarcharDao;
import com.magento.test.entity.EavEntityVarchar;
import com.magento.test.entity.EavEntityVarcharId;

@Stateless
@Named("DefaultEavEntityVarcharService")
public class DefaultEavEntityVarcharService implements EavEntityVarcharService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavEntityVarcharDao dao;

  @Inject
  @Named("DefaultEavEntityVarcharDao")
  public DefaultEavEntityVarcharService(final EavEntityVarcharDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityVarchar find(EavEntityVarcharId id) {
    final EavEntityVarchar result = dao.find(id);
    logger.info("find(EavEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityVarchar> select(int maxResult) {
    final List<EavEntityVarchar> result = dao.select(maxResult);
    logger.info("select(EavEntityVarchar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavEntityVarchar> selectAll() {
    final List<EavEntityVarchar> results = dao.selectAll();
    logger.info("selectAll(EavEntityVarchar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityVarchar create(EavEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("create(EavEntityVarchar={}) - entered bean ");

    final EavEntityVarchar result = dao.create(bean);

    logger.info("create(EavEntityVarchar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavEntityVarchar update(EavEntityVarchar bean) {
    requireNonNull(bean);
    logger.info("update(EavEntityVarchar={}) - entered bean ");

    final EavEntityVarchar result = dao.update(bean);

    logger.info("update(EavEntityVarchar) - exited - return value={} result ");
    return result;
  }
}
