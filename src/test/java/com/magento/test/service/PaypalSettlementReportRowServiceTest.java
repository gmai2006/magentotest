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

import com.magento.test.entity.PaypalSettlementReportRow;

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

public class PaypalSettlementReportRowServiceTest {
  private static DefaultPaypalSettlementReportRowService serviceMock;
  private static PaypalSettlementReportRow[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultPaypalSettlementReportRowService.class);
    String inputFile = "PaypalSettlementReportRow.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, PaypalSettlementReportRow[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getRowId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    PaypalSettlementReportRow testResult = serviceMock.find(records[0].getRowId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals reportId ", records[0].getReportId() == testResult.getReportId());
    org.junit.Assert.assertEquals(
        "expect equals transactionId ",
        records[0].getTransactionId(),
        testResult.getTransactionId());
    org.junit.Assert.assertEquals(
        "expect equals invoiceId ", records[0].getInvoiceId(), testResult.getInvoiceId());
    org.junit.Assert.assertEquals(
        "expect equals paypalReferenceId ",
        records[0].getPaypalReferenceId(),
        testResult.getPaypalReferenceId());
    org.junit.Assert.assertEquals(
        "expect equals paypalReferenceIdType ",
        records[0].getPaypalReferenceIdType(),
        testResult.getPaypalReferenceIdType());
    org.junit.Assert.assertEquals(
        "expect equals transactionEventCode ",
        records[0].getTransactionEventCode(),
        testResult.getTransactionEventCode());
    org.junit.Assert.assertEquals(
        "expect equals transactionDebitOrCredit ",
        records[0].getTransactionDebitOrCredit(),
        testResult.getTransactionDebitOrCredit());
    org.junit.Assert.assertEquals(
        "expect equals grossTransactionAmount ",
        records[0].getGrossTransactionAmount(),
        testResult.getGrossTransactionAmount());
    org.junit.Assert.assertEquals(
        "expect equals grossTransactionCurrency ",
        records[0].getGrossTransactionCurrency(),
        testResult.getGrossTransactionCurrency());
    org.junit.Assert.assertEquals(
        "expect equals feeDebitOrCredit ",
        records[0].getFeeDebitOrCredit(),
        testResult.getFeeDebitOrCredit());
    org.junit.Assert.assertEquals(
        "expect equals feeAmount ", records[0].getFeeAmount(), testResult.getFeeAmount());
    org.junit.Assert.assertEquals(
        "expect equals feeCurrency ", records[0].getFeeCurrency(), testResult.getFeeCurrency());
    org.junit.Assert.assertEquals(
        "expect equals customField ", records[0].getCustomField(), testResult.getCustomField());
    org.junit.Assert.assertEquals(
        "expect equals consumerId ", records[0].getConsumerId(), testResult.getConsumerId());
    org.junit.Assert.assertEquals(
        "expect equals paymentTrackingId ",
        records[0].getPaymentTrackingId(),
        testResult.getPaymentTrackingId());
    org.junit.Assert.assertEquals(
        "expect equals storeId ", records[0].getStoreId(), testResult.getStoreId());
  }
}
