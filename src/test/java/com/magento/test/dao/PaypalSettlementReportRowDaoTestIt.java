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
import com.magento.test.entity.PaypalSettlementReportRow;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class PaypalSettlementReportRowDaoTestIt {
  static final String inputFile = "PaypalSettlementReportRow.json";
  static PaypalSettlementReportRowDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private PaypalSettlementReportRow[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultPaypalSettlementReportRowDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, PaypalSettlementReportRow[].class);
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
    PaypalSettlementReportRow testResult = dao.find(records[1].getRowId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals reportId ", this.records[1].getReportId() == testResult.getReportId());
    org.junit.Assert.assertEquals(
        "expect equals transactionId ",
        this.records[1].getTransactionId(),
        testResult.getTransactionId());
    org.junit.Assert.assertEquals(
        "expect equals invoiceId ", this.records[1].getInvoiceId(), testResult.getInvoiceId());
    org.junit.Assert.assertEquals(
        "expect equals paypalReferenceId ",
        this.records[1].getPaypalReferenceId(),
        testResult.getPaypalReferenceId());
    org.junit.Assert.assertEquals(
        "expect equals paypalReferenceIdType ",
        this.records[1].getPaypalReferenceIdType(),
        testResult.getPaypalReferenceIdType());
    org.junit.Assert.assertEquals(
        "expect equals transactionEventCode ",
        this.records[1].getTransactionEventCode(),
        testResult.getTransactionEventCode());
    org.junit.Assert.assertEquals(
        "expect equals transactionDebitOrCredit ",
        this.records[1].getTransactionDebitOrCredit(),
        testResult.getTransactionDebitOrCredit());
    org.junit.Assert.assertEquals(
        "expect equals grossTransactionAmount ",
        this.records[1].getGrossTransactionAmount(),
        testResult.getGrossTransactionAmount());
    org.junit.Assert.assertEquals(
        "expect equals grossTransactionCurrency ",
        this.records[1].getGrossTransactionCurrency(),
        testResult.getGrossTransactionCurrency());
    org.junit.Assert.assertEquals(
        "expect equals feeDebitOrCredit ",
        this.records[1].getFeeDebitOrCredit(),
        testResult.getFeeDebitOrCredit());
    org.junit.Assert.assertEquals(
        "expect equals feeAmount ", this.records[1].getFeeAmount(), testResult.getFeeAmount());
    org.junit.Assert.assertEquals(
        "expect equals feeCurrency ",
        this.records[1].getFeeCurrency(),
        testResult.getFeeCurrency());
    org.junit.Assert.assertEquals(
        "expect equals customField ",
        this.records[1].getCustomField(),
        testResult.getCustomField());
    org.junit.Assert.assertEquals(
        "expect equals consumerId ", this.records[1].getConsumerId(), testResult.getConsumerId());
    org.junit.Assert.assertEquals(
        "expect equals paymentTrackingId ",
        this.records[1].getPaymentTrackingId(),
        testResult.getPaymentTrackingId());
    org.junit.Assert.assertEquals(
        "expect equals storeId ", this.records[1].getStoreId(), testResult.getStoreId());
  }
}
