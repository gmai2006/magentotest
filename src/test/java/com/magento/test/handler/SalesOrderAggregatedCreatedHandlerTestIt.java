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
import com.magento.test.entity.SalesOrderAggregatedCreated;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesOrderAggregatedCreatedDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.SalesOrderAggregatedCreatedId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesOrderAggregatedCreatedHandlerTestIt {
  static final String inputFile = "SalesOrderAggregatedCreated.json";
  static SalesOrderAggregatedCreatedHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderAggregatedCreated[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesOrderAggregatedCreatedHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesOrderAggregatedCreated[].class);
    assertEquals("match count", count, records.length);
    final SalesOrderAggregatedCreatedId id =
        new SalesOrderAggregatedCreatedId(
            this.records[0].getStoreId(),
            this.records[0].getOrderStatus(),
            this.records[0].getPeriod(),
            this.records[0].getId());
    SalesOrderAggregatedCreated testResult = jpa.find(SalesOrderAggregatedCreated.class, id);
    org.junit.Assert.assertEquals(
        "expect equals ordersCount ",
        this.records[0].getOrdersCount(),
        testResult.getOrdersCount());
    assertEquals(
        "expect equals totalQtyOrdered ",
        this.records[0].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    assertEquals(
        "expect equals totalQtyInvoiced ",
        this.records[0].getTotalQtyInvoiced(),
        testResult.getTotalQtyInvoiced());
    assertEquals(
        "expect equals totalIncomeAmount ",
        this.records[0].getTotalIncomeAmount(),
        testResult.getTotalIncomeAmount());
    assertEquals(
        "expect equals totalRevenueAmount ",
        this.records[0].getTotalRevenueAmount(),
        testResult.getTotalRevenueAmount());
    assertEquals(
        "expect equals totalProfitAmount ",
        this.records[0].getTotalProfitAmount(),
        testResult.getTotalProfitAmount());
    assertEquals(
        "expect equals totalInvoicedAmount ",
        this.records[0].getTotalInvoicedAmount(),
        testResult.getTotalInvoicedAmount());
    assertEquals(
        "expect equals totalCanceledAmount ",
        this.records[0].getTotalCanceledAmount(),
        testResult.getTotalCanceledAmount());
    assertEquals(
        "expect equals totalPaidAmount ",
        this.records[0].getTotalPaidAmount(),
        testResult.getTotalPaidAmount());
    assertEquals(
        "expect equals totalRefundedAmount ",
        this.records[0].getTotalRefundedAmount(),
        testResult.getTotalRefundedAmount());
    assertEquals(
        "expect equals totalTaxAmount ",
        this.records[0].getTotalTaxAmount(),
        testResult.getTotalTaxAmount());
    assertEquals(
        "expect equals totalTaxAmountActual ",
        this.records[0].getTotalTaxAmountActual(),
        testResult.getTotalTaxAmountActual());
    assertEquals(
        "expect equals totalShippingAmount ",
        this.records[0].getTotalShippingAmount(),
        testResult.getTotalShippingAmount());
    assertEquals(
        "expect equals totalShippingAmountActual ",
        this.records[0].getTotalShippingAmountActual(),
        testResult.getTotalShippingAmountActual());
    assertEquals(
        "expect equals totalDiscountAmount ",
        this.records[0].getTotalDiscountAmount(),
        testResult.getTotalDiscountAmount());
    assertEquals(
        "expect equals totalDiscountAmountActual ",
        this.records[0].getTotalDiscountAmountActual(),
        testResult.getTotalDiscountAmountActual());

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
