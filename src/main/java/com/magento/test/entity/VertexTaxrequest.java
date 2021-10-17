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
@Table(name = "vertex_taxrequest")
public class VertexTaxrequest implements Serializable {
  private static final long serialVersionUID = 163445090723989227L;

  /** Description: request_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "request_id")
  private java.lang.Long requestId;

  /** Description: request_type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "request_type", length = 255)
  private java.lang.String requestType;
  /** Description: quote_id. */
  @Basic
  @Column(name = "quote_id")
  private java.lang.Long quoteId;
  /** Description: order_id. */
  @Basic
  @Column(name = "order_id")
  private java.lang.Long orderId;
  /** Description: total_tax. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total_tax", length = 255)
  private java.lang.String totalTax;
  /** Description: source_path. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "source_path", length = 255)
  private java.lang.String sourcePath;
  /** Description: tax_area_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "tax_area_id", length = 255)
  private java.lang.String taxAreaId;
  /** Description: sub_total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sub_total", length = 255)
  private java.lang.String subTotal;
  /** Description: total. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "total", length = 255)
  private java.lang.String total;
  /** Description: lookup_result. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "lookup_result", length = 255)
  private java.lang.String lookupResult;
  /** Description: request_date. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "request_date")
  private java.sql.Timestamp requestDate;
  /** Description: request_xml. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "request_xml", length = 0)
  private java.lang.String requestXml;
  /** Description: response_xml. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "response_xml", length = 0)
  private java.lang.String responseXml;

  public VertexTaxrequest() {}

  public java.lang.Long getRequestId() {
    return this.requestId;
  }

  public void setRequestId(java.lang.Long requestId) {
    this.requestId = requestId;
  }

  public java.lang.String getRequestType() {
    return this.requestType;
  }

  public java.lang.Long getQuoteId() {
    return this.quoteId;
  }

  public java.lang.Long getOrderId() {
    return this.orderId;
  }

  public java.lang.String getTotalTax() {
    return this.totalTax;
  }

  public java.lang.String getSourcePath() {
    return this.sourcePath;
  }

  public java.lang.String getTaxAreaId() {
    return this.taxAreaId;
  }

  public java.lang.String getSubTotal() {
    return this.subTotal;
  }

  public java.lang.String getTotal() {
    return this.total;
  }

  public java.lang.String getLookupResult() {
    return this.lookupResult;
  }

  public java.sql.Timestamp getRequestDate() {
    return this.requestDate;
  }

  public java.lang.String getRequestXml() {
    return this.requestXml;
  }

  public java.lang.String getResponseXml() {
    return this.responseXml;
  }

  public void setRequestType(java.lang.String requestType) {
    this.requestType = requestType;
  }

  public void setQuoteId(java.lang.Long quoteId) {
    this.quoteId = quoteId;
  }

  public void setOrderId(java.lang.Long orderId) {
    this.orderId = orderId;
  }

  public void setTotalTax(java.lang.String totalTax) {
    this.totalTax = totalTax;
  }

  public void setSourcePath(java.lang.String sourcePath) {
    this.sourcePath = sourcePath;
  }

  public void setTaxAreaId(java.lang.String taxAreaId) {
    this.taxAreaId = taxAreaId;
  }

  public void setSubTotal(java.lang.String subTotal) {
    this.subTotal = subTotal;
  }

  public void setTotal(java.lang.String total) {
    this.total = total;
  }

  public void setLookupResult(java.lang.String lookupResult) {
    this.lookupResult = lookupResult;
  }

  public void setRequestDate(java.sql.Timestamp requestDate) {
    this.requestDate = requestDate;
  }

  public void setRequestXml(java.lang.String requestXml) {
    this.requestXml = requestXml;
  }

  public void setResponseXml(java.lang.String responseXml) {
    this.responseXml = responseXml;
  }
}
