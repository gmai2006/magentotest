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
import com.magento.test.entity.CustomerGridFlat;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultCustomerGridFlatDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerGridFlatHandlerTestIt {
  static final String inputFile = "CustomerGridFlat.json";
  static CustomerGridFlatHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CustomerGridFlat[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new CustomerGridFlatHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, CustomerGridFlat[].class);
    assertEquals("match count", count, records.length);
    CustomerGridFlat testResult = jpa.find(CustomerGridFlat.class, records[0].getEntityId());
    assertEquals("expect equals name ", this.records[0].getName(), testResult.getName());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals groupId ", this.records[0].getGroupId(), testResult.getGroupId());
    org.junit.Assert.assertEquals(
        "expect equals websiteId ", this.records[0].getWebsiteId(), testResult.getWebsiteId());
    assertEquals(
        "expect equals confirmation ",
        this.records[0].getConfirmation(),
        testResult.getConfirmation());
    assertEquals(
        "expect equals createdIn ", this.records[0].getCreatedIn(), testResult.getCreatedIn());
    org.junit.Assert.assertEquals(
        "expect equals gender ", this.records[0].getGender(), testResult.getGender());
    assertEquals("expect equals taxvat ", this.records[0].getTaxvat(), testResult.getTaxvat());
    assertEquals(
        "expect equals shippingFull ",
        this.records[0].getShippingFull(),
        testResult.getShippingFull());
    assertEquals(
        "expect equals billingFull ",
        this.records[0].getBillingFull(),
        testResult.getBillingFull());
    assertEquals(
        "expect equals billingFirstname ",
        this.records[0].getBillingFirstname(),
        testResult.getBillingFirstname());
    assertEquals(
        "expect equals billingLastname ",
        this.records[0].getBillingLastname(),
        testResult.getBillingLastname());
    assertEquals(
        "expect equals billingTelephone ",
        this.records[0].getBillingTelephone(),
        testResult.getBillingTelephone());
    assertEquals(
        "expect equals billingPostcode ",
        this.records[0].getBillingPostcode(),
        testResult.getBillingPostcode());
    assertEquals(
        "expect equals billingCountryId ",
        this.records[0].getBillingCountryId(),
        testResult.getBillingCountryId());
    assertEquals(
        "expect equals billingRegion ",
        this.records[0].getBillingRegion(),
        testResult.getBillingRegion());
    assertEquals(
        "expect equals billingStreet ",
        this.records[0].getBillingStreet(),
        testResult.getBillingStreet());
    assertEquals(
        "expect equals billingCity ",
        this.records[0].getBillingCity(),
        testResult.getBillingCity());
    assertEquals(
        "expect equals billingFax ", this.records[0].getBillingFax(), testResult.getBillingFax());
    assertEquals(
        "expect equals billingVatId ",
        this.records[0].getBillingVatId(),
        testResult.getBillingVatId());
    assertEquals(
        "expect equals billingCompany ",
        this.records[0].getBillingCompany(),
        testResult.getBillingCompany());

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
