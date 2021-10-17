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
package com.magento.test.service;

import com.magento.test.entity.SalesOrder;
import com.magento.test.entity.SalesOrderId;

import com.magento.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesOrderServiceTest {
  private static DefaultSalesOrderService serviceMock;
  private static SalesOrder[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesOrderService.class);
    String inputFile = "SalesOrder.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrder[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SalesOrderId id =
        new SalesOrderId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SalesOrderId id =
        new SalesOrderId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    SalesOrder testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals state ", records[0].getState(), testResult.getState());
    org.junit.Assert.assertEquals(
        "expect equals status ", records[0].getStatus(), testResult.getStatus());
    org.junit.Assert.assertEquals(
        "expect equals couponCode ", records[0].getCouponCode(), testResult.getCouponCode());
    org.junit.Assert.assertEquals(
        "expect equals protectCode ", records[0].getProtectCode(), testResult.getProtectCode());
    org.junit.Assert.assertEquals(
        "expect equals shippingDescription ",
        records[0].getShippingDescription(),
        testResult.getShippingDescription());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", records[0].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", records[0].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountCanceled ",
        records[0].getBaseDiscountCanceled(),
        testResult.getBaseDiscountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountInvoiced ",
        records[0].getBaseDiscountInvoiced(),
        testResult.getBaseDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountRefunded ",
        records[0].getBaseDiscountRefunded(),
        testResult.getBaseDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingCanceled ",
        records[0].getBaseShippingCanceled(),
        testResult.getBaseShippingCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInvoiced ",
        records[0].getBaseShippingInvoiced(),
        testResult.getBaseShippingInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingRefunded ",
        records[0].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxAmount ",
        records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxRefunded ",
        records[0].getBaseShippingTaxRefunded(),
        testResult.getBaseShippingTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ", records[0].getBaseSubtotal(), testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalCanceled ",
        records[0].getBaseSubtotalCanceled(),
        testResult.getBaseSubtotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInvoiced ",
        records[0].getBaseSubtotalInvoiced(),
        testResult.getBaseSubtotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalRefunded ",
        records[0].getBaseSubtotalRefunded(),
        testResult.getBaseSubtotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxCanceled ",
        records[0].getBaseTaxCanceled(),
        testResult.getBaseTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxInvoiced ",
        records[0].getBaseTaxInvoiced(),
        testResult.getBaseTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxRefunded ",
        records[0].getBaseTaxRefunded(),
        testResult.getBaseTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals baseToOrderRate ",
        records[0].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalCanceled ",
        records[0].getBaseTotalCanceled(),
        testResult.getBaseTotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalInvoiced ",
        records[0].getBaseTotalInvoiced(),
        testResult.getBaseTotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalInvoicedCost ",
        records[0].getBaseTotalInvoicedCost(),
        testResult.getBaseTotalInvoicedCost());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalOfflineRefunded ",
        records[0].getBaseTotalOfflineRefunded(),
        testResult.getBaseTotalOfflineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalOnlineRefunded ",
        records[0].getBaseTotalOnlineRefunded(),
        testResult.getBaseTotalOnlineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalPaid ",
        records[0].getBaseTotalPaid(),
        testResult.getBaseTotalPaid());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalQtyOrdered ",
        records[0].getBaseTotalQtyOrdered(),
        testResult.getBaseTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalRefunded ",
        records[0].getBaseTotalRefunded(),
        testResult.getBaseTotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountCanceled ",
        records[0].getDiscountCanceled(),
        testResult.getDiscountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals discountInvoiced ",
        records[0].getDiscountInvoiced(),
        testResult.getDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountRefunded ",
        records[0].getDiscountRefunded(),
        testResult.getDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", records[0].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        records[0].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingCanceled ",
        records[0].getShippingCanceled(),
        testResult.getShippingCanceled());
    org.junit.Assert.assertEquals(
        "expect equals shippingInvoiced ",
        records[0].getShippingInvoiced(),
        testResult.getShippingInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals shippingRefunded ",
        records[0].getShippingRefunded(),
        testResult.getShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxAmount ",
        records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxRefunded ",
        records[0].getShippingTaxRefunded(),
        testResult.getShippingTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals storeToOrderRate ",
        records[0].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", records[0].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals subtotalCanceled ",
        records[0].getSubtotalCanceled(),
        testResult.getSubtotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInvoiced ",
        records[0].getSubtotalInvoiced(),
        testResult.getSubtotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals subtotalRefunded ",
        records[0].getSubtotalRefunded(),
        testResult.getSubtotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxCanceled ", records[0].getTaxCanceled(), testResult.getTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals taxInvoiced ", records[0].getTaxInvoiced(), testResult.getTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals taxRefunded ", records[0].getTaxRefunded(), testResult.getTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalCanceled ",
        records[0].getTotalCanceled(),
        testResult.getTotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals totalInvoiced ",
        records[0].getTotalInvoiced(),
        testResult.getTotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals totalOfflineRefunded ",
        records[0].getTotalOfflineRefunded(),
        testResult.getTotalOfflineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalOnlineRefunded ",
        records[0].getTotalOnlineRefunded(),
        testResult.getTotalOnlineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalPaid ", records[0].getTotalPaid(), testResult.getTotalPaid());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyOrdered ",
        records[0].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals totalRefunded ",
        records[0].getTotalRefunded(),
        testResult.getTotalRefunded());
    org.junit.Assert.assertTrue(
        "expect equals canShipPartially ",
        records[0].getCanShipPartially() == testResult.getCanShipPartially());
    org.junit.Assert.assertTrue(
        "expect equals canShipPartiallyItem ",
        records[0].getCanShipPartiallyItem() == testResult.getCanShipPartiallyItem());
    org.junit.Assert.assertTrue(
        "expect equals customerIsGuest ",
        records[0].getCustomerIsGuest() == testResult.getCustomerIsGuest());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        records[0].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
    org.junit.Assert.assertTrue(
        "expect equals billingAddressId ",
        records[0].getBillingAddressId() == testResult.getBillingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        records[0].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertTrue(
        "expect equals editIncrement ",
        records[0].getEditIncrement() == testResult.getEditIncrement());
    org.junit.Assert.assertTrue(
        "expect equals emailSent ", records[0].getEmailSent() == testResult.getEmailSent());
    org.junit.Assert.assertTrue(
        "expect equals sendEmail ", records[0].getSendEmail() == testResult.getSendEmail());
    org.junit.Assert.assertTrue(
        "expect equals forcedShipmentWithInvoice ",
        records[0].getForcedShipmentWithInvoice() == testResult.getForcedShipmentWithInvoice());
    org.junit.Assert.assertTrue(
        "expect equals paymentAuthExpiration ",
        records[0].getPaymentAuthExpiration() == testResult.getPaymentAuthExpiration());
    org.junit.Assert.assertTrue(
        "expect equals quoteAddressId ",
        records[0].getQuoteAddressId() == testResult.getQuoteAddressId());
    org.junit.Assert.assertTrue(
        "expect equals quoteId ", records[0].getQuoteId() == testResult.getQuoteId());
    org.junit.Assert.assertTrue(
        "expect equals shippingAddressId ",
        records[0].getShippingAddressId() == testResult.getShippingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentNegative ",
        records[0].getAdjustmentNegative(),
        testResult.getAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentPositive ",
        records[0].getAdjustmentPositive(),
        testResult.getAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentNegative ",
        records[0].getBaseAdjustmentNegative(),
        testResult.getBaseAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentPositive ",
        records[0].getBaseAdjustmentPositive(),
        testResult.getBaseAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountAmount ",
        records[0].getBaseShippingDiscountAmount(),
        testResult.getBaseShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInclTax ",
        records[0].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalDue ", records[0].getBaseTotalDue(), testResult.getBaseTotalDue());
    org.junit.Assert.assertEquals(
        "expect equals paymentAuthorizationAmount ",
        records[0].getPaymentAuthorizationAmount(),
        testResult.getPaymentAuthorizationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountAmount ",
        records[0].getShippingDiscountAmount(),
        testResult.getShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInclTax ",
        records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals totalDue ", records[0].getTotalDue(), testResult.getTotalDue());
    org.junit.Assert.assertEquals(
        "expect equals weight ", records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertEquals(
        "expect equals customerFirstname ",
        records[0].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    org.junit.Assert.assertEquals(
        "expect equals customerLastname ",
        records[0].getCustomerLastname(),
        testResult.getCustomerLastname());
    org.junit.Assert.assertEquals(
        "expect equals customerMiddlename ",
        records[0].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals customerPrefix ",
        records[0].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    org.junit.Assert.assertEquals(
        "expect equals customerSuffix ",
        records[0].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    org.junit.Assert.assertEquals(
        "expect equals customerTaxvat ",
        records[0].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals discountDescription ",
        records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    org.junit.Assert.assertEquals(
        "expect equals extCustomerId ",
        records[0].getExtCustomerId(),
        testResult.getExtCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals extOrderId ", records[0].getExtOrderId(), testResult.getExtOrderId());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals holdBeforeState ",
        records[0].getHoldBeforeState(),
        testResult.getHoldBeforeState());
    org.junit.Assert.assertEquals(
        "expect equals holdBeforeStatus ",
        records[0].getHoldBeforeStatus(),
        testResult.getHoldBeforeStatus());
    org.junit.Assert.assertEquals(
        "expect equals orderCurrencyCode ",
        records[0].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals originalIncrementId ",
        records[0].getOriginalIncrementId(),
        testResult.getOriginalIncrementId());
    org.junit.Assert.assertEquals(
        "expect equals relationChildId ",
        records[0].getRelationChildId(),
        testResult.getRelationChildId());
    org.junit.Assert.assertEquals(
        "expect equals relationChildRealId ",
        records[0].getRelationChildRealId(),
        testResult.getRelationChildRealId());
    org.junit.Assert.assertEquals(
        "expect equals relationParentId ",
        records[0].getRelationParentId(),
        testResult.getRelationParentId());
    org.junit.Assert.assertEquals(
        "expect equals relationParentRealId ",
        records[0].getRelationParentRealId(),
        testResult.getRelationParentRealId());
    org.junit.Assert.assertEquals(
        "expect equals remoteIp ", records[0].getRemoteIp(), testResult.getRemoteIp());
    org.junit.Assert.assertEquals(
        "expect equals shippingMethod ",
        records[0].getShippingMethod(),
        testResult.getShippingMethod());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals storeName ", records[0].getStoreName(), testResult.getStoreName());
    org.junit.Assert.assertEquals(
        "expect equals xForwardedFor ",
        records[0].getXForwardedFor(),
        testResult.getXForwardedFor());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ", records[0].getCustomerNote(), testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals totalItemCount ",
        records[0].getTotalItemCount() == testResult.getTotalItemCount());
    org.junit.Assert.assertTrue(
        "expect equals customerGender ",
        records[0].getCustomerGender() == testResult.getCustomerGender());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        records[0].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        records[0].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationInvoiced ",
        records[0].getDiscountTaxCompensationInvoiced(),
        testResult.getDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationInvoiced ",
        records[0].getBaseDiscountTaxCompensationInvoiced(),
        testResult.getBaseDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationRefunded ",
        records[0].getDiscountTaxCompensationRefunded(),
        testResult.getDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationRefunded ",
        records[0].getBaseDiscountTaxCompensationRefunded(),
        testResult.getBaseDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingInclTax ",
        records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInclTax ",
        records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals couponRuleName ",
        records[0].getCouponRuleName(),
        testResult.getCouponRuleName());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        records[0].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals paypalIpnCustomerNotified ",
        records[0].getPaypalIpnCustomerNotified() == testResult.getPaypalIpnCustomerNotified());
  }
}
