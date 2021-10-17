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
import com.magento.test.entity.SalesOrder;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesOrderHandler")
public class SalesOrderHandler extends DelimiterFileHandler<SalesOrder> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesOrderHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesOrder parseLine(List<String> headers, List<String> tokens) {
    SalesOrder record = new SalesOrder();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "state":
          record.setState(tokens.get(i));
          break;

        case "status":
          record.setStatus(tokens.get(i));
          break;

        case "couponCode":
          record.setCouponCode(tokens.get(i));
          break;

        case "protectCode":
          record.setProtectCode(tokens.get(i));
          break;

        case "shippingDescription":
          record.setShippingDescription(tokens.get(i));
          break;

        case "isVirtual":
          record.setIsVirtual(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "baseDiscountAmount":
          record.setBaseDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountCanceled":
          record.setBaseDiscountCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountInvoiced":
          record.setBaseDiscountInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountRefunded":
          record.setBaseDiscountRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingAmount":
          record.setBaseShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingCanceled":
          record.setBaseShippingCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingInvoiced":
          record.setBaseShippingInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingRefunded":
          record.setBaseShippingRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingTaxAmount":
          record.setBaseShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingTaxRefunded":
          record.setBaseShippingTaxRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotal":
          record.setBaseSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalCanceled":
          record.setBaseSubtotalCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalInvoiced":
          record.setBaseSubtotalInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalRefunded":
          record.setBaseSubtotalRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxAmount":
          record.setBaseTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxCanceled":
          record.setBaseTaxCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxInvoiced":
          record.setBaseTaxInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxRefunded":
          record.setBaseTaxRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseToGlobalRate":
          record.setBaseToGlobalRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseToOrderRate":
          record.setBaseToOrderRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalCanceled":
          record.setBaseTotalCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalInvoiced":
          record.setBaseTotalInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalInvoicedCost":
          record.setBaseTotalInvoicedCost(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalOfflineRefunded":
          record.setBaseTotalOfflineRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalOnlineRefunded":
          record.setBaseTotalOnlineRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalPaid":
          record.setBaseTotalPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalQtyOrdered":
          record.setBaseTotalQtyOrdered(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalRefunded":
          record.setBaseTotalRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountCanceled":
          record.setDiscountCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountInvoiced":
          record.setDiscountInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountRefunded":
          record.setDiscountRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "grandTotal":
          record.setGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAmount":
          record.setShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingCanceled":
          record.setShippingCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingInvoiced":
          record.setShippingInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingRefunded":
          record.setShippingRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingTaxAmount":
          record.setShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingTaxRefunded":
          record.setShippingTaxRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "storeToBaseRate":
          record.setStoreToBaseRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "storeToOrderRate":
          record.setStoreToOrderRate(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalCanceled":
          record.setSubtotalCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalInvoiced":
          record.setSubtotalInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalRefunded":
          record.setSubtotalRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxAmount":
          record.setTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxCanceled":
          record.setTaxCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxInvoiced":
          record.setTaxInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxRefunded":
          record.setTaxRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalCanceled":
          record.setTotalCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalInvoiced":
          record.setTotalInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalOfflineRefunded":
          record.setTotalOfflineRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalOnlineRefunded":
          record.setTotalOnlineRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalPaid":
          record.setTotalPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalQtyOrdered":
          record.setTotalQtyOrdered(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalRefunded":
          record.setTotalRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "canShipPartially":
          record.setCanShipPartially(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "canShipPartiallyItem":
          record.setCanShipPartiallyItem(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerIsGuest":
          record.setCustomerIsGuest(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerNoteNotify":
          record.setCustomerNoteNotify(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "billingAddressId":
          record.setBillingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerGroupId":
          record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "editIncrement":
          record.setEditIncrement(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "emailSent":
          record.setEmailSent(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sendEmail":
          record.setSendEmail(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "forcedShipmentWithInvoice":
          record.setForcedShipmentWithInvoice(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "paymentAuthExpiration":
          record.setPaymentAuthExpiration(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteAddressId":
          record.setQuoteAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteId":
          record.setQuoteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shippingAddressId":
          record.setShippingAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "adjustmentNegative":
          record.setAdjustmentNegative(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "adjustmentPositive":
          record.setAdjustmentPositive(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAdjustmentNegative":
          record.setBaseAdjustmentNegative(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAdjustmentPositive":
          record.setBaseAdjustmentPositive(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingDiscountAmount":
          record.setBaseShippingDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalInclTax":
          record.setBaseSubtotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTotalDue":
          record.setBaseTotalDue(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "paymentAuthorizationAmount":
          record.setPaymentAuthorizationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingDiscountAmount":
          record.setShippingDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalInclTax":
          record.setSubtotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "totalDue":
          record.setTotalDue(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "weight":
          record.setWeight(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "customerDob":
          record.setCustomerDob(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "incrementId":
          record.setIncrementId(tokens.get(i));
          break;

        case "appliedRuleIds":
          record.setAppliedRuleIds(tokens.get(i));
          break;

        case "baseCurrencyCode":
          record.setBaseCurrencyCode(tokens.get(i));
          break;

        case "customerEmail":
          record.setCustomerEmail(tokens.get(i));
          break;

        case "customerFirstname":
          record.setCustomerFirstname(tokens.get(i));
          break;

        case "customerLastname":
          record.setCustomerLastname(tokens.get(i));
          break;

        case "customerMiddlename":
          record.setCustomerMiddlename(tokens.get(i));
          break;

        case "customerPrefix":
          record.setCustomerPrefix(tokens.get(i));
          break;

        case "customerSuffix":
          record.setCustomerSuffix(tokens.get(i));
          break;

        case "customerTaxvat":
          record.setCustomerTaxvat(tokens.get(i));
          break;

        case "discountDescription":
          record.setDiscountDescription(tokens.get(i));
          break;

        case "extCustomerId":
          record.setExtCustomerId(tokens.get(i));
          break;

        case "extOrderId":
          record.setExtOrderId(tokens.get(i));
          break;

        case "globalCurrencyCode":
          record.setGlobalCurrencyCode(tokens.get(i));
          break;

        case "holdBeforeState":
          record.setHoldBeforeState(tokens.get(i));
          break;

        case "holdBeforeStatus":
          record.setHoldBeforeStatus(tokens.get(i));
          break;

        case "orderCurrencyCode":
          record.setOrderCurrencyCode(tokens.get(i));
          break;

        case "originalIncrementId":
          record.setOriginalIncrementId(tokens.get(i));
          break;

        case "relationChildId":
          record.setRelationChildId(tokens.get(i));
          break;

        case "relationChildRealId":
          record.setRelationChildRealId(tokens.get(i));
          break;

        case "relationParentId":
          record.setRelationParentId(tokens.get(i));
          break;

        case "relationParentRealId":
          record.setRelationParentRealId(tokens.get(i));
          break;

        case "remoteIp":
          record.setRemoteIp(tokens.get(i));
          break;

        case "shippingMethod":
          record.setShippingMethod(tokens.get(i));
          break;

        case "storeCurrencyCode":
          record.setStoreCurrencyCode(tokens.get(i));
          break;

        case "storeName":
          record.setStoreName(tokens.get(i));
          break;

        case "xForwardedFor":
          record.setXForwardedFor(tokens.get(i));
          break;

        case "customerNote":
          record.setCustomerNote(tokens.get(i));
          break;

        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "totalItemCount":
          record.setTotalItemCount(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerGender":
          record.setCustomerGender(java.lang.Integer.valueOf((tokens.get(i))));
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

        case "discountTaxCompensationInvoiced":
          record.setDiscountTaxCompensationInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationInvoiced":
          record.setBaseDiscountTaxCompensationInvoiced(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountTaxCompensationRefunded":
          record.setDiscountTaxCompensationRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationRefunded":
          record.setBaseDiscountTaxCompensationRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingInclTax":
          record.setShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingInclTax":
          record.setBaseShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "couponRuleName":
          record.setCouponRuleName(tokens.get(i));
          break;

        case "giftMessageId":
          record.setGiftMessageId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "paypalIpnCustomerNotified":
          record.setPaypalIpnCustomerNotified(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
