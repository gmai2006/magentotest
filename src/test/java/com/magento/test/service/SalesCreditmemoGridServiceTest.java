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
package com.magento.test.service;

import com.magento.test.entity.SalesCreditmemoGrid;
import com.magento.test.entity.SalesCreditmemoGridId;

import com.magento.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesCreditmemoGridServiceTest {
  private static DefaultSalesCreditmemoGridService serviceMock;
  private static SalesCreditmemoGrid[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesCreditmemoGridService.class);
    String inputFile = "SalesCreditmemoGrid.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesCreditmemoGrid[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SalesCreditmemoGridId id =
        new SalesCreditmemoGridId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SalesCreditmemoGridId id =
        new SalesCreditmemoGridId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    SalesCreditmemoGrid testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertEquals(
        "expect equals orderIncrementId ",
        records[0].getOrderIncrementId(),
        testResult.getOrderIncrementId());
    org.junit.Assert.assertEquals(
        "expect equals billingName ", records[0].getBillingName(), testResult.getBillingName());
    org.junit.Assert.assertTrue(
        "expect equals state ", records[0].getState() == testResult.getState());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals orderStatus ", records[0].getOrderStatus(), testResult.getOrderStatus());
    org.junit.Assert.assertEquals(
        "expect equals billingAddress ",
        records[0].getBillingAddress(),
        testResult.getBillingAddress());
    org.junit.Assert.assertEquals(
        "expect equals shippingAddress ",
        records[0].getShippingAddress(),
        testResult.getShippingAddress());
    org.junit.Assert.assertEquals(
        "expect equals customerName ", records[0].getCustomerName(), testResult.getCustomerName());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        records[0].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertEquals(
        "expect equals paymentMethod ",
        records[0].getPaymentMethod(),
        testResult.getPaymentMethod());
    org.junit.Assert.assertEquals(
        "expect equals shippingInformation ",
        records[0].getShippingInformation(),
        testResult.getShippingInformation());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", records[0].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals shippingAndHandling ",
        records[0].getShippingAndHandling(),
        testResult.getShippingAndHandling());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentPositive ",
        records[0].getAdjustmentPositive(),
        testResult.getAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentNegative ",
        records[0].getAdjustmentNegative(),
        testResult.getAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals orderBaseGrandTotal ",
        records[0].getOrderBaseGrandTotal(),
        testResult.getOrderBaseGrandTotal());
  }
}
