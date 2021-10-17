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
import com.magento.test.entity.SalesOrderGrid;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesOrderGridHandler")
public class SalesOrderGridHandler extends DelimiterFileHandler<SalesOrderGrid> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesOrderGridHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesOrderGrid parseLine(List<String> headers, List<String> tokens) {
    SalesOrderGrid record = new SalesOrderGrid();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "status":
          record.setStatus(tokens.get(i));
          break;

        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeName":
          record.setStoreName(tokens.get(i));
          break;

        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalPaid":
          record.setBaseTotalPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "grandTotal":
          record.setGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalPaid":
          record.setTotalPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "incrementId":
          record.setIncrementId(tokens.get(i));
          break;

        case "baseCurrencyCode":
          record.setBaseCurrencyCode(tokens.get(i));
          break;

        case "orderCurrencyCode":
          record.setOrderCurrencyCode(tokens.get(i));
          break;

        case "shippingName":
          record.setShippingName(tokens.get(i));
          break;

        case "billingName":
          record.setBillingName(tokens.get(i));
          break;

        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "billingAddress":
          record.setBillingAddress(tokens.get(i));
          break;

        case "shippingAddress":
          record.setShippingAddress(tokens.get(i));
          break;

        case "shippingInformation":
          record.setShippingInformation(tokens.get(i));
          break;

        case "customerEmail":
          record.setCustomerEmail(tokens.get(i));
          break;

        case "customerGroup":
          record.setCustomerGroup(tokens.get(i));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAndHandling":
          record.setShippingAndHandling(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "customerName":
          record.setCustomerName(tokens.get(i));
          break;

        case "paymentMethod":
          record.setPaymentMethod(tokens.get(i));
          break;

        case "totalRefunded":
          record.setTotalRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "signifydGuaranteeStatus":
          record.setSignifydGuaranteeStatus(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
