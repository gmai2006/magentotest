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
import com.magento.test.dao.CatalogProductEntityMediaGalleryValueToEntityDao;
import com.magento.test.entity.CatalogProductEntityMediaGalleryValueToEntity;
import com.magento.test.entity.CatalogProductEntityMediaGalleryValueToEntityId;

@Stateless
@Named("DefaultCatalogProductEntityMediaGalleryValueToEntityService")
public class DefaultCatalogProductEntityMediaGalleryValueToEntityService
    implements CatalogProductEntityMediaGalleryValueToEntityService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final CatalogProductEntityMediaGalleryValueToEntityDao dao;

  @Inject
  @Named("DefaultCatalogProductEntityMediaGalleryValueToEntityDao")
  public DefaultCatalogProductEntityMediaGalleryValueToEntityService(
      final CatalogProductEntityMediaGalleryValueToEntityDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityMediaGalleryValueToEntity find(
      CatalogProductEntityMediaGalleryValueToEntityId id) {
    final CatalogProductEntityMediaGalleryValueToEntity result = dao.find(id);
    logger.info(
        "find(CatalogProductEntityMediaGalleryValueToEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityMediaGalleryValueToEntity> select(int maxResult) {
    final List<CatalogProductEntityMediaGalleryValueToEntity> result = dao.select(maxResult);
    logger.info(
        "select(CatalogProductEntityMediaGalleryValueToEntity) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<CatalogProductEntityMediaGalleryValueToEntity> selectAll() {
    final List<CatalogProductEntityMediaGalleryValueToEntity> results = dao.selectAll();
    logger.info(
        "selectAll(CatalogProductEntityMediaGalleryValueToEntity) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityMediaGalleryValueToEntity create(
      CatalogProductEntityMediaGalleryValueToEntity bean) {
    requireNonNull(bean);
    logger.info("create(CatalogProductEntityMediaGalleryValueToEntity={}) - entered bean ");

    final CatalogProductEntityMediaGalleryValueToEntity result = dao.create(bean);

    logger.info(
        "create(CatalogProductEntityMediaGalleryValueToEntity) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public CatalogProductEntityMediaGalleryValueToEntity update(
      CatalogProductEntityMediaGalleryValueToEntity bean) {
    requireNonNull(bean);
    logger.info("update(CatalogProductEntityMediaGalleryValueToEntity={}) - entered bean ");

    final CatalogProductEntityMediaGalleryValueToEntity result = dao.update(bean);

    logger.info(
        "update(CatalogProductEntityMediaGalleryValueToEntity) - exited - return value={} result ");
    return result;
  }
}
