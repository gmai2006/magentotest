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
import com.magento.test.dao.DirectoryCountryFormatDao;
import com.magento.test.entity.DirectoryCountryFormat;
import com.magento.test.entity.DirectoryCountryFormatId;

@Stateless
@Named("DefaultDirectoryCountryFormatService")
public class DefaultDirectoryCountryFormatService implements DirectoryCountryFormatService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final DirectoryCountryFormatDao dao;

  @Inject
  @Named("DefaultDirectoryCountryFormatDao")
  public DefaultDirectoryCountryFormatService(final DirectoryCountryFormatDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCountryFormat find(DirectoryCountryFormatId id) {
    final DirectoryCountryFormat result = dao.find(id);
    logger.info("find(DirectoryCountryFormat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<DirectoryCountryFormat> select(int maxResult) {
    final List<DirectoryCountryFormat> result = dao.select(maxResult);
    logger.info("select(DirectoryCountryFormat) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<DirectoryCountryFormat> selectAll() {
    final List<DirectoryCountryFormat> results = dao.selectAll();
    logger.info("selectAll(DirectoryCountryFormat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCountryFormat create(DirectoryCountryFormat bean) {
    requireNonNull(bean);
    logger.info("create(DirectoryCountryFormat={}) - entered bean ");

    final DirectoryCountryFormat result = dao.create(bean);

    logger.info("create(DirectoryCountryFormat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public DirectoryCountryFormat update(DirectoryCountryFormat bean) {
    requireNonNull(bean);
    logger.info("update(DirectoryCountryFormat={}) - entered bean ");

    final DirectoryCountryFormat result = dao.update(bean);

    logger.info("update(DirectoryCountryFormat) - exited - return value={} result ");
    return result;
  }
}
