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
import com.magento.test.dao.EavFormFieldsetLabelDao;
import com.magento.test.entity.EavFormFieldsetLabel;
import com.magento.test.entity.EavFormFieldsetLabelId;

@Stateless
@Named("DefaultEavFormFieldsetLabelService")
public class DefaultEavFormFieldsetLabelService implements EavFormFieldsetLabelService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final EavFormFieldsetLabelDao dao;

  @Inject
  @Named("DefaultEavFormFieldsetLabelDao")
  public DefaultEavFormFieldsetLabelService(final EavFormFieldsetLabelDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormFieldsetLabel find(EavFormFieldsetLabelId id) {
    final EavFormFieldsetLabel result = dao.find(id);
    logger.info("find(EavFormFieldsetLabel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<EavFormFieldsetLabel> select(int maxResult) {
    final List<EavFormFieldsetLabel> result = dao.select(maxResult);
    logger.info("select(EavFormFieldsetLabel) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<EavFormFieldsetLabel> selectAll() {
    final List<EavFormFieldsetLabel> results = dao.selectAll();
    logger.info("selectAll(EavFormFieldsetLabel) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormFieldsetLabel create(EavFormFieldsetLabel bean) {
    requireNonNull(bean);
    logger.info("create(EavFormFieldsetLabel={}) - entered bean ");

    final EavFormFieldsetLabel result = dao.create(bean);

    logger.info("create(EavFormFieldsetLabel) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public EavFormFieldsetLabel update(EavFormFieldsetLabel bean) {
    requireNonNull(bean);
    logger.info("update(EavFormFieldsetLabel={}) - entered bean ");

    final EavFormFieldsetLabel result = dao.update(bean);

    logger.info("update(EavFormFieldsetLabel) - exited - return value={} result ");
    return result;
  }
}
