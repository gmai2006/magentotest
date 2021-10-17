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
package com.magento.test.handler;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.magento.test.entity.CatalogEavAttribute;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CatalogEavAttributeHandler")
public class CatalogEavAttributeHandler extends DelimiterFileHandler<CatalogEavAttribute> {

  @Inject
  @Named("DefaultJpaDao")
  public CatalogEavAttributeHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CatalogEavAttribute parseLine(List<String> headers, List<String> tokens) {
    CatalogEavAttribute record = new CatalogEavAttribute();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "attributeId":
          record.setAttributeId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "frontendInputRenderer":
          record.setFrontendInputRenderer(tokens.get(i));
          break;

        case "isGlobal":
          record.setIsGlobal(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVisible":
          record.setIsVisible(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isSearchable":
          record.setIsSearchable(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isFilterable":
          record.setIsFilterable(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isComparable":
          record.setIsComparable(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVisibleOnFront":
          record.setIsVisibleOnFront(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isHtmlAllowedOnFront":
          record.setIsHtmlAllowedOnFront(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isUsedForPriceRules":
          record.setIsUsedForPriceRules(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isFilterableInSearch":
          record.setIsFilterableInSearch(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "usedInProductListing":
          record.setUsedInProductListing(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "usedForSortBy":
          record.setUsedForSortBy(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "applyTo":
          record.setApplyTo(tokens.get(i));
          break;

        case "isVisibleInAdvancedSearch":
          record.setIsVisibleInAdvancedSearch(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "position":
          record.setPosition(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isWysiwygEnabled":
          record.setIsWysiwygEnabled(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isUsedForPromoRules":
          record.setIsUsedForPromoRules(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isRequiredInAdminStore":
          record.setIsRequiredInAdminStore(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isUsedInGrid":
          record.setIsUsedInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVisibleInGrid":
          record.setIsVisibleInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isFilterableInGrid":
          record.setIsFilterableInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "searchWeight":
          record.setSearchWeight(java.lang.Float.valueOf((tokens.get(i))));
          break;
        case "additionalData":
          record.setAdditionalData(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
