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
package com.magento.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.magento.test.entity.CatalogEavAttribute;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CatalogEavAttributeDaoTestIt {
  static final String inputFile = "CatalogEavAttribute.json";
  static CatalogEavAttributeDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CatalogEavAttribute[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCatalogEavAttributeDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CatalogEavAttribute[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    CatalogEavAttribute testResult = dao.find(records[1].getAttributeId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals frontendInputRenderer ",
        this.records[1].getFrontendInputRenderer(),
        testResult.getFrontendInputRenderer());
    org.junit.Assert.assertTrue(
        "expect equals isGlobal ", this.records[1].getIsGlobal() == testResult.getIsGlobal());
    org.junit.Assert.assertTrue(
        "expect equals isVisible ", this.records[1].getIsVisible() == testResult.getIsVisible());
    org.junit.Assert.assertTrue(
        "expect equals isSearchable ",
        this.records[1].getIsSearchable() == testResult.getIsSearchable());
    org.junit.Assert.assertTrue(
        "expect equals isFilterable ",
        this.records[1].getIsFilterable() == testResult.getIsFilterable());
    org.junit.Assert.assertTrue(
        "expect equals isComparable ",
        this.records[1].getIsComparable() == testResult.getIsComparable());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleOnFront ",
        this.records[1].getIsVisibleOnFront() == testResult.getIsVisibleOnFront());
    org.junit.Assert.assertTrue(
        "expect equals isHtmlAllowedOnFront ",
        this.records[1].getIsHtmlAllowedOnFront() == testResult.getIsHtmlAllowedOnFront());
    org.junit.Assert.assertTrue(
        "expect equals isUsedForPriceRules ",
        this.records[1].getIsUsedForPriceRules() == testResult.getIsUsedForPriceRules());
    org.junit.Assert.assertTrue(
        "expect equals isFilterableInSearch ",
        this.records[1].getIsFilterableInSearch() == testResult.getIsFilterableInSearch());
    org.junit.Assert.assertTrue(
        "expect equals usedInProductListing ",
        this.records[1].getUsedInProductListing() == testResult.getUsedInProductListing());
    org.junit.Assert.assertTrue(
        "expect equals usedForSortBy ",
        this.records[1].getUsedForSortBy() == testResult.getUsedForSortBy());
    org.junit.Assert.assertEquals(
        "expect equals applyTo ", this.records[1].getApplyTo(), testResult.getApplyTo());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleInAdvancedSearch ",
        this.records[1].getIsVisibleInAdvancedSearch()
            == testResult.getIsVisibleInAdvancedSearch());
    org.junit.Assert.assertTrue(
        "expect equals position ", this.records[1].getPosition() == testResult.getPosition());
    org.junit.Assert.assertTrue(
        "expect equals isWysiwygEnabled ",
        this.records[1].getIsWysiwygEnabled() == testResult.getIsWysiwygEnabled());
    org.junit.Assert.assertTrue(
        "expect equals isUsedForPromoRules ",
        this.records[1].getIsUsedForPromoRules() == testResult.getIsUsedForPromoRules());
    org.junit.Assert.assertTrue(
        "expect equals isRequiredInAdminStore ",
        this.records[1].getIsRequiredInAdminStore() == testResult.getIsRequiredInAdminStore());
    org.junit.Assert.assertTrue(
        "expect equals isUsedInGrid ",
        this.records[1].getIsUsedInGrid() == testResult.getIsUsedInGrid());
    org.junit.Assert.assertTrue(
        "expect equals isVisibleInGrid ",
        this.records[1].getIsVisibleInGrid() == testResult.getIsVisibleInGrid());
    org.junit.Assert.assertTrue(
        "expect equals isFilterableInGrid ",
        this.records[1].getIsFilterableInGrid() == testResult.getIsFilterableInGrid());
    org.junit.Assert.assertTrue(
        "expect equals searchWeight ",
        this.records[1].getSearchWeight() == testResult.getSearchWeight());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        this.records[1].getAdditionalData(),
        testResult.getAdditionalData());
  }
}
