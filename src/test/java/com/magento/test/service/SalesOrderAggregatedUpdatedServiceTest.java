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

import com.magento.test.entity.SalesOrderAggregatedUpdated;
import com.magento.test.entity.SalesOrderAggregatedUpdatedId;

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

public class SalesOrderAggregatedUpdatedServiceTest {
  private static DefaultSalesOrderAggregatedUpdatedService serviceMock;
  private static SalesOrderAggregatedUpdated[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultSalesOrderAggregatedUpdatedService.class);
    String inputFile = "SalesOrderAggregatedUpdated.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrderAggregatedUpdated[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final SalesOrderAggregatedUpdatedId id =
        new SalesOrderAggregatedUpdatedId(
            records[0].getStoreId(),
            records[0].getOrderStatus(),
            records[0].getPeriod(),
            records[0].getId());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final SalesOrderAggregatedUpdatedId id =
        new SalesOrderAggregatedUpdatedId(
            records[0].getStoreId(),
            records[0].getOrderStatus(),
            records[0].getPeriod(),
            records[0].getId());
    SalesOrderAggregatedUpdated testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals ordersCount ", records[0].getOrdersCount() == testResult.getOrdersCount());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyOrdered ",
        records[0].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyInvoiced ",
        records[0].getTotalQtyInvoiced(),
        testResult.getTotalQtyInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals totalIncomeAmount ",
        records[0].getTotalIncomeAmount(),
        testResult.getTotalIncomeAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalRevenueAmount ",
        records[0].getTotalRevenueAmount(),
        testResult.getTotalRevenueAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalProfitAmount ",
        records[0].getTotalProfitAmount(),
        testResult.getTotalProfitAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalInvoicedAmount ",
        records[0].getTotalInvoicedAmount(),
        testResult.getTotalInvoicedAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalCanceledAmount ",
        records[0].getTotalCanceledAmount(),
        testResult.getTotalCanceledAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalPaidAmount ",
        records[0].getTotalPaidAmount(),
        testResult.getTotalPaidAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalRefundedAmount ",
        records[0].getTotalRefundedAmount(),
        testResult.getTotalRefundedAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalTaxAmount ",
        records[0].getTotalTaxAmount(),
        testResult.getTotalTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalTaxAmountActual ",
        records[0].getTotalTaxAmountActual(),
        testResult.getTotalTaxAmountActual());
    org.junit.Assert.assertEquals(
        "expect equals totalShippingAmount ",
        records[0].getTotalShippingAmount(),
        testResult.getTotalShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalShippingAmountActual ",
        records[0].getTotalShippingAmountActual(),
        testResult.getTotalShippingAmountActual());
    org.junit.Assert.assertEquals(
        "expect equals totalDiscountAmount ",
        records[0].getTotalDiscountAmount(),
        testResult.getTotalDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals totalDiscountAmountActual ",
        records[0].getTotalDiscountAmountActual(),
        testResult.getTotalDiscountAmountActual());
  }
}
