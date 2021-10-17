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
@Table(name = "widget_instance_page")
public class WidgetInstancePage implements Serializable {
  private static final long serialVersionUID = 163445090726426103L;

  /** Description: page_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "page_id")
  private java.lang.Integer pageId;

  /** Description: instance_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "instance_id")
  private java.lang.Integer instanceId;
  /** Description: page_group. */
  @Basic
  @Column(name = "page_group", length = 25)
  private java.lang.String pageGroup;
  /** Description: layout_handle. */
  @Basic
  @Column(name = "layout_handle", length = 255)
  private java.lang.String layoutHandle;
  /** Description: block_reference. */
  @Basic
  @Column(name = "block_reference", length = 255)
  private java.lang.String blockReference;
  /** Description: page_for. */
  @Basic
  @Column(name = "page_for", length = 25)
  private java.lang.String pageFor;
  /** Description: entities. */
  @Basic
  @Column(name = "entities", length = 0)
  private java.lang.String entities;
  /** Description: page_template. */
  @Basic
  @Column(name = "page_template", length = 255)
  private java.lang.String pageTemplate;

  public WidgetInstancePage() {}

  public java.lang.Integer getPageId() {
    return this.pageId;
  }

  public void setPageId(java.lang.Integer pageId) {
    this.pageId = pageId;
  }

  public java.lang.Integer getInstanceId() {
    return this.instanceId;
  }

  public java.lang.String getPageGroup() {
    return this.pageGroup;
  }

  public java.lang.String getLayoutHandle() {
    return this.layoutHandle;
  }

  public java.lang.String getBlockReference() {
    return this.blockReference;
  }

  public java.lang.String getPageFor() {
    return this.pageFor;
  }

  public java.lang.String getEntities() {
    return this.entities;
  }

  public java.lang.String getPageTemplate() {
    return this.pageTemplate;
  }

  public void setInstanceId(java.lang.Integer instanceId) {
    this.instanceId = instanceId;
  }

  public void setPageGroup(java.lang.String pageGroup) {
    this.pageGroup = pageGroup;
  }

  public void setLayoutHandle(java.lang.String layoutHandle) {
    this.layoutHandle = layoutHandle;
  }

  public void setBlockReference(java.lang.String blockReference) {
    this.blockReference = blockReference;
  }

  public void setPageFor(java.lang.String pageFor) {
    this.pageFor = pageFor;
  }

  public void setEntities(java.lang.String entities) {
    this.entities = entities;
  }

  public void setPageTemplate(java.lang.String pageTemplate) {
    this.pageTemplate = pageTemplate;
  }
}
