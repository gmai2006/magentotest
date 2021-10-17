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
import com.magento.test.entity.SalesCreditmemo;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesCreditmemoHandler")
public class SalesCreditmemoHandler extends DelimiterFileHandler<SalesCreditmemo> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesCreditmemoHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesCreditmemo parseLine(List<String> headers, List<String> tokens) {
    SalesCreditmemo record = new SalesCreditmemo();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "adjustmentPositive":
          record.setAdjustmentPositive(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingTaxAmount":
          record.setBaseShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "storeToOrderRate":
          record.setStoreToOrderRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountAmount":
          record.setBaseDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseToOrderRate":
          record.setBaseToOrderRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "grandTotal":
          record.setGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAdjustmentNegative":
          record.setBaseAdjustmentNegative(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalInclTax":
          record.setBaseSubtotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAmount":
          record.setShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalInclTax":
          record.setSubtotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "adjustmentNegative":
          record.setAdjustmentNegative(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingAmount":
          record.setBaseShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "storeToBaseRate":
          record.setStoreToBaseRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseToGlobalRate":
          record.setBaseToGlobalRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAdjustment":
          record.setBaseAdjustment(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotal":
          record.setBaseSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "adjustment":
          record.setAdjustment(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAdjustmentPositive":
          record.setBaseAdjustmentPositive(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxAmount":
          record.setBaseTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingTaxAmount":
          record.setShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxAmount":
          record.setTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "orderId":
          record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "emailSent":
          record.setEmailSent(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sendEmail":
          record.setSendEmail(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "creditmemoStatus":
          record.setCreditmemoStatus(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "state":
          record.setState(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shippingAddressId":
          record.setShippingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "billingAddressId":
          record.setBillingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "invoiceId":
          record.setInvoiceId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeCurrencyCode":
          record.setStoreCurrencyCode(tokens.get(i));
          break;

        case "orderCurrencyCode":
          record.setOrderCurrencyCode(tokens.get(i));
          break;

        case "baseCurrencyCode":
          record.setBaseCurrencyCode(tokens.get(i));
          break;

        case "globalCurrencyCode":
          record.setGlobalCurrencyCode(tokens.get(i));
          break;

        case "transactionId":
          record.setTransactionId(tokens.get(i));
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

        case "discountTaxCompensationAmount":
          record.setDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationAmount":
          record.setBaseDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingDiscountTaxCompensationAmount":
          record.setShippingDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingDiscountTaxCompensationAmnt":
          record.setBaseShippingDiscountTaxCompensationAmnt(
              new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingInclTax":
          record.setShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingInclTax":
          record.setBaseShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountDescription":
          record.setDiscountDescription(tokens.get(i));
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
