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
@Table(name = "sendfriend_log")
public class SendfriendLog implements Serializable {
  private static final long serialVersionUID = 163445090686763134L;

  /** Description: log_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "log_id")
  private java.lang.Integer logId;

  /** Description: ip. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "ip")
  private java.lang.Long ip;
  /** Description: time. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "time")
  private java.lang.Integer time;
  /** Description: website_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  public SendfriendLog() {}

  public java.lang.Integer getLogId() {
    return this.logId;
  }

  public void setLogId(java.lang.Integer logId) {
    this.logId = logId;
  }

  public java.lang.Long getIp() {
    return this.ip;
  }

  public java.lang.Integer getTime() {
    return this.time;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setIp(java.lang.Long ip) {
    this.ip = ip;
  }

  public void setTime(java.lang.Integer time) {
    this.time = time;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }
}
