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
@Table(name = "design_change")
public class DesignChange implements Serializable {
  private static final long serialVersionUID = 163445090503970318L;

  /** Description: design_change_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "design_change_id")
  private java.lang.Integer designChangeId;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: design. */
  @Basic
  @Column(name = "design", length = 255)
  private java.lang.String design;
  /** Description: date_from. */
  @Basic
  @Column(name = "date_from")
  private java.util.Date dateFrom;
  /** Description: date_to. */
  @Basic
  @Column(name = "date_to")
  private java.util.Date dateTo;

  public DesignChange() {}

  public java.lang.Integer getDesignChangeId() {
    return this.designChangeId;
  }

  public void setDesignChangeId(java.lang.Integer designChangeId) {
    this.designChangeId = designChangeId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.String getDesign() {
    return this.design;
  }

  public java.util.Date getDateFrom() {
    return this.dateFrom;
  }

  public java.util.Date getDateTo() {
    return this.dateTo;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setDesign(java.lang.String design) {
    this.design = design;
  }

  public void setDateFrom(java.util.Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public void setDateTo(java.util.Date dateTo) {
    this.dateTo = dateTo;
  }
}
