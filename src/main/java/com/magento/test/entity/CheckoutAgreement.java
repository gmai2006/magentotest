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
@Table(name = "checkout_agreement")
public class CheckoutAgreement implements Serializable {
  private static final long serialVersionUID = 163445090471154598L;

  /** Description: agreement_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "agreement_id")
  private java.lang.Integer agreementId;

  /** Description: name. */
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: content. */
  @Basic
  @Column(name = "content", length = 0)
  private java.lang.String content;
  /** Description: content_height. */
  @Basic
  @Column(name = "content_height", length = 25)
  private java.lang.String contentHeight;
  /** Description: checkbox_text. */
  @Basic
  @Column(name = "checkbox_text", length = 0)
  private java.lang.String checkboxText;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: is_html. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_html")
  private java.lang.Integer isHtml;
  /** Description: mode. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "mode")
  private java.lang.Integer mode;

  public CheckoutAgreement() {}

  public java.lang.Integer getAgreementId() {
    return this.agreementId;
  }

  public void setAgreementId(java.lang.Integer agreementId) {
    this.agreementId = agreementId;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public java.lang.String getContentHeight() {
    return this.contentHeight;
  }

  public java.lang.String getCheckboxText() {
    return this.checkboxText;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getIsHtml() {
    return this.isHtml;
  }

  public java.lang.Integer getMode() {
    return this.mode;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public void setContentHeight(java.lang.String contentHeight) {
    this.contentHeight = contentHeight;
  }

  public void setCheckboxText(java.lang.String checkboxText) {
    this.checkboxText = checkboxText;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setIsHtml(java.lang.Integer isHtml) {
    this.isHtml = isHtml;
  }

  public void setMode(java.lang.Integer mode) {
    this.mode = mode;
  }
}
