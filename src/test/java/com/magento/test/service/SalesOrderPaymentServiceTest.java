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

import com.magento.test.entity.SalesOrderPayment;

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

public class SalesOrderPaymentServiceTest {
  private static DefaultSalesOrderPaymentService serviceMock;
  private static SalesOrderPayment[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesOrderPaymentService.class);
    String inputFile = "SalesOrderPayment.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderPayment[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    SalesOrderPayment testResult = serviceMock.find(records[0].getEntityId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals parentId ", records[0].getParentId() == testResult.getParentId());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingCaptured ",
        records[0].getBaseShippingCaptured(),
        testResult.getBaseShippingCaptured());
    org.junit.Assert.assertEquals(
        "expect equals shippingCaptured ",
        records[0].getShippingCaptured(),
        testResult.getShippingCaptured());
    org.junit.Assert.assertEquals(
        "expect equals amountRefunded ",
        records[0].getAmountRefunded(),
        testResult.getAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountPaid ",
        records[0].getBaseAmountPaid(),
        testResult.getBaseAmountPaid());
    org.junit.Assert.assertEquals(
        "expect equals amountCanceled ",
        records[0].getAmountCanceled(),
        testResult.getAmountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountAuthorized ",
        records[0].getBaseAmountAuthorized(),
        testResult.getBaseAmountAuthorized());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountPaidOnline ",
        records[0].getBaseAmountPaidOnline(),
        testResult.getBaseAmountPaidOnline());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefundedOnline ",
        records[0].getBaseAmountRefundedOnline(),
        testResult.getBaseAmountRefundedOnline());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        records[0].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals amountPaid ", records[0].getAmountPaid(), testResult.getAmountPaid());
    org.junit.Assert.assertEquals(
        "expect equals amountAuthorized ",
        records[0].getAmountAuthorized(),
        testResult.getAmountAuthorized());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountOrdered ",
        records[0].getBaseAmountOrdered(),
        testResult.getBaseAmountOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingRefunded ",
        records[0].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingRefunded ",
        records[0].getShippingRefunded(),
        testResult.getShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountRefunded ",
        records[0].getBaseAmountRefunded(),
        testResult.getBaseAmountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals amountOrdered ",
        records[0].getAmountOrdered(),
        testResult.getAmountOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseAmountCanceled ",
        records[0].getBaseAmountCanceled(),
        testResult.getBaseAmountCanceled());
    org.junit.Assert.assertTrue(
        "expect equals quotePaymentId ",
        records[0].getQuotePaymentId() == testResult.getQuotePaymentId());
    org.junit.Assert.assertEquals(
        "expect equals additionalData ",
        records[0].getAdditionalData(),
        testResult.getAdditionalData());
    org.junit.Assert.assertEquals(
        "expect equals ccExpMonth ", records[0].getCcExpMonth(), testResult.getCcExpMonth());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartYear ",
        records[0].getCcSsStartYear(),
        testResult.getCcSsStartYear());
    org.junit.Assert.assertEquals(
        "expect equals echeckBankName ",
        records[0].getEcheckBankName(),
        testResult.getEcheckBankName());
    org.junit.Assert.assertEquals(
        "expect equals method ", records[0].getMethod(), testResult.getMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugRequestBody ",
        records[0].getCcDebugRequestBody(),
        testResult.getCcDebugRequestBody());
    org.junit.Assert.assertEquals(
        "expect equals ccSecureVerify ",
        records[0].getCcSecureVerify(),
        testResult.getCcSecureVerify());
    org.junit.Assert.assertEquals(
        "expect equals protectionEligibility ",
        records[0].getProtectionEligibility(),
        testResult.getProtectionEligibility());
    org.junit.Assert.assertEquals(
        "expect equals ccApproval ", records[0].getCcApproval(), testResult.getCcApproval());
    org.junit.Assert.assertEquals(
        "expect equals ccLast4 ", records[0].getCcLast4(), testResult.getCcLast4());
    org.junit.Assert.assertEquals(
        "expect equals ccStatusDescription ",
        records[0].getCcStatusDescription(),
        testResult.getCcStatusDescription());
    org.junit.Assert.assertEquals(
        "expect equals echeckType ", records[0].getEcheckType(), testResult.getEcheckType());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugResponseSerialized ",
        records[0].getCcDebugResponseSerialized(),
        testResult.getCcDebugResponseSerialized());
    org.junit.Assert.assertEquals(
        "expect equals ccSsStartMonth ",
        records[0].getCcSsStartMonth(),
        testResult.getCcSsStartMonth());
    org.junit.Assert.assertEquals(
        "expect equals echeckAccountType ",
        records[0].getEcheckAccountType(),
        testResult.getEcheckAccountType());
    org.junit.Assert.assertEquals(
        "expect equals lastTransId ", records[0].getLastTransId(), testResult.getLastTransId());
    org.junit.Assert.assertEquals(
        "expect equals ccCidStatus ", records[0].getCcCidStatus(), testResult.getCcCidStatus());
    org.junit.Assert.assertEquals(
        "expect equals ccOwner ", records[0].getCcOwner(), testResult.getCcOwner());
    org.junit.Assert.assertEquals(
        "expect equals ccType ", records[0].getCcType(), testResult.getCcType());
    org.junit.Assert.assertEquals(
        "expect equals poNumber ", records[0].getPoNumber(), testResult.getPoNumber());
    org.junit.Assert.assertEquals(
        "expect equals ccExpYear ", records[0].getCcExpYear(), testResult.getCcExpYear());
    org.junit.Assert.assertEquals(
        "expect equals ccStatus ", records[0].getCcStatus(), testResult.getCcStatus());
    org.junit.Assert.assertEquals(
        "expect equals echeckRoutingNumber ",
        records[0].getEcheckRoutingNumber(),
        testResult.getEcheckRoutingNumber());
    org.junit.Assert.assertEquals(
        "expect equals accountStatus ",
        records[0].getAccountStatus(),
        testResult.getAccountStatus());
    org.junit.Assert.assertEquals(
        "expect equals anetTransMethod ",
        records[0].getAnetTransMethod(),
        testResult.getAnetTransMethod());
    org.junit.Assert.assertEquals(
        "expect equals ccDebugResponseBody ",
        records[0].getCcDebugResponseBody(),
        testResult.getCcDebugResponseBody());
    org.junit.Assert.assertEquals(
        "expect equals ccSsIssue ", records[0].getCcSsIssue(), testResult.getCcSsIssue());
    org.junit.Assert.assertEquals(
        "expect equals echeckAccountName ",
        records[0].getEcheckAccountName(),
        testResult.getEcheckAccountName());
    org.junit.Assert.assertEquals(
        "expect equals ccAvsStatus ", records[0].getCcAvsStatus(), testResult.getCcAvsStatus());
    org.junit.Assert.assertEquals(
        "expect equals ccNumberEnc ", records[0].getCcNumberEnc(), testResult.getCcNumberEnc());
    org.junit.Assert.assertEquals(
        "expect equals ccTransId ", records[0].getCcTransId(), testResult.getCcTransId());
    org.junit.Assert.assertEquals(
        "expect equals addressStatus ",
        records[0].getAddressStatus(),
        testResult.getAddressStatus());
    org.junit.Assert.assertEquals(
        "expect equals additionalInformation ",
        records[0].getAdditionalInformation(),
        testResult.getAdditionalInformation());
  }
}
