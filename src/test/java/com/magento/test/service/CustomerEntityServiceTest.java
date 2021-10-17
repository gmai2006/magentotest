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

import com.magento.test.entity.CustomerEntity;
import com.magento.test.entity.CustomerEntityId;

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

public class CustomerEntityServiceTest {
  private static DefaultCustomerEntityService serviceMock;
  private static CustomerEntity[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCustomerEntityService.class);
    String inputFile = "CustomerEntity.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerEntity[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final CustomerEntityId id =
        new CustomerEntityId(
            records[0].getEntityId(), records[0].getWebsiteId(), records[0].getEmail());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final CustomerEntityId id =
        new CustomerEntityId(
            records[0].getEntityId(), records[0].getWebsiteId(), records[0].getEmail());
    CustomerEntity testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals groupId ", records[0].getGroupId() == testResult.getGroupId());
    org.junit.Assert.assertEquals(
        "expect equals incrementId ", records[0].getIncrementId(), testResult.getIncrementId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals disableAutoGroupChange ",
        records[0].getDisableAutoGroupChange() == testResult.getDisableAutoGroupChange());
    org.junit.Assert.assertEquals(
        "expect equals createdIn ", records[0].getCreatedIn(), testResult.getCreatedIn());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", records[0].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals middlename ", records[0].getMiddlename(), testResult.getMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", records[0].getSuffix(), testResult.getSuffix());
    org.junit.Assert.assertEquals(
        "expect equals passwordHash ", records[0].getPasswordHash(), testResult.getPasswordHash());
    org.junit.Assert.assertEquals(
        "expect equals rpToken ", records[0].getRpToken(), testResult.getRpToken());
    org.junit.Assert.assertTrue(
        "expect equals defaultBilling ",
        records[0].getDefaultBilling() == testResult.getDefaultBilling());
    org.junit.Assert.assertTrue(
        "expect equals defaultShipping ",
        records[0].getDefaultShipping() == testResult.getDefaultShipping());
    org.junit.Assert.assertEquals(
        "expect equals taxvat ", records[0].getTaxvat(), testResult.getTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals confirmation ", records[0].getConfirmation(), testResult.getConfirmation());
    org.junit.Assert.assertTrue(
        "expect equals gender ", records[0].getGender() == testResult.getGender());
    org.junit.Assert.assertTrue(
        "expect equals failuresNum ", records[0].getFailuresNum() == testResult.getFailuresNum());
  }
}
