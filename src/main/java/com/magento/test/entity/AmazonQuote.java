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
@IdClass(AmazonQuoteId.class)
@Table(name = "amazon_quote")
public class AmazonQuote implements Serializable {
  private static final long serialVersionUID = 163445090323955773L;

  /** Description: quote_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "quote_id")
  private java.lang.Integer quoteId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: amazon_order_reference_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "amazon_order_reference_id", length = 255)
  private java.lang.String amazonOrderReferenceId;
  /** Description: sandbox_simulation_reference. */
  @Basic
  @Column(name = "sandbox_simulation_reference", length = 255)
  private java.lang.String sandboxSimulationReference;
  /** Description: confirmed. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "confirmed")
  private java.lang.Integer confirmed;

  public AmazonQuote() {}

  public java.lang.Integer getQuoteId() {
    return this.quoteId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setQuoteId(java.lang.Integer quoteId) {
    this.quoteId = quoteId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.lang.String getAmazonOrderReferenceId() {
    return this.amazonOrderReferenceId;
  }

  public java.lang.String getSandboxSimulationReference() {
    return this.sandboxSimulationReference;
  }

  public java.lang.Integer getConfirmed() {
    return this.confirmed;
  }

  public void setAmazonOrderReferenceId(java.lang.String amazonOrderReferenceId) {
    this.amazonOrderReferenceId = amazonOrderReferenceId;
  }

  public void setSandboxSimulationReference(java.lang.String sandboxSimulationReference) {
    this.sandboxSimulationReference = sandboxSimulationReference;
  }

  public void setConfirmed(java.lang.Integer confirmed) {
    this.confirmed = confirmed;
  }
}
