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
import com.magento.test.entity.SalesOrderPayment;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesOrderPaymentDaoTestIt {
  static final String inputFile = "SalesOrderPayment.json";
  static SalesOrderPaymentDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrderPayment[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesOrderPaymentDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderPayment[].class);
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
    SalesOrderPayment testResult = dao.find(records[1].getEntityId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentId ", this.records[1].getParentId() == testResult.getParentId());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingCaptured ",
        this.records[1].getBaseShippingCaptured(),
        testResult.getBaseShippingCaptured());
    org.junit.Assert.assertEquals(
        "expect equals shippingCaptured ",
        this.records[1].getShippingCaptured(),
        testResult.getShippingCaptured());
    org.junit.Assert.assertEquals(
        "expect equals amountRefunded ",
        this.records[1].getAmountRefunded(),
        testResult.getAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountPaid ",
        this.records[1].getBaseAmountPaid(),
        testResult.getBaseAmountPaid());
    org.junit.Assert.assertEquals(
        "expect equals amountCanceled ",
        this.records[1].getAmountCanceled(),
        testResult.getAmountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountAuthorized ",
        this.records[1].getBaseAmountAuthorized(),
        testResult.getBaseAmountAuthorized());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountPaidOnline ",
        this.records[1].getBaseAmountPaidOnline(),
        testResult.getBaseAmountPaidOnline());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefundedOnline ",
        this.records[1].getBaseAmountRefundedOnline(),
        testResult.getBaseAmountRefundedOnline());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        this.records[1].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        this.records[1].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals amountPaid ", this.records[1].getAmountPaid(), testResult.getAmountPaid());
    org.junit.Assert.assertEquals(
        "expect equals amountAuthorized ",
        this.records[1].getAmountAuthorized(),
        testResult.getAmountAuthorized());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountOrdered ",
        this.records[1].getBaseAmountOrdered(),
        testResult.getBaseAmountOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingRefunded ",
        this.records[1].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingRefunded ",
        this.records[1].getShippingRefunded(),
        testResult.getShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefunded ",
        this.records[1].getBaseAmountRefunded(),
        testResult.getBaseAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals amountOrdered ",
        this.records[1].getAmountOrdered(),
        testResult.getAmountOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountCanceled ",
        this.records[1].getBaseAmountCanceled(),
        testResult.getBaseAmountCanceled());
    org.junit.Assert.assertTrue(
        "expect equals quotePaymentId ",
        this.records[1].getQuotePaymentId() == testResult.getQuotePaymentId());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        this.records[1].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals ccExpMonth ", this.records[1].getCcExpMonth(), testResult.getCcExpMonth());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartYear ",
        this.records[1].getCcSsStartYear(),
        testResult.getCcSsStartYear());
    org.junit.Assert.assertEquals(
        "expect equals echeckBankName ",
        this.records[1].getEcheckBankName(),
        testResult.getEcheckBankName());
    org.junit.Assert.assertEquals(
        "expect equals method ", this.records[1].getMethod(), testResult.getMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugRequestBody ",
        this.records[1].getCcDebugRequestBody(),
        testResult.getCcDebugRequestBody());
    org.junit.Assert.assertEquals(
        "expect equals ccSecureVerify ",
        this.records[1].getCcSecureVerify(),
        testResult.getCcSecureVerify());
    org.junit.Assert.assertEquals(
        "expect equals protectionEligibility ",
        this.records[1].getProtectionEligibility(),
        testResult.getProtectionEligibility());
    org.junit.Assert.assertEquals(
        "expect equals ccApproval ", this.records[1].getCcApproval(), testResult.getCcApproval());
    org.junit.Assert.assertEquals(
        "expect equals ccLast4 ", this.records[1].getCcLast4(), testResult.getCcLast4());
    org.junit.Assert.assertEquals(
        "expect equals ccStatusDescription ",
        this.records[1].getCcStatusDescription(),
        testResult.getCcStatusDescription());
    org.junit.Assert.assertEquals(
        "expect equals echeckType ", this.records[1].getEcheckType(), testResult.getEcheckType());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugResponseSerialized ",
        this.records[1].getCcDebugResponseSerialized(),
        testResult.getCcDebugResponseSerialized());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartMonth ",
        this.records[1].getCcSsStartMonth(),
        testResult.getCcSsStartMonth());
    org.junit.Assert.assertEquals(
        "expect equals echeckAccountType ",
        this.records[1].getEcheckAccountType(),
        testResult.getEcheckAccountType());
    org.junit.Assert.assertEquals(
        "expect equals lastTransId ",
        this.records[1].getLastTransId(),
        testResult.getLastTransId());
    org.junit.Assert.assertEquals(
        "expect equals ccCidStatus ",
        this.records[1].getCcCidStatus(),
        testResult.getCcCidStatus());
    org.junit.Assert.assertEquals(
        "expect equals ccOwner ", this.records[1].getCcOwner(), testResult.getCcOwner());
    org.junit.Assert.assertEquals(
        "expect equals ccType ", this.records[1].getCcType(), testResult.getCcType());
    org.junit.Assert.assertEquals(
        "expect equals poNumber ", this.records[1].getPoNumber(), testResult.getPoNumber());
    org.junit.Assert.assertEquals(
        "expect equals ccExpYear ", this.records[1].getCcExpYear(), testResult.getCcExpYear());
    org.junit.Assert.assertEquals(
        "expect equals ccStatus ", this.records[1].getCcStatus(), testResult.getCcStatus());
    org.junit.Assert.assertEquals(
        "expect equals echeckRoutingNumber ",
        this.records[1].getEcheckRoutingNumber(),
        testResult.getEcheckRoutingNumber());
    org.junit.Assert.assertEquals(
        "expect equals accountStatus ",
        this.records[1].getAccountStatus(),
        testResult.getAccountStatus());
    org.junit.Assert.assertEquals(
        "expect equals anetTransMethod ",
        this.records[1].getAnetTransMethod(),
        testResult.getAnetTransMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugResponseBody ",
        this.records[1].getCcDebugResponseBody(),
        testResult.getCcDebugResponseBody());
    org.junit.Assert.assertEquals(
        "expect equals ccSsIssue ", this.records[1].getCcSsIssue(), testResult.getCcSsIssue());
    org.junit.Assert.assertEquals(
        "expect equals echeckAccountName ",
        this.records[1].getEcheckAccountName(),
        testResult.getEcheckAccountName());
    org.junit.Assert.assertEquals(
        "expect equals ccAvsStatus ",
        this.records[1].getCcAvsStatus(),
        testResult.getCcAvsStatus());
    org.junit.Assert.assertEquals(
        "expect equals ccNumberEnc ",
        this.records[1].getCcNumberEnc(),
        testResult.getCcNumberEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccTransId ", this.records[1].getCcTransId(), testResult.getCcTransId());
    org.junit.Assert.assertEquals(
        "expect equals addressStatus ",
        this.records[1].getAddressStatus(),
        testResult.getAddressStatus());
    org.junit.Assert.assertEquals(
        "expect equals additionalInformation ",
        this.records[1].getAdditionalInformation(),
        testResult.getAdditionalInformation());
  }
}
