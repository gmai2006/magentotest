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

/** embeddable class Id for CatalogruleWebsite. generated on 10/16/2021 from a schema. */
public class CatalogruleWebsiteId implements Serializable {
  private static final long serialVersionUID = 163445090467990397L;

  @Column(name = "rule_id")
  private java.lang.Integer ruleId;

  @Column(name = "website_id")
  private java.lang.Integer websiteId;

  /** Constructor: CatalogruleWebsiteId. */
  public CatalogruleWebsiteId() {}

  /**
   * Constructor: CatalogruleWebsiteId.
   *
   * @param ruleId - ruleId.
   * @param websiteId - websiteId.
   */
  public CatalogruleWebsiteId(java.lang.Integer ruleId, java.lang.Integer websiteId) {
    this.ruleId = ruleId;
    this.websiteId = websiteId;
  }

  public java.lang.Integer getRuleId() {
    return this.ruleId;
  }

  public java.lang.Integer getWebsiteId() {
    return this.websiteId;
  }

  public void setRuleId(java.lang.Integer ruleId) {
    this.ruleId = ruleId;
  }

  public void setWebsiteId(java.lang.Integer websiteId) {
    this.websiteId = websiteId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((ruleId == null) ? 0 : ruleId.hashCode());
    result = prime * result + ((websiteId == null) ? 0 : websiteId.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CatalogruleWebsiteId other = (CatalogruleWebsiteId) obj;

    if (ruleId == null) {
      if (other.ruleId != null) return false;
    } else if (!ruleId.equals(other.ruleId)) return false;

    if (websiteId == null) {
      if (other.websiteId != null) return false;
    } else if (!websiteId.equals(other.websiteId)) return false;

    return true;
  }
}
