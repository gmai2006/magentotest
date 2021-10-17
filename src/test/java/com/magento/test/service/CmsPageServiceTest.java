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

import com.magento.test.entity.CmsPage;

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

public class CmsPageServiceTest {
  private static DefaultCmsPageService serviceMock;
  private static CmsPage[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCmsPageService.class);
    String inputFile = "CmsPage.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CmsPage[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getPageId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CmsPage testResult = serviceMock.find(records[0].getPageId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals title ", records[0].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals pageLayout ", records[0].getPageLayout(), testResult.getPageLayout());
    org.junit.Assert.assertEquals(
        "expect equals metaKeywords ", records[0].getMetaKeywords(), testResult.getMetaKeywords());
    org.junit.Assert.assertEquals(
        "expect equals metaDescription ",
        records[0].getMetaDescription(),
        testResult.getMetaDescription());
    org.junit.Assert.assertEquals(
        "expect equals identifier ", records[0].getIdentifier(), testResult.getIdentifier());
    org.junit.Assert.assertEquals(
        "expect equals contentHeading ",
        records[0].getContentHeading(),
        testResult.getContentHeading());
    org.junit.Assert.assertEquals(
        "expect equals content ", records[0].getContent(), testResult.getContent());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
    org.junit.Assert.assertEquals(
        "expect equals layoutUpdateXml ",
        records[0].getLayoutUpdateXml(),
        testResult.getLayoutUpdateXml());
    org.junit.Assert.assertEquals(
        "expect equals customTheme ", records[0].getCustomTheme(), testResult.getCustomTheme());
    org.junit.Assert.assertEquals(
        "expect equals customRootTemplate ",
        records[0].getCustomRootTemplate(),
        testResult.getCustomRootTemplate());
    org.junit.Assert.assertEquals(
        "expect equals customLayoutUpdateXml ",
        records[0].getCustomLayoutUpdateXml(),
        testResult.getCustomLayoutUpdateXml());
    org.junit.Assert.assertEquals(
        "expect equals metaTitle ", records[0].getMetaTitle(), testResult.getMetaTitle());
  }
}
