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
@IdClass(CustomerEavAttributeWebsiteId.class)
@Table(name = "customer_eav_attribute_website")
public class CustomerEavAttributeWebsite implements Serializable {
  private static final long serialVersionUID = 163445090489277799L;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Description: is_visible. */
  @Basic
  @Column(name = "is_visible")
  private java.lang.Integer isVisible;
  /** Description: is_required. */
  @Basic
  @Column(name = "is_required")
  private java.lang.Integer isRequired;
  /** Description: default_value. */
  @Basic
  @Column(name = "default_value", length = 0)
  private java.lang.String defaultValue;
  /** Description: multiline_count. */
  @Basic
  @Column(name = "multiline_count")
  private java.lang.Integer multilineCount;

  public CustomerEavAttributeWebsite() {}

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  public java.lang.Integer getIsVisible() {
    return this.isVisible;
  }

  public java.lang.Integer getIsRequired() {
    return this.isRequired;
  }

  public java.lang.String getDefaultValue() {
    return this.defaultValue;
  }

  public java.lang.Integer getMultilineCount() {
    return this.multilineCount;
  }

  public void setIsVisible(java.lang.Integer isVisible) {
    this.isVisible = isVisible;
  }

  public void setIsRequired(java.lang.Integer isRequired) {
    this.isRequired = isRequired;
  }

  public void setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public void setMultilineCount(java.lang.Integer multilineCount) {
    this.multilineCount = multilineCount;
  }
}
