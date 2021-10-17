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
import com.magento.test.entity.CatalogProductBundleSelectionPrice;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CatalogProductBundleSelectionPriceHandler")
public class CatalogProductBundleSelectionPriceHandler
    extends DelimiterFileHandler<CatalogProductBundleSelectionPrice> {

  @Inject
  @Named("DefaultJpaDao")
  public CatalogProductBundleSelectionPriceHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CatalogProductBundleSelectionPrice parseLine(
      List<String> headers, List<String> tokens) {
    CatalogProductBundleSelectionPrice record = new CatalogProductBundleSelectionPrice();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "selectionId":
          record.setSelectionId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "websiteId":
          record.setWebsiteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "selectionPriceType":
          record.setSelectionPriceType(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "selectionPriceValue":
          record.setSelectionPriceValue(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "parentProductId":
          record.setParentProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
