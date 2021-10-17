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
@Table(name = "catalogsearch_recommendations")
public class CatalogsearchRecommendations implements Serializable {
  private static final long serialVersionUID = 163445090470695570L;

  /** Description: id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "id")
  private java.lang.Integer id;

  /** Description: query_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "query_id")
  private java.lang.Integer queryId;
  /** Description: relation_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "relation_id")
  private java.lang.Integer relationId;

  public CatalogsearchRecommendations() {}

  public java.lang.Integer getId() {
    return this.id;
  }

  public void setId(java.lang.Integer id) {
    this.id = id;
  }

  public java.lang.Integer getQueryId() {
    return this.queryId;
  }

  public java.lang.Integer getRelationId() {
    return this.relationId;
  }

  public void setQueryId(java.lang.Integer queryId) {
    this.queryId = queryId;
  }

  public void setRelationId(java.lang.Integer relationId) {
    this.relationId = relationId;
  }
}
