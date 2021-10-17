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
import com.magento.test.entity.SalesOrderAddress;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesOrderAddressDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesOrderAddressHandlerTestIt {
  static final String inputFile = "SalesOrderAddress.json";
  static SalesOrderAddressHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderAddress[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesOrderAddressHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesOrderAddress[].class);
    assertEquals("match count", count, records.length);
    SalesOrderAddress testResult = jpa.find(SalesOrderAddress.class, records[0].getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals parentId ", this.records[0].getParentId(), testResult.getParentId());
    org.junit.Assert.assertEquals(
        "expect equals customerAddressId ",
        this.records[0].getCustomerAddressId(),
        testResult.getCustomerAddressId());
    org.junit.Assert.assertEquals(
        "expect equals quoteAddressId ",
        this.records[0].getQuoteAddressId(),
        testResult.getQuoteAddressId());
    org.junit.Assert.assertEquals(
        "expect equals regionId ", this.records[0].getRegionId(), testResult.getRegionId());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    assertEquals("expect equals fax ", this.records[0].getFax(), testResult.getFax());
    assertEquals("expect equals region ", this.records[0].getRegion(), testResult.getRegion());
    assertEquals(
        "expect equals postcode ", this.records[0].getPostcode(), testResult.getPostcode());
    assertEquals(
        "expect equals lastname ", this.records[0].getLastname(), testResult.getLastname());
    assertEquals("expect equals street ", this.records[0].getStreet(), testResult.getStreet());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    assertEquals(
        "expect equals telephone ", this.records[0].getTelephone(), testResult.getTelephone());
    assertEquals(
        "expect equals countryId ", this.records[0].getCountryId(), testResult.getCountryId());
    assertEquals(
        "expect equals firstname ", this.records[0].getFirstname(), testResult.getFirstname());
    assertEquals(
        "expect equals addressType ",
        this.records[0].getAddressType(),
        testResult.getAddressType());
    assertEquals("expect equals prefix ", this.records[0].getPrefix(), testResult.getPrefix());
    assertEquals(
        "expect equals middlename ", this.records[0].getMiddlename(), testResult.getMiddlename());
    assertEquals("expect equals suffix ", this.records[0].getSuffix(), testResult.getSuffix());
    assertEquals("expect equals company ", this.records[0].getCompany(), testResult.getCompany());
    assertEquals("expect equals vatId ", this.records[0].getVatId(), testResult.getVatId());
    org.junit.Assert.assertEquals(
        "expect equals vatIsValid ", this.records[0].getVatIsValid(), testResult.getVatIsValid());
    assertEquals(
        "expect equals vatRequestId ",
        this.records[0].getVatRequestId(),
        testResult.getVatRequestId());
    assertEquals(
        "expect equals vatRequestDate ",
        this.records[0].getVatRequestDate(),
        testResult.getVatRequestDate());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestSuccess ",
        this.records[0].getVatRequestSuccess(),
        testResult.getVatRequestSuccess());

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
