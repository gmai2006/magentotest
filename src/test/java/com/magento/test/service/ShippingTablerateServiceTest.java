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

import com.magento.test.entity.ShippingTablerate;
import com.magento.test.entity.ShippingTablerateId;

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

public class ShippingTablerateServiceTest {
  private static DefaultShippingTablerateService serviceMock;
  private static ShippingTablerate[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultShippingTablerateService.class);
    String inputFile = "ShippingTablerate.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, ShippingTablerate[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final ShippingTablerateId id =
        new ShippingTablerateId(
            records[0].getDestZip(),
            records[0].getConditionValue(),
            records[0].getPk(),
            records[0].getDestCountryId(),
            records[0].getDestRegionId(),
            records[0].getConditionName(),
            records[0].getWebsiteId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final ShippingTablerateId id =
        new ShippingTablerateId(
            records[0].getDestZip(),
            records[0].getConditionValue(),
            records[0].getPk(),
            records[0].getDestCountryId(),
            records[0].getDestRegionId(),
            records[0].getConditionName(),
            records[0].getWebsiteId());
    ShippingTablerate testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals price ", records[0].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals cost ", records[0].getCost(), testResult.getCost());
  }
}
