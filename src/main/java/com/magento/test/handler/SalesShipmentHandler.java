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
import com.magento.test.entity.SalesShipment;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesShipmentHandler")
public class SalesShipmentHandler extends DelimiterFileHandler<SalesShipment> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesShipmentHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesShipment parseLine(List<String> headers, List<String> tokens) {
    SalesShipment record = new SalesShipment();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "totalWeight":
          record.setTotalWeight(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalQty":
          record.setTotalQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "emailSent":
          record.setEmailSent(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sendEmail":
          record.setSendEmail(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "orderId":
          record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shippingAddressId":
          record.setShippingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "billingAddressId":
          record.setBillingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shipmentStatus":
          record.setShipmentStatus(java.lang.Integer.valueOf((tokens.get(i))));
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

        case "packages":
          record.setPackages(tokens.get(i));
          break;

        case "shippingLabel":
          record.setShippingLabel(java.lang.String.valueOf((tokens.get(i))));
          break;
        case "customerNote":
          record.setCustomerNote(tokens.get(i));
          break;

        case "customerNoteNotify":
          record.setCustomerNoteNotify(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
