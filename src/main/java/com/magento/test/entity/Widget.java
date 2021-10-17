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
@Table(name = "widget")
public class Widget implements Serializable {
  private static final long serialVersionUID = 163445090725375033L;

  /** Description: widget_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "widget_id")
  private java.lang.Integer widgetId;

  /** Description: widget_code. */
  @Basic
  @Column(name = "widget_code", length = 255)
  private java.lang.String widgetCode;
  /** Description: widget_type. */
  @Basic
  @Column(name = "widget_type", length = 255)
  private java.lang.String widgetType;
  /** Description: parameters. */
  @Basic
  @Column(name = "parameters", length = 0)
  private java.lang.String parameters;

  public Widget() {}

  public java.lang.Integer getWidgetId() {
    return this.widgetId;
  }

  public void setWidgetId(java.lang.Integer widgetId) {
    this.widgetId = widgetId;
  }

  public java.lang.String getWidgetCode() {
    return this.widgetCode;
  }

  public java.lang.String getWidgetType() {
    return this.widgetType;
  }

  public java.lang.String getParameters() {
    return this.parameters;
  }

  public void setWidgetCode(java.lang.String widgetCode) {
    this.widgetCode = widgetCode;
  }

  public void setWidgetType(java.lang.String widgetType) {
    this.widgetType = widgetType;
  }

  public void setParameters(java.lang.String parameters) {
    this.parameters = parameters;
  }
}
