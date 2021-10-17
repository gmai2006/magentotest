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
@Table(name = "eav_entity_store")
public class EavEntityStore implements Serializable {
  private static final long serialVersionUID = 163445090528510790L;

  /** Description: entity_store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_store_id")
  private java.lang.Integer entityStoreId;

  /** Description: entity_type_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "entity_type_id")
  private java.lang.Integer entityTypeId;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: increment_prefix. */
  @Basic
  @Column(name = "increment_prefix", length = 20)
  private java.lang.String incrementPrefix;
  /** Description: increment_last_id. */
  @Basic
  @Column(name = "increment_last_id", length = 50)
  private java.lang.String incrementLastId;

  public EavEntityStore() {}

  public java.lang.Integer getEntityStoreId() {
    return this.entityStoreId;
  }

  public void setEntityStoreId(java.lang.Integer entityStoreId) {
    this.entityStoreId = entityStoreId;
  }

  public java.lang.Integer getEntityTypeId() {
    return this.entityTypeId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getIncrementPrefix() {
    return this.incrementPrefix;
  }

  public java.lang.String getIncrementLastId() {
    return this.incrementLastId;
  }

  public void setEntityTypeId(java.lang.Integer entityTypeId) {
    this.entityTypeId = entityTypeId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setIncrementPrefix(java.lang.String incrementPrefix) {
    this.incrementPrefix = incrementPrefix;
  }

  public void setIncrementLastId(java.lang.String incrementLastId) {
    this.incrementLastId = incrementLastId;
  }
}
