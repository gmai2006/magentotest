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
import com.magento.test.entity.Quote;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultQuoteDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuoteHandlerTestIt {
  static final String inputFile = "Quote.json";
  static QuoteHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Quote[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new QuoteHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, Quote[].class);
    assertEquals("match count", count, records.length);
    Quote testResult = jpa.find(Quote.class, records[0].getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals storeId ", this.records[0].getStoreId(), testResult.getStoreId());
    org.junit.Assert.assertEquals(
        "expect equals isActive ", this.records[0].getIsActive(), testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals isVirtual ", this.records[0].getIsVirtual(), testResult.getIsVirtual());
    org.junit.Assert.assertEquals(
        "expect equals isMultiShipping ",
        this.records[0].getIsMultiShipping(),
        testResult.getIsMultiShipping());
    org.junit.Assert.assertEquals(
        "expect equals itemsCount ", this.records[0].getItemsCount(), testResult.getItemsCount());
    assertEquals(
        "expect equals itemsQty ", this.records[0].getItemsQty(), testResult.getItemsQty());
    org.junit.Assert.assertEquals(
        "expect equals origOrderId ",
        this.records[0].getOrigOrderId(),
        testResult.getOrigOrderId());
    assertEquals(
        "expect equals storeToBaseRate ",
        this.records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    assertEquals(
        "expect equals storeToQuoteRate ",
        this.records[0].getStoreToQuoteRate(),
        testResult.getStoreToQuoteRate());
    assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    assertEquals(
        "expect equals quoteCurrencyCode ",
        this.records[0].getQuoteCurrencyCode(),
        testResult.getQuoteCurrencyCode());
    assertEquals(
        "expect equals grandTotal ", this.records[0].getGrandTotal(), testResult.getGrandTotal());
    assertEquals(
        "expect equals baseGrandTotal ",
        this.records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    assertEquals(
        "expect equals checkoutMethod ",
        this.records[0].getCheckoutMethod(),
        testResult.getCheckoutMethod());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals customerTaxClassId ",
        this.records[0].getCustomerTaxClassId(),
        testResult.getCustomerTaxClassId());
    org.junit.Assert.assertEquals(
        "expect equals customerGroupId ",
        this.records[0].getCustomerGroupId(),
        testResult.getCustomerGroupId());
    assertEquals(
        "expect equals customerEmail ",
        this.records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    assertEquals(
        "expect equals customerPrefix ",
        this.records[0].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    assertEquals(
        "expect equals customerFirstname ",
        this.records[0].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    assertEquals(
        "expect equals customerMiddlename ",
        this.records[0].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    assertEquals(
        "expect equals customerLastname ",
        this.records[0].getCustomerLastname(),
        testResult.getCustomerLastname());
    assertEquals(
        "expect equals customerSuffix ",
        this.records[0].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    assertEquals(
        "expect equals customerNote ",
        this.records[0].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertEquals(
        "expect equals customerNoteNotify ",
        this.records[0].getCustomerNoteNotify(),
        testResult.getCustomerNoteNotify());
    org.junit.Assert.assertEquals(
        "expect equals customerIsGuest ",
        this.records[0].getCustomerIsGuest(),
        testResult.getCustomerIsGuest());
    assertEquals(
        "expect equals remoteIp ", this.records[0].getRemoteIp(), testResult.getRemoteIp());
    assertEquals(
        "expect equals appliedRuleIds ",
        this.records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    assertEquals(
        "expect equals reservedOrderId ",
        this.records[0].getReservedOrderId(),
        testResult.getReservedOrderId());
    assertEquals(
        "expect equals passwordHash ",
        this.records[0].getPasswordHash(),
        testResult.getPasswordHash());
    assertEquals(
        "expect equals couponCode ", this.records[0].getCouponCode(), testResult.getCouponCode());
    assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    assertEquals(
        "expect equals baseToQuoteRate ",
        this.records[0].getBaseToQuoteRate(),
        testResult.getBaseToQuoteRate());
    assertEquals(
        "expect equals customerTaxvat ",
        this.records[0].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    assertEquals(
        "expect equals customerGender ",
        this.records[0].getCustomerGender(),
        testResult.getCustomerGender());
    assertEquals(
        "expect equals subtotal ", this.records[0].getSubtotal(), testResult.getSubtotal());
    assertEquals(
        "expect equals baseSubtotal ",
        this.records[0].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    assertEquals(
        "expect equals subtotalWithDiscount ",
        this.records[0].getSubtotalWithDiscount(),
        testResult.getSubtotalWithDiscount());
    assertEquals(
        "expect equals baseSubtotalWithDiscount ",
        this.records[0].getBaseSubtotalWithDiscount(),
        testResult.getBaseSubtotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals isChanged ", this.records[0].getIsChanged(), testResult.getIsChanged());
    org.junit.Assert.assertEquals(
        "expect equals triggerRecollect ",
        this.records[0].getTriggerRecollect(),
        testResult.getTriggerRecollect());
    assertEquals(
        "expect equals extShippingInfo ",
        this.records[0].getExtShippingInfo(),
        testResult.getExtShippingInfo());
    org.junit.Assert.assertEquals(
        "expect equals giftMessageId ",
        this.records[0].getGiftMessageId(),
        testResult.getGiftMessageId());
    org.junit.Assert.assertEquals(
        "expect equals isPersistent ",
        this.records[0].getIsPersistent(),
        testResult.getIsPersistent());

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
