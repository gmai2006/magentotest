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
package com.magento.test.dao;

import java.util.List;
import com.magento.test.entity.OauthNonce;
import com.magento.test.entity.OauthNonceId;

public interface OauthNonceDao {
  /**
   * Retrieve all records OauthNonce.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of OauthNonce
   */
  public List<OauthNonce> select(int maxResult);

  /**
   * Retrieve all records OauthNonce.
   *
   * @return A list of OauthNonce
   */
  public List<OauthNonce> selectAll();

  /**
   * Find an entity.
   *
   * @param id An OauthNonce id.
   * @return The same OauthNonce.
   */
  public OauthNonce find(OauthNonceId id);
  /**
   * Create an OauthNonce.
   *
   * @param e the OauthNonce.
   * @return The same OauthNonce.
   */
  public OauthNonce create(OauthNonce e);

  /**
   * Update the OauthNonce.
   *
   * @param e the OauthNonce.
   * @return The same OauthNonce.
   */
  public OauthNonce update(OauthNonce e);
}
