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
import com.magento.test.entity.QuotePayment;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultQuotePaymentDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuotePaymentHandlerTestIt {
  static final String inputFile = "QuotePayment.json";
  static QuotePaymentHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private QuotePayment[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new QuotePaymentHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, QuotePayment[].class);
    assertEquals("match count", count, records.length);
    QuotePayment testResult = jpa.find(QuotePayment.class, records[0].getPaymentId());
    org.junit.Assert.assertEquals(
        "expect equals quoteId ", this.records[0].getQuoteId(), testResult.getQuoteId());
    assertEquals("expect equals method ", this.records[0].getMethod(), testResult.getMethod());
    assertEquals("expect equals ccType ", this.records[0].getCcType(), testResult.getCcType());
    assertEquals(
        "expect equals ccNumberEnc ",
        this.records[0].getCcNumberEnc(),
        testResult.getCcNumberEnc());
    assertEquals("expect equals ccLast4 ", this.records[0].getCcLast4(), testResult.getCcLast4());
    assertEquals(
        "expect equals ccCidEnc ", this.records[0].getCcCidEnc(), testResult.getCcCidEnc());
    assertEquals("expect equals ccOwner ", this.records[0].getCcOwner(), testResult.getCcOwner());
    assertEquals(
        "expect equals ccExpMonth ", this.records[0].getCcExpMonth(), testResult.getCcExpMonth());
    org.junit.Assert.assertEquals(
        "expect equals ccExpYear ", this.records[0].getCcExpYear(), testResult.getCcExpYear());
    assertEquals(
        "expect equals ccSsOwner ", this.records[0].getCcSsOwner(), testResult.getCcSsOwner());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartMonth ",
        this.records[0].getCcSsStartMonth(),
        testResult.getCcSsStartMonth());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartYear ",
        this.records[0].getCcSsStartYear(),
        testResult.getCcSsStartYear());
    assertEquals(
        "expect equals poNumber ", this.records[0].getPoNumber(), testResult.getPoNumber());
    assertEquals(
        "expect equals additionalData ",
        this.records[0].getAdditionalData(),
        testResult.getAdditionalData());
    assertEquals(
        "expect equals ccSsIssue ", this.records[0].getCcSsIssue(), testResult.getCcSsIssue());
    assertEquals(
        "expect equals additionalInformation ",
        this.records[0].getAdditionalInformation(),
        testResult.getAdditionalInformation());
    assertEquals(
        "expect equals paypalPayerId ",
        this.records[0].getPaypalPayerId(),
        testResult.getPaypalPayerId());
    assertEquals(
        "expect equals paypalPayerStatus ",
        this.records[0].getPaypalPayerStatus(),
        testResult.getPaypalPayerStatus());
    assertEquals(
        "expect equals paypalCorrelationId ",
        this.records[0].getPaypalCorrelationId(),
        testResult.getPaypalCorrelationId());

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
