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

/** embeddable class Id for UrlRewrite. generated on 10/16/2021 from a schema. */
public class UrlRewriteId implements Serializable {
  private static final long serialVersionUID = 16344509071068086L;

  @Column(name = "store_id")
  private java.lang.Integer storeId;

  @Column(name = "url_rewrite_id")
  private java.lang.Integer urlRewriteId;

  @Column(name = "request_path")
  private java.lang.String requestPath;

  /** Constructor: UrlRewriteId. */
  public UrlRewriteId() {}

  /**
   * Constructor: UrlRewriteId.
   *
   * @param storeId - storeId.
   * @param urlRewriteId - urlRewriteId.
   * @param requestPath - requestPath.
   */
  public UrlRewriteId(
      java.lang.Integer storeId, java.lang.Integer urlRewriteId, java.lang.String requestPath) {
    this.storeId = storeId;
    this.urlRewriteId = urlRewriteId;
    this.requestPath = requestPath;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getUrlRewriteId() {
    return this.urlRewriteId;
  }

  public java.lang.String getRequestPath() {
    return this.requestPath;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setUrlRewriteId(java.lang.Integer urlRewriteId) {
    this.urlRewriteId = urlRewriteId;
  }

  public void setRequestPath(java.lang.String requestPath) {
    this.requestPath = requestPath;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
    result = prime * result + ((urlRewriteId == null) ? 0 : urlRewriteId.hashCode());
    result = prime * result + ((requestPath == null) ? 0 : requestPath.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    UrlRewriteId other = (UrlRewriteId) obj;

    if (storeId == null) {
      if (other.storeId != null) return false;
    } else if (!storeId.equals(other.storeId)) return false;

    if (urlRewriteId == null) {
      if (other.urlRewriteId != null) return false;
    } else if (!urlRewriteId.equals(other.urlRewriteId)) return false;

    if (requestPath == null) {
      if (other.requestPath != null) return false;
    } else if (!requestPath.equals(other.requestPath)) return false;

    return true;
  }
}
