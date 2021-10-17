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

import com.magento.test.entity.SalesInvoice;
import com.magento.test.entity.SalesInvoiceId;

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

public class SalesInvoiceServiceTest {
  private static DefaultSalesInvoiceService serviceMock;
  private static SalesInvoice[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesInvoiceService.class);
    String inputFile = "SalesInvoice.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesInvoice[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SalesInvoiceId id =
        new SalesInvoiceId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SalesInvoiceId id =
        new SalesInvoiceId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    SalesInvoice testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxAmount ",
        records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals storeToOrderRate ",
        records[0].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxAmount ",
        records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseToOrderRate ",
        records[0].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", records[0].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        records[0].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInclTax ",
        records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInclTax ",
        records[0].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalQty ", records[0].getTotalQty(), testResult.getTotalQty());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", records[0].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ", records[0].getBaseSubtotal(), testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertTrue(
        "expect equals billingAddressId ",
        records[0].getBillingAddressId() == testResult.getBillingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals isUsedForRefund ",
        records[0].getIsUsedForRefund() == testResult.getIsUsedForRefund());
    org.junit.Assert.assertTrue(
        "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertTrue(
        "expect equals emailSent ", records[0].getEmailSent() == testResult.getEmailSent());
    org.junit.Assert.assertTrue(
        "expect equals sendEmail ", records[0].getSendEmail() == testResult.getSendEmail());
    org.junit.Assert.assertTrue(
        "expect equals canVoidFlag ", records[0].getCanVoidFlag() == testResult.getCanVoidFlag());
    org.junit.Assert.assertTrue(
        "expect equals state ", records[0].getState() == testResult.getState());
    org.junit.Assert.assertTrue(
        "expect equals shippingAddressId ",
        records[0].getShippingAddressId() == testResult.getShippingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals transactionId ",
        records[0].getTransactionId(),
        testResult.getTransactionId());
    org.junit.Assert.assertEquals(
        "expect equals orderCurrencyCode ",
        records[0].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
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
        "expect equals shippingInclTax ",
        records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInclTax ",
        records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalRefunded ",
        records[0].getBaseTotalRefunded(),
        testResult.getBaseTotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals discountDescription ",
        records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ", records[0].getCustomerNote(), testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        records[0].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
  }
}
