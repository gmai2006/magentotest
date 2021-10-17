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
import com.magento.test.dao.CustomerFormAttributeDao;
import com.magento.test.entity.CustomerFormAttribute;
import com.magento.test.entity.CustomerFormAttributeId;

@Stateless
@Named("DefaultCustomerFormAttributeService")
public class DefaultCustomerFormAttributeService implements CustomerFormAttributeService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerFormAttributeDao dao;

  @Inject
  @Named("DefaultCustomerFormAttributeDao")
  public DefaultCustomerFormAttributeService(final CustomerFormAttributeDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerFormAttribute find(CustomerFormAttributeId id) {
    final CustomerFormAttribute result = dao.find(id);
    logger.info("find(CustomerFormAttribute) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerFormAttribute> select(int maxResult) {
    final List<CustomerFormAttribute> result = dao.select(maxResult);
    logger.info("select(CustomerFormAttribute) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerFormAttribute> selectAll() {
    final List<CustomerFormAttribute> results = dao.selectAll();
    logger.info("selectAll(CustomerFormAttribute) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerFormAttribute create(CustomerFormAttribute bean) {
    requireNonNull(bean);
    logger.info("create(CustomerFormAttribute={}) - entered bean ");

    final CustomerFormAttribute result = dao.create(bean);

    logger.info("create(CustomerFormAttribute) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerFormAttribute update(CustomerFormAttribute bean) {
    requireNonNull(bean);
    logger.info("update(CustomerFormAttribute={}) - entered bean ");

    final CustomerFormAttribute result = dao.update(bean);

    logger.info("update(CustomerFormAttribute) - exited - return value={} result ");
    return result;
  }
}
