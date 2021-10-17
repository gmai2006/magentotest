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
@Table(name = "search_synonyms")
public class SearchSynonyms implements Serializable {
  private static final long serialVersionUID = 163445090686491434L;

  /** Description: group_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "group_id")
  private java.lang.Long groupId;

  /** Description: synonyms. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "synonyms", length = 0)
  private java.lang.String synonyms;
  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  public SearchSynonyms() {}

  public java.lang.Long getGroupId() {
    return this.groupId;
  }

  public void setGroupId(java.lang.Long groupId) {
    this.groupId = groupId;
  }

  public java.lang.String getSynonyms() {
    return this.synonyms;
  }

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setSynonyms(java.lang.String synonyms) {
    this.synonyms = synonyms;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }
}
