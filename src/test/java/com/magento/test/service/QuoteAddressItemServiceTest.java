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

import com.magento.test.entity.QuoteAddressItem;

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

public class QuoteAddressItemServiceTest {
  private static DefaultQuoteAddressItemService serviceMock;
  private static QuoteAddressItem[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultQuoteAddressItemService.class);
    String inputFile = "QuoteAddressItem.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, QuoteAddressItem[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getAddressItemId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    QuoteAddressItem testResult = serviceMock.find(records[0].getAddressItemId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentItemId ",
        records[0].getParentItemId() == testResult.getParentItemId());
    org.junit.Assert.assertTrue(
        "expect equals quoteAddressId ",
        records[0].getQuoteAddressId() == testResult.getQuoteAddressId());
    org.junit.Assert.assertTrue(
        "expect equals quoteItemId ", records[0].getQuoteItemId() == testResult.getQuoteItemId());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals weight ", records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals("expect equals qty ", records[0].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals rowTotal ", records[0].getRowTotal(), testResult.getRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotal ", records[0].getBaseRowTotal(), testResult.getBaseRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals rowTotalWithDiscount ",
        records[0].getRowTotalWithDiscount(),
        testResult.getRowTotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals rowWeight ", records[0].getRowWeight(), testResult.getRowWeight());
    org.junit.Assert.assertTrue(
        "expect equals productId ", records[0].getProductId() == testResult.getProductId());
    org.junit.Assert.assertTrue(
        "expect equals superProductId ",
        records[0].getSuperProductId() == testResult.getSuperProductId());
    org.junit.Assert.assertTrue(
        "expect equals parentProductId ",
        records[0].getParentProductId() == testResult.getParentProductId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertEquals("expect equals sku ", records[0].getSku(), testResult.getSku());
    org.junit.Assert.assertEquals(
        "expect equals image ", records[0].getImage(), testResult.getImage());
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        records[0].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertEquals(
        "expect equals price ", records[0].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals discountPercent ",
        records[0].getDiscountPercent(),
        testResult.getDiscountPercent());
    org.junit.Assert.assertTrue(
        "expect equals noDiscount ", records[0].getNoDiscount() == testResult.getNoDiscount());
    org.junit.Assert.assertEquals(
        "expect equals taxPercent ", records[0].getTaxPercent(), testResult.getTaxPercent());
    org.junit.Assert.assertEquals(
        "expect equals basePrice ", records[0].getBasePrice(), testResult.getBasePrice());
    org.junit.Assert.assertEquals(
        "expect equals baseCost ", records[0].getBaseCost(), testResult.getBaseCost());
    org.junit.Assert.assertEquals(
        "expect equals priceInclTax ", records[0].getPriceInclTax(), testResult.getPriceInclTax());
    org.junit.Assert.assertEquals(
        "expect equals basePriceInclTax ",
        records[0].getBasePriceInclTax(),
        testResult.getBasePriceInclTax());
    org.junit.Assert.assertEquals(
        "expect equals rowTotalInclTax ",
        records[0].getRowTotalInclTax(),
        testResult.getRowTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotalInclTax ",
        records[0].getBaseRowTotalInclTax(),
        testResult.getBaseRowTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        records[0].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals freeShipping ",
        records[0].getFreeShipping() == testResult.getFreeShipping());
  }
}
