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
import com.magento.test.entity.EavAttribute;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultEavAttributeDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.EavAttributeId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EavAttributeHandlerTestIt {
  static final String inputFile = "EavAttribute.json";
  static EavAttributeHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private EavAttribute[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new EavAttributeHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, EavAttribute[].class);
    assertEquals("match count", count, records.length);
    final EavAttributeId id =
        new EavAttributeId(
            this.records[0].getAttributeId(),
            this.records[0].getEntityTypeId(),
            this.records[0].getAttributeCode());
    EavAttribute testResult = jpa.find(EavAttribute.class, id);
    assertEquals(
        "expect equals attributeModel ",
        this.records[0].getAttributeModel(),
        testResult.getAttributeModel());
    assertEquals(
        "expect equals backendModel ",
        this.records[0].getBackendModel(),
        testResult.getBackendModel());
    assertEquals(
        "expect equals backendType ",
        this.records[0].getBackendType(),
        testResult.getBackendType());
    assertEquals(
        "expect equals backendTable ",
        this.records[0].getBackendTable(),
        testResult.getBackendTable());
    assertEquals(
        "expect equals frontendModel ",
        this.records[0].getFrontendModel(),
        testResult.getFrontendModel());
    assertEquals(
        "expect equals frontendInput ",
        this.records[0].getFrontendInput(),
        testResult.getFrontendInput());
    assertEquals(
        "expect equals frontendLabel ",
        this.records[0].getFrontendLabel(),
        testResult.getFrontendLabel());
    assertEquals(
        "expect equals frontendClass ",
        this.records[0].getFrontendClass(),
        testResult.getFrontendClass());
    assertEquals(
        "expect equals sourceModel ",
        this.records[0].getSourceModel(),
        testResult.getSourceModel());
    org.junit.Assert.assertEquals(
        "expect equals isRequired ", this.records[0].getIsRequired(), testResult.getIsRequired());
    org.junit.Assert.assertEquals(
        "expect equals isUserDefined ",
        this.records[0].getIsUserDefined(),
        testResult.getIsUserDefined());
    assertEquals(
        "expect equals defaultValue ",
        this.records[0].getDefaultValue(),
        testResult.getDefaultValue());
    org.junit.Assert.assertEquals(
        "expect equals isUnique ", this.records[0].getIsUnique(), testResult.getIsUnique());
    assertEquals("expect equals note ", this.records[0].getNote(), testResult.getNote());

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
