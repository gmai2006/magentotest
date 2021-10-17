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
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(SalesShipmentId.class)
@Table(name = "sales_shipment")
public class SalesShipment implements Serializable {
  private static final long serialVersionUID = 163445090670328626L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: increment_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "increment_id")
  private java.lang.String incrementId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: total_weight. */
  @Basic
  @Column(name = "total_weight")
  private java.math.BigDecimal totalWeight;
  /** Description: total_qty. */
  @Basic
  @Column(name = "total_qty")
  private java.math.BigDecimal totalQty;
  /** Description: email_sent. */
  @Basic
  @Column(name = "email_sent")
  private java.lang.Integer emailSent;
  /** Description: send_email. */
  @Basic
  @Column(name = "send_email")
  private java.lang.Integer sendEmail;
  /** Description: order_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "order_id")
  private java.lang.Integer orderId;
  /** Description: customer_id. */
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: shipping_address_id. */
  @Basic
  @Column(name = "shipping_address_id")
  private java.lang.Integer shippingAddressId;
  /** Description: billing_address_id. */
  @Basic
  @Column(name = "billing_address_id")
  private java.lang.Integer billingAddressId;
  /** Description: shipment_status. */
  @Basic
  @Column(name = "shipment_status")
  private java.lang.Integer shipmentStatus;
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
  /** Description: packages. */
  @Basic
  @Column(name = "packages", length = 0)
  private java.lang.String packages;
  /** Description: shipping_label. */
  @Basic
  @Column(name = "shipping_label")
  private java.lang.String shippingLabel;
  /** Description: customer_note. */
  @Basic
  @Column(name = "customer_note", length = 0)
  private java.lang.String customerNote;
  /** Description: customer_note_notify. */
  @Basic
  @Column(name = "customer_note_notify")
  private java.lang.Integer customerNoteNotify;

  public SalesShipment() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getIncrementId() {
    return this.incrementId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setIncrementId(java.lang.String incrementId) {
    this.incrementId = incrementId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.math.BigDecimal getTotalWeight() {
    return this.totalWeight;
  }

  public java.math.BigDecimal getTotalQty() {
    return this.totalQty;
  }

  public java.lang.Integer getEmailSent() {
    return this.emailSent;
  }

  public java.lang.Integer getSendEmail() {
    return this.sendEmail;
  }

  public java.lang.Integer getOrderId() {
    return this.orderId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.Integer getShippingAddressId() {
    return this.shippingAddressId;
  }

  public java.lang.Integer getBillingAddressId() {
    return this.billingAddressId;
  }

  public java.lang.Integer getShipmentStatus() {
    return this.shipmentStatus;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.String getPackages() {
    return this.packages;
  }

  public java.lang.String getShippingLabel() {
    return this.shippingLabel;
  }

  public java.lang.String getCustomerNote() {
    return this.customerNote;
  }

  public java.lang.Integer getCustomerNoteNotify() {
    return this.customerNoteNotify;
  }

  public void setTotalWeight(java.math.BigDecimal totalWeight) {
    this.totalWeight = totalWeight;
  }

  public void setTotalQty(java.math.BigDecimal totalQty) {
    this.totalQty = totalQty;
  }

  public void setEmailSent(java.lang.Integer emailSent) {
    this.emailSent = emailSent;
  }

  public void setSendEmail(java.lang.Integer sendEmail) {
    this.sendEmail = sendEmail;
  }

  public void setOrderId(java.lang.Integer orderId) {
    this.orderId = orderId;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setShippingAddressId(java.lang.Integer shippingAddressId) {
    this.shippingAddressId = shippingAddressId;
  }

  public void setBillingAddressId(java.lang.Integer billingAddressId) {
    this.billingAddressId = billingAddressId;
  }

  public void setShipmentStatus(java.lang.Integer shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setPackages(java.lang.String packages) {
    this.packages = packages;
  }

  public void setShippingLabel(java.lang.String shippingLabel) {
    this.shippingLabel = shippingLabel;
  }

  public void setCustomerNote(java.lang.String customerNote) {
    this.customerNote = customerNote;
  }

  public void setCustomerNoteNotify(java.lang.Integer customerNoteNotify) {
    this.customerNoteNotify = customerNoteNotify;
  }
}
