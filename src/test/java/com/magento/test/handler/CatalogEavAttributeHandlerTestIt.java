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
package com.magento.test.handler;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.CDL;
import org.json.JSONArray;
import com.google.gson.Gson;
import com.magento.test.entity.CatalogEavAttribute;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultCatalogEavAttributeDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CatalogEavAttributeHandlerTestIt {
  static final String inputFile = "CatalogEavAttribute.json";
  static CatalogEavAttributeHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CatalogEavAttribute[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new CatalogEavAttributeHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, CatalogEavAttribute[].class);
    assertEquals("match count", count, records.length);
    CatalogEavAttribute testResult =
        jpa.find(CatalogEavAttribute.class, records[0].getAttributeId());
    assertEquals(
        "expect equals frontendInputRenderer ",
        this.records[0].getFrontendInputRenderer(),
        testResult.getFrontendInputRenderer());
    org.junit.Assert.assertEquals(
        "expect equals isGlobal ", this.records[0].getIsGlobal(), testResult.getIsGlobal());
    org.junit.Assert.assertEquals(
        "expect equals isVisible ", this.records[0].getIsVisible(), testResult.getIsVisible());
    org.junit.Assert.assertEquals(
        "expect equals isSearchable ",
        this.records[0].getIsSearchable(),
        testResult.getIsSearchable());
    org.junit.Assert.assertEquals(
        "expect equals isFilterable ",
        this.records[0].getIsFilterable(),
        testResult.getIsFilterable());
    org.junit.Assert.assertEquals(
        "expect equals isComparable ",
        this.records[0].getIsComparable(),
        testResult.getIsComparable());
    org.junit.Assert.assertEquals(
        "expect equals isVisibleOnFront ",
        this.records[0].getIsVisibleOnFront(),
        testResult.getIsVisibleOnFront());
    org.junit.Assert.assertEquals(
        "expect equals isHtmlAllowedOnFront ",
        this.records[0].getIsHtmlAllowedOnFront(),
        testResult.getIsHtmlAllowedOnFront());
    org.junit.Assert.assertEquals(
        "expect equals isUsedForPriceRules ",
        this.records[0].getIsUsedForPriceRules(),
        testResult.getIsUsedForPriceRules());
    org.junit.Assert.assertEquals(
        "expect equals isFilterableInSearch ",
        this.records[0].getIsFilterableInSearch(),
        testResult.getIsFilterableInSearch());
    org.junit.Assert.assertEquals(
        "expect equals usedInProductListing ",
        this.records[0].getUsedInProductListing(),
        testResult.getUsedInProductListing());
    org.junit.Assert.assertEquals(
        "expect equals usedForSortBy ",
        this.records[0].getUsedForSortBy(),
        testResult.getUsedForSortBy());
    assertEquals("expect equals applyTo ", this.records[0].getApplyTo(), testResult.getApplyTo());
    org.junit.Assert.assertEquals(
        "expect equals isVisibleInAdvancedSearch ",
        this.records[0].getIsVisibleInAdvancedSearch(),
        testResult.getIsVisibleInAdvancedSearch());
    org.junit.Assert.assertEquals(
        "expect equals position ", this.records[0].getPosition(), testResult.getPosition());
    org.junit.Assert.assertEquals(
        "expect equals isWysiwygEnabled ",
        this.records[0].getIsWysiwygEnabled(),
        testResult.getIsWysiwygEnabled());
    org.junit.Assert.assertEquals(
        "expect equals isUsedForPromoRules ",
        this.records[0].getIsUsedForPromoRules(),
        testResult.getIsUsedForPromoRules());
    org.junit.Assert.assertEquals(
        "expect equals isRequiredInAdminStore ",
        this.records[0].getIsRequiredInAdminStore(),
        testResult.getIsRequiredInAdminStore());
    org.junit.Assert.assertEquals(
        "expect equals isUsedInGrid ",
        this.records[0].getIsUsedInGrid(),
        testResult.getIsUsedInGrid());
    org.junit.Assert.assertEquals(
        "expect equals isVisibleInGrid ",
        this.records[0].getIsVisibleInGrid(),
        testResult.getIsVisibleInGrid());
    org.junit.Assert.assertEquals(
        "expect equals isFilterableInGrid ",
        this.records[0].getIsFilterableInGrid(),
        testResult.getIsFilterableInGrid());
    org.junit.Assert.assertEquals(
        "expect equals searchWeight ",
        this.records[0].getSearchWeight(),
        testResult.getSearchWeight());
    assertEquals(
        "expect equals additionalData ",
        this.records[0].getAdditionalData(),
        testResult.getAdditionalData());

    // cleanup
    inputStream.close();
    json = null;
    records = null;
  }

  /**
   * Construct a delimiter file from a json file.
   *
   * @param inputFile the json file.
   * @param charset default charset.
   * @return
   */
  private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
    try {
      final File tempFile = File.createTempFile(inputFile, ".txt");
      tempFile.deleteOnExit();
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      JSONArray docs = new JSONArray(json);
      String csv = CDL.toString(docs);
      org.apache.commons.io.FileUtils.writeStringToFile(tempFile, csv, Charset.defaultCharset());
      return tempFile;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
