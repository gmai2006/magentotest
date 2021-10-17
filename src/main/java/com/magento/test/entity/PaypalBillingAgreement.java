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
@Table(name = "paypal_billing_agreement")
public class PaypalBillingAgreement implements Serializable {
  private static final long serialVersionUID = 163445090579222076L;

  /** Description: agreement_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "agreement_id")
  private java.lang.Integer agreementId;

  /** Description: customer_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "customer_id")
  private java.lang.Integer customerId;
  /** Description: method_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "method_code", length = 32)
  private java.lang.String methodCode;
  /** Description: reference_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "reference_id", length = 32)
  private java.lang.String referenceId;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status", length = 20)
  private java.lang.String status;
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
  /** Description: store_id. */
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: agreement_label. */
  @Basic
  @Column(name = "agreement_label", length = 255)
  private java.lang.String agreementLabel;

  public PaypalBillingAgreement() {}

  public java.lang.Integer getAgreementId() {
    return this.agreementId;
  }

  public void setAgreementId(java.lang.Integer agreementId) {
    this.agreementId = agreementId;
  }

  public java.lang.Integer getCustomerId() {
    return this.customerId;
  }

  public java.lang.String getMethodCode() {
    return this.methodCode;
  }

  public java.lang.String getReferenceId() {
    return this.referenceId;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getAgreementLabel() {
    return this.agreementLabel;
  }

  public void setCustomerId(java.lang.Integer customerId) {
    this.customerId = customerId;
  }

  public void setMethodCode(java.lang.String methodCode) {
    this.methodCode = methodCode;
  }

  public void setReferenceId(java.lang.String referenceId) {
    this.referenceId = referenceId;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setAgreementLabel(java.lang.String agreementLabel) {
    this.agreementLabel = agreementLabel;
  }
}
