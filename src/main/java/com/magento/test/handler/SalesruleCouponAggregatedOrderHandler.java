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
import com.magento.test.entity.SalesruleCouponAggregatedOrder;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesruleCouponAggregatedOrderHandler")
public class SalesruleCouponAggregatedOrderHandler
    extends DelimiterFileHandler<SalesruleCouponAggregatedOrder> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesruleCouponAggregatedOrderHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesruleCouponAggregatedOrder parseLine(List<String> headers, List<String> tokens) {
    SalesruleCouponAggregatedOrder record = new SalesruleCouponAggregatedOrder();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "id":
          record.setId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "period":
          record.setPeriod(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "orderStatus":
          record.setOrderStatus(tokens.get(i));
          break;

        case "couponCode":
          record.setCouponCode(tokens.get(i));
          break;

        case "couponUses":
          record.setCouponUses(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "subtotalAmount":
          record.setSubtotalAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalAmount":
          record.setTotalAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "ruleName":
          record.setRuleName(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
