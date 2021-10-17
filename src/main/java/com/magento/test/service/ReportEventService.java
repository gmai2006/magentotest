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
package com.magento.test.service;

import java.util.List;
import com.magento.test.entity.ReportEvent;

public interface ReportEventService {
  public ReportEvent find(java.lang.Long id);

  /**
   * Select a list of ReportEvent based on a given maximum number of returning records.
   *
   * @param maxResult : a specified maximum number of returned records.
   * @return ReportEvent records.
   */
  public List<ReportEvent> select(int maxResult);

  /**
   * Select all ReportEvent.
   *
   * @return all ReportEvent records.
   */
  public List<ReportEvent> selectAll();

  /**
   * Create ReportEvent.
   *
   * @param bean The ReportEvent.
   * @return The ReportEvent.
   */
  public ReportEvent create(ReportEvent bean);

  /**
   * Update a ReportEvent.
   *
   * @param bean - The ReportEvent.
   * @return ReportEvent.
   */
  public ReportEvent update(ReportEvent bean);
}
