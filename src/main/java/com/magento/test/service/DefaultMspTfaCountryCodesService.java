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
import com.magento.test.dao.MspTfaCountryCodesDao;
import com.magento.test.entity.MspTfaCountryCodes;

@Stateless
@Named("DefaultMspTfaCountryCodesService")
public class DefaultMspTfaCountryCodesService implements MspTfaCountryCodesService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MspTfaCountryCodesDao dao;

  @Inject
  @Named("DefaultMspTfaCountryCodesDao")
  public DefaultMspTfaCountryCodesService(final MspTfaCountryCodesDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MspTfaCountryCodes find(java.lang.Integer id) {

    final MspTfaCountryCodes result = dao.find(id);
    logger.info("find(MspTfaCountryCodes) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MspTfaCountryCodes> select(int maxResult) {
    final List<MspTfaCountryCodes> result = dao.select(maxResult);
    logger.info("select(MspTfaCountryCodes) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MspTfaCountryCodes> selectAll() {
    final List<MspTfaCountryCodes> results = dao.selectAll();
    logger.info("selectAll(MspTfaCountryCodes) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MspTfaCountryCodes create(MspTfaCountryCodes bean) {
    requireNonNull(bean);
    logger.info("create(MspTfaCountryCodes={}) - entered bean ");

    final MspTfaCountryCodes result = dao.create(bean);

    logger.info("create(MspTfaCountryCodes) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MspTfaCountryCodes update(MspTfaCountryCodes bean) {
    requireNonNull(bean);
    logger.info("update(MspTfaCountryCodes={}) - entered bean ");

    final MspTfaCountryCodes result = dao.update(bean);

    logger.info("update(MspTfaCountryCodes) - exited - return value={} result ");
    return result;
  }
}
