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
import com.magento.test.entity.EavEntityType;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultEavEntityTypeDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EavEntityTypeHandlerTestIt {
  static final String inputFile = "EavEntityType.json";
  static EavEntityTypeHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private EavEntityType[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new EavEntityTypeHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, EavEntityType[].class);
    assertEquals("match count", count, records.length);
    EavEntityType testResult = jpa.find(EavEntityType.class, records[0].getEntityTypeId());
    assertEquals(
        "expect equals entityTypeCode ",
        this.records[0].getEntityTypeCode(),
        testResult.getEntityTypeCode());
    assertEquals(
        "expect equals entityModel ",
        this.records[0].getEntityModel(),
        testResult.getEntityModel());
    assertEquals(
        "expect equals attributeModel ",
        this.records[0].getAttributeModel(),
        testResult.getAttributeModel());
    assertEquals(
        "expect equals entityTable ",
        this.records[0].getEntityTable(),
        testResult.getEntityTable());
    assertEquals(
        "expect equals valueTablePrefix ",
        this.records[0].getValueTablePrefix(),
        testResult.getValueTablePrefix());
    assertEquals(
        "expect equals entityIdField ",
        this.records[0].getEntityIdField(),
        testResult.getEntityIdField());
    org.junit.Assert.assertEquals(
        "expect equals isDataSharing ",
        this.records[0].getIsDataSharing(),
        testResult.getIsDataSharing());
    assertEquals(
        "expect equals dataSharingKey ",
        this.records[0].getDataSharingKey(),
        testResult.getDataSharingKey());
    org.junit.Assert.assertEquals(
        "expect equals defaultAttributeSetId ",
        this.records[0].getDefaultAttributeSetId(),
        testResult.getDefaultAttributeSetId());
    assertEquals(
        "expect equals incrementModel ",
        this.records[0].getIncrementModel(),
        testResult.getIncrementModel());
    org.junit.Assert.assertEquals(
        "expect equals incrementPerStore ",
        this.records[0].getIncrementPerStore(),
        testResult.getIncrementPerStore());
    org.junit.Assert.assertEquals(
        "expect equals incrementPadLength ",
        this.records[0].getIncrementPadLength(),
        testResult.getIncrementPadLength());
    assertEquals(
        "expect equals incrementPadChar ",
        this.records[0].getIncrementPadChar(),
        testResult.getIncrementPadChar());
    assertEquals(
        "expect equals additionalAttributeTable ",
        this.records[0].getAdditionalAttributeTable(),
        testResult.getAdditionalAttributeTable());
    assertEquals(
        "expect equals entityAttributeCollection ",
        this.records[0].getEntityAttributeCollection(),
        testResult.getEntityAttributeCollection());

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
