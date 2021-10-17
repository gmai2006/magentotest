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
@IdClass(SearchQueryId.class)
@Table(name = "search_query")
public class SearchQuery implements Serializable {
  private static final long serialVersionUID = 163445090685966316L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: query_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "query_id")
  private java.lang.Integer queryId;
  /** Description: query_text. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "query_text")
  private java.lang.String queryText;

  /** Description: num_results. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "num_results")
  private java.lang.Integer numResults;
  /** Description: popularity. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "popularity")
  private java.lang.Integer popularity;
  /** Description: redirect. */
  @Basic
  @Column(name = "redirect", length = 255)
  private java.lang.String redirect;
  /** Description: display_in_terms. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "display_in_terms")
  private java.lang.Integer displayInTerms;
  /** Description: is_active. */
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: is_processed. */
  @Basic
  @Column(name = "is_processed")
  private java.lang.Integer isProcessed;
  /** Description: updated_at. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;

  public SearchQuery() {}

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

  public java.lang.Integer getNumResults() {
    return this.numResults;
  }

  public java.lang.Integer getPopularity() {
    return this.popularity;
  }

  public java.lang.String getRedirect() {
    return this.redirect;
  }

  public java.lang.Integer getDisplayInTerms() {
    return this.displayInTerms;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getIsProcessed() {
    return this.isProcessed;
  }

  public java.sql.Timestamp getUpdatedAt() {
    return this.updatedAt;
  }

  public void setNumResults(java.lang.Integer numResults) {
    this.numResults = numResults;
  }

  public void setPopularity(java.lang.Integer popularity) {
    this.popularity = popularity;
  }

  public void setRedirect(java.lang.String redirect) {
    this.redirect = redirect;
  }

  public void setDisplayInTerms(java.lang.Integer displayInTerms) {
    this.displayInTerms = displayInTerms;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setIsProcessed(java.lang.Integer isProcessed) {
    this.isProcessed = isProcessed;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }
}
