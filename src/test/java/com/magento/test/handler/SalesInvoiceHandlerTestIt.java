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
import com.magento.test.entity.SalesInvoice;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesInvoiceDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.SalesInvoiceId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesInvoiceHandlerTestIt {
  static final String inputFile = "SalesInvoice.json";
  static SalesInvoiceHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesInvoice[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesInvoiceHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesInvoice[].class);
    assertEquals("match count", count, records.length);
    final SalesInvoiceId id =
        new SalesInvoiceId(
            this.records[0].getStoreId(),
            this.records[0].getIncrementId(),
            this.records[0].getEntityId());
    SalesInvoice testResult = jpa.find(SalesInvoice.class, id);
    assertEquals(
        "expect equals baseGrandTotal ",
        this.records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    assertEquals(
        "expect equals shippingTaxAmount ",
        this.records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    assertEquals(
        "expect equals taxAmount ", this.records[0].getTaxAmount(), testResult.getTaxAmount());
    assertEquals(
        "expect equals baseTaxAmount ",
        this.records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    assertEquals(
        "expect equals storeToOrderRate ",
        this.records[0].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    assertEquals(
        "expect equals baseShippingTaxAmount ",
        this.records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    assertEquals(
        "expect equals baseToOrderRate ",
        this.records[0].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    assertEquals(
        "expect equals grandTotal ", this.records[0].getGrandTotal(), testResult.getGrandTotal());
    assertEquals(
        "expect equals shippingAmount ",
        this.records[0].getShippingAmount(),
        testResult.getShippingAmount());
    assertEquals(
        "expect equals subtotalInclTax ",
        this.records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    assertEquals(
        "expect equals baseSubtotalInclTax ",
        this.records[0].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    assertEquals(
        "expect equals storeToBaseRate ",
        this.records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    assertEquals(
        "expect equals baseShippingAmount ",
        this.records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    assertEquals(
        "expect equals totalQty ", this.records[0].getTotalQty(), testResult.getTotalQty());
    assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    assertEquals(
        "expect equals subtotal ", this.records[0].getSubtotal(), testResult.getSubtotal());
    assertEquals(
        "expect equals baseSubtotal ",
        this.records[0].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    assertEquals(
        "expect equals discountAmount ",
        this.records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals billingAddressId ",
        this.records[0].getBillingAddressId(),
        testResult.getBillingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals isUsedForRefund ",
        this.records[0].getIsUsedForRefund(),
        testResult.getIsUsedForRefund());
    org.junit.Assert.assertEquals(
        "expect equals orderId ", this.records[0].getOrderId(), testResult.getOrderId());
    org.junit.Assert.assertEquals(
        "expect equals emailSent ", this.records[0].getEmailSent(), testResult.getEmailSent());
    org.junit.Assert.assertEquals(
        "expect equals sendEmail ", this.records[0].getSendEmail(), testResult.getSendEmail());
    org.junit.Assert.assertEquals(
        "expect equals canVoidFlag ",
        this.records[0].getCanVoidFlag(),
        testResult.getCanVoidFlag());
    org.junit.Assert.assertEquals(
        "expect equals state ", this.records[0].getState(), testResult.getState());
    org.junit.Assert.assertEquals(
        "expect equals shippingAddressId ",
        this.records[0].getShippingAddressId(),
        testResult.getShippingAddressId());
    assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    assertEquals(
        "expect equals transactionId ",
        this.records[0].getTransactionId(),
        testResult.getTransactionId());
    assertEquals(
        "expect equals orderCurrencyCode ",
        this.records[0].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        this.records[0].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        this.records[0].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    assertEquals(
        "expect equals shippingInclTax ",
        this.records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    assertEquals(
        "expect equals baseShippingInclTax ",
        this.records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    assertEquals(
        "expect equals baseTotalRefunded ",
        this.records[0].getBaseTotalRefunded(),
        testResult.getBaseTotalRefunded());
    assertEquals(
        "expect equals discountDescription ",
        this.records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    assertEquals(
        "expect equals customerNote ",
        this.records[0].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertEquals(
        "expect equals customerNoteNotify ",
        this.records[0].getCustomerNoteNotify(),
        testResult.getCustomerNoteNotify());

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
