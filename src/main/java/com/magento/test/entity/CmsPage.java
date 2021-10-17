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
@Table(name = "cms_page")
public class CmsPage implements Serializable {
  private static final long serialVersionUID = 16344509047499158L;

  /** Description: page_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "page_id")
  private java.lang.Integer pageId;

  /** Description: title. */
  @Basic
  @Column(name = "title", length = 255)
  private java.lang.String title;
  /** Description: page_layout. */
  @Basic
  @Column(name = "page_layout", length = 255)
  private java.lang.String pageLayout;
  /** Description: meta_keywords. */
  @Basic
  @Column(name = "meta_keywords", length = 0)
  private java.lang.String metaKeywords;
  /** Description: meta_description. */
  @Basic
  @Column(name = "meta_description", length = 0)
  private java.lang.String metaDescription;
  /** Description: identifier. */
  @Basic
  @Column(name = "identifier", length = 100)
  private java.lang.String identifier;
  /** Description: content_heading. */
  @Basic
  @Column(name = "content_heading", length = 255)
  private java.lang.String contentHeading;
  /** Description: content. */
  @Basic
  @Column(name = "content", length = 0)
  private java.lang.String content;
  /** Description: creation_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "creation_time")
  private java.sql.Timestamp creationTime;
  /** Description: update_time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "update_time")
  private java.sql.Timestamp updateTime;
  /** Description: is_active. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "is_active")
  private java.lang.Integer isActive;
  /** Description: sort_order. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "sort_order")
  private java.lang.Integer sortOrder;
  /** Description: layout_update_xml. */
  @Basic
  @Column(name = "layout_update_xml", length = 0)
  private java.lang.String layoutUpdateXml;
  /** Description: custom_theme. */
  @Basic
  @Column(name = "custom_theme", length = 100)
  private java.lang.String customTheme;
  /** Description: custom_root_template. */
  @Basic
  @Column(name = "custom_root_template", length = 255)
  private java.lang.String customRootTemplate;
  /** Description: custom_layout_update_xml. */
  @Basic
  @Column(name = "custom_layout_update_xml", length = 0)
  private java.lang.String customLayoutUpdateXml;
  /** Description: custom_theme_from. */
  @Basic
  @Column(name = "custom_theme_from")
  private java.util.Date customThemeFrom;
  /** Description: custom_theme_to. */
  @Basic
  @Column(name = "custom_theme_to")
  private java.util.Date customThemeTo;
  /** Description: meta_title. */
  @Basic
  @Column(name = "meta_title", length = 255)
  private java.lang.String metaTitle;

  public CmsPage() {}

  public java.lang.Integer getPageId() {
    return this.pageId;
  }

  public void setPageId(java.lang.Integer pageId) {
    this.pageId = pageId;
  }

  public java.lang.String getTitle() {
    return this.title;
  }

  public java.lang.String getPageLayout() {
    return this.pageLayout;
  }

  public java.lang.String getMetaKeywords() {
    return this.metaKeywords;
  }

  public java.lang.String getMetaDescription() {
    return this.metaDescription;
  }

  public java.lang.String getIdentifier() {
    return this.identifier;
  }

  public java.lang.String getContentHeading() {
    return this.contentHeading;
  }

  public java.lang.String getContent() {
    return this.content;
  }

  public java.sql.Timestamp getCreationTime() {
    return this.creationTime;
  }

  public java.sql.Timestamp getUpdateTime() {
    return this.updateTime;
  }

  public java.lang.Integer getIsActive() {
    return this.isActive;
  }

  public java.lang.Integer getSortOrder() {
    return this.sortOrder;
  }

  public java.lang.String getLayoutUpdateXml() {
    return this.layoutUpdateXml;
  }

  public java.lang.String getCustomTheme() {
    return this.customTheme;
  }

  public java.lang.String getCustomRootTemplate() {
    return this.customRootTemplate;
  }

  public java.lang.String getCustomLayoutUpdateXml() {
    return this.customLayoutUpdateXml;
  }

  public java.util.Date getCustomThemeFrom() {
    return this.customThemeFrom;
  }

  public java.util.Date getCustomThemeTo() {
    return this.customThemeTo;
  }

  public java.lang.String getMetaTitle() {
    return this.metaTitle;
  }

  public void setTitle(java.lang.String title) {
    this.title = title;
  }

  public void setPageLayout(java.lang.String pageLayout) {
    this.pageLayout = pageLayout;
  }

  public void setMetaKeywords(java.lang.String metaKeywords) {
    this.metaKeywords = metaKeywords;
  }

  public void setMetaDescription(java.lang.String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public void setIdentifier(java.lang.String identifier) {
    this.identifier = identifier;
  }

  public void setContentHeading(java.lang.String contentHeading) {
    this.contentHeading = contentHeading;
  }

  public void setContent(java.lang.String content) {
    this.content = content;
  }

  public void setCreationTime(java.sql.Timestamp creationTime) {
    this.creationTime = creationTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  public void setIsActive(java.lang.Integer isActive) {
    this.isActive = isActive;
  }

  public void setSortOrder(java.lang.Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public void setLayoutUpdateXml(java.lang.String layoutUpdateXml) {
    this.layoutUpdateXml = layoutUpdateXml;
  }

  public void setCustomTheme(java.lang.String customTheme) {
    this.customTheme = customTheme;
  }

  public void setCustomRootTemplate(java.lang.String customRootTemplate) {
    this.customRootTemplate = customRootTemplate;
  }

  public void setCustomLayoutUpdateXml(java.lang.String customLayoutUpdateXml) {
    this.customLayoutUpdateXml = customLayoutUpdateXml;
  }

  public void setCustomThemeFrom(java.util.Date customThemeFrom) {
    this.customThemeFrom = customThemeFrom;
  }

  public void setCustomThemeTo(java.util.Date customThemeTo) {
    this.customThemeTo = customThemeTo;
  }

  public void setMetaTitle(java.lang.String metaTitle) {
    this.metaTitle = metaTitle;
  }
}
