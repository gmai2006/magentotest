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

/** embeddable class Id for MagentoBulk. generated on 10/16/2021 from a schema. */
public class MagentoBulkId implements Serializable {
  private static final long serialVersionUID = 163445090565429807L;

  @Column(name = "id")
  private java.lang.Integer id;

  @Column(name = "uuid")
  private byte[] uuid;

  /** Constructor: MagentoBulkId. */
  public MagentoBulkId() {}

  /**
   * Constructor: MagentoBulkId.
   *
   * @param id - id.
   * @param uuid - uuid.
   */
  public MagentoBulkId(java.lang.Integer id, byte[] uuid) {
    this.id = id;
    this.uuid = uuid;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public byte[] getUuid() {
    return this.uuid;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public void setUuid(byte[] uuid) {
    this.uuid = uuid;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MagentoBulkId other = (MagentoBulkId) obj;

    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;

    if (uuid == null) {
      if (other.uuid != null) return false;
    } else if (!uuid.equals(other.uuid)) return false;

    return true;
  }
}
