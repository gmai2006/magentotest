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

import com.magento.test.entity.SalesShipment;
import com.magento.test.entity.SalesShipmentId;

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

public class SalesShipmentServiceTest {
  private static DefaultSalesShipmentService serviceMock;
  private static SalesShipment[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesShipmentService.class);
    String inputFile = "SalesShipment.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesShipment[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SalesShipmentId id =
        new SalesShipmentId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SalesShipmentId id =
        new SalesShipmentId(
            records[0].getStoreId(), records[0].getIncrementId(), records[0].getEntityId());
    SalesShipment testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals totalWeight ", records[0].getTotalWeight(), testResult.getTotalWeight());
    org.junit.Assert.assertEquals(
        "expect equals totalQty ", records[0].getTotalQty(), testResult.getTotalQty());
    org.junit.Assert.assertTrue(
        "expect equals emailSent ", records[0].getEmailSent() == testResult.getEmailSent());
    org.junit.Assert.assertTrue(
        "expect equals sendEmail ", records[0].getSendEmail() == testResult.getSendEmail());
    org.junit.Assert.assertTrue(
        "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", records[0].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertTrue(
        "expect equals shippingAddressId ",
        records[0].getShippingAddressId() == testResult.getShippingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals billingAddressId ",
        records[0].getBillingAddressId() == testResult.getBillingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals shipmentStatus ",
        records[0].getShipmentStatus() == testResult.getShipmentStatus());
    org.junit.Assert.assertEquals(
        "expect equals packages ", records[0].getPackages(), testResult.getPackages());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ", records[0].getCustomerNote(), testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        records[0].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
  }
}
