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
import com.magento.test.dao.TranslationDao;
import com.magento.test.entity.Translation;
import com.magento.test.entity.TranslationId;

@Stateless
@Named("DefaultTranslationService")
public class DefaultTranslationService implements TranslationService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final TranslationDao dao;

  @Inject
  @Named("DefaultTranslationDao")
  public DefaultTranslationService(final TranslationDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Translation find(TranslationId id) {
    final Translation result = dao.find(id);
    logger.info("find(Translation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Translation> select(int maxResult) {
    final List<Translation> result = dao.select(maxResult);
    logger.info("select(Translation) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Translation> selectAll() {
    final List<Translation> results = dao.selectAll();
    logger.info("selectAll(Translation) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Translation create(Translation bean) {
    requireNonNull(bean);
    logger.info("create(Translation={}) - entered bean ");

    final Translation result = dao.create(bean);

    logger.info("create(Translation) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Translation update(Translation bean) {
    requireNonNull(bean);
    logger.info("update(Translation={}) - entered bean ");

    final Translation result = dao.update(bean);

    logger.info("update(Translation) - exited - return value={} result ");
    return result;
  }
}
