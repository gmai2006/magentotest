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
import com.magento.test.entity.SalesShipmentGrid;
import com.magento.test.entity.SalesShipmentGridId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesShipmentGridDaoTestIt {
  static final String inputFile = "SalesShipmentGrid.json";
  static SalesShipmentGridDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesShipmentGrid[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesShipmentGridDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesShipmentGrid[].class);
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
    final SalesShipmentGridId id =
        new SalesShipmentGridId(
            this.records[1].getStoreId(),
            this.records[1].getIncrementId(),
            this.records[1].getEntityId());
    SalesShipmentGrid testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals orderIncrementId ",
        this.records[1].getOrderIncrementId(),
        testResult.getOrderIncrementId());
    org.junit.Assert.assertTrue(
        "expect equals orderId ", this.records[1].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertEquals(
        "expect equals customerName ",
        this.records[1].getCustomerName(),
        testResult.getCustomerName());
    org.junit.Assert.assertEquals(
        "expect equals totalQty ", this.records[1].getTotalQty(), testResult.getTotalQty());
    org.junit.Assert.assertTrue(
        "expect equals shipmentStatus ",
        this.records[1].getShipmentStatus() == testResult.getShipmentStatus());
    org.junit.Assert.assertEquals(
        "expect equals orderStatus ",
        this.records[1].getOrderStatus(),
        testResult.getOrderStatus());
    org.junit.Assert.assertEquals(
        "expect equals billingAddress ",
        this.records[1].getBillingAddress(),
        testResult.getBillingAddress());
    org.junit.Assert.assertEquals(
        "expect equals shippingAddress ",
        this.records[1].getShippingAddress(),
        testResult.getShippingAddress());
    org.junit.Assert.assertEquals(
        "expect equals billingName ",
        this.records[1].getBillingName(),
        testResult.getBillingName());
    org.junit.Assert.assertEquals(
        "expect equals shippingName ",
        this.records[1].getShippingName(),
        testResult.getShippingName());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        this.records[1].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        this.records[1].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertEquals(
        "expect equals paymentMethod ",
        this.records[1].getPaymentMethod(),
        testResult.getPaymentMethod());
    org.junit.Assert.assertEquals(
        "expect equals shippingInformation ",
        this.records[1].getShippingInformation(),
        testResult.getShippingInformation());
  }
}
