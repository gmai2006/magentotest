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
import com.magento.test.entity.TemandoQuotePickupLocation;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultTemandoQuotePickupLocationDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemandoQuotePickupLocationHandlerTestIt {
  static final String inputFile = "TemandoQuotePickupLocation.json";
  static TemandoQuotePickupLocationHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private TemandoQuotePickupLocation[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new TemandoQuotePickupLocationHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, TemandoQuotePickupLocation[].class);
    assertEquals("match count", count, records.length);
    TemandoQuotePickupLocation testResult =
        jpa.find(TemandoQuotePickupLocation.class, records[0].getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals recipientAddressId ",
        this.records[0].getRecipientAddressId(),
        testResult.getRecipientAddressId());
    assertEquals(
        "expect equals pickupLocationId ",
        this.records[0].getPickupLocationId(),
        testResult.getPickupLocationId());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals("expect equals country ", this.records[0].getCountry(), testResult.getCountry());
    assertEquals("expect equals region ", this.records[0].getRegion(), testResult.getRegion());
    assertEquals(
        "expect equals postcode ", this.records[0].getPostcode(), testResult.getPostcode());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals street ", this.records[0].getStreet(), testResult.getStreet());
    assertEquals(
        "expect equals openingHours ",
        this.records[0].getOpeningHours(),
        testResult.getOpeningHours());
    assertEquals(
        "expect equals shippingExperiences ",
        this.records[0].getShippingExperiences(),
        testResult.getShippingExperiences());
    org.junit.Assert.assertEquals(
        "expect equals selected ", this.records[0].getSelected(), testResult.getSelected());
    org.junit.Assert.assertEquals(
        "expect equals distance ", this.records[0].getDistance(), testResult.getDistance());

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
