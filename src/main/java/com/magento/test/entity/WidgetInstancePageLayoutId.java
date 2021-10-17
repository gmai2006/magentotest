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

/** embeddable class Id for WidgetInstancePageLayout. generated on 10/16/2021 from a schema. */
public class WidgetInstancePageLayoutId implements Serializable {
  private static final long serialVersionUID = 163445090727154198L;

  @Column(name = "page_id")
  private java.lang.Integer pageId;

  @Column(name = "layout_update_id")
  private java.lang.Integer layoutUpdateId;

  /** Constructor: WidgetInstancePageLayoutId. */
  public WidgetInstancePageLayoutId() {}

  /**
   * Constructor: WidgetInstancePageLayoutId.
   *
   * @param pageId - pageId.
   * @param layoutUpdateId - layoutUpdateId.
   */
  public WidgetInstancePageLayoutId(java.lang.Integer pageId, java.lang.Integer layoutUpdateId) {
    this.pageId = pageId;
    this.layoutUpdateId = layoutUpdateId;
  }

  public java.lang.Integer getPageId() {
    return this.pageId;
  }

  public java.lang.Integer getLayoutUpdateId() {
    return this.layoutUpdateId;
  }

  public void setPageId(java.lang.Integer pageId) {
    this.pageId = pageId;
  }

  public void setLayoutUpdateId(java.lang.Integer layoutUpdateId) {
    this.layoutUpdateId = layoutUpdateId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((pageId == null) ? 0 : pageId.hashCode());
    result = prime * result + ((layoutUpdateId == null) ? 0 : layoutUpdateId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    WidgetInstancePageLayoutId other = (WidgetInstancePageLayoutId) obj;

    if (pageId == null) {
      if (other.pageId != null) return false;
    } else if (!pageId.equals(other.pageId)) return false;

    if (layoutUpdateId == null) {
      if (other.layoutUpdateId != null) return false;
    } else if (!layoutUpdateId.equals(other.layoutUpdateId)) return false;

    return true;
  }
}
