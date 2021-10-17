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

/** embeddable class Id for DownloadableLinkTitle. generated on 10/16/2021 from a schema. */
public class DownloadableLinkTitleId implements Serializable {
  private static final long serialVersionUID = 163445090512369885L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "title_id")
  private java.lang.Integer titleId;

  @Column(name = "link_id")
  private java.lang.Integer linkId;

  /** Constructor: DownloadableLinkTitleId. */
  public DownloadableLinkTitleId() {}

  /**
   * Constructor: DownloadableLinkTitleId.
   *
   * @param storeId - storeId.
   * @param titleId - titleId.
   * @param linkId - linkId.
   */
  public DownloadableLinkTitleId(
      java.lang.Integer storeId, java.lang.Integer titleId, java.lang.Integer linkId) {
    this.storeId = storeId;
    this.titleId = titleId;
    this.linkId = linkId;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getTitleId() {
    return this.titleId;
  }

  public java.lang.Integer getLinkId() {
    return this.linkId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setTitleId(java.lang.Integer titleId) {
    this.titleId = titleId;
  }

  public void setLinkId(java.lang.Integer linkId) {
    this.linkId = linkId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((titleId == null) ? 0 : titleId.hashCode());
    result = prime * result + ((linkId == null) ? 0 : linkId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    DownloadableLinkTitleId other = (DownloadableLinkTitleId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (titleId == null) {
      if (other.titleId != null) return false;
    } else if (!titleId.equals(other.titleId)) return false;

    if (linkId == null) {
      if (other.linkId != null) return false;
    } else if (!linkId.equals(other.linkId)) return false;

    return true;
  }
}
