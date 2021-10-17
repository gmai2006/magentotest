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

import com.magento.test.entity.SalesOrderItem;

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

public class SalesOrderItemServiceTest {
  private static DefaultSalesOrderItemService serviceMock;
  private static SalesOrderItem[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesOrderItemService.class);
    String inputFile = "SalesOrderItem.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderItem[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getItemId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    SalesOrderItem testResult = serviceMock.find(records[0].getItemId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertTrue(
        "expect equals parentItemId ",
        records[0].getParentItemId() == testResult.getParentItemId());
    org.junit.Assert.assertTrue(
        "expect equals quoteItemId ", records[0].getQuoteItemId() == testResult.getQuoteItemId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertTrue(
        "expect equals productId ", records[0].getProductId() == testResult.getProductId());
    org.junit.Assert.assertEquals(
        "expect equals productType ", records[0].getProductType(), testResult.getProductType());
    org.junit.Assert.assertEquals(
        "expect equals productOptions ",
        records[0].getProductOptions(),
        testResult.getProductOptions());
    org.junit.Assert.assertEquals(
        "expect equals weight ", records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", records[0].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertEquals("expect equals sku ", records[0].getSku(), testResult.getSku());
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        records[0].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertTrue(
        "expect equals noDiscount ", records[0].getNoDiscount() == testResult.getNoDiscount());
    org.junit.Assert.assertEquals(
        "expect equals qtyBackordered ",
        records[0].getQtyBackordered(),
        testResult.getQtyBackordered());
    org.junit.Assert.assertEquals(
        "expect equals qtyCanceled ", records[0].getQtyCanceled(), testResult.getQtyCanceled());
    org.junit.Assert.assertEquals(
        "expect equals qtyInvoiced ", records[0].getQtyInvoiced(), testResult.getQtyInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals qtyOrdered ", records[0].getQtyOrdered(), testResult.getQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals qtyRefunded ", records[0].getQtyRefunded(), testResult.getQtyRefunded());
    org.junit.Assert.assertEquals(
        "expect equals qtyShipped ", records[0].getQtyShipped(), testResult.getQtyShipped());
    org.junit.Assert.assertEquals(
        "expect equals baseCost ", records[0].getBaseCost(), testResult.getBaseCost());
    org.junit.Assert.assertEquals(
        "expect equals price ", records[0].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals basePrice ", records[0].getBasePrice(), testResult.getBasePrice());
    org.junit.Assert.assertEquals(
        "expect equals originalPrice ",
        records[0].getOriginalPrice(),
        testResult.getOriginalPrice());
    org.junit.Assert.assertEquals(
        "expect equals baseOriginalPrice ",
        records[0].getBaseOriginalPrice(),
        testResult.getBaseOriginalPrice());
    org.junit.Assert.assertEquals(
        "expect equals taxPercent ", records[0].getTaxPercent(), testResult.getTaxPercent());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxInvoiced ", records[0].getTaxInvoiced(), testResult.getTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxInvoiced ",
        records[0].getBaseTaxInvoiced(),
        testResult.getBaseTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountPercent ",
        records[0].getDiscountPercent(),
        testResult.getDiscountPercent());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountInvoiced ",
        records[0].getDiscountInvoiced(),
        testResult.getDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountInvoiced ",
        records[0].getBaseDiscountInvoiced(),
        testResult.getBaseDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals amountRefunded ",
        records[0].getAmountRefunded(),
        testResult.getAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefunded ",
        records[0].getBaseAmountRefunded(),
        testResult.getBaseAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals rowTotal ", records[0].getRowTotal(), testResult.getRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotal ", records[0].getBaseRowTotal(), testResult.getBaseRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals rowInvoiced ", records[0].getRowInvoiced(), testResult.getRowInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseRowInvoiced ",
        records[0].getBaseRowInvoiced(),
        testResult.getBaseRowInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals rowWeight ", records[0].getRowWeight(), testResult.getRowWeight());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxBeforeDiscount ",
        records[0].getBaseTaxBeforeDiscount(),
        testResult.getBaseTaxBeforeDiscount());
    org.junit.Assert.assertEquals(
        "expect equals taxBeforeDiscount ",
        records[0].getTaxBeforeDiscount(),
        testResult.getTaxBeforeDiscount());
    org.junit.Assert.assertEquals(
        "expect equals extOrderItemId ",
        records[0].getExtOrderItemId(),
        testResult.getExtOrderItemId());
    org.junit.Assert.assertTrue(
        "expect equals lockedDoInvoice ",
        records[0].getLockedDoInvoice() == testResult.getLockedDoInvoice());
    org.junit.Assert.assertTrue(
        "expect equals lockedDoShip ",
        records[0].getLockedDoShip() == testResult.getLockedDoShip());
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
        "expect equals taxCanceled ", records[0].getTaxCanceled(), testResult.getTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationCanceled ",
        records[0].getDiscountTaxCompensationCanceled(),
        testResult.getDiscountTaxCompensationCanceled());
    org.junit.Assert.assertEquals(
        "expect equals taxRefunded ", records[0].getTaxRefunded(), testResult.getTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxRefunded ",
        records[0].getBaseTaxRefunded(),
        testResult.getBaseTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals discountRefunded ",
        records[0].getDiscountRefunded(),
        testResult.getDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountRefunded ",
        records[0].getBaseDiscountRefunded(),
        testResult.getBaseDiscountRefunded());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        records[0].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageAvailable ",
        records[0].getGiftMessageAvailable() == testResult.getGiftMessageAvailable());
    org.junit.Assert.assertTrue(
        "expect equals freeShipping ",
        records[0].getFreeShipping() == testResult.getFreeShipping());
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
