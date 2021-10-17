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
package com.magento.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.magento.test.entity.SalesOrderItem;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesOrderItemDaoTestIt {
  static final String inputFile = "SalesOrderItem.json";
  static SalesOrderItemDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderItem[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesOrderItemDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderItem[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    SalesOrderItem testResult = dao.find(records[1].getItemId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals orderId ", this.records[1].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertTrue(
        "expect equals parentItemId ",
        this.records[1].getParentItemId() == testResult.getParentItemId());
    org.junit.Assert.assertTrue(
        "expect equals quoteItemId ",
        this.records[1].getQuoteItemId() == testResult.getQuoteItemId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertTrue(
        "expect equals productId ", this.records[1].getProductId() == testResult.getProductId());
    org.junit.Assert.assertEquals(
        "expect equals productType ",
        this.records[1].getProductType(),
        testResult.getProductType());
    org.junit.Assert.assertEquals(
        "expect equals productOptions ",
        this.records[1].getProductOptions(),
        testResult.getProductOptions());
    org.junit.Assert.assertEquals(
        "expect equals weight ", this.records[1].getWeight(), testResult.getWeight());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", this.records[1].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertEquals(
        "expect equals sku ", this.records[1].getSku(), testResult.getSku());
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        this.records[1].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        this.records[1].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        this.records[1].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertTrue(
        "expect equals noDiscount ", this.records[1].getNoDiscount() == testResult.getNoDiscount());
    org.junit.Assert.assertEquals(
        "expect equals qtyBackordered ",
        this.records[1].getQtyBackordered(),
        testResult.getQtyBackordered());
    org.junit.Assert.assertEquals(
        "expect equals qtyCanceled ",
        this.records[1].getQtyCanceled(),
        testResult.getQtyCanceled());
    org.junit.Assert.assertEquals(
        "expect equals qtyInvoiced ",
        this.records[1].getQtyInvoiced(),
        testResult.getQtyInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals qtyOrdered ", this.records[1].getQtyOrdered(), testResult.getQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals qtyRefunded ",
        this.records[1].getQtyRefunded(),
        testResult.getQtyRefunded());
    org.junit.Assert.assertEquals(
        "expect equals qtyShipped ", this.records[1].getQtyShipped(), testResult.getQtyShipped());
    org.junit.Assert.assertEquals(
        "expect equals baseCost ", this.records[1].getBaseCost(), testResult.getBaseCost());
    org.junit.Assert.assertEquals(
        "expect equals price ", this.records[1].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals basePrice ", this.records[1].getBasePrice(), testResult.getBasePrice());
    org.junit.Assert.assertEquals(
        "expect equals originalPrice ",
        this.records[1].getOriginalPrice(),
        testResult.getOriginalPrice());
    org.junit.Assert.assertEquals(
        "expect equals baseOriginalPrice ",
        this.records[1].getBaseOriginalPrice(),
        testResult.getBaseOriginalPrice());
    org.junit.Assert.assertEquals(
        "expect equals taxPercent ", this.records[1].getTaxPercent(), testResult.getTaxPercent());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", this.records[1].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        this.records[1].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxInvoiced ",
        this.records[1].getTaxInvoiced(),
        testResult.getTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxInvoiced ",
        this.records[1].getBaseTaxInvoiced(),
        testResult.getBaseTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountPercent ",
        this.records[1].getDiscountPercent(),
        testResult.getDiscountPercent());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        this.records[1].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[1].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountInvoiced ",
        this.records[1].getDiscountInvoiced(),
        testResult.getDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountInvoiced ",
        this.records[1].getBaseDiscountInvoiced(),
        testResult.getBaseDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals amountRefunded ",
        this.records[1].getAmountRefunded(),
        testResult.getAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefunded ",
        this.records[1].getBaseAmountRefunded(),
        testResult.getBaseAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals rowTotal ", this.records[1].getRowTotal(), testResult.getRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotal ",
        this.records[1].getBaseRowTotal(),
        testResult.getBaseRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals rowInvoiced ",
        this.records[1].getRowInvoiced(),
        testResult.getRowInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseRowInvoiced ",
        this.records[1].getBaseRowInvoiced(),
        testResult.getBaseRowInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals rowWeight ", this.records[1].getRowWeight(), testResult.getRowWeight());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxBeforeDiscount ",
        this.records[1].getBaseTaxBeforeDiscount(),
        testResult.getBaseTaxBeforeDiscount());
    org.junit.Assert.assertEquals(
        "expect equals taxBeforeDiscount ",
        this.records[1].getTaxBeforeDiscount(),
        testResult.getTaxBeforeDiscount());
    org.junit.Assert.assertEquals(
        "expect equals extOrderItemId ",
        this.records[1].getExtOrderItemId(),
        testResult.getExtOrderItemId());
    org.junit.Assert.assertTrue(
        "expect equals lockedDoInvoice ",
        this.records[1].getLockedDoInvoice() == testResult.getLockedDoInvoice());
    org.junit.Assert.assertTrue(
        "expect equals lockedDoShip ",
        this.records[1].getLockedDoShip() == testResult.getLockedDoShip());
    org.junit.Assert.assertEquals(
        "expect equals priceInclTax ",
        this.records[1].getPriceInclTax(),
        testResult.getPriceInclTax());
    org.junit.Assert.assertEquals(
        "expect equals basePriceInclTax ",
        this.records[1].getBasePriceInclTax(),
        testResult.getBasePriceInclTax());
    org.junit.Assert.assertEquals(
        "expect equals rowTotalInclTax ",
        this.records[1].getRowTotalInclTax(),
        testResult.getRowTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotalInclTax ",
        this.records[1].getBaseRowTotalInclTax(),
        testResult.getBaseRowTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[1].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[1].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationInvoiced ",
        this.records[1].getDiscountTaxCompensationInvoiced(),
        testResult.getDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationInvoiced ",
        this.records[1].getBaseDiscountTaxCompensationInvoiced(),
        testResult.getBaseDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationRefunded ",
        this.records[1].getDiscountTaxCompensationRefunded(),
        testResult.getDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationRefunded ",
        this.records[1].getBaseDiscountTaxCompensationRefunded(),
        testResult.getBaseDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals taxCanceled ",
        this.records[1].getTaxCanceled(),
        testResult.getTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationCanceled ",
        this.records[1].getDiscountTaxCompensationCanceled(),
        testResult.getDiscountTaxCompensationCanceled());
    org.junit.Assert.assertEquals(
        "expect equals taxRefunded ",
        this.records[1].getTaxRefunded(),
        testResult.getTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxRefunded ",
        this.records[1].getBaseTaxRefunded(),
        testResult.getBaseTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals discountRefunded ",
        this.records[1].getDiscountRefunded(),
        testResult.getDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountRefunded ",
        this.records[1].getBaseDiscountRefunded(),
        testResult.getBaseDiscountRefunded());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        this.records[1].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageAvailable ",
        this.records[1].getGiftMessageAvailable() == testResult.getGiftMessageAvailable());
    org.junit.Assert.assertTrue(
        "expect equals freeShipping ",
        this.records[1].getFreeShipping() == testResult.getFreeShipping());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxApplied ",
        this.records[1].getWeeeTaxApplied(),
        testResult.getWeeeTaxApplied());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxAppliedAmount ",
        this.records[1].getWeeeTaxAppliedAmount(),
        testResult.getWeeeTaxAppliedAmount());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxAppliedRowAmount ",
        this.records[1].getWeeeTaxAppliedRowAmount(),
        testResult.getWeeeTaxAppliedRowAmount());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxDisposition ",
        this.records[1].getWeeeTaxDisposition(),
        testResult.getWeeeTaxDisposition());
    org.junit.Assert.assertEquals(
        "expect equals weeeTaxRowDisposition ",
        this.records[1].getWeeeTaxRowDisposition(),
        testResult.getWeeeTaxRowDisposition());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxAppliedAmount ",
        this.records[1].getBaseWeeeTaxAppliedAmount(),
        testResult.getBaseWeeeTaxAppliedAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxAppliedRowAmnt ",
        this.records[1].getBaseWeeeTaxAppliedRowAmnt(),
        testResult.getBaseWeeeTaxAppliedRowAmnt());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxDisposition ",
        this.records[1].getBaseWeeeTaxDisposition(),
        testResult.getBaseWeeeTaxDisposition());
    org.junit.Assert.assertEquals(
        "expect equals baseWeeeTaxRowDisposition ",
        this.records[1].getBaseWeeeTaxRowDisposition(),
        testResult.getBaseWeeeTaxRowDisposition());
  }
}
