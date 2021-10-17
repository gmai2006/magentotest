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

import com.magento.test.entity.CustomerEavAttribute;

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

public class CustomerEavAttributeServiceTest {
  private static DefaultCustomerEavAttributeService serviceMock;
  private static CustomerEavAttribute[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCustomerEavAttributeService.class);
    String inputFile = "CustomerEavAttribute.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerEavAttribute[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getAttributeId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CustomerEavAttribute testResult = serviceMock.find(records[0].getAttributeId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals isVisible ", records[0].getIsVisible() == testResult.getIsVisible());
    org.junit.Assert.assertEquals(
        "expect equals inputFilter ", records[0].getInputFilter(), testResult.getInputFilter());
    org.junit.Assert.assertTrue(
        "expect equals multilineCount ",
        records[0].getMultilineCount() == testResult.getMultilineCount());
    org.junit.Assert.assertEquals(
        "expect equals validateRules ",
        records[0].getValidateRules(),
        testResult.getValidateRules());
    org.junit.Assert.assertTrue(
        "expect equals isSystem ", records[0].getIsSystem() == testResult.getIsSystem());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
    org.junit.Assert.assertEquals(
        "expect equals dataModel ", records[0].getDataModel(), testResult.getDataModel());
    org.junit.Assert.assertTrue(
        "expect equals isUsedInGrid ",
        records[0].getIsUsedInGrid() == testResult.getIsUsedInGrid());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleInGrid ",
        records[0].getIsVisibleInGrid() == testResult.getIsVisibleInGrid());
    org.junit.Assert.assertTrue(
        "expect equals isFilterableInGrid ",
        records[0].getIsFilterableInGrid() == testResult.getIsFilterableInGrid());
    org.junit.Assert.assertTrue(
        "expect equals isSearchableInGrid ",
        records[0].getIsSearchableInGrid() == testResult.getIsSearchableInGrid());
  }
}
