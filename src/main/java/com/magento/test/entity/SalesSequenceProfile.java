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
@IdClass(SalesSequenceProfileId.class)
@Table(name = "sales_sequence_profile")
public class SalesSequenceProfile implements Serializable {
  private static final long serialVersionUID = 163445090669113865L;

  /** Description: meta_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "meta_id")
  private java.lang.Integer metaId;
  /** Description: profile_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "profile_id")
  private java.lang.Integer profileId;
  /** Description: prefix. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "prefix")
  private java.lang.String prefix;
  /** Description: suffix. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "suffix")
  private java.lang.String suffix;

  /** Description: start_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "start_value")
  private java.lang.Integer startValue;
  /** Description: step. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "step")
  private java.lang.Integer step;
  /** Description: max_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "max_value")
  private java.lang.Integer maxValue;
  /** Description: warning_value. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "warning_value")
  private java.lang.Integer warningValue;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;

  public SalesSequenceProfile() {}

  public java.lang.Integer getMetaId() {
    return this.metaId;
  }

  public java.lang.Integer getProfileId() {
    return this.profileId;
  }

  public java.lang.String getPrefix() {
    return this.prefix;
  }

  public java.lang.String getSuffix() {
    return this.suffix;
  }

  public void setMetaId(java.lang.Integer metaId) {
    this.metaId = metaId;
  }

  public void setProfileId(java.lang.Integer profileId) {
    this.profileId = profileId;
  }

  public void setPrefix(java.lang.String prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(java.lang.String suffix) {
    this.suffix = suffix;
  }

  public java.lang.Integer getStartValue() {
    return this.startValue;
  }

  public java.lang.Integer getStep() {
    return this.step;
  }

  public java.lang.Integer getMaxValue() {
    return this.maxValue;
  }

  public java.lang.Integer getWarningValue() {
    return this.warningValue;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public void setStartValue(java.lang.Integer startValue) {
    this.startValue = startValue;
  }

  public void setStep(java.lang.Integer step) {
    this.step = step;
  }

  public void setMaxValue(java.lang.Integer maxValue) {
    this.maxValue = maxValue;
  }

  public void setWarningValue(java.lang.Integer warningValue) {
    this.warningValue = warningValue;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }
}
