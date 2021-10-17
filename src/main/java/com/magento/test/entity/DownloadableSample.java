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
@Table(name = "downloadable_sample")
public class DownloadableSample implements Serializable {
  private static final long serialVersionUID = 163445090513438622L;

  /** Description: sample_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "sample_id")
  private java.lang.Integer sampleId;

  /** Description: product_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "product_id")
  private java.lang.Integer productId;
  /** Description: sample_url. */
  @Basic
  @Column(name = "sample_url", length = 255)
  private java.lang.String sampleUrl;
  /** Description: sample_file. */
  @Basic
  @Column(name = "sample_file", length = 255)
  private java.lang.String sampleFile;
  /** Description: sample_type. */
  @Basic
  @Column(name = "sample_type", length = 20)
  private java.lang.String sampleType;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public DownloadableSample() {}

  public java.lang.Integer getSampleId() {
    return this.sampleId;
  }

  public void setSampleId(java.lang.Integer sampleId) {
    this.sampleId = sampleId;
  }

  public java.lang.Integer getProductId() {
    return this.productId;
  }

  public java.lang.String getSampleUrl() {
    return this.sampleUrl;
  }

  public java.lang.String getSampleFile() {
    return this.sampleFile;
  }

  public java.lang.String getSampleType() {
    return this.sampleType;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setProductId(java.lang.Integer productId) {
    this.productId = productId;
  }

  public void setSampleUrl(java.lang.String sampleUrl) {
    this.sampleUrl = sampleUrl;
  }

  public void setSampleFile(java.lang.String sampleFile) {
    this.sampleFile = sampleFile;
  }

  public void setSampleType(java.lang.String sampleType) {
    this.sampleType = sampleType;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
