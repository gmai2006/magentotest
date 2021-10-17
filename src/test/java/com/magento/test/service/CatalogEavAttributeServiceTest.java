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

import com.magento.test.entity.CatalogEavAttribute;

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

public class CatalogEavAttributeServiceTest {
  private static DefaultCatalogEavAttributeService serviceMock;
  private static CatalogEavAttribute[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCatalogEavAttributeService.class);
    String inputFile = "CatalogEavAttribute.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CatalogEavAttribute[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getAttributeId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CatalogEavAttribute testResult = serviceMock.find(records[0].getAttributeId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals frontendInputRenderer ",
        records[0].getFrontendInputRenderer(),
        testResult.getFrontendInputRenderer());
    org.junit.Assert.assertTrue(
        "expect equals isGlobal ", records[0].getIsGlobal() == testResult.getIsGlobal());
    org.junit.Assert.assertTrue(
        "expect equals isVisible ", records[0].getIsVisible() == testResult.getIsVisible());
    org.junit.Assert.assertTrue(
        "expect equals isSearchable ",
        records[0].getIsSearchable() == testResult.getIsSearchable());
    org.junit.Assert.assertTrue(
        "expect equals isFilterable ",
        records[0].getIsFilterable() == testResult.getIsFilterable());
    org.junit.Assert.assertTrue(
        "expect equals isComparable ",
        records[0].getIsComparable() == testResult.getIsComparable());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleOnFront ",
        records[0].getIsVisibleOnFront() == testResult.getIsVisibleOnFront());
    org.junit.Assert.assertTrue(
        "expect equals isHtmlAllowedOnFront ",
        records[0].getIsHtmlAllowedOnFront() == testResult.getIsHtmlAllowedOnFront());
    org.junit.Assert.assertTrue(
        "expect equals isUsedForPriceRules ",
        records[0].getIsUsedForPriceRules() == testResult.getIsUsedForPriceRules());
    org.junit.Assert.assertTrue(
        "expect equals isFilterableInSearch ",
        records[0].getIsFilterableInSearch() == testResult.getIsFilterableInSearch());
    org.junit.Assert.assertTrue(
        "expect equals usedInProductListing ",
        records[0].getUsedInProductListing() == testResult.getUsedInProductListing());
    org.junit.Assert.assertTrue(
        "expect equals usedForSortBy ",
        records[0].getUsedForSortBy() == testResult.getUsedForSortBy());
    org.junit.Assert.assertEquals(
        "expect equals applyTo ", records[0].getApplyTo(), testResult.getApplyTo());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleInAdvancedSearch ",
        records[0].getIsVisibleInAdvancedSearch() == testResult.getIsVisibleInAdvancedSearch());
    org.junit.Assert.assertTrue(
        "expect equals position ", records[0].getPosition() == testResult.getPosition());
    org.junit.Assert.assertTrue(
        "expect equals isWysiwygEnabled ",
        records[0].getIsWysiwygEnabled() == testResult.getIsWysiwygEnabled());
    org.junit.Assert.assertTrue(
        "expect equals isUsedForPromoRules ",
        records[0].getIsUsedForPromoRules() == testResult.getIsUsedForPromoRules());
    org.junit.Assert.assertTrue(
        "expect equals isRequiredInAdminStore ",
        records[0].getIsRequiredInAdminStore() == testResult.getIsRequiredInAdminStore());
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
        "expect equals searchWeight ",
        records[0].getSearchWeight() == testResult.getSearchWeight());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
  }
}
