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
@IdClass(QueueId.class)
@Table(name = "queue")
public class Queue implements Serializable {
  private static final long serialVersionUID = 163445090587121682L;

  /** Description: name. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "name")
  private java.lang.String name;
  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  public Queue() {}

  public java.lang.String getName() {
    return this.name;
  }

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }
}
