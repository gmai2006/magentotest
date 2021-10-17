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
import com.magento.test.dao.ThemeFileDao;
import com.magento.test.entity.ThemeFile;

@Stateless
@Named("DefaultThemeFileService")
public class DefaultThemeFileService implements ThemeFileService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final ThemeFileDao dao;

  @Inject
  @Named("DefaultThemeFileDao")
  public DefaultThemeFileService(final ThemeFileDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public ThemeFile find(java.lang.Integer id) {

    final ThemeFile result = dao.find(id);
    logger.info("find(ThemeFile) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<ThemeFile> select(int maxResult) {
    final List<ThemeFile> result = dao.select(maxResult);
    logger.info("select(ThemeFile) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<ThemeFile> selectAll() {
    final List<ThemeFile> results = dao.selectAll();
    logger.info("selectAll(ThemeFile) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public ThemeFile create(ThemeFile bean) {
    requireNonNull(bean);
    logger.info("create(ThemeFile={}) - entered bean ");

    final ThemeFile result = dao.create(bean);

    logger.info("create(ThemeFile) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public ThemeFile update(ThemeFile bean) {
    requireNonNull(bean);
    logger.info("update(ThemeFile={}) - entered bean ");

    final ThemeFile result = dao.update(bean);

    logger.info("update(ThemeFile) - exited - return value={} result ");
    return result;
  }
}
