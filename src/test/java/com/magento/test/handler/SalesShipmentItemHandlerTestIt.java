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
import com.magento.test.entity.SalesShipmentItem;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesShipmentItemDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesShipmentItemHandlerTestIt {
  static final String inputFile = "SalesShipmentItem.json";
  static SalesShipmentItemHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesShipmentItem[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesShipmentItemHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesShipmentItem[].class);
    assertEquals("match count", count, records.length);
    SalesShipmentItem testResult = jpa.find(SalesShipmentItem.class, records[0].getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals parentId ", this.records[0].getParentId(), testResult.getParentId());
    assertEquals(
        "expect equals rowTotal ", this.records[0].getRowTotal(), testResult.getRowTotal());
    assertEquals("expect equals price ", this.records[0].getPrice(), testResult.getPrice());
    assertEquals("expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    assertEquals("expect equals qty ", this.records[0].getQty(), testResult.getQty());
    org.junit.Assert.assertEquals(
        "expect equals productId ", this.records[0].getProductId(), testResult.getProductId());
    org.junit.Assert.assertEquals(
        "expect equals orderItemId ",
        this.records[0].getOrderItemId(),
        testResult.getOrderItemId());
    assertEquals(
        "expect equals additionalData ",
        this.records[0].getAdditionalData(),
        testResult.getAdditionalData());
    assertEquals(
        "expect equals description ",
        this.records[0].getDescription(),
        testResult.getDescription());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals("expect equals sku ", this.records[0].getSku(), testResult.getSku());

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
