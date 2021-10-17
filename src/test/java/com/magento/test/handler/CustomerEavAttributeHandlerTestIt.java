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
import com.magento.test.entity.CustomerEavAttribute;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultCustomerEavAttributeDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerEavAttributeHandlerTestIt {
  static final String inputFile = "CustomerEavAttribute.json";
  static CustomerEavAttributeHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CustomerEavAttribute[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new CustomerEavAttributeHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, CustomerEavAttribute[].class);
    assertEquals("match count", count, records.length);
    CustomerEavAttribute testResult =
        jpa.find(CustomerEavAttribute.class, records[0].getAttributeId());
    org.junit.Assert.assertEquals(
        "expect equals isVisible ", this.records[0].getIsVisible(), testResult.getIsVisible());
    assertEquals(
        "expect equals inputFilter ",
        this.records[0].getInputFilter(),
        testResult.getInputFilter());
    org.junit.Assert.assertEquals(
        "expect equals multilineCount ",
        this.records[0].getMultilineCount(),
        testResult.getMultilineCount());
    assertEquals(
        "expect equals validateRules ",
        this.records[0].getValidateRules(),
        testResult.getValidateRules());
    org.junit.Assert.assertEquals(
        "expect equals isSystem ", this.records[0].getIsSystem(), testResult.getIsSystem());
    org.junit.Assert.assertEquals(
        "expect equals sortOrder ", this.records[0].getSortOrder(), testResult.getSortOrder());
    assertEquals(
        "expect equals dataModel ", this.records[0].getDataModel(), testResult.getDataModel());
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
        "expect equals isSearchableInGrid ",
        this.records[0].getIsSearchableInGrid(),
        testResult.getIsSearchableInGrid());

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
