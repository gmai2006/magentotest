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

/** embeddable class Id for SearchQuery. generated on 10/16/2021 from a schema. */
public class SearchQueryId implements Serializable {
  private static final long serialVersionUID = 163445090685523653L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "query_id")
  private java.lang.Integer queryId;

  @Column(name = "query_text")
  private java.lang.String queryText;

  /** Constructor: SearchQueryId. */
  public SearchQueryId() {}

  /**
   * Constructor: SearchQueryId.
   *
   * @param storeId - storeId.
   * @param queryId - queryId.
   * @param queryText - queryText.
   */
  public SearchQueryId(
      java.lang.Integer storeId, java.lang.Integer queryId, java.lang.String queryText) {
    this.storeId = storeId;
    this.queryId = queryId;
    this.queryText = queryText;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getQueryId() {
    return this.queryId;
  }

  public java.lang.String getQueryText() {
    return this.queryText;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setQueryId(java.lang.Integer queryId) {
    this.queryId = queryId;
  }

  public void setQueryText(java.lang.String queryText) {
    this.queryText = queryText;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((queryId == null) ? 0 : queryId.hashCode());
    result = prime * result + ((queryText == null) ? 0 : queryText.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    SearchQueryId other = (SearchQueryId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (queryId == null) {
      if (other.queryId != null) return false;
    } else if (!queryId.equals(other.queryId)) return false;

    if (queryText == null) {
      if (other.queryText != null) return false;
    } else if (!queryText.equals(other.queryText)) return false;

    return true;
  }
}
