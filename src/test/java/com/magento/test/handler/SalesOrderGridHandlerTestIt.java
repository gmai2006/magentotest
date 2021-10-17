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
import com.magento.test.entity.SalesOrderGrid;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesOrderGridDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.SalesOrderGridId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesOrderGridHandlerTestIt {
  static final String inputFile = "SalesOrderGrid.json";
  static SalesOrderGridHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderGrid[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesOrderGridHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesOrderGrid[].class);
    assertEquals("match count", count, records.length);
    final SalesOrderGridId id =
        new SalesOrderGridId(
            this.records[0].getStoreId(),
            this.records[0].getIncrementId(),
            this.records[0].getEntityId());
    SalesOrderGrid testResult = jpa.find(SalesOrderGrid.class, id);
    assertEquals("expect equals status ", this.records[0].getStatus(), testResult.getStatus());
    assertEquals(
        "expect equals storeName ", this.records[0].getStoreName(), testResult.getStoreName());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    assertEquals(
        "expect equals baseGrandTotal ",
        this.records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    assertEquals(
        "expect equals baseTotalPaid ",
        this.records[0].getBaseTotalPaid(),
        testResult.getBaseTotalPaid());
    assertEquals(
        "expect equals grandTotal ", this.records[0].getGrandTotal(), testResult.getGrandTotal());
    assertEquals(
        "expect equals totalPaid ", this.records[0].getTotalPaid(), testResult.getTotalPaid());
    assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    assertEquals(
        "expect equals orderCurrencyCode ",
        this.records[0].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    assertEquals(
        "expect equals shippingName ",
        this.records[0].getShippingName(),
        testResult.getShippingName());
    assertEquals(
        "expect equals billingName ",
        this.records[0].getBillingName(),
        testResult.getBillingName());
    assertEquals(
        "expect equals billingAddress ",
        this.records[0].getBillingAddress(),
        testResult.getBillingAddress());
    assertEquals(
        "expect equals shippingAddress ",
        this.records[0].getShippingAddress(),
        testResult.getShippingAddress());
    assertEquals(
        "expect equals shippingInformation ",
        this.records[0].getShippingInformation(),
        testResult.getShippingInformation());
    assertEquals(
        "expect equals customerEmail ",
        this.records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    assertEquals(
        "expect equals customerGroup ",
        this.records[0].getCustomerGroup(),
        testResult.getCustomerGroup());
    assertEquals(
        "expect equals subtotal ", this.records[0].getSubtotal(), testResult.getSubtotal());
    assertEquals(
        "expect equals shippingAndHandling ",
        this.records[0].getShippingAndHandling(),
        testResult.getShippingAndHandling());
    assertEquals(
        "expect equals customerName ",
        this.records[0].getCustomerName(),
        testResult.getCustomerName());
    assertEquals(
        "expect equals paymentMethod ",
        this.records[0].getPaymentMethod(),
        testResult.getPaymentMethod());
    assertEquals(
        "expect equals totalRefunded ",
        this.records[0].getTotalRefunded(),
        testResult.getTotalRefunded());
    assertEquals(
        "expect equals signifydGuaranteeStatus ",
        this.records[0].getSignifydGuaranteeStatus(),
        testResult.getSignifydGuaranteeStatus());

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
