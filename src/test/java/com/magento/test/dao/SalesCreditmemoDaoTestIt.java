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
import com.magento.test.entity.SalesCreditmemo;
import com.magento.test.entity.SalesCreditmemoId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesCreditmemoDaoTestIt {
  static final String inputFile = "SalesCreditmemo.json";
  static SalesCreditmemoDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesCreditmemo[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesCreditmemoDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesCreditmemo[].class);
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
    final SalesCreditmemoId id =
        new SalesCreditmemoId(
            this.records[1].getStoreId(),
            this.records[1].getIncrementId(),
            this.records[1].getEntityId());
    SalesCreditmemo testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals adjustmentPositive ",
        this.records[1].getAdjustmentPositive(),
        testResult.getAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxAmount ",
        this.records[1].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals storeToOrderRate ",
        this.records[1].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[1].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseToOrderRate ",
        this.records[1].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", this.records[1].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentNegative ",
        this.records[1].getBaseAdjustmentNegative(),
        testResult.getBaseAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInclTax ",
        this.records[1].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        this.records[1].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInclTax ",
        this.records[1].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentNegative ",
        this.records[1].getAdjustmentNegative(),
        testResult.getAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        this.records[1].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        this.records[1].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[1].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustment ",
        this.records[1].getBaseAdjustment(),
        testResult.getBaseAdjustment());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ",
        this.records[1].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        this.records[1].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", this.records[1].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals adjustment ", this.records[1].getAdjustment(), testResult.getAdjustment());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        this.records[1].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentPositive ",
        this.records[1].getBaseAdjustmentPositive(),
        testResult.getBaseAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        this.records[1].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxAmount ",
        this.records[1].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", this.records[1].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertTrue(
        "expect equals orderId ", this.records[1].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertTrue(
        "expect equals emailSent ", this.records[1].getEmailSent() == testResult.getEmailSent());
    org.junit.Assert.assertTrue(
        "expect equals sendEmail ", this.records[1].getSendEmail() == testResult.getSendEmail());
    org.junit.Assert.assertTrue(
        "expect equals creditmemoStatus ",
        this.records[1].getCreditmemoStatus() == testResult.getCreditmemoStatus());
    org.junit.Assert.assertTrue(
        "expect equals state ", this.records[1].getState() == testResult.getState());
    org.junit.Assert.assertTrue(
        "expect equals shippingAddressId ",
        this.records[1].getShippingAddressId() == testResult.getShippingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals billingAddressId ",
        this.records[1].getBillingAddressId() == testResult.getBillingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals invoiceId ", this.records[1].getInvoiceId() == testResult.getInvoiceId());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[1].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals orderCurrencyCode ",
        this.records[1].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[1].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[1].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals transactionId ",
        this.records[1].getTransactionId(),
        testResult.getTransactionId());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[1].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[1].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        this.records[1].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        this.records[1].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    org.junit.Assert.assertEquals(
        "expect equals shippingInclTax ",
        this.records[1].getShippingInclTax(),
        testResult.getShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInclTax ",
        this.records[1].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals discountDescription ",
        this.records[1].getDiscountDescription(),
        testResult.getDiscountDescription());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ",
        this.records[1].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        this.records[1].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
  }
}
