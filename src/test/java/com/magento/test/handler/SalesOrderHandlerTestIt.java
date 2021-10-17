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
import com.magento.test.entity.SalesOrder;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultSalesOrderDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import com.magento.test.entity.SalesOrderId;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalesOrderHandlerTestIt {
  static final String inputFile = "SalesOrder.json";
  static SalesOrderHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrder[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new SalesOrderHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, SalesOrder[].class);
    assertEquals("match count", count, records.length);
    final SalesOrderId id =
        new SalesOrderId(
            this.records[0].getStoreId(),
            this.records[0].getIncrementId(),
            this.records[0].getEntityId());
    SalesOrder testResult = jpa.find(SalesOrder.class, id);
    assertEquals("expect equals state ", this.records[0].getState(), testResult.getState());
    assertEquals("expect equals status ", this.records[0].getStatus(), testResult.getStatus());
    assertEquals(
        "expect equals couponCode ", this.records[0].getCouponCode(), testResult.getCouponCode());
    assertEquals(
        "expect equals protectCode ",
        this.records[0].getProtectCode(),
        testResult.getProtectCode());
    assertEquals(
        "expect equals shippingDescription ",
        this.records[0].getShippingDescription(),
        testResult.getShippingDescription());
    org.junit.Assert.assertEquals(
        "expect equals isVirtual ", this.records[0].getIsVirtual(), testResult.getIsVirtual());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    assertEquals(
        "expect equals baseDiscountCanceled ",
        this.records[0].getBaseDiscountCanceled(),
        testResult.getBaseDiscountCanceled());
    assertEquals(
        "expect equals baseDiscountInvoiced ",
        this.records[0].getBaseDiscountInvoiced(),
        testResult.getBaseDiscountInvoiced());
    assertEquals(
        "expect equals baseDiscountRefunded ",
        this.records[0].getBaseDiscountRefunded(),
        testResult.getBaseDiscountRefunded());
    assertEquals(
        "expect equals baseGrandTotal ",
        this.records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    assertEquals(
        "expect equals baseShippingAmount ",
        this.records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    assertEquals(
        "expect equals baseShippingCanceled ",
        this.records[0].getBaseShippingCanceled(),
        testResult.getBaseShippingCanceled());
    assertEquals(
        "expect equals baseShippingInvoiced ",
        this.records[0].getBaseShippingInvoiced(),
        testResult.getBaseShippingInvoiced());
    assertEquals(
        "expect equals baseShippingRefunded ",
        this.records[0].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    assertEquals(
        "expect equals baseShippingTaxAmount ",
        this.records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    assertEquals(
        "expect equals baseShippingTaxRefunded ",
        this.records[0].getBaseShippingTaxRefunded(),
        testResult.getBaseShippingTaxRefunded());
    assertEquals(
        "expect equals baseSubtotal ",
        this.records[0].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    assertEquals(
        "expect equals baseSubtotalCanceled ",
        this.records[0].getBaseSubtotalCanceled(),
        testResult.getBaseSubtotalCanceled());
    assertEquals(
        "expect equals baseSubtotalInvoiced ",
        this.records[0].getBaseSubtotalInvoiced(),
        testResult.getBaseSubtotalInvoiced());
    assertEquals(
        "expect equals baseSubtotalRefunded ",
        this.records[0].getBaseSubtotalRefunded(),
        testResult.getBaseSubtotalRefunded());
    assertEquals(
        "expect equals baseTaxAmount ",
        this.records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    assertEquals(
        "expect equals baseTaxCanceled ",
        this.records[0].getBaseTaxCanceled(),
        testResult.getBaseTaxCanceled());
    assertEquals(
        "expect equals baseTaxInvoiced ",
        this.records[0].getBaseTaxInvoiced(),
        testResult.getBaseTaxInvoiced());
    assertEquals(
        "expect equals baseTaxRefunded ",
        this.records[0].getBaseTaxRefunded(),
        testResult.getBaseTaxRefunded());
    assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[0].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    assertEquals(
        "expect equals baseToOrderRate ",
        this.records[0].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    assertEquals(
        "expect equals baseTotalCanceled ",
        this.records[0].getBaseTotalCanceled(),
        testResult.getBaseTotalCanceled());
    assertEquals(
        "expect equals baseTotalInvoiced ",
        this.records[0].getBaseTotalInvoiced(),
        testResult.getBaseTotalInvoiced());
    assertEquals(
        "expect equals baseTotalInvoicedCost ",
        this.records[0].getBaseTotalInvoicedCost(),
        testResult.getBaseTotalInvoicedCost());
    assertEquals(
        "expect equals baseTotalOfflineRefunded ",
        this.records[0].getBaseTotalOfflineRefunded(),
        testResult.getBaseTotalOfflineRefunded());
    assertEquals(
        "expect equals baseTotalOnlineRefunded ",
        this.records[0].getBaseTotalOnlineRefunded(),
        testResult.getBaseTotalOnlineRefunded());
    assertEquals(
        "expect equals baseTotalPaid ",
        this.records[0].getBaseTotalPaid(),
        testResult.getBaseTotalPaid());
    assertEquals(
        "expect equals baseTotalQtyOrdered ",
        this.records[0].getBaseTotalQtyOrdered(),
        testResult.getBaseTotalQtyOrdered());
    assertEquals(
        "expect equals baseTotalRefunded ",
        this.records[0].getBaseTotalRefunded(),
        testResult.getBaseTotalRefunded());
    assertEquals(
        "expect equals discountAmount ",
        this.records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    assertEquals(
        "expect equals discountCanceled ",
        this.records[0].getDiscountCanceled(),
        testResult.getDiscountCanceled());
    assertEquals(
        "expect equals discountInvoiced ",
        this.records[0].getDiscountInvoiced(),
        testResult.getDiscountInvoiced());
    assertEquals(
        "expect equals discountRefunded ",
        this.records[0].getDiscountRefunded(),
        testResult.getDiscountRefunded());
    assertEquals(
        "expect equals grandTotal ", this.records[0].getGrandTotal(), testResult.getGrandTotal());
    assertEquals(
        "expect equals shippingAmount ",
        this.records[0].getShippingAmount(),
        testResult.getShippingAmount());
    assertEquals(
        "expect equals shippingCanceled ",
        this.records[0].getShippingCanceled(),
        testResult.getShippingCanceled());
    assertEquals(
        "expect equals shippingInvoiced ",
        this.records[0].getShippingInvoiced(),
        testResult.getShippingInvoiced());
    assertEquals(
        "expect equals shippingRefunded ",
        this.records[0].getShippingRefunded(),
        testResult.getShippingRefunded());
    assertEquals(
        "expect equals shippingTaxAmount ",
        this.records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    assertEquals(
        "expect equals shippingTaxRefunded ",
        this.records[0].getShippingTaxRefunded(),
        testResult.getShippingTaxRefunded());
    assertEquals(
        "expect equals storeToBaseRate ",
        this.records[0].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    assertEquals(
        "expect equals storeToOrderRate ",
        this.records[0].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    assertEquals(
        "expect equals subtotal ", this.records[0].getSubtotal(), testResult.getSubtotal());
    assertEquals(
        "expect equals subtotalCanceled ",
        this.records[0].getSubtotalCanceled(),
        testResult.getSubtotalCanceled());
    assertEquals(
        "expect equals subtotalInvoiced ",
        this.records[0].getSubtotalInvoiced(),
        testResult.getSubtotalInvoiced());
    assertEquals(
        "expect equals subtotalRefunded ",
        this.records[0].getSubtotalRefunded(),
        testResult.getSubtotalRefunded());
    assertEquals(
        "expect equals taxAmount ", this.records[0].getTaxAmount(), testResult.getTaxAmount());
    assertEquals(
        "expect equals taxCanceled ",
        this.records[0].getTaxCanceled(),
        testResult.getTaxCanceled());
    assertEquals(
        "expect equals taxInvoiced ",
        this.records[0].getTaxInvoiced(),
        testResult.getTaxInvoiced());
    assertEquals(
        "expect equals taxRefunded ",
        this.records[0].getTaxRefunded(),
        testResult.getTaxRefunded());
    assertEquals(
        "expect equals totalCanceled ",
        this.records[0].getTotalCanceled(),
        testResult.getTotalCanceled());
    assertEquals(
        "expect equals totalInvoiced ",
        this.records[0].getTotalInvoiced(),
        testResult.getTotalInvoiced());
    assertEquals(
        "expect equals totalOfflineRefunded ",
        this.records[0].getTotalOfflineRefunded(),
        testResult.getTotalOfflineRefunded());
    assertEquals(
        "expect equals totalOnlineRefunded ",
        this.records[0].getTotalOnlineRefunded(),
        testResult.getTotalOnlineRefunded());
    assertEquals(
        "expect equals totalPaid ", this.records[0].getTotalPaid(), testResult.getTotalPaid());
    assertEquals(
        "expect equals totalQtyOrdered ",
        this.records[0].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    assertEquals(
        "expect equals totalRefunded ",
        this.records[0].getTotalRefunded(),
        testResult.getTotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals canShipPartially ",
        this.records[0].getCanShipPartially(),
        testResult.getCanShipPartially());
    org.junit.Assert.assertEquals(
        "expect equals canShipPartiallyItem ",
        this.records[0].getCanShipPartiallyItem(),
        testResult.getCanShipPartiallyItem());
    org.junit.Assert.assertEquals(
        "expect equals customerIsGuest ",
        this.records[0].getCustomerIsGuest(),
        testResult.getCustomerIsGuest());
    org.junit.Assert.assertEquals(
        "expect equals customerNoteNotify ",
        this.records[0].getCustomerNoteNotify(),
        testResult.getCustomerNoteNotify());
    org.junit.Assert.assertEquals(
        "expect equals billingAddressId ",
        this.records[0].getBillingAddressId(),
        testResult.getBillingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals customerGroupId ",
        this.records[0].getCustomerGroupId(),
        testResult.getCustomerGroupId());
    org.junit.Assert.assertEquals(
        "expect equals editIncrement ",
        this.records[0].getEditIncrement(),
        testResult.getEditIncrement());
    org.junit.Assert.assertEquals(
        "expect equals emailSent ", this.records[0].getEmailSent(), testResult.getEmailSent());
    org.junit.Assert.assertEquals(
        "expect equals sendEmail ", this.records[0].getSendEmail(), testResult.getSendEmail());
    org.junit.Assert.assertEquals(
        "expect equals forcedShipmentWithInvoice ",
        this.records[0].getForcedShipmentWithInvoice(),
        testResult.getForcedShipmentWithInvoice());
    org.junit.Assert.assertEquals(
        "expect equals paymentAuthExpiration ",
        this.records[0].getPaymentAuthExpiration(),
        testResult.getPaymentAuthExpiration());
    org.junit.Assert.assertEquals(
        "expect equals quoteAddressId ",
        this.records[0].getQuoteAddressId(),
        testResult.getQuoteAddressId());
    org.junit.Assert.assertEquals(
        "expect equals quoteId ", this.records[0].getQuoteId(), testResult.getQuoteId());
    org.junit.Assert.assertEquals(
        "expect equals shippingAddressId ",
        this.records[0].getShippingAddressId(),
        testResult.getShippingAddressId());
    assertEquals(
        "expect equals adjustmentNegative ",
        this.records[0].getAdjustmentNegative(),
        testResult.getAdjustmentNegative());
    assertEquals(
        "expect equals adjustmentPositive ",
        this.records[0].getAdjustmentPositive(),
        testResult.getAdjustmentPositive());
    assertEquals(
        "expect equals baseAdjustmentNegative ",
        this.records[0].getBaseAdjustmentNegative(),
        testResult.getBaseAdjustmentNegative());
    assertEquals(
        "expect equals baseAdjustmentPositive ",
        this.records[0].getBaseAdjustmentPositive(),
        testResult.getBaseAdjustmentPositive());
    assertEquals(
        "expect equals baseShippingDiscountAmount ",
        this.records[0].getBaseShippingDiscountAmount(),
        testResult.getBaseShippingDiscountAmount());
    assertEquals(
        "expect equals baseSubtotalInclTax ",
        this.records[0].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    assertEquals(
        "expect equals baseTotalDue ",
        this.records[0].getBaseTotalDue(),
        testResult.getBaseTotalDue());
    assertEquals(
        "expect equals paymentAuthorizationAmount ",
        this.records[0].getPaymentAuthorizationAmount(),
        testResult.getPaymentAuthorizationAmount());
    assertEquals(
        "expect equals shippingDiscountAmount ",
        this.records[0].getShippingDiscountAmount(),
        testResult.getShippingDiscountAmount());
    assertEquals(
        "expect equals subtotalInclTax ",
        this.records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    assertEquals(
        "expect equals totalDue ", this.records[0].getTotalDue(), testResult.getTotalDue());
    assertEquals("expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    assertEquals(
        "expect equals appliedRuleIds ",
        this.records[0].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[0].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    assertEquals(
        "expect equals customerEmail ",
        this.records[0].getCustomerEmail(),
        testResult.getCustomerEmail());
    assertEquals(
        "expect equals customerFirstname ",
        this.records[0].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    assertEquals(
        "expect equals customerLastname ",
        this.records[0].getCustomerLastname(),
        testResult.getCustomerLastname());
    assertEquals(
        "expect equals customerMiddlename ",
        this.records[0].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    assertEquals(
        "expect equals customerPrefix ",
        this.records[0].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    assertEquals(
        "expect equals customerSuffix ",
        this.records[0].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    assertEquals(
        "expect equals customerTaxvat ",
        this.records[0].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    assertEquals(
        "expect equals discountDescription ",
        this.records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    assertEquals(
        "expect equals extCustomerId ",
        this.records[0].getExtCustomerId(),
        testResult.getExtCustomerId());
    assertEquals(
        "expect equals extOrderId ", this.records[0].getExtOrderId(), testResult.getExtOrderId());
    assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[0].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    assertEquals(
        "expect equals holdBeforeState ",
        this.records[0].getHoldBeforeState(),
        testResult.getHoldBeforeState());
    assertEquals(
        "expect equals holdBeforeStatus ",
        this.records[0].getHoldBeforeStatus(),
        testResult.getHoldBeforeStatus());
    assertEquals(
        "expect equals orderCurrencyCode ",
        this.records[0].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    assertEquals(
        "expect equals originalIncrementId ",
        this.records[0].getOriginalIncrementId(),
        testResult.getOriginalIncrementId());
    assertEquals(
        "expect equals relationChildId ",
        this.records[0].getRelationChildId(),
        testResult.getRelationChildId());
    assertEquals(
        "expect equals relationChildRealId ",
        this.records[0].getRelationChildRealId(),
        testResult.getRelationChildRealId());
    assertEquals(
        "expect equals relationParentId ",
        this.records[0].getRelationParentId(),
        testResult.getRelationParentId());
    assertEquals(
        "expect equals relationParentRealId ",
        this.records[0].getRelationParentRealId(),
        testResult.getRelationParentRealId());
    assertEquals(
        "expect equals remoteIp ", this.records[0].getRemoteIp(), testResult.getRemoteIp());
    assertEquals(
        "expect equals shippingMethod ",
        this.records[0].getShippingMethod(),
        testResult.getShippingMethod());
    assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[0].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    assertEquals(
        "expect equals storeName ", this.records[0].getStoreName(), testResult.getStoreName());
    assertEquals(
        "expect equals xForwardedFor ",
        this.records[0].getXForwardedFor(),
        testResult.getXForwardedFor());
    assertEquals(
        "expect equals customerNote ",
        this.records[0].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertEquals(
        "expect equals totalItemCount ",
        this.records[0].getTotalItemCount(),
        testResult.getTotalItemCount());
    org.junit.Assert.assertEquals(
        "expect equals customerGender ",
        this.records[0].getCustomerGender(),
        testResult.getCustomerGender());
    assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        this.records[0].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        this.records[0].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    assertEquals(
        "expect equals discountTaxCompensationInvoiced ",
        this.records[0].getDiscountTaxCompensationInvoiced(),
        testResult.getDiscountTaxCompensationInvoiced());
    assertEquals(
        "expect equals baseDiscountTaxCompensationInvoiced ",
        this.records[0].getBaseDiscountTaxCompensationInvoiced(),
        testResult.getBaseDiscountTaxCompensationInvoiced());
    assertEquals(
        "expect equals discountTaxCompensationRefunded ",
        this.records[0].getDiscountTaxCompensationRefunded(),
        testResult.getDiscountTaxCompensationRefunded());
    assertEquals(
        "expect equals baseDiscountTaxCompensationRefunded ",
        this.records[0].getBaseDiscountTaxCompensationRefunded(),
        testResult.getBaseDiscountTaxCompensationRefunded());
    assertEquals(
        "expect equals shippingInclTax ",
        this.records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    assertEquals(
        "expect equals baseShippingInclTax ",
        this.records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    assertEquals(
        "expect equals couponRuleName ",
        this.records[0].getCouponRuleName(),
        testResult.getCouponRuleName());
    org.junit.Assert.assertEquals(
        "expect equals giftMessageId ",
        this.records[0].getGiftMessageId(),
        testResult.getGiftMessageId());
    org.junit.Assert.assertEquals(
        "expect equals paypalIpnCustomerNotified ",
        this.records[0].getPaypalIpnCustomerNotified(),
        testResult.getPaypalIpnCustomerNotified());

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
