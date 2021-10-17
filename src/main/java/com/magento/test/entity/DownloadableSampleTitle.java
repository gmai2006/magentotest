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
@IdClass(DownloadableSampleTitleId.class)
@Table(name = "downloadable_sample_title")
public class DownloadableSampleTitle implements Serializable {
  private static final long serialVersionUID = 163445090514720882L;

  /** Description: store_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "store_id")
  private java.lang.Integer storeId;
  /** Description: sample_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sample_id")
  private java.lang.Integer sampleId;
  /** Description: title_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "title_id")
  private java.lang.Integer titleId;

  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;

  public DownloadableSampleTitle() {}

  public java.lang.Integer getStoreId() {
    return this.storeId;
  }

  public java.lang.Integer getSampleId() {
    return this.sampleId;
  }

  public java.lang.Integer getTitleId() {
    return this.titleId;
  }

  public void setStoreId(java.lang.Integer storeId) {
    this.storeId = storeId;
  }

  public void setSampleId(java.lang.Integer sampleId) {
    this.sampleId = sampleId;
  }

  public void setTitleId(java.lang.Integer titleId) {
    this.titleId = titleId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }
}
