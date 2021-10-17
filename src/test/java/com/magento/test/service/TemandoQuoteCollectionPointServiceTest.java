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

import com.magento.test.entity.TemandoQuoteCollectionPoint;

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

public class TemandoQuoteCollectionPointServiceTest {
  private static DefaultTemandoQuoteCollectionPointService serviceMock;
  private static TemandoQuoteCollectionPoint[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultTemandoQuoteCollectionPointService.class);
    String inputFile = "TemandoQuoteCollectionPoint.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, TemandoQuoteCollectionPoint[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    TemandoQuoteCollectionPoint testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals recipientAddressId ",
        records[0].getRecipientAddressId() == testResult.getRecipientAddressId());
    org.junit.Assert.assertEquals(
        "expect equals collectionPointId ",
        records[0].getCollectionPointId(),
        testResult.getCollectionPointId());
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals country ", records[0].getCountry(), testResult.getCountry());
    org.junit.Assert.assertEquals(
        "expect equals region ", records[0].getRegion(), testResult.getRegion());
    org.junit.Assert.assertEquals(
        "expect equals postcode ", records[0].getPostcode(), testResult.getPostcode());
    org.junit.Assert.assertEquals(
        "expect equals city ", records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals street ", records[0].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals openingHours ", records[0].getOpeningHours(), testResult.getOpeningHours());
    org.junit.Assert.assertEquals(
        "expect equals shippingExperiences ",
        records[0].getShippingExperiences(),
        testResult.getShippingExperiences());
    org.junit.Assert.assertTrue(
        "expect equals selected ", records[0].getSelected() == testResult.getSelected());
    org.junit.Assert.assertTrue(
        "expect equals distance ", records[0].getDistance() == testResult.getDistance());
  }
}
