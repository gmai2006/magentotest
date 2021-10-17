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
@IdClass(PaypalSettlementReportId.class)
@Table(name = "paypal_settlement_report")
public class PaypalSettlementReport implements Serializable {
  private static final long serialVersionUID = 163445090582136642L;

  /** Description: account_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "account_id")
  private java.lang.String accountId;
  /** Description: report_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "report_id")
  private java.lang.Integer reportId;
  /** Description: report_date. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "report_date")
  private java.util.Date reportDate;

  /** Description: filename. */
  @Basic
  @Column(name = "filename", length = 24)
  private java.lang.String filename;
  /** Description: last_modified. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "last_modified")
  private java.sql.Timestamp lastModified;

  public PaypalSettlementReport() {}

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

  public java.lang.String getFilename() {
    return this.filename;
  }

  public java.sql.Timestamp getLastModified() {
    return this.lastModified;
  }

  public void setFilename(java.lang.String filename) {
    this.filename = filename;
  }

  public void setLastModified(java.sql.Timestamp lastModified) {
    this.lastModified = lastModified;
  }
}
