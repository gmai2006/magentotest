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
@IdClass(ReleaseNotificationViewerLogId.class)
@Table(name = "release_notification_viewer_log")
public class ReleaseNotificationViewerLog implements Serializable {
  private static final long serialVersionUID = 163445090609764181L;

  /** Description: viewer_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "viewer_id")
  private java.lang.Integer viewerId;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: last_view_version. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_view_version", length = 16)
  private java.lang.String lastViewVersion;

  public ReleaseNotificationViewerLog() {}

  public java.lang.Integer getViewerId() {
    return this.viewerId;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setViewerId(java.lang.Integer viewerId) {
    this.viewerId = viewerId;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.String getLastViewVersion() {
    return this.lastViewVersion;
  }

  public void setLastViewVersion(java.lang.String lastViewVersion) {
    this.lastViewVersion = lastViewVersion;
  }
}
