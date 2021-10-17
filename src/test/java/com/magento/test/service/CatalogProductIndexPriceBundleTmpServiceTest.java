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

import com.magento.test.entity.CatalogProductIndexPriceBundleTmp;
import com.magento.test.entity.CatalogProductIndexPriceBundleTmpId;

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

public class CatalogProductIndexPriceBundleTmpServiceTest {
  private static DefaultCatalogProductIndexPriceBundleTmpService serviceMock;
  private static CatalogProductIndexPriceBundleTmp[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCatalogProductIndexPriceBundleTmpService.class);
    String inputFile = "CatalogProductIndexPriceBundleTmp.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CatalogProductIndexPriceBundleTmp[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final CatalogProductIndexPriceBundleTmpId id =
        new CatalogProductIndexPriceBundleTmpId(
            records[0].getEntityId(), records[0].getCustomerGroupId(), records[0].getWebsiteId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final CatalogProductIndexPriceBundleTmpId id =
        new CatalogProductIndexPriceBundleTmpId(
            records[0].getEntityId(), records[0].getCustomerGroupId(), records[0].getWebsiteId());
    CatalogProductIndexPriceBundleTmp testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals taxClassId ", records[0].getTaxClassId() == testResult.getTaxClassId());
    org.junit.Assert.assertTrue(
        "expect equals priceType ", records[0].getPriceType() == testResult.getPriceType());
    org.junit.Assert.assertEquals(
        "expect equals specialPrice ", records[0].getSpecialPrice(), testResult.getSpecialPrice());
    org.junit.Assert.assertEquals(
        "expect equals tierPercent ", records[0].getTierPercent(), testResult.getTierPercent());
    org.junit.Assert.assertEquals(
        "expect equals origPrice ", records[0].getOrigPrice(), testResult.getOrigPrice());
    org.junit.Assert.assertEquals(
        "expect equals price ", records[0].getPrice(), testResult.getPrice());
    org.junit.Assert.assertEquals(
        "expect equals minPrice ", records[0].getMinPrice(), testResult.getMinPrice());
    org.junit.Assert.assertEquals(
        "expect equals maxPrice ", records[0].getMaxPrice(), testResult.getMaxPrice());
    org.junit.Assert.assertEquals(
        "expect equals tierPrice ", records[0].getTierPrice(), testResult.getTierPrice());
    org.junit.Assert.assertEquals(
        "expect equals baseTier ", records[0].getBaseTier(), testResult.getBaseTier());
  }
}
