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
import com.magento.test.entity.QuoteAddressItem;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class QuoteAddressItemDaoTestIt {
  static final String inputFile = "QuoteAddressItem.json";
  static QuoteAddressItemDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private QuoteAddressItem[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultQuoteAddressItemDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, QuoteAddressItem[].class);
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
    QuoteAddressItem testResult = dao.find(records[1].getAddressItemId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentItemId ",
        this.records[1].getParentItemId() == testResult.getParentItemId());
    org.junit.Assert.assertTrue(
        "expect equals quoteAddressId ",
        this.records[1].getQuoteAddressId() == testResult.getQuoteAddressId());
    org.junit.Assert.assertTrue(
        "expect equals quoteItemId ",
        this.records[1].getQuoteItemId() == testResult.getQuoteItemId());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        this.records[1].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        this.records[1].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals weight ", this.records[1].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals qty ", this.records[1].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        this.records[1].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", this.records[1].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals rowTotal ", this.records[1].getRowTotal(), testResult.getRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseRowTotal ",
        this.records[1].getBaseRowTotal(),
        testResult.getBaseRowTotal());
    org.junit.Assert.assertEquals(
        "expect equals rowTotalWithDiscount ",
        this.records[1].getRowTotalWithDiscount(),
        testResult.getRowTotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[1].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        this.records[1].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals rowWeight ", this.records[1].getRowWeight(), testResult.getRowWeight());
    org.junit.Assert.assertTrue(
        "expect equals productId ", this.records[1].getProductId() == testResult.getProductId());
    org.junit.Assert.assertTrue(
        "expect equals superProductId ",
        this.records[1].getSuperProductId() == testResult.getSuperProductId());
    org.junit.Assert.assertTrue(
        "expect equals parentProductId ",
        this.records[1].getParentProductId() == testResult.getParentProductId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertEquals(
        "expect equals sku ", this.records[1].getSku(), testResult.getSku());
    org.junit.Assert.assertEquals(
        "expect equals image ", this.records[1].getImage(), testResult.getImage());
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertTrue(
        "expect equals isQtyDecimal ",
        this.records[1].getIsQtyDecimal() == testResult.getIsQtyDecimal());
    org.junit.Assert.assertEquals(
        "expect equals price ", this.records[1].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals discountPercent ",
        this.records[1].getDiscountPercent(),
        testResult.getDiscountPercent());
    org.junit.Assert.assertTrue(
        "expect equals noDiscount ", this.records[1].getNoDiscount() == testResult.getNoDiscount());
    org.junit.Assert.assertEquals(
        "expect equals taxPercent ", this.records[1].getTaxPercent(), testResult.getTaxPercent());
    org.junit.Assert.assertEquals(
        "expect equals basePrice ", this.records[1].getBasePrice(), testResult.getBasePrice());
    org.junit.Assert.assertEquals(
        "expect equals baseCost ", this.records[1].getBaseCost(), testResult.getBaseCost());
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
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        this.records[1].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals freeShipping ",
        this.records[1].getFreeShipping() == testResult.getFreeShipping());
  }
}
