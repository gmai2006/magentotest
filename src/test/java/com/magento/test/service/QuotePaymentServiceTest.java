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
package com.magento.test.service;

import com.magento.test.entity.QuotePayment;

import com.magento.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class QuotePaymentServiceTest {
  private static DefaultQuotePaymentService serviceMock;
  private static QuotePayment[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultQuotePaymentService.class);
    String inputFile = "QuotePayment.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, QuotePayment[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getPaymentId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    QuotePayment testResult = serviceMock.find(records[0].getPaymentId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals quoteId ", records[0].getQuoteId() == testResult.getQuoteId());
    org.junit.Assert.assertEquals(
        "expect equals method ", records[0].getMethod(), testResult.getMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccType ", records[0].getCcType(), testResult.getCcType());
    org.junit.Assert.assertEquals(
        "expect equals ccNumberEnc ", records[0].getCcNumberEnc(), testResult.getCcNumberEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccLast4 ", records[0].getCcLast4(), testResult.getCcLast4());
    org.junit.Assert.assertEquals(
        "expect equals ccCidEnc ", records[0].getCcCidEnc(), testResult.getCcCidEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccOwner ", records[0].getCcOwner(), testResult.getCcOwner());
    org.junit.Assert.assertEquals(
        "expect equals ccExpMonth ", records[0].getCcExpMonth(), testResult.getCcExpMonth());
    org.junit.Assert.assertTrue(
        "expect equals ccExpYear ", records[0].getCcExpYear() == testResult.getCcExpYear());
    org.junit.Assert.assertEquals(
        "expect equals ccSsOwner ", records[0].getCcSsOwner(), testResult.getCcSsOwner());
    org.junit.Assert.assertTrue(
        "expect equals ccSsStartMonth ",
        records[0].getCcSsStartMonth() == testResult.getCcSsStartMonth());
    org.junit.Assert.assertTrue(
        "expect equals ccSsStartYear ",
        records[0].getCcSsStartYear() == testResult.getCcSsStartYear());
    org.junit.Assert.assertEquals(
        "expect equals poNumber ", records[0].getPoNumber(), testResult.getPoNumber());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals ccSsIssue ", records[0].getCcSsIssue(), testResult.getCcSsIssue());
    org.junit.Assert.assertEquals(
        "expect equals additionalInformation ",
        records[0].getAdditionalInformation(),
        testResult.getAdditionalInformation());
    org.junit.Assert.assertEquals(
        "expect equals paypalPayerId ",
        records[0].getPaypalPayerId(),
        testResult.getPaypalPayerId());
    org.junit.Assert.assertEquals(
        "expect equals paypalPayerStatus ",
        records[0].getPaypalPayerStatus(),
        testResult.getPaypalPayerStatus());
    org.junit.Assert.assertEquals(
        "expect equals paypalCorrelationId ",
        records[0].getPaypalCorrelationId(),
        testResult.getPaypalCorrelationId());
  }
}
