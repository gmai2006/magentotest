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
@Table(name = "cache")
public class Cache implements Serializable {
  private static final long serialVersionUID = 163445090328215584L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.String id;

  /** Description: data. */
  @Basic
  @Column(name = "data")
  private java.lang.String data;
  /** Description: create_time. */
  @Basic
  @Column(name = "create_time")
  private java.lang.Integer createTime;
  /** Description: update_time. */
  @Basic
  @Column(name = "update_time")
  private java.lang.Integer updateTime;
  /** Description: expire_time. */
  @Basic
  @Column(name = "expire_time")
  private java.lang.Integer expireTime;

  public Cache() {}

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getData() {
    return this.data;
  }

  public java.lang.Integer getCreateTime() {
    return this.createTime;
  }

  public java.lang.Integer getUpdateTime() {
    return this.updateTime;
  }

  public java.lang.Integer getExpireTime() {
    return this.expireTime;
  }

  public void setData(java.lang.String data) {
    this.data = data;
  }

  public void setCreateTime(java.lang.Integer createTime) {
    this.createTime = createTime;
  }

  public void setUpdateTime(java.lang.Integer updateTime) {
    this.updateTime = updateTime;
  }

  public void setExpireTime(java.lang.Integer expireTime) {
    this.expireTime = expireTime;
  }
}
