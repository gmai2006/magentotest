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

import com.magento.test.entity.MspTfaUserConfig;

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

public class MspTfaUserConfigServiceTest {
  private static DefaultMspTfaUserConfigService serviceMock;
  private static MspTfaUserConfig[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMspTfaUserConfigService.class);
    String inputFile = "MspTfaUserConfig.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MspTfaUserConfig[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getMspTfaUserConfigId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MspTfaUserConfig testResult = serviceMock.find(records[0].getMspTfaUserConfigId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals userId ", records[0].getUserId() == testResult.getUserId());
    org.junit.Assert.assertEquals(
        "expect equals encodedProviders ",
        records[0].getEncodedProviders(),
        testResult.getEncodedProviders());
    org.junit.Assert.assertEquals(
        "expect equals encodedConfig ",
        records[0].getEncodedConfig(),
        testResult.getEncodedConfig());
    org.junit.Assert.assertEquals(
        "expect equals defaultProvider ",
        records[0].getDefaultProvider(),
        testResult.getDefaultProvider());
  }
}
