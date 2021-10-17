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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** embeddable class Id for EavAttributeGroup. generated on 10/16/2021 from a schema. */
public class EavAttributeGroupId implements Serializable {
  private static final long serialVersionUID = 163445090517056520L;

  @Column(name = "attribute_group_id")
  private java.lang.Integer attributeGroupId;

  @Column(name = "attribute_group_code")
  private java.lang.String attributeGroupCode;

  @Column(name = "attribute_set_id")
  private java.lang.Integer attributeSetId;

  @Column(name = "attribute_group_name")
  private java.lang.String attributeGroupName;

  /** Constructor: EavAttributeGroupId. */
  public EavAttributeGroupId() {}

  /**
   * Constructor: EavAttributeGroupId.
   *
   * @param attributeGroupId - attributeGroupId.
   * @param attributeGroupCode - attributeGroupCode.
   * @param attributeSetId - attributeSetId.
   * @param attributeGroupName - attributeGroupName.
   */
  public EavAttributeGroupId(
      java.lang.Integer attributeGroupId,
      java.lang.String attributeGroupCode,
      java.lang.Integer attributeSetId,
      java.lang.String attributeGroupName) {
    this.attributeGroupId = attributeGroupId;
    this.attributeGroupCode = attributeGroupCode;
    this.attributeSetId = attributeSetId;
    this.attributeGroupName = attributeGroupName;
  }

  public java.lang.Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }

  public java.lang.String getAttributeGroupCode() {
    return this.attributeGroupCode;
  }

  public java.lang.Integer getAttributeSetId() {
    return this.attributeSetId;
  }

  public java.lang.String getAttributeGroupName() {
    return this.attributeGroupName;
  }

  public void setAttributeGroupId(java.lang.Integer attributeGroupId) {
    this.attributeGroupId = attributeGroupId;
  }

  public void setAttributeGroupCode(java.lang.String attributeGroupCode) {
    this.attributeGroupCode = attributeGroupCode;
  }

  public void setAttributeSetId(java.lang.Integer attributeSetId) {
    this.attributeSetId = attributeSetId;
  }

  public void setAttributeGroupName(java.lang.String attributeGroupName) {
    this.attributeGroupName = attributeGroupName;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((attributeGroupId == null) ? 0 : attributeGroupId.hashCode());
    result = prime * result + ((attributeGroupCode == null) ? 0 : attributeGroupCode.hashCode());
    result = prime * result + ((attributeSetId == null) ? 0 : attributeSetId.hashCode());
    result = prime * result + ((attributeGroupName == null) ? 0 : attributeGroupName.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EavAttributeGroupId other = (EavAttributeGroupId) obj;

    if (attributeGroupId == null) {
      if (other.attributeGroupId != null) return false;
    } else if (!attributeGroupId.equals(other.attributeGroupId)) return false;

    if (attributeGroupCode == null) {
      if (other.attributeGroupCode != null) return false;
    } else if (!attributeGroupCode.equals(other.attributeGroupCode)) return false;

    if (attributeSetId == null) {
      if (other.attributeSetId != null) return false;
    } else if (!attributeSetId.equals(other.attributeSetId)) return false;

    if (attributeGroupName == null) {
      if (other.attributeGroupName != null) return false;
    } else if (!attributeGroupName.equals(other.attributeGroupName)) return false;

    return true;
  }
}
