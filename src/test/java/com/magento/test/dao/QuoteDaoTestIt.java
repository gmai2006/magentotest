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
import com.magento.test.entity.Quote;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class QuoteDaoTestIt {
  static final String inputFile = "Quote.json";
  static QuoteDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private Quote[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultQuoteDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Quote[].class);
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
    Quote testResult = dao.find(records[1].getEntityId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", this.records[1].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", this.records[1].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertTrue(
        "expect equals isMultiShipping ",
        this.records[1].getIsMultiShipping() == testResult.getIsMultiShipping());
    org.junit.Assert.assertTrue(
        "expect equals itemsCount ", this.records[1].getItemsCount() == testResult.getItemsCount());
    org.junit.Assert.assertEquals(
        "expect equals itemsQty ", this.records[1].getItemsQty(), testResult.getItemsQty());
    org.junit.Assert.assertTrue(
        "expect equals origOrderId ",
        this.records[1].getOrigOrderId() == testResult.getOrigOrderId());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        this.records[1].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals storeToQuoteRate ",
        this.records[1].getStoreToQuoteRate(),
        testResult.getStoreToQuoteRate());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[1].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[1].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals quoteCurrencyCode ",
        this.records[1].getQuoteCurrencyCode(),
        testResult.getQuoteCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", this.records[1].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        this.records[1].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals checkoutMethod ",
        this.records[1].getCheckoutMethod(),
        testResult.getCheckoutMethod());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", this.records[1].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertTrue(
        "expect equals customerTaxClassId ",
        this.records[1].getCustomerTaxClassId() == testResult.getCustomerTaxClassId());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        this.records[1].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        this.records[1].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertEquals(
        "expect equals customerPrefix ",
        this.records[1].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    org.junit.Assert.assertEquals(
        "expect equals customerFirstname ",
        this.records[1].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    org.junit.Assert.assertEquals(
        "expect equals customerMiddlename ",
        this.records[1].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals customerLastname ",
        this.records[1].getCustomerLastname(),
        testResult.getCustomerLastname());
    org.junit.Assert.assertEquals(
        "expect equals customerSuffix ",
        this.records[1].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ",
        this.records[1].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        this.records[1].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
    org.junit.Assert.assertTrue(
        "expect equals customerIsGuest ",
        this.records[1].getCustomerIsGuest() == testResult.getCustomerIsGuest());
    org.junit.Assert.assertEquals(
        "expect equals remoteIp ", this.records[1].getRemoteIp(), testResult.getRemoteIp());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        this.records[1].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals reservedOrderId ",
        this.records[1].getReservedOrderId(),
        testResult.getReservedOrderId());
    org.junit.Assert.assertEquals(
        "expect equals passwordHash ",
        this.records[1].getPasswordHash(),
        testResult.getPasswordHash());
    org.junit.Assert.assertEquals(
        "expect equals couponCode ", this.records[1].getCouponCode(), testResult.getCouponCode());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[1].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[1].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals baseToQuoteRate ",
        this.records[1].getBaseToQuoteRate(),
        testResult.getBaseToQuoteRate());
    org.junit.Assert.assertEquals(
        "expect equals customerTaxvat ",
        this.records[1].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals customerGender ",
        this.records[1].getCustomerGender(),
        testResult.getCustomerGender());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", this.records[1].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ",
        this.records[1].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals subtotalWithDiscount ",
        this.records[1].getSubtotalWithDiscount(),
        testResult.getSubtotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalWithDiscount ",
        this.records[1].getBaseSubtotalWithDiscount(),
        testResult.getBaseSubtotalWithDiscount());
    org.junit.Assert.assertTrue(
        "expect equals isChanged ", this.records[1].getIsChanged() == testResult.getIsChanged());
    org.junit.Assert.assertTrue(
        "expect equals triggerRecollect ",
        this.records[1].getTriggerRecollect() == testResult.getTriggerRecollect());
    org.junit.Assert.assertEquals(
        "expect equals extShippingInfo ",
        this.records[1].getExtShippingInfo(),
        testResult.getExtShippingInfo());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        this.records[1].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals isPersistent ",
        this.records[1].getIsPersistent() == testResult.getIsPersistent());
  }
}
