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
@IdClass(EmailTemplateId.class)
@Table(name = "email_template")
public class EmailTemplate implements Serializable {
  private static final long serialVersionUID = 163445090547248089L;

  /** Description: template_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "template_id")
  private java.lang.Integer templateId;
  /** Description: template_code. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "template_code")
  private java.lang.String templateCode;

  /** Description: template_text. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "template_text", length = 0)
  private java.lang.String templateText;
  /** Description: template_styles. */
  @Basic
  @Column(name = "template_styles", length = 0)
  private java.lang.String templateStyles;
  /** Description: template_type. */
  @Basic
  @Column(name = "template_type")
  private java.lang.Integer templateType;
  /** Description: template_subject. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "template_subject", length = 200)
  private java.lang.String templateSubject;
  /** Description: template_sender_name. */
  @Basic
  @Column(name = "template_sender_name", length = 200)
  private java.lang.String templateSenderName;
  /** Description: template_sender_email. */
  @Basic
  @Column(name = "template_sender_email", length = 200)
  private java.lang.String templateSenderEmail;
  /** Description: added_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "added_at")
  private java.sql.Timestamp addedAt;
  /** Description: modified_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "modified_at")
  private java.sql.Timestamp modifiedAt;
  /** Description: orig_template_code. */
  @Basic
  @Column(name = "orig_template_code", length = 200)
  private java.lang.String origTemplateCode;
  /** Description: orig_template_variables. */
  @Basic
  @Column(name = "orig_template_variables", length = 0)
  private java.lang.String origTemplateVariables;

  public EmailTemplate() {}

  public java.lang.Integer getTemplateId() {
    return this.templateId;
  }

  public java.lang.String getTemplateCode() {
    return this.templateCode;
  }

  public void setTemplateId(java.lang.Integer templateId) {
    this.templateId = templateId;
  }

  public void setTemplateCode(java.lang.String templateCode) {
    this.templateCode = templateCode;
  }

  public java.lang.String getTemplateText() {
    return this.templateText;
  }

  public java.lang.String getTemplateStyles() {
    return this.templateStyles;
  }

  public java.lang.Integer getTemplateType() {
    return this.templateType;
  }

  public java.lang.String getTemplateSubject() {
    return this.templateSubject;
  }

  public java.lang.String getTemplateSenderName() {
    return this.templateSenderName;
  }

  public java.lang.String getTemplateSenderEmail() {
    return this.templateSenderEmail;
  }

  public java.sql.Timestamp getAddedAt() {
    return this.addedAt;
  }

  public java.sql.Timestamp getModifiedAt() {
    return this.modifiedAt;
  }

  public java.lang.String getOrigTemplateCode() {
    return this.origTemplateCode;
  }

  public java.lang.String getOrigTemplateVariables() {
    return this.origTemplateVariables;
  }

  public void setTemplateText(java.lang.String templateText) {
    this.templateText = templateText;
  }

  public void setTemplateStyles(java.lang.String templateStyles) {
    this.templateStyles = templateStyles;
  }

  public void setTemplateType(java.lang.Integer templateType) {
    this.templateType = templateType;
  }

  public void setTemplateSubject(java.lang.String templateSubject) {
    this.templateSubject = templateSubject;
  }

  public void setTemplateSenderName(java.lang.String templateSenderName) {
    this.templateSenderName = templateSenderName;
  }

  public void setTemplateSenderEmail(java.lang.String templateSenderEmail) {
    this.templateSenderEmail = templateSenderEmail;
  }

  public void setAddedAt(java.sql.Timestamp addedAt) {
    this.addedAt = addedAt;
  }

  public void setModifiedAt(java.sql.Timestamp modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public void setOrigTemplateCode(java.lang.String origTemplateCode) {
    this.origTemplateCode = origTemplateCode;
  }

  public void setOrigTemplateVariables(java.lang.String origTemplateVariables) {
    this.origTemplateVariables = origTemplateVariables;
  }
}
