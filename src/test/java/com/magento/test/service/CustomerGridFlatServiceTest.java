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

import com.magento.test.entity.CustomerGridFlat;

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

public class CustomerGridFlatServiceTest {
  private static DefaultCustomerGridFlatService serviceMock;
  private static CustomerGridFlat[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCustomerGridFlatService.class);
    String inputFile = "CustomerGridFlat.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerGridFlat[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CustomerGridFlat testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals email ", records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertTrue(
        "expect equals groupId ", records[0].getGroupId() == testResult.getGroupId());
    org.junit.Assert.assertTrue(
        "expect equals websiteId ", records[0].getWebsiteId() == testResult.getWebsiteId());
    org.junit.Assert.assertEquals(
        "expect equals confirmation ", records[0].getConfirmation(), testResult.getConfirmation());
    org.junit.Assert.assertEquals(
        "expect equals createdIn ", records[0].getCreatedIn(), testResult.getCreatedIn());
    org.junit.Assert.assertTrue(
        "expect equals gender ", records[0].getGender() == testResult.getGender());
    org.junit.Assert.assertEquals(
        "expect equals taxvat ", records[0].getTaxvat(), testResult.getTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals shippingFull ", records[0].getShippingFull(), testResult.getShippingFull());
    org.junit.Assert.assertEquals(
        "expect equals billingFull ", records[0].getBillingFull(), testResult.getBillingFull());
    org.junit.Assert.assertEquals(
        "expect equals billingFirstname ",
        records[0].getBillingFirstname(),
        testResult.getBillingFirstname());
    org.junit.Assert.assertEquals(
        "expect equals billingLastname ",
        records[0].getBillingLastname(),
        testResult.getBillingLastname());
    org.junit.Assert.assertEquals(
        "expect equals billingTelephone ",
        records[0].getBillingTelephone(),
        testResult.getBillingTelephone());
    org.junit.Assert.assertEquals(
        "expect equals billingPostcode ",
        records[0].getBillingPostcode(),
        testResult.getBillingPostcode());
    org.junit.Assert.assertEquals(
        "expect equals billingCountryId ",
        records[0].getBillingCountryId(),
        testResult.getBillingCountryId());
    org.junit.Assert.assertEquals(
        "expect equals billingRegion ",
        records[0].getBillingRegion(),
        testResult.getBillingRegion());
    org.junit.Assert.assertEquals(
        "expect equals billingStreet ",
        records[0].getBillingStreet(),
        testResult.getBillingStreet());
    org.junit.Assert.assertEquals(
        "expect equals billingCity ", records[0].getBillingCity(), testResult.getBillingCity());
    org.junit.Assert.assertEquals(
        "expect equals billingFax ", records[0].getBillingFax(), testResult.getBillingFax());
    org.junit.Assert.assertEquals(
        "expect equals billingVatId ", records[0].getBillingVatId(), testResult.getBillingVatId());
    org.junit.Assert.assertEquals(
        "expect equals billingCompany ",
        records[0].getBillingCompany(),
        testResult.getBillingCompany());
  }
}
