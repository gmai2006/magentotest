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

import com.magento.test.entity.Catalogrule;

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

public class CatalogruleServiceTest {
  private static DefaultCatalogruleService serviceMock;
  private static Catalogrule[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCatalogruleService.class);
    String inputFile = "Catalogrule.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Catalogrule[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getRuleId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    Catalogrule testResult = serviceMock.find(records[0].getRuleId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals description ", records[0].getDescription(), testResult.getDescription());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals conditionsSerialized ",
        records[0].getConditionsSerialized(),
        testResult.getConditionsSerialized());
    org.junit.Assert.assertEquals(
        "expect equals actionsSerialized ",
        records[0].getActionsSerialized(),
        testResult.getActionsSerialized());
    org.junit.Assert.assertTrue(
        "expect equals stopRulesProcessing ",
        records[0].getStopRulesProcessing() == testResult.getStopRulesProcessing());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
    org.junit.Assert.assertEquals(
        "expect equals simpleAction ", records[0].getSimpleAction(), testResult.getSimpleAction());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
  }
}
