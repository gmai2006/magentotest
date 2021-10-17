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

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.magento.test.entity.QuoteItem;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultQuoteItemDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuoteItemHandlerTestIt {
  static final String inputFile = "QuoteItem.json";
  static QuoteItemHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private QuoteItem[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new QuoteItemHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, QuoteItem[].class);
    assertEquals("match count", count, records.length);
    QuoteItem testResult = jpa.find(QuoteItem.class, records[0].getItemId());
    org.junit.Assert.assertEquals(
        "expect equals quoteId ", this.records[0].getQuoteId(), testResult.getQuoteId());
    org.junit.Assert.assertEquals(
        "expect equals productId ", this.records[0].getProductId(), testResult.getProductId());
    org.junit.Assert.assertEquals(
        "expect equals storeId ", this.records[0].getStoreId(), testResult.getStoreId());
    org.junit.Assert.assertEquals(
        "expect equals parentItemId ",
        this.records[0].getParentItemId(),
        testResult.getParentItemId());
    org.junit.Assert.assertEquals(
        "expect equals isVirtual ", this.records[0].getIsVirtual(), testResult.getIsVirtual());
    assertEquals("expect equals sku ", this.records[0].getSku(), testResult.getSku());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals(
        "expect equals description ",
        this.records[0].getDescription(),
        testResult.getDescription());
    assertEquals(
        "expect equals appliedRuleIds ",
        this.records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    assertEquals(
        "expect equals additionalData ",
        this.records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals isQtyDecimal ",
        this.records[0].getIsQtyDecimal(),
        testResult.getIsQtyDecimal());
    org.junit.Assert.assertEquals(
        "expect equals noDiscount ", this.records[0].getNoDiscount(), testResult.getNoDiscount());
    assertEquals("expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    assertEquals("expect equals qty ", this.records[0].getQty(), testResult.getQty());
    assertEquals("expect equals price ", this.records[0].getPrice(), testResult.getPrice());
    assertEquals(
        "expect equals basePrice ", this.records[0].getBasePrice(), testResult.getBasePrice());
    assertEquals(
        "expect equals customPrice ",
        this.records[0].getCustomPrice(),
        testResult.getCustomPrice());
    assertEquals(
        "expect equals discountPercent ",
        this.records[0].getDiscountPercent(),
        testResult.getDiscountPercent());
    assertEquals(
        "expect equals discountAmount ",
        this.records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    assertEquals(
        "expect equals taxPercent ", this.records[0].getTaxPercent(), testResult.getTaxPercent());
    assertEquals(
        "expect equals taxAmount ", this.records[0].getTaxAmount(), testResult.getTaxAmount());
    assertEquals(
        "expect equals baseTaxAmount ",
        this.records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    assertEquals(
        "expect equals rowTotal ", this.records[0].getRowTotal(), testResult.getRowTotal());
    assertEquals(
        "expect equals baseRowTotal ",
        this.records[0].getBaseRowTotal(),
        testResult.getBaseRowTotal());
    assertEquals(
        "expect equals rowTotalWithDiscount ",
        this.records[0].getRowTotalWithDiscount(),
        testResult.getRowTotalWithDiscount());
    assertEquals(
        "expect equals rowWeight ", this.records[0].getRowWeight(), testResult.getRowWeight());
    assertEquals(
        "expect equals productType ",
        this.records[0].getProductType(),
        testResult.getProductType());
    assertEquals(
        "expect equals baseTaxBeforeDiscount ",
        this.records[0].getBaseTaxBeforeDiscount(),
        testResult.getBaseTaxBeforeDiscount());
    assertEquals(
        "expect equals taxBeforeDiscount ",
        this.records[0].getTaxBeforeDiscount(),
        testResult.getTaxBeforeDiscount());
    assertEquals(
        "expect equals originalCustomPrice ",
        this.records[0].getOriginalCustomPrice(),
        testResult.getOriginalCustomPrice());
    assertEquals(
        "expect equals redirectUrl ",
        this.records[0].getRedirectUrl(),
        testResult.getRedirectUrl());
    assertEquals(
        "expect equals baseCost ", this.records[0].getBaseCost(), testResult.getBaseCost());
    assertEquals(
        "expect equals priceInclTax ",
        this.records[0].getPriceInclTax(),
        testResult.getPriceInclTax());
    assertEquals(
        "expect equals basePriceInclTax ",
        this.records[0].getBasePriceInclTax(),
        testResult.getBasePriceInclTax());
    assertEquals(
        "expect equals rowTotalInclTax ",
        this.records[0].getRowTotalInclTax(),
        testResult.getRowTotalInclTax());
    assertEquals(
        "expect equals baseRowTotalInclTax ",
        this.records[0].getBaseRowTotalInclTax(),
        testResult.getBaseRowTotalInclTax());
    assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals giftMessageId ",
        this.records[0].getGiftMessageId(),
        testResult.getGiftMessageId());
    org.junit.Assert.assertEquals(
        "expect equals freeShipping ",
        this.records[0].getFreeShipping(),
        testResult.getFreeShipping());
    assertEquals(
        "expect equals weeeTaxApplied ",
        this.records[0].getWeeeTaxApplied(),
        testResult.getWeeeTaxApplied());
    assertEquals(
        "expect equals weeeTaxAppliedAmount ",
        this.records[0].getWeeeTaxAppliedAmount(),
        testResult.getWeeeTaxAppliedAmount());
    assertEquals(
        "expect equals weeeTaxAppliedRowAmount ",
        this.records[0].getWeeeTaxAppliedRowAmount(),
        testResult.getWeeeTaxAppliedRowAmount());
    assertEquals(
        "expect equals weeeTaxDisposition ",
        this.records[0].getWeeeTaxDisposition(),
        testResult.getWeeeTaxDisposition());
    assertEquals(
        "expect equals weeeTaxRowDisposition ",
        this.records[0].getWeeeTaxRowDisposition(),
        testResult.getWeeeTaxRowDisposition());
    assertEquals(
        "expect equals baseWeeeTaxAppliedAmount ",
        this.records[0].getBaseWeeeTaxAppliedAmount(),
        testResult.getBaseWeeeTaxAppliedAmount());
    assertEquals(
        "expect equals baseWeeeTaxAppliedRowAmnt ",
        this.records[0].getBaseWeeeTaxAppliedRowAmnt(),
        testResult.getBaseWeeeTaxAppliedRowAmnt());
    assertEquals(
        "expect equals baseWeeeTaxDisposition ",
        this.records[0].getBaseWeeeTaxDisposition(),
        testResult.getBaseWeeeTaxDisposition());
    assertEquals(
        "expect equals baseWeeeTaxRowDisposition ",
        this.records[0].getBaseWeeeTaxRowDisposition(),
        testResult.getBaseWeeeTaxRowDisposition());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }

  /**
   * Construct a delimiter file from a json file.
   *
   * @param inputFile the json file.
   * @param charset default charset.
   * @return
   */
  private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
    try {
      final File tempFile = File.createTempFile(inputFile, ".txt");
      tempFile.deleteOnExit();
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      JSONArray docs = new JSONArray(json);
      String csv = CDL.toString(docs);
      org.apache.commons.io.FileUtils.writeStringToFile(tempFile, csv, Charset.defaultCharset());
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
