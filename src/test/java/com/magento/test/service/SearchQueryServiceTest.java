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

import com.magento.test.entity.SearchQuery;
import com.magento.test.entity.SearchQueryId;

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

public class SearchQueryServiceTest {
  private static DefaultSearchQueryService serviceMock;
  private static SearchQuery[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSearchQueryService.class);
    String inputFile = "SearchQuery.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SearchQuery[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SearchQueryId id =
        new SearchQueryId(
            records[0].getStoreId(), records[0].getQueryId(), records[0].getQueryText());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SearchQueryId id =
        new SearchQueryId(
            records[0].getStoreId(), records[0].getQueryId(), records[0].getQueryText());
    SearchQuery testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals numResults ", records[0].getNumResults() == testResult.getNumResults());
    org.junit.Assert.assertTrue(
        "expect equals popularity ", records[0].getPopularity() == testResult.getPopularity());
    org.junit.Assert.assertEquals(
        "expect equals redirect ", records[0].getRedirect(), testResult.getRedirect());
    org.junit.Assert.assertTrue(
        "expect equals displayInTerms ",
        records[0].getDisplayInTerms() == testResult.getDisplayInTerms());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals isProcessed ", records[0].getIsProcessed() == testResult.getIsProcessed());
  }
}
