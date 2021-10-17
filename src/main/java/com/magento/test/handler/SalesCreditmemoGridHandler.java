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
import com.magento.test.entity.SalesCreditmemoGrid;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesCreditmemoGridHandler")
public class SalesCreditmemoGridHandler extends DelimiterFileHandler<SalesCreditmemoGrid> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesCreditmemoGridHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesCreditmemoGrid parseLine(List<String> headers, List<String> tokens) {
    SalesCreditmemoGrid record = new SalesCreditmemoGrid();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "incrementId":
          record.setIncrementId(tokens.get(i));
          break;

        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "orderId":
          record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "orderIncrementId":
          record.setOrderIncrementId(tokens.get(i));
          break;

        case "orderCreatedAt":
          record.setOrderCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "billingName":
          record.setBillingName(tokens.get(i));
          break;

        case "state":
          record.setState(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "orderStatus":
          record.setOrderStatus(tokens.get(i));
          break;

        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "billingAddress":
          record.setBillingAddress(tokens.get(i));
          break;

        case "shippingAddress":
          record.setShippingAddress(tokens.get(i));
          break;

        case "customerName":
          record.setCustomerName(tokens.get(i));
          break;

        case "customerEmail":
          record.setCustomerEmail(tokens.get(i));
          break;

        case "customerGroupId":
          record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "paymentMethod":
          record.setPaymentMethod(tokens.get(i));
          break;

        case "shippingInformation":
          record.setShippingInformation(tokens.get(i));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAndHandling":
          record.setShippingAndHandling(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "adjustmentPositive":
          record.setAdjustmentPositive(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "adjustmentNegative":
          record.setAdjustmentNegative(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "orderBaseGrandTotal":
          record.setOrderBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
