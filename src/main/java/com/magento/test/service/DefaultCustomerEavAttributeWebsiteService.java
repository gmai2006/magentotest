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
import com.magento.test.dao.CustomerEavAttributeWebsiteDao;
import com.magento.test.entity.CustomerEavAttributeWebsite;
import com.magento.test.entity.CustomerEavAttributeWebsiteId;

@Stateless
@Named("DefaultCustomerEavAttributeWebsiteService")
public class DefaultCustomerEavAttributeWebsiteService
    implements CustomerEavAttributeWebsiteService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CustomerEavAttributeWebsiteDao dao;

  @Inject
  @Named("DefaultCustomerEavAttributeWebsiteDao")
  public DefaultCustomerEavAttributeWebsiteService(final CustomerEavAttributeWebsiteDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEavAttributeWebsite find(CustomerEavAttributeWebsiteId id) {
    final CustomerEavAttributeWebsite result = dao.find(id);
    logger.info("find(CustomerEavAttributeWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEavAttributeWebsite> select(int maxResult) {
    final List<CustomerEavAttributeWebsite> result = dao.select(maxResult);
    logger.info("select(CustomerEavAttributeWebsite) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CustomerEavAttributeWebsite> selectAll() {
    final List<CustomerEavAttributeWebsite> results = dao.selectAll();
    logger.info("selectAll(CustomerEavAttributeWebsite) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEavAttributeWebsite create(CustomerEavAttributeWebsite bean) {
    requireNonNull(bean);
    logger.info("create(CustomerEavAttributeWebsite={}) - entered bean ");

    final CustomerEavAttributeWebsite result = dao.create(bean);

    logger.info("create(CustomerEavAttributeWebsite) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CustomerEavAttributeWebsite update(CustomerEavAttributeWebsite bean) {
    requireNonNull(bean);
    logger.info("update(CustomerEavAttributeWebsite={}) - entered bean ");

    final CustomerEavAttributeWebsite result = dao.update(bean);

    logger.info("update(CustomerEavAttributeWebsite) - exited - return value={} result ");
    return result;
  }
}
