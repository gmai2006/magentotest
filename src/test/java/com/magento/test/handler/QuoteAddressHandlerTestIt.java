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
import com.magento.test.entity.QuoteAddress;
import com.magento.test.dao.JpaDao;
import com.magento.test.dao.StandaloneJpaDao;
import com.magento.test.dao.DefaultQuoteAddressDao;
import com.magento.test.utils.DelimiterParser;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.gson.GsonBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuoteAddressHandlerTestIt {
  static final String inputFile = "QuoteAddress.json";
  static QuoteAddressHandler handler;
  private static JpaDao jpa;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private QuoteAddress[] records;

  /** Run before the test. */
  @BeforeClass
  public static void before() {
    final EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    jpa = new StandaloneJpaDao(factory.createEntityManager());
    handler = new QuoteAddressHandler(jpa);
  }

  @Test
  public void testSelect() throws IOException {
    final File tempFile = createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
    final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
    int count = handler.process(inputStream);
    String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
    records = gson.fromJson(json, QuoteAddress[].class);
    assertEquals("match count", count, records.length);
    QuoteAddress testResult = jpa.find(QuoteAddress.class, records[0].getAddressId());
    org.junit.Assert.assertEquals(
        "expect equals quoteId ", this.records[0].getQuoteId(), testResult.getQuoteId());
    org.junit.Assert.assertEquals(
        "expect equals customerId ", this.records[0].getCustomerId(), testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals saveInAddressBook ",
        this.records[0].getSaveInAddressBook(),
        testResult.getSaveInAddressBook());
    org.junit.Assert.assertEquals(
        "expect equals customerAddressId ",
        this.records[0].getCustomerAddressId(),
        testResult.getCustomerAddressId());
    assertEquals(
        "expect equals addressType ",
        this.records[0].getAddressType(),
        testResult.getAddressType());
    assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
    assertEquals("expect equals prefix ", this.records[0].getPrefix(), testResult.getPrefix());
    assertEquals(
        "expect equals firstname ", this.records[0].getFirstname(), testResult.getFirstname());
    assertEquals(
        "expect equals middlename ", this.records[0].getMiddlename(), testResult.getMiddlename());
    assertEquals(
        "expect equals lastname ", this.records[0].getLastname(), testResult.getLastname());
    assertEquals("expect equals suffix ", this.records[0].getSuffix(), testResult.getSuffix());
    assertEquals("expect equals company ", this.records[0].getCompany(), testResult.getCompany());
    assertEquals("expect equals street ", this.records[0].getStreet(), testResult.getStreet());
    assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
    assertEquals("expect equals region ", this.records[0].getRegion(), testResult.getRegion());
    org.junit.Assert.assertEquals(
        "expect equals regionId ", this.records[0].getRegionId(), testResult.getRegionId());
    assertEquals(
        "expect equals postcode ", this.records[0].getPostcode(), testResult.getPostcode());
    assertEquals(
        "expect equals countryId ", this.records[0].getCountryId(), testResult.getCountryId());
    assertEquals(
        "expect equals telephone ", this.records[0].getTelephone(), testResult.getTelephone());
    assertEquals("expect equals fax ", this.records[0].getFax(), testResult.getFax());
    org.junit.Assert.assertEquals(
        "expect equals sameAsBilling ",
        this.records[0].getSameAsBilling(),
        testResult.getSameAsBilling());
    org.junit.Assert.assertEquals(
        "expect equals collectShippingRates ",
        this.records[0].getCollectShippingRates(),
        testResult.getCollectShippingRates());
    assertEquals(
        "expect equals shippingMethod ",
        this.records[0].getShippingMethod(),
        testResult.getShippingMethod());
    assertEquals(
        "expect equals shippingDescription ",
        this.records[0].getShippingDescription(),
        testResult.getShippingDescription());
    assertEquals("expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
    assertEquals(
        "expect equals subtotal ", this.records[0].getSubtotal(), testResult.getSubtotal());
    assertEquals(
        "expect equals baseSubtotal ",
        this.records[0].getBaseSubtotal(),
        testResult.getBaseSubtotal());
    assertEquals(
        "expect equals subtotalWithDiscount ",
        this.records[0].getSubtotalWithDiscount(),
        testResult.getSubtotalWithDiscount());
    assertEquals(
        "expect equals baseSubtotalWithDiscount ",
        this.records[0].getBaseSubtotalWithDiscount(),
        testResult.getBaseSubtotalWithDiscount());
    assertEquals(
        "expect equals taxAmount ", this.records[0].getTaxAmount(), testResult.getTaxAmount());
    assertEquals(
        "expect equals baseTaxAmount ",
        this.records[0].getBaseTaxAmount(),
        testResult.getBaseTaxAmount());
    assertEquals(
        "expect equals shippingAmount ",
        this.records[0].getShippingAmount(),
        testResult.getShippingAmount());
    assertEquals(
        "expect equals baseShippingAmount ",
        this.records[0].getBaseShippingAmount(),
        testResult.getBaseShippingAmount());
    assertEquals(
        "expect equals shippingTaxAmount ",
        this.records[0].getShippingTaxAmount(),
        testResult.getShippingTaxAmount());
    assertEquals(
        "expect equals baseShippingTaxAmount ",
        this.records[0].getBaseShippingTaxAmount(),
        testResult.getBaseShippingTaxAmount());
    assertEquals(
        "expect equals discountAmount ",
        this.records[0].getDiscountAmount(),
        testResult.getDiscountAmount());
    assertEquals(
        "expect equals baseDiscountAmount ",
        this.records[0].getBaseDiscountAmount(),
        testResult.getBaseDiscountAmount());
    assertEquals(
        "expect equals grandTotal ", this.records[0].getGrandTotal(), testResult.getGrandTotal());
    assertEquals(
        "expect equals baseGrandTotal ",
        this.records[0].getBaseGrandTotal(),
        testResult.getBaseGrandTotal());
    assertEquals(
        "expect equals customerNotes ",
        this.records[0].getCustomerNotes(),
        testResult.getCustomerNotes());
    assertEquals(
        "expect equals appliedTaxes ",
        this.records[0].getAppliedTaxes(),
        testResult.getAppliedTaxes());
    assertEquals(
        "expect equals discountDescription ",
        this.records[0].getDiscountDescription(),
        testResult.getDiscountDescription());
    assertEquals(
        "expect equals shippingDiscountAmount ",
        this.records[0].getShippingDiscountAmount(),
        testResult.getShippingDiscountAmount());
    assertEquals(
        "expect equals baseShippingDiscountAmount ",
        this.records[0].getBaseShippingDiscountAmount(),
        testResult.getBaseShippingDiscountAmount());
    assertEquals(
        "expect equals subtotalInclTax ",
        this.records[0].getSubtotalInclTax(),
        testResult.getSubtotalInclTax());
    assertEquals(
        "expect equals baseSubtotalTotalInclTax ",
        this.records[0].getBaseSubtotalTotalInclTax(),
        testResult.getBaseSubtotalTotalInclTax());
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
        "expect equals shippingInclTax ",
        this.records[0].getShippingInclTax(),
        testResult.getShippingInclTax());
    assertEquals(
        "expect equals baseShippingInclTax ",
        this.records[0].getBaseShippingInclTax(),
        testResult.getBaseShippingInclTax());
    assertEquals("expect equals vatId ", this.records[0].getVatId(), testResult.getVatId());
    org.junit.Assert.assertEquals(
        "expect equals vatIsValid ", this.records[0].getVatIsValid(), testResult.getVatIsValid());
    assertEquals(
        "expect equals vatRequestId ",
        this.records[0].getVatRequestId(),
        testResult.getVatRequestId());
    assertEquals(
        "expect equals vatRequestDate ",
        this.records[0].getVatRequestDate(),
        testResult.getVatRequestDate());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestSuccess ",
        this.records[0].getVatRequestSuccess(),
        testResult.getVatRequestSuccess());
    assertEquals(
        "expect equals validatedCountryCode ",
        this.records[0].getValidatedCountryCode(),
        testResult.getValidatedCountryCode());
    assertEquals(
        "expect equals validatedVatNumber ",
        this.records[0].getValidatedVatNumber(),
        testResult.getValidatedVatNumber());
    org.junit.Assert.assertEquals(
        "expect equals giftMessageId ",
        this.records[0].getGiftMessageId(),
        testResult.getGiftMessageId());
    org.junit.Assert.assertEquals(
        "expect equals freeShipping ",
        this.records[0].getFreeShipping(),
        testResult.getFreeShipping());

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
