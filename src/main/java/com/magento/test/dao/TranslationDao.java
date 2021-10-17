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
import com.magento.test.entity.Translation;
import com.magento.test.entity.TranslationId;

public interface TranslationDao {
  /**
   * Retrieve all records Translation.
   *
   * @param maxResult a maximum number of returned records.
   * @return A list of Translation
   */
  public List<Translation> select(int maxResult);

  /**
   * Retrieve all records Translation.
   *
   * @return A list of Translation
   */
  public List<Translation> selectAll();

  /**
   * Find an entity.
   *
   * @param id An Translation id.
   * @return The same Translation.
   */
  public Translation find(TranslationId id);
  /**
   * Create an Translation.
   *
   * @param e the Translation.
   * @return The same Translation.
   */
  public Translation create(Translation e);

  /**
   * Update the Translation.
   *
   * @param e the Translation.
   * @return The same Translation.
   */
  public Translation update(Translation e);
}
