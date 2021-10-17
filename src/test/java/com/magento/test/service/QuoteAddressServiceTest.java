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

import com.magento.test.entity.QuoteAddress;

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

public class QuoteAddressServiceTest {
  private static DefaultQuoteAddressService serviceMock;
  private static QuoteAddress[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultQuoteAddressService.class);
    String inputFile = "QuoteAddress.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, QuoteAddress[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getAddressId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    QuoteAddress testResult = serviceMock.find(records[0].getAddressId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals quoteId ", records[0].getQuoteId() == testResult.getQuoteId());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", records[0].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertTrue(
        "expect equals saveInAddressBook ",
        records[0].getSaveInAddressBook() == testResult.getSaveInAddressBook());
    org.junit.Assert.assertTrue(
        "expect equals customerAddressId ",
        records[0].getCustomerAddressId() == testResult.getCustomerAddressId());
    org.junit.Assert.assertEquals(
        "expect equals addressType ", records[0].getAddressType(), testResult.getAddressType());
    org.junit.Assert.assertEquals(
        "expect equals email ", records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", records[0].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals middlename ", records[0].getMiddlename(), testResult.getMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", records[0].getSuffix(), testResult.getSuffix());
    org.junit.Assert.assertEquals(
        "expect equals company ", records[0].getCompany(), testResult.getCompany());
    org.junit.Assert.assertEquals(
        "expect equals street ", records[0].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals city ", records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals region ", records[0].getRegion(), testResult.getRegion());
    org.junit.Assert.assertTrue(
        "expect equals regionId ", records[0].getRegionId() == testResult.getRegionId());
    org.junit.Assert.assertEquals(
        "expect equals postcode ", records[0].getPostcode(), testResult.getPostcode());
    org.junit.Assert.assertEquals(
        "expect equals countryId ", records[0].getCountryId(), testResult.getCountryId());
    org.junit.Assert.assertEquals(
        "expect equals telephone ", records[0].getTelephone(), testResult.getTelephone());
    org.junit.Assert.assertEquals("expect equals fax ", records[0].getFax(), testResult.getFax());
    org.junit.Assert.assertTrue(
        "expect equals sameAsBilling ",
        records[0].getSameAsBilling() == testResult.getSameAsBilling());
    org.junit.Assert.assertTrue(
        "expect equals collectShippingRates ",
        records[0].getCollectShippingRates() == testResult.getCollectShippingRates());
    org.junit.Assert.assertEquals(
        "expect equals shippingMethod ",
        records[0].getShippingMethod(),
        testResult.getShippingMethod());
    org.junit.Assert.assertEquals(
        "expect equals shippingDescription ",
        records[0].getShippingDescription(),
        testResult.getShippingDescription());
    org.junit.Assert.assertEquals(
        "expect equals weight ", records[0].getWeight(), testResult.getWeight());
    org.junit.Assert.assertEquals(
        "expect equals subtotal ", records[0].getSubtotal(), testResult.getSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotal ", records[0].getBaseSubtotal(), testResult.getBaseSubtotal());
    org.junit.Assert.assertEquals(
        "expect equals subtotalWithDiscount ",
        records[0].getSubtotalWithDiscount(),
        testResult.getSubtotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalWithDiscount ",
        records[0].getBaseSubtotalWithDiscount(),
        testResult.getBaseSubtotalWithDiscount());
    org.junit.Assert.assertEquals(
        "expect equals taxAmount ", records[0].getTaxAmount(), testResult.getTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseTaxAmount ",
        records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingAmount ",
        records[0].getShippingAmount(),
        testResult.getShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingAmount ",
        records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingTaxAmount ",
        records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingTaxAmount ",
        records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    org.junit.Assert.assertEquals(
        "expect equals discountAmount ",
        records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountAmount ",
        records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals grandTotal ", records[0].getGrandTotal(), testResult.getGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals baseGrandTotal ",
        records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    org.junit.Assert.assertEquals(
        "expect equals customerNotes ",
        records[0].getCustomerNotes(),
        testResult.getCustomerNotes());
    org.junit.Assert.assertEquals(
        "expect equals appliedTaxes ", records[0].getAppliedTaxes(), testResult.getAppliedTaxes());
    org.junit.Assert.assertEquals(
        "expect equals discountDescription ",
        records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountAmount ",
        records[0].getShippingDiscountAmount(),
        testResult.getShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountAmount ",
        records[0].getBaseShippingDiscountAmount(),
        testResult.getBaseShippingDiscountAmount());
    org.junit.Assert.assertEquals(
        "expect equals subtotalInclTax ",
        records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseSubtotalTotalInclTax ",
        records[0].getBaseSubtotalTotalInclTax(),
        testResult.getBaseSubtotalTotalInclTax());
    org.junit.Assert.assertEquals(
        "expect equals discountTaxCompensationAmount ",
        records[0].getDiscountTaxCompensationAmount(),
        testResult.getDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseDiscountTaxCompensationAmount ",
        records[0].getBaseDiscountTaxCompensationAmount(),
        testResult.getBaseDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals shippingDiscountTaxCompensationAmount ",
        records[0].getShippingDiscountTaxCompensationAmount(),
        testResult.getShippingDiscountTaxCompensationAmount());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingDiscountTaxCompensationAmnt ",
        records[0].getBaseShippingDiscountTaxCompensationAmnt(),
        testResult.getBaseShippingDiscountTaxCompensationAmnt());
    org.junit.Assert.assertEquals(
        "expect equals shippingInclTax ",
        records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals baseShippingInclTax ",
        records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    org.junit.Assert.assertEquals(
        "expect equals vatId ", records[0].getVatId(), testResult.getVatId());
    org.junit.Assert.assertTrue(
        "expect equals vatIsValid ", records[0].getVatIsValid() == testResult.getVatIsValid());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestId ", records[0].getVatRequestId(), testResult.getVatRequestId());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestDate ",
        records[0].getVatRequestDate(),
        testResult.getVatRequestDate());
    org.junit.Assert.assertTrue(
        "expect equals vatRequestSuccess ",
        records[0].getVatRequestSuccess() == testResult.getVatRequestSuccess());
    org.junit.Assert.assertEquals(
        "expect equals validatedCountryCode ",
        records[0].getValidatedCountryCode(),
        testResult.getValidatedCountryCode());
    org.junit.Assert.assertEquals(
        "expect equals validatedVatNumber ",
        records[0].getValidatedVatNumber(),
        testResult.getValidatedVatNumber());
    org.junit.Assert.assertTrue(
        "expect equals giftMessageId ",
        records[0].getGiftMessageId() == testResult.getGiftMessageId());
    org.junit.Assert.assertTrue(
        "expect equals freeShipping ",
        records[0].getFreeShipping() == testResult.getFreeShipping());
  }
}
