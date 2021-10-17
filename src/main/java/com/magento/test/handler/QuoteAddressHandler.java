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

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.magento.test.entity.QuoteAddress;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("QuoteAddressHandler")
public class QuoteAddressHandler extends DelimiterFileHandler<QuoteAddress> {

  @Inject
  @Named("DefaultJpaDao")
  public QuoteAddressHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected QuoteAddress parseLine(List<String> headers, List<String> tokens) {
    QuoteAddress record = new QuoteAddress();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "addressId":
          record.setAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteId":
          record.setQuoteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "saveInAddressBook":
          record.setSaveInAddressBook(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerAddressId":
          record.setCustomerAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "addressType":
          record.setAddressType(tokens.get(i));
          break;

        case "email":
          record.setEmail(tokens.get(i));
          break;

        case "prefix":
          record.setPrefix(tokens.get(i));
          break;

        case "firstname":
          record.setFirstname(tokens.get(i));
          break;

        case "middlename":
          record.setMiddlename(tokens.get(i));
          break;

        case "lastname":
          record.setLastname(tokens.get(i));
          break;

        case "suffix":
          record.setSuffix(tokens.get(i));
          break;

        case "company":
          record.setCompany(tokens.get(i));
          break;

        case "street":
          record.setStreet(tokens.get(i));
          break;

        case "city":
          record.setCity(tokens.get(i));
          break;

        case "region":
          record.setRegion(tokens.get(i));
          break;

        case "regionId":
          record.setRegionId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "postcode":
          record.setPostcode(tokens.get(i));
          break;

        case "countryId":
          record.setCountryId(tokens.get(i));
          break;

        case "telephone":
          record.setTelephone(tokens.get(i));
          break;

        case "fax":
          record.setFax(tokens.get(i));
          break;

        case "sameAsBilling":
          record.setSameAsBilling(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "collectShippingRates":
          record.setCollectShippingRates(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shippingMethod":
          record.setShippingMethod(tokens.get(i));
          break;

        case "shippingDescription":
          record.setShippingDescription(tokens.get(i));
          break;

        case "weight":
          record.setWeight(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotal":
          record.setSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotal":
          record.setBaseSubtotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalWithDiscount":
          record.setSubtotalWithDiscount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalWithDiscount":
          record.setBaseSubtotalWithDiscount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxAmount":
          record.setTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxAmount":
          record.setBaseTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAmount":
          record.setShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingAmount":
          record.setBaseShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingTaxAmount":
          record.setShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingTaxAmount":
          record.setBaseShippingTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountAmount":
          record.setBaseDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "grandTotal":
          record.setGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseGrandTotal":
          record.setBaseGrandTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "customerNotes":
          record.setCustomerNotes(tokens.get(i));
          break;

        case "appliedTaxes":
          record.setAppliedTaxes(tokens.get(i));
          break;

        case "discountDescription":
          record.setDiscountDescription(tokens.get(i));
          break;

        case "shippingDiscountAmount":
          record.setShippingDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingDiscountAmount":
          record.setBaseShippingDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "subtotalInclTax":
          record.setSubtotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseSubtotalTotalInclTax":
          record.setBaseSubtotalTotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountTaxCompensationAmount":
          record.setDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationAmount":
          record.setBaseDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingDiscountTaxCompensationAmount":
          record.setShippingDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingDiscountTaxCompensationAmnt":
          record.setBaseShippingDiscountTaxCompensationAmnt(
              new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingInclTax":
          record.setShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingInclTax":
          record.setBaseShippingInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "vatId":
          record.setVatId(tokens.get(i));
          break;

        case "vatIsValid":
          record.setVatIsValid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "vatRequestId":
          record.setVatRequestId(tokens.get(i));
          break;

        case "vatRequestDate":
          record.setVatRequestDate(tokens.get(i));
          break;

        case "vatRequestSuccess":
          record.setVatRequestSuccess(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "validatedCountryCode":
          record.setValidatedCountryCode(tokens.get(i));
          break;

        case "validatedVatNumber":
          record.setValidatedVatNumber(tokens.get(i));
          break;

        case "giftMessageId":
          record.setGiftMessageId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "freeShipping":
          record.setFreeShipping(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
