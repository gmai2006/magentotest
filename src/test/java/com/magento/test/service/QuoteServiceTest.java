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

import com.magento.test.entity.Quote;

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

public class QuoteServiceTest {
  private static DefaultQuoteService serviceMock;
  private static Quote[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultQuoteService.class);
    String inputFile = "Quote.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Quote[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    Quote testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", records[0].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertTrue(
        "expect equals isMultiShipping ",
        records[0].getIsMultiShipping() == testResult.getIsMultiShipping());
    org.junit.Assert.assertTrue(
        "expect equals itemsCount ", records[0].getItemsCount() == testResult.getItemsCount());
    org.junit.Assert.assertEquals(
        "expect equals itemsQty ", records[0].getItemsQty(), testResult.getItemsQty());
    org.junit.Assert.assertTrue(
        "expect equals origOrderId ", records[0].getOrigOrderId() == testResult.getOrigOrderId());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals storeToQuoteRate ",
        records[0].getStoreToQuoteRate(),
        testResult.getStoreToQuoteRate());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals quoteCurrencyCode ",
        records[0].getQuoteCurrencyCode(),
        testResult.getQuoteCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", records[0].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals checkoutMethod ",
        records[0].getCheckoutMethod(),
        testResult.getCheckoutMethod());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", records[0].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertTrue(
        "expect equals customerTaxClassId ",
        records[0].getCustomerTaxClassId() == testResult.getCustomerTaxClassId());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        records[0].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertEquals(
        "expect equals customerPrefix ",
        records[0].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    org.junit.Assert.assertEquals(
        "expect equals customerFirstname ",
        records[0].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    org.junit.Assert.assertEquals(
        "expect equals customerMiddlename ",
        records[0].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals customerLastname ",
        records[0].getCustomerLastname(),
        testResult.getCustomerLastname());
    org.junit.Assert.assertEquals(
        "expect equals customerSuffix ",
        records[0].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ", records[0].getCustomerNote(), testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        records[0].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
    org.junit.Assert.assertTrue(
        "expect equals customerIsGuest ",
        records[0].getCustomerIsGuest() == testResult.getCustomerIsGuest());
    org.junit.Assert.assertEquals(
        "expect equals remoteIp ", records[0].getRemoteIp(), testResult.getRemoteIp());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals reservedOrderId ",
        records[0].getReservedOrderId(),
        testResult.getReservedOrderId());
    org.junit.Assert.assertEquals(
        "expect equals passwordHash ", records[0].getPasswordHash(), testResult.getPasswordHash());
    org.junit.Assert.assertEquals(
        "expect equals couponCode ", records[0].getCouponCode(), testResult.getCouponCode());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals baseToQuoteRate ",
        records[0].getBaseToQuoteRate(),
        testResult.getBaseToQuoteRate());
    org.junit.Assert.assertEquals(
        "expect equals customerTaxvat ",
        records[0].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals customerGender ",
        records[0].getCustomerGender(),
        testResult.getCustomerGender());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", records[0].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ", records[0].getBaseSubtotal(), testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals subtotalWithDiscount ",
        records[0].getSubtotalWithDiscount(),
        testResult.getSubtotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalWithDiscount ",
        records[0].getBaseSubtotalWithDiscount(),
        testResult.getBaseSubtotalWithDiscount());
    org.junit.Assert.assertTrue(
        "expect equals isChanged ", records[0].getIsChanged() == testResult.getIsChanged());
    org.junit.Assert.assertTrue(
        "expect equals triggerRecollect ",
        records[0].getTriggerRecollect() == testResult.getTriggerRecollect());
    org.junit.Assert.assertEquals(
        "expect equals extShippingInfo ",
        records[0].getExtShippingInfo(),
        testResult.getExtShippingInfo());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        records[0].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals isPersistent ",
        records[0].getIsPersistent() == testResult.getIsPersistent());
  }
}
