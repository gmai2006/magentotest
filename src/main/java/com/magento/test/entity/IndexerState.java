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
@Table(name = "indexer_state")
public class IndexerState implements Serializable {
  private static final long serialVersionUID = 163445090552240702L;

  /** Description: state_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "state_id")
  private java.lang.Integer stateId;

  /** Description: indexer_id. */
  @Basic
  @Column(name = "indexer_id", length = 255)
  private java.lang.String indexerId;
  /** Description: status. */
  @Basic
  @Column(name = "status", length = 16)
  private java.lang.String status;
  /** Description: updated. */
  @Basic
  @Column(name = "updated")
  private java.util.Date updated;
  /** Description: hash_config. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "hash_config", length = 32)
  private java.lang.String hashConfig;

  public IndexerState() {}

  public java.lang.Integer getStateId() {
    return this.stateId;
  }

  public void setStateId(java.lang.Integer stateId) {
    this.stateId = stateId;
  }

  public java.lang.String getIndexerId() {
    return this.indexerId;
  }

  public java.lang.String getStatus() {
    return this.status;
  }

  public java.util.Date getUpdated() {
    return this.updated;
  }

  public java.lang.String getHashConfig() {
    return this.hashConfig;
  }

  public void setIndexerId(java.lang.String indexerId) {
    this.indexerId = indexerId;
  }

  public void setStatus(java.lang.String status) {
    this.status = status;
  }

  public void setUpdated(java.util.Date updated) {
    this.updated = updated;
  }

  public void setHashConfig(java.lang.String hashConfig) {
    this.hashConfig = hashConfig;
  }
}
