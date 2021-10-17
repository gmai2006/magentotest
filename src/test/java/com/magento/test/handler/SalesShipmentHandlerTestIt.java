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
import com.magento.test.entity.SalesShipment;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesShipmentDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.SalesShipmentId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesShipmentHandlerTestIt {
  static final String inputFile = "SalesShipment.json";
  static SalesShipmentHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesShipment[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesShipmentHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesShipment[].class);
    assertEquals("match count", count, records.length);
    final SalesShipmentId id =
        new SalesShipmentId(
            this.records[0].getStoreId(),
            this.records[0].getIncrementId(),
            this.records[0].getEntityId());
    SalesShipment testResult = jpa.find(SalesShipment.class, id);
    assertEquals(
        "expect equals totalWeight ",
        this.records[0].getTotalWeight(),
        testResult.getTotalWeight());
    assertEquals(
        "expect equals totalQty ", this.records[0].getTotalQty(), testResult.getTotalQty());
    org.junit.Assert.assertEquals(
        "expect equals emailSent ", this.records[0].getEmailSent(), testResult.getEmailSent());
    org.junit.Assert.assertEquals(
        "expect equals sendEmail ", this.records[0].getSendEmail(), testResult.getSendEmail());
    org.junit.Assert.assertEquals(
        "expect equals orderId ", this.records[0].getOrderId(), testResult.getOrderId());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals shippingAddressId ",
        this.records[0].getShippingAddressId(),
        testResult.getShippingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals billingAddressId ",
        this.records[0].getBillingAddressId(),
        testResult.getBillingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals shipmentStatus ",
        this.records[0].getShipmentStatus(),
        testResult.getShipmentStatus());
    assertEquals(
        "expect equals packages ", this.records[0].getPackages(), testResult.getPackages());
    assertEquals(
        "expect equals customerNote ",
        this.records[0].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertEquals(
        "expect equals customerNoteNotify ",
        this.records[0].getCustomerNoteNotify(),
        testResult.getCustomerNoteNotify());

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
