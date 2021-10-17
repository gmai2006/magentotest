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

import com.magento.test.entity.SalesInvoiceItem;

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

public class SalesInvoiceItemServiceTest {
  private static DefaultSalesInvoiceItemService serviceMock;
  private static SalesInvoiceItem[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesInvoiceItemService.class);
    String inputFile = "SalesInvoiceItem.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesInvoiceItem[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    SalesInvoiceItem testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentId ", records[0].getParentId() == testResult.getParentId());
    org.junit.Assert.assertEquals(
        "expect equals basePrice ", records[0].getBasePrice(), testResult.getBasePrice());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotal ", records[0].getBaseRowTotal(), testResult.getBaseRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals rowTotal ", records[0].getRowTotal(), testResult.getRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals priceInclTax ", records[0].getPriceInclTax(), testResult.getPriceInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals basePriceInclTax ",
        records[0].getBasePriceInclTax(),
        testResult.getBasePriceInclTax());
    org.junit.Assert.assertEquals("expect equals qty ", records[0].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals baseCost ", records[0].getBaseCost(), testResult.getBaseCost());
    org.junit.Assert.assertEquals(
        "expect equals price ", records[0].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotalInclTax ",
        records[0].getBaseRowTotalInclTax(),
        testResult.getBaseRowTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals rowTotalInclTax ",
        records[0].getRowTotalInclTax(),
        testResult.getRowTotalInclTax());
    org.junit.Assert.assertTrue(
        "expect equals productId ", records[0].getProductId() == testResult.getProductId());
    org.junit.Assert.assertTrue(
        "expect equals orderItemId ", records[0].getOrderItemId() == testResult.getOrderItemId());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertEquals("expect equals sku ", records[0].getSku(), testResult.getSku());
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxRatio ", records[0].getTaxRatio(), testResult.getTaxRatio());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxApplied ",
        records[0].getWeeeTaxApplied(),
        testResult.getWeeeTaxApplied());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxAppliedAmount ",
        records[0].getWeeeTaxAppliedAmount(),
        testResult.getWeeeTaxAppliedAmount());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxAppliedRowAmount ",
        records[0].getWeeeTaxAppliedRowAmount(),
        testResult.getWeeeTaxAppliedRowAmount());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxDisposition ",
        records[0].getWeeeTaxDisposition(),
        testResult.getWeeeTaxDisposition());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxRowDisposition ",
        records[0].getWeeeTaxRowDisposition(),
        testResult.getWeeeTaxRowDisposition());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxAppliedAmount ",
        records[0].getBaseWeeeTaxAppliedAmount(),
        testResult.getBaseWeeeTaxAppliedAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxAppliedRowAmnt ",
        records[0].getBaseWeeeTaxAppliedRowAmnt(),
        testResult.getBaseWeeeTaxAppliedRowAmnt());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxDisposition ",
        records[0].getBaseWeeeTaxDisposition(),
        testResult.getBaseWeeeTaxDisposition());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxRowDisposition ",
        records[0].getBaseWeeeTaxRowDisposition(),
        testResult.getBaseWeeeTaxRowDisposition());
  }
}
