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
@Table(name = "widget_instance")
public class WidgetInstance implements Serializable {
  private static final long serialVersionUID = 163445090725811355L;

  /** Description: instance_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "instance_id")
  private java.lang.Integer instanceId;

  /** Description: instance_type. */
  @Basic
  @Column(name = "instance_type", length = 255)
  private java.lang.String instanceType;
  /** Description: theme_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "theme_id")
  private java.lang.Integer themeId;
  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: store_ids. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "store_ids", length = 255)
  private java.lang.String storeIds;
  /** Description: widget_parameters. */
  @Basic
  @Column(name = "widget_parameters", length = 0)
  private java.lang.String widgetParameters;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;

  public WidgetInstance() {}

  public java.lang.Integer getInstanceId() {
    return this.instanceId;
  }

  public void setInstanceId(java.lang.Integer instanceId) {
    this.instanceId = instanceId;
  }

  public java.lang.String getInstanceType() {
    return this.instanceType;
  }

  public java.lang.Integer getThemeId() {
    return this.themeId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getStoreIds() {
    return this.storeIds;
  }

  public java.lang.String getWidgetParameters() {
    return this.widgetParameters;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public void setInstanceType(java.lang.String instanceType) {
    this.instanceType = instanceType;
  }

  public void setThemeId(java.lang.Integer themeId) {
    this.themeId = themeId;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setStoreIds(java.lang.String storeIds) {
    this.storeIds = storeIds;
  }

  public void setWidgetParameters(java.lang.String widgetParameters) {
    this.widgetParameters = widgetParameters;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }
}
