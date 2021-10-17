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
package com.magento.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.magento.test.entity.QuotePayment;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class QuotePaymentDaoTestIt {
  static final String inputFile = "QuotePayment.json";
  static QuotePaymentDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private QuotePayment[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultQuotePaymentDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, QuotePayment[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    QuotePayment testResult = dao.find(records[1].getPaymentId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals quoteId ", this.records[1].getQuoteId() == testResult.getQuoteId());
    org.junit.Assert.assertEquals(
        "expect equals method ", this.records[1].getMethod(), testResult.getMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccType ", this.records[1].getCcType(), testResult.getCcType());
    org.junit.Assert.assertEquals(
        "expect equals ccNumberEnc ",
        this.records[1].getCcNumberEnc(),
        testResult.getCcNumberEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccLast4 ", this.records[1].getCcLast4(), testResult.getCcLast4());
    org.junit.Assert.assertEquals(
        "expect equals ccCidEnc ", this.records[1].getCcCidEnc(), testResult.getCcCidEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccOwner ", this.records[1].getCcOwner(), testResult.getCcOwner());
    org.junit.Assert.assertEquals(
        "expect equals ccExpMonth ", this.records[1].getCcExpMonth(), testResult.getCcExpMonth());
    org.junit.Assert.assertTrue(
        "expect equals ccExpYear ", this.records[1].getCcExpYear() == testResult.getCcExpYear());
    org.junit.Assert.assertEquals(
        "expect equals ccSsOwner ", this.records[1].getCcSsOwner(), testResult.getCcSsOwner());
    org.junit.Assert.assertTrue(
        "expect equals ccSsStartMonth ",
        this.records[1].getCcSsStartMonth() == testResult.getCcSsStartMonth());
    org.junit.Assert.assertTrue(
        "expect equals ccSsStartYear ",
        this.records[1].getCcSsStartYear() == testResult.getCcSsStartYear());
    org.junit.Assert.assertEquals(
        "expect equals poNumber ", this.records[1].getPoNumber(), testResult.getPoNumber());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        this.records[1].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals ccSsIssue ", this.records[1].getCcSsIssue(), testResult.getCcSsIssue());
    org.junit.Assert.assertEquals(
        "expect equals additionalInformation ",
        this.records[1].getAdditionalInformation(),
        testResult.getAdditionalInformation());
    org.junit.Assert.assertEquals(
        "expect equals paypalPayerId ",
        this.records[1].getPaypalPayerId(),
        testResult.getPaypalPayerId());
    org.junit.Assert.assertEquals(
        "expect equals paypalPayerStatus ",
        this.records[1].getPaypalPayerStatus(),
        testResult.getPaypalPayerStatus());
    org.junit.Assert.assertEquals(
        "expect equals paypalCorrelationId ",
        this.records[1].getPaypalCorrelationId(),
        testResult.getPaypalCorrelationId());
  }
}
