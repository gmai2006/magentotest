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
@Table(name = "msp_tfa_user_config")
public class MspTfaUserConfig implements Serializable {
  private static final long serialVersionUID = 16344509056837567L;

  /** Description: msp_tfa_user_config_id. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "msp_tfa_user_config_id")
  private java.lang.Integer mspTfaUserConfigId;

  /** Description: user_id. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "user_id")
  private java.lang.Integer userId;
  /** Description: encoded_providers. */
  @Basic
  @Column(name = "encoded_providers", length = 0)
  private java.lang.String encodedProviders;
  /** Description: encoded_config. */
  @Basic
  @Column(name = "encoded_config", length = 0)
  private java.lang.String encodedConfig;
  /** Description: default_provider. */
  @Basic
  @Column(name = "default_provider", length = 0)
  private java.lang.String defaultProvider;

  public MspTfaUserConfig() {}

  public java.lang.Integer getMspTfaUserConfigId() {
    return this.mspTfaUserConfigId;
  }

  public void setMspTfaUserConfigId(java.lang.Integer mspTfaUserConfigId) {
    this.mspTfaUserConfigId = mspTfaUserConfigId;
  }

  public java.lang.Integer getUserId() {
    return this.userId;
  }

  public java.lang.String getEncodedProviders() {
    return this.encodedProviders;
  }

  public java.lang.String getEncodedConfig() {
    return this.encodedConfig;
  }

  public java.lang.String getDefaultProvider() {
    return this.defaultProvider;
  }

  public void setUserId(java.lang.Integer userId) {
    this.userId = userId;
  }

  public void setEncodedProviders(java.lang.String encodedProviders) {
    this.encodedProviders = encodedProviders;
  }

  public void setEncodedConfig(java.lang.String encodedConfig) {
    this.encodedConfig = encodedConfig;
  }

  public void setDefaultProvider(java.lang.String defaultProvider) {
    this.defaultProvider = defaultProvider;
  }
}
