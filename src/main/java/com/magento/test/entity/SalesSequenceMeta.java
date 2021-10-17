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
@IdClass(SalesSequenceMetaId.class)
@Table(name = "sales_sequence_meta")
public class SalesSequenceMeta implements Serializable {
  private static final long serialVersionUID = 163445090668073180L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: entity_type. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "entity_type")
  private java.lang.String entityType;
  /** Description: meta_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "meta_id")
  private java.lang.Integer metaId;

  /** Description: sequence_table. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sequence_table", length = 64)
  private java.lang.String sequenceTable;

  public SalesSequenceMeta() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getEntityType() {
    return this.entityType;
  }

  public java.lang.Integer getMetaId() {
    return this.metaId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
  }

  public void setMetaId(java.lang.Integer metaId) {
    this.metaId = metaId;
  }

  public java.lang.String getSequenceTable() {
    return this.sequenceTable;
  }

  public void setSequenceTable(java.lang.String sequenceTable) {
    this.sequenceTable = sequenceTable;
  }
}
