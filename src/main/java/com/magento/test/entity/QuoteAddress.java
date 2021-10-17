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
package com.magento.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "quote_address")
public class QuoteAddress implements Serializable {
  private static final long serialVersionUID = 163445090591892691L;

  /** Description: address_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "address_id")
  private java.lang.Integer addressId;

  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: created_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: save_in_address_book. */
  @Basic
  @Column(name = "save_in_address_book")
  private java.lang.Integer saveInAddressBook;
  /** Description: customer_address_id. */
  @Basic
  @Column(name = "customer_address_id")
  private java.lang.Integer customerAddressId;
  /** Description: address_type. */
  @Basic
  @Column(name = "address_type", length = 10)
  private java.lang.String addressType;
  /** Description: email. */
  @Basic
  @Column(name = "email", length = 255)
  private java.lang.String email;
  /** Description: prefix. */
  @Basic
  @Column(name = "prefix", length = 40)
  private java.lang.String prefix;
  /** Description: firstname. */
  @Basic
  @Column(name = "firstname", length = 255)
  private java.lang.String firstname;
  /** Description: middlename. */
  @Basic
  @Column(name = "middlename", length = 40)
  private java.lang.String middlename;
  /** Description: lastname. */
  @Basic
  @Column(name = "lastname", length = 255)
  private java.lang.String lastname;
  /** Description: suffix. */
  @Basic
  @Column(name = "suffix", length = 40)
  private java.lang.String suffix;
  /** Description: company. */
  @Basic
  @Column(name = "company", length = 255)
  private java.lang.String company;
  /** Description: street. */
  @Basic
  @Column(name = "street", length = 255)
  private java.lang.String street;
  /** Description: city. */
  @Basic
  @Column(name = "city", length = 255)
  private java.lang.String city;
  /** Description: region. */
  @Basic
  @Column(name = "region", length = 255)
  private java.lang.String region;
  /** Description: region_id. */
  @Basic
  @Column(name = "region_id")
  private java.lang.Integer regionId;
  /** Description: postcode. */
  @Basic
  @Column(name = "postcode", length = 20)
  private java.lang.String postcode;
  /** Description: country_id. */
  @Basic
  @Column(name = "country_id", length = 30)
  private java.lang.String countryId;
  /** Description: telephone. */
  @Basic
  @Column(name = "telephone", length = 255)
  private java.lang.String telephone;
  /** Description: fax. */
  @Basic
  @Column(name = "fax", length = 255)
  private java.lang.String fax;
  /** Description: same_as_billing. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "same_as_billing")
  private java.lang.Integer sameAsBilling;
  /** Description: collect_shipping_rates. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "collect_shipping_rates")
  private java.lang.Integer collectShippingRates;
  /** Description: shipping_method. */
  @Basic
  @Column(name = "shipping_method", length = 120)
  private java.lang.String shippingMethod;
  /** Description: shipping_description. */
  @Basic
  @Column(name = "shipping_description", length = 255)
  private java.lang.String shippingDescription;
  /** Description: weight. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "weight")
  private java.math.BigDecimal weight;
  /** Description: subtotal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subtotal")
  private java.math.BigDecimal subtotal;
  /** Description: base_subtotal. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_subtotal")
  private java.math.BigDecimal baseSubtotal;
  /** Description: subtotal_with_discount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "subtotal_with_discount")
  private java.math.BigDecimal subtotalWithDiscount;
  /** Description: base_subtotal_with_discount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_subtotal_with_discount")
  private java.math.BigDecimal baseSubtotalWithDiscount;
  /** Description: tax_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_amount")
  private java.math.BigDecimal taxAmount;
  /** Description: base_tax_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_tax_amount")
  private java.math.BigDecimal baseTaxAmount;
  /** Description: shipping_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "shipping_amount")
  private java.math.BigDecimal shippingAmount;
  /** Description: base_shipping_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_shipping_amount")
  private java.math.BigDecimal baseShippingAmount;
  /** Description: shipping_tax_amount. */
  @Basic
  @Column(name = "shipping_tax_amount")
  private java.math.BigDecimal shippingTaxAmount;
  /** Description: base_shipping_tax_amount. */
  @Basic
  @Column(name = "base_shipping_tax_amount")
  private java.math.BigDecimal baseShippingTaxAmount;
  /** Description: discount_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "discount_amount")
  private java.math.BigDecimal discountAmount;
  /** Description: base_discount_amount. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_discount_amount")
  private java.math.BigDecimal baseDiscountAmount;
  /** Description: grand_total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "grand_total")
  private java.math.BigDecimal grandTotal;
  /** Description: base_grand_total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "base_grand_total")
  private java.math.BigDecimal baseGrandTotal;
  /** Description: customer_notes. */
  @Basic
  @Column(name = "customer_notes", length = 0)
  private java.lang.String customerNotes;
  /** Description: applied_taxes. */
  @Basic
  @Column(name = "applied_taxes", length = 0)
  private java.lang.String appliedTaxes;
  /** Description: discount_description. */
  @Basic
  @Column(name = "discount_description", length = 255)
  private java.lang.String discountDescription;
  /** Description: shipping_discount_amount. */
  @Basic
  @Column(name = "shipping_discount_amount")
  private java.math.BigDecimal shippingDiscountAmount;
  /** Description: base_shipping_discount_amount. */
  @Basic
  @Column(name = "base_shipping_discount_amount")
  private java.math.BigDecimal baseShippingDiscountAmount;
  /** Description: subtotal_incl_tax. */
  @Basic
  @Column(name = "subtotal_incl_tax")
  private java.math.BigDecimal subtotalInclTax;
  /** Description: base_subtotal_total_incl_tax. */
  @Basic
  @Column(name = "base_subtotal_total_incl_tax")
  private java.math.BigDecimal baseSubtotalTotalInclTax;
  /** Description: discount_tax_compensation_amount. */
  @Basic
  @Column(name = "discount_tax_compensation_amount")
  private java.math.BigDecimal discountTaxCompensationAmount;
  /** Description: base_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "base_discount_tax_compensation_amount")
  private java.math.BigDecimal baseDiscountTaxCompensationAmount;
  /** Description: shipping_discount_tax_compensation_amount. */
  @Basic
  @Column(name = "shipping_discount_tax_compensation_amount")
  private java.math.BigDecimal shippingDiscountTaxCompensationAmount;
  /** Description: base_shipping_discount_tax_compensation_amnt. */
  @Basic
  @Column(name = "base_shipping_discount_tax_compensation_amnt")
  private java.math.BigDecimal baseShippingDiscountTaxCompensationAmnt;
  /** Description: shipping_incl_tax. */
  @Basic
  @Column(name = "shipping_incl_tax")
  private java.math.BigDecimal shippingInclTax;
  /** Description: base_shipping_incl_tax. */
  @Basic
  @Column(name = "base_shipping_incl_tax")
  private java.math.BigDecimal baseShippingInclTax;
  /** Description: vat_id. */
  @Basic
  @Column(name = "vat_id", length = 0)
  private java.lang.String vatId;
  /** Description: vat_is_valid. */
  @Basic
  @Column(name = "vat_is_valid")
  private java.lang.Integer vatIsValid;
  /** Description: vat_request_id. */
  @Basic
  @Column(name = "vat_request_id", length = 0)
  private java.lang.String vatRequestId;
  /** Description: vat_request_date. */
  @Basic
  @Column(name = "vat_request_date", length = 0)
  private java.lang.String vatRequestDate;
  /** Description: vat_request_success. */
  @Basic
  @Column(name = "vat_request_success")
  private java.lang.Integer vatRequestSuccess;
  /** Description: validated_country_code. */
  @Basic
  @Column(name = "validated_country_code", length = 0)
  private java.lang.String validatedCountryCode;
  /** Description: validated_vat_number. */
  @Basic
  @Column(name = "validated_vat_number", length = 0)
  private java.lang.String validatedVatNumber;
  /** Description: gift_message_id. */
  @Basic
  @Column(name = "gift_message_id")
  private java.lang.Integer giftMessageId;
  /** Description: free_shipping. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "free_shipping")
  private java.lang.Integer freeShipping;

  public QuoteAddress() {}

  public java.lang.Integer getAddressId() {
    return this.addressId;
  }

  public void setAddressId(java.lang.Integer addressId) {
    this.addressId = addressId;
  }

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getSaveInAddressBook() {
    return this.saveInAddressBook;
  }

  public java.lang.Integer getCustomerAddressId() {
    return this.customerAddressId;
  }

  public java.lang.String getAddressType() {
    return this.addressType;
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getFirstname() {
    return this.firstname;
  }

  public java.lang.String getMiddlename() {
    return this.middlename;
  }

  public java.lang.String getLastname() {
    return this.lastname;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public java.lang.String getCompany() {
    return this.company;
  }

  public java.lang.String getStreet() {
    return this.street;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getRegion() {
    return this.region;
  }

  public java.lang.Integer getRegionId() {
    return this.regionId;
  }

  public java.lang.String getPostcode() {
    return this.postcode;
  }

  public java.lang.String getCountryId() {
    return this.countryId;
  }

  public java.lang.String getTelephone() {
    return this.telephone;
  }

  public java.lang.String getFax() {
    return this.fax;
  }

  public java.lang.Integer getSameAsBilling() {
    return this.sameAsBilling;
  }

  public java.lang.Integer getCollectShippingRates() {
    return this.collectShippingRates;
  }

  public java.lang.String getShippingMethod() {
    return this.shippingMethod;
  }

  public java.lang.String getShippingDescription() {
    return this.shippingDescription;
  }

  public java.math.BigDecimal getWeight() {
    return this.weight;
  }

  public java.math.BigDecimal getSubtotal() {
    return this.subtotal;
  }

  public java.math.BigDecimal getBaseSubtotal() {
    return this.baseSubtotal;
  }

  public java.math.BigDecimal getSubtotalWithDiscount() {
    return this.subtotalWithDiscount;
  }

  public java.math.BigDecimal getBaseSubtotalWithDiscount() {
    return this.baseSubtotalWithDiscount;
  }

  public java.math.BigDecimal getTaxAmount() {
    return this.taxAmount;
  }

  public java.math.BigDecimal getBaseTaxAmount() {
    return this.baseTaxAmount;
  }

  public java.math.BigDecimal getShippingAmount() {
    return this.shippingAmount;
  }

  public java.math.BigDecimal getBaseShippingAmount() {
    return this.baseShippingAmount;
  }

  public java.math.BigDecimal getShippingTaxAmount() {
    return this.shippingTaxAmount;
  }

  public java.math.BigDecimal getBaseShippingTaxAmount() {
    return this.baseShippingTaxAmount;
  }

  public java.math.BigDecimal getDiscountAmount() {
    return this.discountAmount;
  }

  public java.math.BigDecimal getBaseDiscountAmount() {
    return this.baseDiscountAmount;
  }

  public java.math.BigDecimal getGrandTotal() {
    return this.grandTotal;
  }

  public java.math.BigDecimal getBaseGrandTotal() {
    return this.baseGrandTotal;
  }

  public java.lang.String getCustomerNotes() {
    return this.customerNotes;
  }

  public java.lang.String getAppliedTaxes() {
    return this.appliedTaxes;
  }

  public java.lang.String getDiscountDescription() {
    return this.discountDescription;
  }

  public java.math.BigDecimal getShippingDiscountAmount() {
    return this.shippingDiscountAmount;
  }

  public java.math.BigDecimal getBaseShippingDiscountAmount() {
    return this.baseShippingDiscountAmount;
  }

  public java.math.BigDecimal getSubtotalInclTax() {
    return this.subtotalInclTax;
  }

  public java.math.BigDecimal getBaseSubtotalTotalInclTax() {
    return this.baseSubtotalTotalInclTax;
  }

  public java.math.BigDecimal getDiscountTaxCompensationAmount() {
    return this.discountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseDiscountTaxCompensationAmount() {
    return this.baseDiscountTaxCompensationAmount;
  }

  public java.math.BigDecimal getShippingDiscountTaxCompensationAmount() {
    return this.shippingDiscountTaxCompensationAmount;
  }

  public java.math.BigDecimal getBaseShippingDiscountTaxCompensationAmnt() {
    return this.baseShippingDiscountTaxCompensationAmnt;
  }

  public java.math.BigDecimal getShippingInclTax() {
    return this.shippingInclTax;
  }

  public java.math.BigDecimal getBaseShippingInclTax() {
    return this.baseShippingInclTax;
  }

  public java.lang.String getVatId() {
    return this.vatId;
  }

  public java.lang.Integer getVatIsValid() {
    return this.vatIsValid;
  }

  public java.lang.String getVatRequestId() {
    return this.vatRequestId;
  }

  public java.lang.String getVatRequestDate() {
    return this.vatRequestDate;
  }

  public java.lang.Integer getVatRequestSuccess() {
    return this.vatRequestSuccess;
  }

  public java.lang.String getValidatedCountryCode() {
    return this.validatedCountryCode;
  }

  public java.lang.String getValidatedVatNumber() {
    return this.validatedVatNumber;
  }

  public java.lang.Integer getGiftMessageId() {
    return this.giftMessageId;
  }

  public java.lang.Integer getFreeShipping() {
    return this.freeShipping;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setSaveInAddressBook(java.lang.Integer saveInAddressBook) {
    this.saveInAddressBook = saveInAddressBook;
  }

  public void setCustomerAddressId(java.lang.Integer customerAddressId) {
    this.customerAddressId = customerAddressId;
  }

  public void setAddressType(java.lang.String addressType) {
    this.addressType = addressType;
  }

  public void setEmail(java.lang.String email) {
    this.email = email;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setFirstname(java.lang.String firstname) {
    this.firstname = firstname;
  }

  public void setMiddlename(java.lang.String middlename) {
    this.middlename = middlename;
  }

  public void setLastname(java.lang.String lastname) {
    this.lastname = lastname;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }

  public void setCompany(java.lang.String company) {
    this.company = company;
  }

  public void setStreet(java.lang.String street) {
    this.street = street;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setRegion(java.lang.String region) {
    this.region = region;
  }

  public void setRegionId(java.lang.Integer regionId) {
    this.regionId = regionId;
  }

  public void setPostcode(java.lang.String postcode) {
    this.postcode = postcode;
  }

  public void setCountryId(java.lang.String countryId) {
    this.countryId = countryId;
  }

  public void setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
  }

  public void setFax(java.lang.String fax) {
    this.fax = fax;
  }

  public void setSameAsBilling(java.lang.Integer sameAsBilling) {
    this.sameAsBilling = sameAsBilling;
  }

  public void setCollectShippingRates(java.lang.Integer collectShippingRates) {
    this.collectShippingRates = collectShippingRates;
  }

  public void setShippingMethod(java.lang.String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public void setShippingDescription(java.lang.String shippingDescription) {
    this.shippingDescription = shippingDescription;
  }

  public void setWeight(java.math.BigDecimal weight) {
    this.weight = weight;
  }

  public void setSubtotal(java.math.BigDecimal subtotal) {
    this.subtotal = subtotal;
  }

  public void setBaseSubtotal(java.math.BigDecimal baseSubtotal) {
    this.baseSubtotal = baseSubtotal;
  }

  public void setSubtotalWithDiscount(java.math.BigDecimal subtotalWithDiscount) {
    this.subtotalWithDiscount = subtotalWithDiscount;
  }

  public void setBaseSubtotalWithDiscount(java.math.BigDecimal baseSubtotalWithDiscount) {
    this.baseSubtotalWithDiscount = baseSubtotalWithDiscount;
  }

  public void setTaxAmount(java.math.BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public void setBaseTaxAmount(java.math.BigDecimal baseTaxAmount) {
    this.baseTaxAmount = baseTaxAmount;
  }

  public void setShippingAmount(java.math.BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public void setBaseShippingAmount(java.math.BigDecimal baseShippingAmount) {
    this.baseShippingAmount = baseShippingAmount;
  }

  public void setShippingTaxAmount(java.math.BigDecimal shippingTaxAmount) {
    this.shippingTaxAmount = shippingTaxAmount;
  }

  public void setBaseShippingTaxAmount(java.math.BigDecimal baseShippingTaxAmount) {
    this.baseShippingTaxAmount = baseShippingTaxAmount;
  }

  public void setDiscountAmount(java.math.BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setBaseDiscountAmount(java.math.BigDecimal baseDiscountAmount) {
    this.baseDiscountAmount = baseDiscountAmount;
  }

  public void setGrandTotal(java.math.BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public void setBaseGrandTotal(java.math.BigDecimal baseGrandTotal) {
    this.baseGrandTotal = baseGrandTotal;
  }

  public void setCustomerNotes(java.lang.String customerNotes) {
    this.customerNotes = customerNotes;
  }

  public void setAppliedTaxes(java.lang.String appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }

  public void setDiscountDescription(java.lang.String discountDescription) {
    this.discountDescription = discountDescription;
  }

  public void setShippingDiscountAmount(java.math.BigDecimal shippingDiscountAmount) {
    this.shippingDiscountAmount = shippingDiscountAmount;
  }

  public void setBaseShippingDiscountAmount(java.math.BigDecimal baseShippingDiscountAmount) {
    this.baseShippingDiscountAmount = baseShippingDiscountAmount;
  }

  public void setSubtotalInclTax(java.math.BigDecimal subtotalInclTax) {
    this.subtotalInclTax = subtotalInclTax;
  }

  public void setBaseSubtotalTotalInclTax(java.math.BigDecimal baseSubtotalTotalInclTax) {
    this.baseSubtotalTotalInclTax = baseSubtotalTotalInclTax;
  }

  public void setDiscountTaxCompensationAmount(java.math.BigDecimal discountTaxCompensationAmount) {
    this.discountTaxCompensationAmount = discountTaxCompensationAmount;
  }

  public void setBaseDiscountTaxCompensationAmount(
      java.math.BigDecimal baseDiscountTaxCompensationAmount) {
    this.baseDiscountTaxCompensationAmount = baseDiscountTaxCompensationAmount;
  }

  public void setShippingDiscountTaxCompensationAmount(
      java.math.BigDecimal shippingDiscountTaxCompensationAmount) {
    this.shippingDiscountTaxCompensationAmount = shippingDiscountTaxCompensationAmount;
  }

  public void setBaseShippingDiscountTaxCompensationAmnt(
      java.math.BigDecimal baseShippingDiscountTaxCompensationAmnt) {
    this.baseShippingDiscountTaxCompensationAmnt = baseShippingDiscountTaxCompensationAmnt;
  }

  public void setShippingInclTax(java.math.BigDecimal shippingInclTax) {
    this.shippingInclTax = shippingInclTax;
  }

  public void setBaseShippingInclTax(java.math.BigDecimal baseShippingInclTax) {
    this.baseShippingInclTax = baseShippingInclTax;
  }

  public void setVatId(java.lang.String vatId) {
    this.vatId = vatId;
  }

  public void setVatIsValid(java.lang.Integer vatIsValid) {
    this.vatIsValid = vatIsValid;
  }

  public void setVatRequestId(java.lang.String vatRequestId) {
    this.vatRequestId = vatRequestId;
  }

  public void setVatRequestDate(java.lang.String vatRequestDate) {
    this.vatRequestDate = vatRequestDate;
  }

  public void setVatRequestSuccess(java.lang.Integer vatRequestSuccess) {
    this.vatRequestSuccess = vatRequestSuccess;
  }

  public void setValidatedCountryCode(java.lang.String validatedCountryCode) {
    this.validatedCountryCode = validatedCountryCode;
  }

  public void setValidatedVatNumber(java.lang.String validatedVatNumber) {
    this.validatedVatNumber = validatedVatNumber;
  }

  public void setGiftMessageId(java.lang.Integer giftMessageId) {
    this.giftMessageId = giftMessageId;
  }

  public void setFreeShipping(java.lang.Integer freeShipping) {
    this.freeShipping = freeShipping;
  }
}
