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
@IdClass(CustomerEntityDatetimeId.class)
@Table(name = "customer_entity_datetime")
public class CustomerEntityDatetime implements Serializable {
  private static final long serialVersionUID = 163445090492952066L;

  /** Description: attribute_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "attribute_id")
  private java.lang.Integer attributeId;
  /** Description: value_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "value_id")
  private java.lang.Integer valueId;
  /** Description: entity_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_id")
  private java.lang.Integer entityId;

  /** Description: value. */
  @Basic
  @Column(name = "value")
  private java.util.Date value;

  public CustomerEntityDatetime() {}

  public java.lang.Integer getAttributeId() {
    return this.attributeId;
  }

  public java.lang.Integer getValueId() {
    return this.valueId;
  }

  public java.lang.Integer getEntityId() {
    return this.entityId;
  }

  public void setAttributeId(java.lang.Integer attributeId) {
    this.attributeId = attributeId;
  }

  public void setValueId(java.lang.Integer valueId) {
    this.valueId = valueId;
  }

  public void setEntityId(java.lang.Integer entityId) {
    this.entityId = entityId;
  }

  public java.util.Date getValue() {
    return this.value;
  }

  public void setValue(java.util.Date value) {
    this.value = value;
  }
}
