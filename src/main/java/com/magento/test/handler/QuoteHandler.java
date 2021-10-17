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
import com.magento.test.entity.Quote;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("QuoteHandler")
public class QuoteHandler extends DelimiterFileHandler<Quote> {

  @Inject
  @Named("DefaultJpaDao")
  public QuoteHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Quote parseLine(List<String> headers, List<String> tokens) {
    Quote record = new Quote();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "convertedAt":
          record.setConvertedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "isActive":
          record.setIsActive(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVirtual":
          record.setIsVirtual(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isMultiShipping":
          record.setIsMultiShipping(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "itemsCount":
          record.setItemsCount(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "itemsQty":
          record.setItemsQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "origOrderId":
          record.setOrigOrderId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeToBaseRate":
          record.setStoreToBaseRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "storeToQuoteRate":
          record.setStoreToQuoteRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseCurrencyCode":
          record.setBaseCurrencyCode(tokens.get(i));
          break;

        case "storeCurrencyCode":
          record.setStoreCurrencyCode(tokens.get(i));
          break;

        case "quoteCurrencyCode":
          record.setQuoteCurrencyCode(tokens.get(i));
          break;

        case "grandTotal":
          record.setGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "checkoutMethod":
          record.setCheckoutMethod(tokens.get(i));
          break;

        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerTaxClassId":
          record.setCustomerTaxClassId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerGroupId":
          record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerEmail":
          record.setCustomerEmail(tokens.get(i));
          break;

        case "customerPrefix":
          record.setCustomerPrefix(tokens.get(i));
          break;

        case "customerFirstname":
          record.setCustomerFirstname(tokens.get(i));
          break;

        case "customerMiddlename":
          record.setCustomerMiddlename(tokens.get(i));
          break;

        case "customerLastname":
          record.setCustomerLastname(tokens.get(i));
          break;

        case "customerSuffix":
          record.setCustomerSuffix(tokens.get(i));
          break;

        case "customerDob":
          record.setCustomerDob(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "customerNote":
          record.setCustomerNote(tokens.get(i));
          break;

        case "customerNoteNotify":
          record.setCustomerNoteNotify(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerIsGuest":
          record.setCustomerIsGuest(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "remoteIp":
          record.setRemoteIp(tokens.get(i));
          break;

        case "appliedRuleIds":
          record.setAppliedRuleIds(tokens.get(i));
          break;

        case "reservedOrderId":
          record.setReservedOrderId(tokens.get(i));
          break;

        case "passwordHash":
          record.setPasswordHash(tokens.get(i));
          break;

        case "couponCode":
          record.setCouponCode(tokens.get(i));
          break;

        case "globalCurrencyCode":
          record.setGlobalCurrencyCode(tokens.get(i));
          break;

        case "baseToGlobalRate":
          record.setBaseToGlobalRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseToQuoteRate":
          record.setBaseToQuoteRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "customerTaxvat":
          record.setCustomerTaxvat(tokens.get(i));
          break;

        case "customerGender":
          record.setCustomerGender(tokens.get(i));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotal":
          record.setBaseSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalWithDiscount":
          record.setSubtotalWithDiscount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalWithDiscount":
          record.setBaseSubtotalWithDiscount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "isChanged":
          record.setIsChanged(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "triggerRecollect":
          record.setTriggerRecollect(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "extShippingInfo":
          record.setExtShippingInfo(tokens.get(i));
          break;

        case "giftMessageId":
          record.setGiftMessageId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isPersistent":
          record.setIsPersistent(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
