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
import com.magento.test.entity.SalesOrderPayment;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesOrderPaymentDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesOrderPaymentHandlerTestIt {
  static final String inputFile = "SalesOrderPayment.json";
  static SalesOrderPaymentHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderPayment[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesOrderPaymentHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesOrderPayment[].class);
    assertEquals("match count", count, records.length);
    SalesOrderPayment testResult = jpa.find(SalesOrderPayment.class, records[0].getEntityId());
    org.junit.Assert.assertEquals(
        "expect equals parentId ", this.records[0].getParentId(), testResult.getParentId());
    assertEquals(
        "expect equals baseShippingCaptured ",
        this.records[0].getBaseShippingCaptured(),
        testResult.getBaseShippingCaptured());
    assertEquals(
        "expect equals shippingCaptured ",
        this.records[0].getShippingCaptured(),
        testResult.getShippingCaptured());
    assertEquals(
        "expect equals amountRefunded ",
        this.records[0].getAmountRefunded(),
        testResult.getAmountRefunded());
    assertEquals(
        "expect equals baseAmountPaid ",
        this.records[0].getBaseAmountPaid(),
        testResult.getBaseAmountPaid());
    assertEquals(
        "expect equals amountCanceled ",
        this.records[0].getAmountCanceled(),
        testResult.getAmountCanceled());
    assertEquals(
        "expect equals baseAmountAuthorized ",
        this.records[0].getBaseAmountAuthorized(),
        testResult.getBaseAmountAuthorized());
    assertEquals(
        "expect equals baseAmountPaidOnline ",
        this.records[0].getBaseAmountPaidOnline(),
        testResult.getBaseAmountPaidOnline());
    assertEquals(
        "expect equals baseAmountRefundedOnline ",
        this.records[0].getBaseAmountRefundedOnline(),
        testResult.getBaseAmountRefundedOnline());
    assertEquals(
        "expect equals baseShippingAmount ",
        this.records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    assertEquals(
        "expect equals shippingAmount ",
        this.records[0].getShippingAmount(),
        testResult.getShippingAmount());
    assertEquals(
        "expect equals amountPaid ", this.records[0].getAmountPaid(), testResult.getAmountPaid());
    assertEquals(
        "expect equals amountAuthorized ",
        this.records[0].getAmountAuthorized(),
        testResult.getAmountAuthorized());
    assertEquals(
        "expect equals baseAmountOrdered ",
        this.records[0].getBaseAmountOrdered(),
        testResult.getBaseAmountOrdered());
    assertEquals(
        "expect equals baseShippingRefunded ",
        this.records[0].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    assertEquals(
        "expect equals shippingRefunded ",
        this.records[0].getShippingRefunded(),
        testResult.getShippingRefunded());
    assertEquals(
        "expect equals baseAmountRefunded ",
        this.records[0].getBaseAmountRefunded(),
        testResult.getBaseAmountRefunded());
    assertEquals(
        "expect equals amountOrdered ",
        this.records[0].getAmountOrdered(),
        testResult.getAmountOrdered());
    assertEquals(
        "expect equals baseAmountCanceled ",
        this.records[0].getBaseAmountCanceled(),
        testResult.getBaseAmountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals quotePaymentId ",
        this.records[0].getQuotePaymentId(),
        testResult.getQuotePaymentId());
    assertEquals(
        "expect equals additionalData ",
        this.records[0].getAdditionalData(),
        testResult.getAdditionalData());
    assertEquals(
        "expect equals ccExpMonth ", this.records[0].getCcExpMonth(), testResult.getCcExpMonth());
    assertEquals(
        "expect equals ccSsStartYear ",
        this.records[0].getCcSsStartYear(),
        testResult.getCcSsStartYear());
    assertEquals(
        "expect equals echeckBankName ",
        this.records[0].getEcheckBankName(),
        testResult.getEcheckBankName());
    assertEquals("expect equals method ", this.records[0].getMethod(), testResult.getMethod());
    assertEquals(
        "expect equals ccDebugRequestBody ",
        this.records[0].getCcDebugRequestBody(),
        testResult.getCcDebugRequestBody());
    assertEquals(
        "expect equals ccSecureVerify ",
        this.records[0].getCcSecureVerify(),
        testResult.getCcSecureVerify());
    assertEquals(
        "expect equals protectionEligibility ",
        this.records[0].getProtectionEligibility(),
        testResult.getProtectionEligibility());
    assertEquals(
        "expect equals ccApproval ", this.records[0].getCcApproval(), testResult.getCcApproval());
    assertEquals("expect equals ccLast4 ", this.records[0].getCcLast4(), testResult.getCcLast4());
    assertEquals(
        "expect equals ccStatusDescription ",
        this.records[0].getCcStatusDescription(),
        testResult.getCcStatusDescription());
    assertEquals(
        "expect equals echeckType ", this.records[0].getEcheckType(), testResult.getEcheckType());
    assertEquals(
        "expect equals ccDebugResponseSerialized ",
        this.records[0].getCcDebugResponseSerialized(),
        testResult.getCcDebugResponseSerialized());
    assertEquals(
        "expect equals ccSsStartMonth ",
        this.records[0].getCcSsStartMonth(),
        testResult.getCcSsStartMonth());
    assertEquals(
        "expect equals echeckAccountType ",
        this.records[0].getEcheckAccountType(),
        testResult.getEcheckAccountType());
    assertEquals(
        "expect equals lastTransId ",
        this.records[0].getLastTransId(),
        testResult.getLastTransId());
    assertEquals(
        "expect equals ccCidStatus ",
        this.records[0].getCcCidStatus(),
        testResult.getCcCidStatus());
    assertEquals("expect equals ccOwner ", this.records[0].getCcOwner(), testResult.getCcOwner());
    assertEquals("expect equals ccType ", this.records[0].getCcType(), testResult.getCcType());
    assertEquals(
        "expect equals poNumber ", this.records[0].getPoNumber(), testResult.getPoNumber());
    assertEquals(
        "expect equals ccExpYear ", this.records[0].getCcExpYear(), testResult.getCcExpYear());
    assertEquals(
        "expect equals ccStatus ", this.records[0].getCcStatus(), testResult.getCcStatus());
    assertEquals(
        "expect equals echeckRoutingNumber ",
        this.records[0].getEcheckRoutingNumber(),
        testResult.getEcheckRoutingNumber());
    assertEquals(
        "expect equals accountStatus ",
        this.records[0].getAccountStatus(),
        testResult.getAccountStatus());
    assertEquals(
        "expect equals anetTransMethod ",
        this.records[0].getAnetTransMethod(),
        testResult.getAnetTransMethod());
    assertEquals(
        "expect equals ccDebugResponseBody ",
        this.records[0].getCcDebugResponseBody(),
        testResult.getCcDebugResponseBody());
    assertEquals(
        "expect equals ccSsIssue ", this.records[0].getCcSsIssue(), testResult.getCcSsIssue());
    assertEquals(
        "expect equals echeckAccountName ",
        this.records[0].getEcheckAccountName(),
        testResult.getEcheckAccountName());
    assertEquals(
        "expect equals ccAvsStatus ",
        this.records[0].getCcAvsStatus(),
        testResult.getCcAvsStatus());
    assertEquals(
        "expect equals ccNumberEnc ",
        this.records[0].getCcNumberEnc(),
        testResult.getCcNumberEnc());
    assertEquals(
        "expect equals ccTransId ", this.records[0].getCcTransId(), testResult.getCcTransId());
    assertEquals(
        "expect equals addressStatus ",
        this.records[0].getAddressStatus(),
        testResult.getAddressStatus());
    assertEquals(
        "expect equals additionalInformation ",
        this.records[0].getAdditionalInformation(),
        testResult.getAdditionalInformation());

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
