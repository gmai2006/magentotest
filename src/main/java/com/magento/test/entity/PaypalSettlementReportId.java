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

/** embeddable class Id for PaypalSettlementReport. generated on 10/16/2021 from a schema. */
public class PaypalSettlementReportId implements Serializable {
  private static final long serialVersionUID = 163445090581580631L;

  @Column(name = "account_id")
  private java.lang.String accountId;

  @Column(name = "report_id")
  private java.lang.Integer reportId;

  @Column(name = "report_date")
  private java.util.Date reportDate;

  /** Constructor: PaypalSettlementReportId. */
  public PaypalSettlementReportId() {}

  /**
   * Constructor: PaypalSettlementReportId.
   *
   * @param accountId - accountId.
   * @param reportId - reportId.
   * @param reportDate - reportDate.
   */
  public PaypalSettlementReportId(
      java.lang.String accountId, java.lang.Integer reportId, java.util.Date reportDate) {
    this.accountId = accountId;
    this.reportId = reportId;
    this.reportDate = reportDate;
  }

  public java.lang.String getAccountId() {
    return this.accountId;
  }

  public java.lang.Integer getReportId() {
    return this.reportId;
  }

  public java.util.Date getReportDate() {
    return this.reportDate;
  }

  public void setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
  }

  public void setReportId(java.lang.Integer reportId) {
    this.reportId = reportId;
  }

  public void setReportDate(java.util.Date reportDate) {
    this.reportDate = reportDate;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
    result = prime * result + ((reportId == null) ? 0 : reportId.hashCode());
    result = prime * result + ((reportDate == null) ? 0 : reportDate.hashCode());

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PaypalSettlementReportId other = (PaypalSettlementReportId) obj;

    if (accountId == null) {
      if (other.accountId != null) return false;
    } else if (!accountId.equals(other.accountId)) return false;

    if (reportId == null) {
      if (other.reportId != null) return false;
    } else if (!reportId.equals(other.reportId)) return false;

    if (reportDate == null) {
      if (other.reportDate != null) return false;
    } else if (!reportDate.equals(other.reportDate)) return false;

    return true;
  }
}
