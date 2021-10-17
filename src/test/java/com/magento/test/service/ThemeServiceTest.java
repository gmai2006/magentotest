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

import com.magento.test.entity.Theme;

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

public class ThemeServiceTest {
  private static DefaultThemeService serviceMock;
  private static Theme[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultThemeService.class);
    String inputFile = "Theme.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, Theme[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getThemeId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    Theme testResult = serviceMock.find(records[0].getThemeId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentId ", records[0].getParentId() == testResult.getParentId());
    org.junit.Assert.assertEquals(
        "expect equals themePath ", records[0].getThemePath(), testResult.getThemePath());
    org.junit.Assert.assertEquals(
        "expect equals themeTitle ", records[0].getThemeTitle(), testResult.getThemeTitle());
    org.junit.Assert.assertEquals(
        "expect equals previewImage ", records[0].getPreviewImage(), testResult.getPreviewImage());
    org.junit.Assert.assertTrue(
        "expect equals isFeatured ", records[0].getIsFeatured() == testResult.getIsFeatured());
    org.junit.Assert.assertEquals(
        "expect equals area ", records[0].getArea(), testResult.getArea());
    org.junit.Assert.assertTrue(
        "expect equals type ", records[0].getType() == testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals code ", records[0].getCode(), testResult.getCode());
  }
}
