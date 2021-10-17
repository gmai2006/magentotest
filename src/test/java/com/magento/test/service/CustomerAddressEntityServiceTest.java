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

import com.magento.test.entity.CustomerAddressEntity;

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

public class CustomerAddressEntityServiceTest {
  private static DefaultCustomerAddressEntityService serviceMock;
  private static CustomerAddressEntity[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCustomerAddressEntityService.class);
    String inputFile = "CustomerAddressEntity.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerAddressEntity[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CustomerAddressEntity testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals incrementId ", records[0].getIncrementId(), testResult.getIncrementId());
    org.junit.Assert.assertTrue(
        "expect equals parentId ", records[0].getParentId() == testResult.getParentId());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals city ", records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals company ", records[0].getCompany(), testResult.getCompany());
    org.junit.Assert.assertEquals(
        "expect equals countryId ", records[0].getCountryId(), testResult.getCountryId());
    org.junit.Assert.assertEquals("expect equals fax ", records[0].getFax(), testResult.getFax());
    org.junit.Assert.assertEquals(
        "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals middlename ", records[0].getMiddlename(), testResult.getMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals postcode ", records[0].getPostcode(), testResult.getPostcode());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", records[0].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals region ", records[0].getRegion(), testResult.getRegion());
    org.junit.Assert.assertTrue(
        "expect equals regionId ", records[0].getRegionId() == testResult.getRegionId());
    org.junit.Assert.assertEquals(
        "expect equals street ", records[0].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", records[0].getSuffix(), testResult.getSuffix());
    org.junit.Assert.assertEquals(
        "expect equals telephone ", records[0].getTelephone(), testResult.getTelephone());
    org.junit.Assert.assertEquals(
        "expect equals vatId ", records[0].getVatId(), testResult.getVatId());
    org.junit.Assert.assertTrue(
        "expect equals vatIsValid ", records[0].getVatIsValid() == testResult.getVatIsValid());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestDate ",
        records[0].getVatRequestDate(),
        testResult.getVatRequestDate());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestId ", records[0].getVatRequestId(), testResult.getVatRequestId());
    org.junit.Assert.assertTrue(
        "expect equals vatRequestSuccess ",
        records[0].getVatRequestSuccess() == testResult.getVatRequestSuccess());
  }
}
