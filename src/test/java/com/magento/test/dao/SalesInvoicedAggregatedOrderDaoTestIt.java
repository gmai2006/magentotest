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
import com.magento.test.entity.SalesInvoicedAggregatedOrder;
import com.magento.test.entity.SalesInvoicedAggregatedOrderId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesInvoicedAggregatedOrderDaoTestIt {
  static final String inputFile = "SalesInvoicedAggregatedOrder.json";
  static SalesInvoicedAggregatedOrderDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesInvoicedAggregatedOrder[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesInvoicedAggregatedOrderDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesInvoicedAggregatedOrder[].class);
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
    final SalesInvoicedAggregatedOrderId id =
        new SalesInvoicedAggregatedOrderId(
            this.records[1].getStoreId(),
            this.records[1].getOrderStatus(),
            this.records[1].getPeriod(),
            this.records[1].getId());
    SalesInvoicedAggregatedOrder testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals ordersCount ",
        this.records[1].getOrdersCount() == testResult.getOrdersCount());
    org.junit.Assert.assertEquals(
        "expect equals ordersInvoiced ",
        this.records[1].getOrdersInvoiced(),
        testResult.getOrdersInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals invoiced ", this.records[1].getInvoiced(), testResult.getInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals invoicedCaptured ",
        this.records[1].getInvoicedCaptured(),
        testResult.getInvoicedCaptured());
    org.junit.Assert.assertEquals(
        "expect equals invoicedNotCaptured ",
        this.records[1].getInvoicedNotCaptured(),
        testResult.getInvoicedNotCaptured());
  }
}
