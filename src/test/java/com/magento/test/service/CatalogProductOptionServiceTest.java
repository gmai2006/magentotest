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

import com.magento.test.entity.CatalogProductOption;

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

public class CatalogProductOptionServiceTest {
  private static DefaultCatalogProductOptionService serviceMock;
  private static CatalogProductOption[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCatalogProductOptionService.class);
    String inputFile = "CatalogProductOption.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CatalogProductOption[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getOptionId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CatalogProductOption testResult = serviceMock.find(records[0].getOptionId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals productId ", records[0].getProductId() == testResult.getProductId());
    org.junit.Assert.assertEquals(
        "expect equals type ", records[0].getType(), testResult.getType());
    org.junit.Assert.assertTrue(
        "expect equals isRequire ", records[0].getIsRequire() == testResult.getIsRequire());
    org.junit.Assert.assertEquals("expect equals sku ", records[0].getSku(), testResult.getSku());
    org.junit.Assert.assertTrue(
        "expect equals maxCharacters ",
        records[0].getMaxCharacters() == testResult.getMaxCharacters());
    org.junit.Assert.assertEquals(
        "expect equals fileExtension ",
        records[0].getFileExtension(),
        testResult.getFileExtension());
    org.junit.Assert.assertTrue(
        "expect equals imageSizex ", records[0].getImageSizex() == testResult.getImageSizex());
    org.junit.Assert.assertTrue(
        "expect equals imageSizey ", records[0].getImageSizey() == testResult.getImageSizey());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
  }
}
