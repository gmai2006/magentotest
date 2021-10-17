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
import com.magento.test.entity.ProductAlertPrice;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("ProductAlertPriceHandler")
public class ProductAlertPriceHandler extends DelimiterFileHandler<ProductAlertPrice> {

  @Inject
  @Named("DefaultJpaDao")
  public ProductAlertPriceHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected ProductAlertPrice parseLine(List<String> headers, List<String> tokens) {
    ProductAlertPrice record = new ProductAlertPrice();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "alertPriceId":
          record.setAlertPriceId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "price":
          record.setPrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "websiteId":
          record.setWebsiteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "addDate":
          record.setAddDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "lastSendDate":
          record.setLastSendDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "sendCount":
          record.setSendCount(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "status":
          record.setStatus(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
