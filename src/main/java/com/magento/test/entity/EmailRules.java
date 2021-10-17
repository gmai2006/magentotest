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
@Table(name = "email_rules")
public class EmailRules implements Serializable {
  private static final long serialVersionUID = 16344509054592531L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: name. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "name", length = 255)
  private java.lang.String name;
  /** Description: website_ids. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_ids", length = 255)
  private java.lang.String websiteIds;
  /** Description: type. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "type")
  private java.lang.Integer type;
  /** Description: status. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "status")
  private java.lang.Integer status;
  /** Description: combination. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "combination")
  private java.lang.Integer combination;
  /** Description: conditions. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "conditions")
  private java.lang.String conditions;
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

  public EmailRules() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.String getWebsiteIds() {
    return this.websiteIds;
  }

  public java.lang.Integer getType() {
    return this.type;
  }

  public java.lang.Integer getStatus() {
    return this.status;
  }

  public java.lang.Integer getCombination() {
    return this.combination;
  }

  public java.lang.String getConditions() {
    return this.conditions;
  }

  public java.sql.Timestamp getCreatedAt() {
    return this.createdAt;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setWebsiteIds(java.lang.String websiteIds) {
    this.websiteIds = websiteIds;
  }

  public void setType(java.lang.Integer type) {
    this.type = type;
  }

  public void setStatus(java.lang.Integer status) {
    this.status = status;
  }

  public void setCombination(java.lang.Integer combination) {
    this.combination = combination;
  }

  public void setConditions(java.lang.String conditions) {
    this.conditions = conditions;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
