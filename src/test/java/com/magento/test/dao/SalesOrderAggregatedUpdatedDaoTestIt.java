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
import com.magento.test.entity.SalesOrderAggregatedUpdated;
import com.magento.test.entity.SalesOrderAggregatedUpdatedId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesOrderAggregatedUpdatedDaoTestIt {
  static final String inputFile = "SalesOrderAggregatedUpdated.json";
  static SalesOrderAggregatedUpdatedDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderAggregatedUpdated[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesOrderAggregatedUpdatedDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderAggregatedUpdated[].class);
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
    final SalesOrderAggregatedUpdatedId id =
        new SalesOrderAggregatedUpdatedId(
            this.records[1].getStoreId(),
            this.records[1].getOrderStatus(),
            this.records[1].getPeriod(),
            this.records[1].getId());
    SalesOrderAggregatedUpdated testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals ordersCount ",
        this.records[1].getOrdersCount() == testResult.getOrdersCount());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyOrdered ",
        this.records[1].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyInvoiced ",
        this.records[1].getTotalQtyInvoiced(),
        testResult.getTotalQtyInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals totalIncomeAmount ",
        this.records[1].getTotalIncomeAmount(),
        testResult.getTotalIncomeAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalRevenueAmount ",
        this.records[1].getTotalRevenueAmount(),
        testResult.getTotalRevenueAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalProfitAmount ",
        this.records[1].getTotalProfitAmount(),
        testResult.getTotalProfitAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalInvoicedAmount ",
        this.records[1].getTotalInvoicedAmount(),
        testResult.getTotalInvoicedAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalCanceledAmount ",
        this.records[1].getTotalCanceledAmount(),
        testResult.getTotalCanceledAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalPaidAmount ",
        this.records[1].getTotalPaidAmount(),
        testResult.getTotalPaidAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalRefundedAmount ",
        this.records[1].getTotalRefundedAmount(),
        testResult.getTotalRefundedAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalTaxAmount ",
        this.records[1].getTotalTaxAmount(),
        testResult.getTotalTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalTaxAmountActual ",
        this.records[1].getTotalTaxAmountActual(),
        testResult.getTotalTaxAmountActual());
    org.junit.Assert.assertEquals(
        "expect equals totalShippingAmount ",
        this.records[1].getTotalShippingAmount(),
        testResult.getTotalShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalShippingAmountActual ",
        this.records[1].getTotalShippingAmountActual(),
        testResult.getTotalShippingAmountActual());
    org.junit.Assert.assertEquals(
        "expect equals totalDiscountAmount ",
        this.records[1].getTotalDiscountAmount(),
        testResult.getTotalDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalDiscountAmountActual ",
        this.records[1].getTotalDiscountAmountActual(),
        testResult.getTotalDiscountAmountActual());
  }
}
