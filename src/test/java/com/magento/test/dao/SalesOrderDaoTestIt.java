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
import com.magento.test.entity.SalesOrder;
import com.magento.test.entity.SalesOrderId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class SalesOrderDaoTestIt {
  static final String inputFile = "SalesOrder.json";
  static SalesOrderDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private SalesOrder[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultSalesOrderDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, SalesOrder[].class);
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
    final SalesOrderId id =
        new SalesOrderId(
            this.records[1].getStoreId(),
            this.records[1].getIncrementId(),
            this.records[1].getEntityId());
    SalesOrder testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals state ", this.records[1].getState(), testResult.getState());
    org.junit.Assert.assertEquals(
        "expect equals status ", this.records[1].getStatus(), testResult.getStatus());
    org.junit.Assert.assertEquals(
        "expect equals couponCode ", this.records[1].getCouponCode(), testResult.getCouponCode());
    org.junit.Assert.assertEquals(
        "expect equals protectCode ",
        this.records[1].getProtectCode(),
        testResult.getProtectCode());
    org.junit.Assert.assertEquals(
        "expect equals shippingDescription ",
        this.records[1].getShippingDescription(),
        testResult.getShippingDescription());
    org.junit.Assert.assertTrue(
        "expect equals isVirtual ", this.records[1].getIsVirtual() == testResult.getIsVirtual());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", this.records[1].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[1].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountCanceled ",
        this.records[1].getBaseDiscountCanceled(),
        testResult.getBaseDiscountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountInvoiced ",
        this.records[1].getBaseDiscountInvoiced(),
        testResult.getBaseDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountRefunded ",
        this.records[1].getBaseDiscountRefunded(),
        testResult.getBaseDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        this.records[1].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        this.records[1].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingCanceled ",
        this.records[1].getBaseShippingCanceled(),
        testResult.getBaseShippingCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInvoiced ",
        this.records[1].getBaseShippingInvoiced(),
        testResult.getBaseShippingInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingRefunded ",
        this.records[1].getBaseShippingRefunded(),
        testResult.getBaseShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxAmount ",
        this.records[1].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxRefunded ",
        this.records[1].getBaseShippingTaxRefunded(),
        testResult.getBaseShippingTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ",
        this.records[1].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalCanceled ",
        this.records[1].getBaseSubtotalCanceled(),
        testResult.getBaseSubtotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInvoiced ",
        this.records[1].getBaseSubtotalInvoiced(),
        testResult.getBaseSubtotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalRefunded ",
        this.records[1].getBaseSubtotalRefunded(),
        testResult.getBaseSubtotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        this.records[1].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxCanceled ",
        this.records[1].getBaseTaxCanceled(),
        testResult.getBaseTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxInvoiced ",
        this.records[1].getBaseTaxInvoiced(),
        testResult.getBaseTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxRefunded ",
        this.records[1].getBaseTaxRefunded(),
        testResult.getBaseTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseToGlobalRate ",
        this.records[1].getBaseToGlobalRate(),
        testResult.getBaseToGlobalRate());
    org.junit.Assert.assertEquals(
        "expect equals baseToOrderRate ",
        this.records[1].getBaseToOrderRate(),
        testResult.getBaseToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalCanceled ",
        this.records[1].getBaseTotalCanceled(),
        testResult.getBaseTotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalInvoiced ",
        this.records[1].getBaseTotalInvoiced(),
        testResult.getBaseTotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalInvoicedCost ",
        this.records[1].getBaseTotalInvoicedCost(),
        testResult.getBaseTotalInvoicedCost());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalOfflineRefunded ",
        this.records[1].getBaseTotalOfflineRefunded(),
        testResult.getBaseTotalOfflineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalOnlineRefunded ",
        this.records[1].getBaseTotalOnlineRefunded(),
        testResult.getBaseTotalOnlineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalPaid ",
        this.records[1].getBaseTotalPaid(),
        testResult.getBaseTotalPaid());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalQtyOrdered ",
        this.records[1].getBaseTotalQtyOrdered(),
        testResult.getBaseTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalRefunded ",
        this.records[1].getBaseTotalRefunded(),
        testResult.getBaseTotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        this.records[1].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountCanceled ",
        this.records[1].getDiscountCanceled(),
        testResult.getDiscountCanceled());
    org.junit.Assert.assertEquals(
        "expect equals discountInvoiced ",
        this.records[1].getDiscountInvoiced(),
        testResult.getDiscountInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountRefunded ",
        this.records[1].getDiscountRefunded(),
        testResult.getDiscountRefunded());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", this.records[1].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        this.records[1].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingCanceled ",
        this.records[1].getShippingCanceled(),
        testResult.getShippingCanceled());
    org.junit.Assert.assertEquals(
        "expect equals shippingInvoiced ",
        this.records[1].getShippingInvoiced(),
        testResult.getShippingInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals shippingRefunded ",
        this.records[1].getShippingRefunded(),
        testResult.getShippingRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxAmount ",
        this.records[1].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxRefunded ",
        this.records[1].getShippingTaxRefunded(),
        testResult.getShippingTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals storeToBaseRate ",
        this.records[1].getStoreToBaseRate(),
        testResult.getStoreToBaseRate());
    org.junit.Assert.assertEquals(
        "expect equals storeToOrderRate ",
        this.records[1].getStoreToOrderRate(),
        testResult.getStoreToOrderRate());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", this.records[1].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals subtotalCanceled ",
        this.records[1].getSubtotalCanceled(),
        testResult.getSubtotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInvoiced ",
        this.records[1].getSubtotalInvoiced(),
        testResult.getSubtotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals subtotalRefunded ",
        this.records[1].getSubtotalRefunded(),
        testResult.getSubtotalRefunded());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", this.records[1].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals taxCanceled ",
        this.records[1].getTaxCanceled(),
        testResult.getTaxCanceled());
    org.junit.Assert.assertEquals(
        "expect equals taxInvoiced ",
        this.records[1].getTaxInvoiced(),
        testResult.getTaxInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals taxRefunded ",
        this.records[1].getTaxRefunded(),
        testResult.getTaxRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalCanceled ",
        this.records[1].getTotalCanceled(),
        testResult.getTotalCanceled());
    org.junit.Assert.assertEquals(
        "expect equals totalInvoiced ",
        this.records[1].getTotalInvoiced(),
        testResult.getTotalInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals totalOfflineRefunded ",
        this.records[1].getTotalOfflineRefunded(),
        testResult.getTotalOfflineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalOnlineRefunded ",
        this.records[1].getTotalOnlineRefunded(),
        testResult.getTotalOnlineRefunded());
    org.junit.Assert.assertEquals(
        "expect equals totalPaid ", this.records[1].getTotalPaid(), testResult.getTotalPaid());
    org.junit.Assert.assertEquals(
        "expect equals totalQtyOrdered ",
        this.records[1].getTotalQtyOrdered(),
        testResult.getTotalQtyOrdered());
    org.junit.Assert.assertEquals(
        "expect equals totalRefunded ",
        this.records[1].getTotalRefunded(),
        testResult.getTotalRefunded());
    org.junit.Assert.assertTrue(
        "expect equals canShipPartially ",
        this.records[1].getCanShipPartially() == testResult.getCanShipPartially());
    org.junit.Assert.assertTrue(
        "expect equals canShipPartiallyItem ",
        this.records[1].getCanShipPartiallyItem() == testResult.getCanShipPartiallyItem());
    org.junit.Assert.assertTrue(
        "expect equals customerIsGuest ",
        this.records[1].getCustomerIsGuest() == testResult.getCustomerIsGuest());
    org.junit.Assert.assertTrue(
        "expect equals customerNoteNotify ",
        this.records[1].getCustomerNoteNotify() == testResult.getCustomerNoteNotify());
    org.junit.Assert.assertTrue(
        "expect equals billingAddressId ",
        this.records[1].getBillingAddressId() == testResult.getBillingAddressId());
    org.junit.Assert.assertTrue(
        "expect equals customerGroupId ",
        this.records[1].getCustomerGroupId() == testResult.getCustomerGroupId());
    org.junit.Assert.assertTrue(
        "expect equals editIncrement ",
        this.records[1].getEditIncrement() == testResult.getEditIncrement());
    org.junit.Assert.assertTrue(
        "expect equals emailSent ", this.records[1].getEmailSent() == testResult.getEmailSent());
    org.junit.Assert.assertTrue(
        "expect equals sendEmail ", this.records[1].getSendEmail() == testResult.getSendEmail());
    org.junit.Assert.assertTrue(
        "expect equals forcedShipmentWithInvoice ",
        this.records[1].getForcedShipmentWithInvoice()
            == testResult.getForcedShipmentWithInvoice());
    org.junit.Assert.assertTrue(
        "expect equals paymentAuthExpiration ",
        this.records[1].getPaymentAuthExpiration() == testResult.getPaymentAuthExpiration());
    org.junit.Assert.assertTrue(
        "expect equals quoteAddressId ",
        this.records[1].getQuoteAddressId() == testResult.getQuoteAddressId());
    org.junit.Assert.assertTrue(
        "expect equals quoteId ", this.records[1].getQuoteId() == testResult.getQuoteId());
    org.junit.Assert.assertTrue(
        "expect equals shippingAddressId ",
        this.records[1].getShippingAddressId() == testResult.getShippingAddressId());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentNegative ",
        this.records[1].getAdjustmentNegative(),
        testResult.getAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals adjustmentPositive ",
        this.records[1].getAdjustmentPositive(),
        testResult.getAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentNegative ",
        this.records[1].getBaseAdjustmentNegative(),
        testResult.getBaseAdjustmentNegative());
    org.junit.Assert.assertEquals(
        "expect equals baseAdjustmentPositive ",
        this.records[1].getBaseAdjustmentPositive(),
        testResult.getBaseAdjustmentPositive());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountAmount ",
        this.records[1].getBaseShippingDiscountAmount(),
        testResult.getBaseShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalInclTax ",
        this.records[1].getBaseSubtotalInclTax(),
        testResult.getBaseSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseTotalDue ",
        this.records[1].getBaseTotalDue(),
        testResult.getBaseTotalDue());
    org.junit.Assert.assertEquals(
        "expect equals paymentAuthorizationAmount ",
        this.records[1].getPaymentAuthorizationAmount(),
        testResult.getPaymentAuthorizationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountAmount ",
        this.records[1].getShippingDiscountAmount(),
        testResult.getShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInclTax ",
        this.records[1].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals totalDue ", this.records[1].getTotalDue(), testResult.getTotalDue());
    org.junit.Assert.assertEquals(
        "expect equals weight ", this.records[1].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals appliedRuleIds ",
        this.records[1].getAppliedRuleIds(),
        testResult.getAppliedRuleIds());
    org.junit.Assert.assertEquals(
        "expect equals baseCurrencyCode ",
        this.records[1].getBaseCurrencyCode(),
        testResult.getBaseCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals customerEmail ",
        this.records[1].getCustomerEmail(),
        testResult.getCustomerEmail());
    org.junit.Assert.assertEquals(
        "expect equals customerFirstname ",
        this.records[1].getCustomerFirstname(),
        testResult.getCustomerFirstname());
    org.junit.Assert.assertEquals(
        "expect equals customerLastname ",
        this.records[1].getCustomerLastname(),
        testResult.getCustomerLastname());
    org.junit.Assert.assertEquals(
        "expect equals customerMiddlename ",
        this.records[1].getCustomerMiddlename(),
        testResult.getCustomerMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals customerPrefix ",
        this.records[1].getCustomerPrefix(),
        testResult.getCustomerPrefix());
    org.junit.Assert.assertEquals(
        "expect equals customerSuffix ",
        this.records[1].getCustomerSuffix(),
        testResult.getCustomerSuffix());
    org.junit.Assert.assertEquals(
        "expect equals customerTaxvat ",
        this.records[1].getCustomerTaxvat(),
        testResult.getCustomerTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals discountDescription ",
        this.records[1].getDiscountDescription(),
        testResult.getDiscountDescription());
    org.junit.Assert.assertEquals(
        "expect equals extCustomerId ",
        this.records[1].getExtCustomerId(),
        testResult.getExtCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals extOrderId ", this.records[1].getExtOrderId(), testResult.getExtOrderId());
    org.junit.Assert.assertEquals(
        "expect equals globalCurrencyCode ",
        this.records[1].getGlobalCurrencyCode(),
        testResult.getGlobalCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals holdBeforeState ",
        this.records[1].getHoldBeforeState(),
        testResult.getHoldBeforeState());
    org.junit.Assert.assertEquals(
        "expect equals holdBeforeStatus ",
        this.records[1].getHoldBeforeStatus(),
        testResult.getHoldBeforeStatus());
    org.junit.Assert.assertEquals(
        "expect equals orderCurrencyCode ",
        this.records[1].getOrderCurrencyCode(),
        testResult.getOrderCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals originalIncrementId ",
        this.records[1].getOriginalIncrementId(),
        testResult.getOriginalIncrementId());
    org.junit.Assert.assertEquals(
        "expect equals relationChildId ",
        this.records[1].getRelationChildId(),
        testResult.getRelationChildId());
    org.junit.Assert.assertEquals(
        "expect equals relationChildRealId ",
        this.records[1].getRelationChildRealId(),
        testResult.getRelationChildRealId());
    org.junit.Assert.assertEquals(
        "expect equals relationParentId ",
        this.records[1].getRelationParentId(),
        testResult.getRelationParentId());
    org.junit.Assert.assertEquals(
        "expect equals relationParentRealId ",
        this.records[1].getRelationParentRealId(),
        testResult.getRelationParentRealId());
    org.junit.Assert.assertEquals(
        "expect equals remoteIp ", this.records[1].getRemoteIp(), testResult.getRemoteIp());
    org.junit.Assert.assertEquals(
        "expect equals shippingMethod ",
        this.records[1].getShippingMethod(),
        testResult.getShippingMethod());
    org.junit.Assert.assertEquals(
        "expect equals storeCurrencyCode ",
        this.records[1].getStoreCurrencyCode(),
        testResult.getStoreCurrencyCode());
    org.junit.Assert.assertEquals(
        "expect equals storeName ", this.records[1].getStoreName(), testResult.getStoreName());
    org.junit.Assert.assertEquals(
        "expect equals xForwardedFor ",
        this.records[1].getXForwardedFor(),
        testResult.getXForwardedFor());
    org.junit.Assert.assertEquals(
        "expect equals customerNote ",
        this.records[1].getCustomerNote(),
        testResult.getCustomerNote());
    org.junit.Assert.assertTrue(
        "expect equals totalItemCount ",
        this.records[1].getTotalItemCount() == testResult.getTotalItemCount());
    org.junit.Assert.assertTrue(
        "expect equals customerGender ",
        this.records[1].getCustomerGender() == testResult.getCustomerGender());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        this.records[1].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        this.records[1].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        this.records[1].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        this.records[1].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationInvoiced ",
        this.records[1].getDiscountTaxCompensationInvoiced(),
        testResult.getDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationInvoiced ",
        this.records[1].getBaseDiscountTaxCompensationInvoiced(),
        testResult.getBaseDiscountTaxCompensationInvoiced());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationRefunded ",
        this.records[1].getDiscountTaxCompensationRefunded(),
        testResult.getDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationRefunded ",
        this.records[1].getBaseDiscountTaxCompensationRefunded(),
        testResult.getBaseDiscountTaxCompensationRefunded());
    org.junit.Assert.assertEquals(
        "expect equals shippingInclTax ",
        this.records[1].getShippingInclTax(),
        testResult.getShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInclTax ",
        this.records[1].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals couponRuleName ",
        this.records[1].getCouponRuleName(),
        testResult.getCouponRuleName());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        this.records[1].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals paypalIpnCustomerNotified ",
        this.records[1].getPaypalIpnCustomerNotified()
            == testResult.getPaypalIpnCustomerNotified());
  }
}
