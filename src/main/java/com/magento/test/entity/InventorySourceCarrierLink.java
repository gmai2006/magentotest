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
@Table(name = "inventory_source_carrier_link")
public class InventorySourceCarrierLink implements Serializable {
  private static final long serialVersionUID = 163445090557970655L;

  /** Description: link_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Description: source_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "source_code", length = 255)
  private java.lang.String sourceCode;
  /** Description: carrier_code. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "carrier_code", length = 255)
  private java.lang.String carrierCode;
  /** Description: position. */
  @Basic
  @Column(name = "position")
  private java.lang.Integer position;

  public InventorySourceCarrierLink() {}

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  public java.lang.String getSourceCode() {
    return this.sourceCode;
  }

  public java.lang.String getCarrierCode() {
    return this.carrierCode;
  }

  public java.lang.Integer getPosition() {
    return this.position;
  }

  public void setSourceCode(java.lang.String sourceCode) {
    this.sourceCode = sourceCode;
  }

  public void setCarrierCode(java.lang.String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public void setPosition(java.lang.Integer position) {
    this.position = position;
  }
}
