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
package com.magento.test.handler;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.magento.test.entity.CatalogruleProduct;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CatalogruleProductHandler")
public class CatalogruleProductHandler extends DelimiterFileHandler<CatalogruleProduct> {

  @Inject
  @Named("DefaultJpaDao")
  public CatalogruleProductHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CatalogruleProduct parseLine(List<String> headers, List<String> tokens) {
    CatalogruleProduct record = new CatalogruleProduct();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "ruleProductId":
          record.setRuleProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "ruleId":
          record.setRuleId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "fromTime":
          record.setFromTime(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "toTime":
          record.setToTime(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerGroupId":
          record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "actionOperator":
          record.setActionOperator(tokens.get(i));
          break;

        case "actionAmount":
          record.setActionAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "actionStop":
          record.setActionStop(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sortOrder":
          record.setSortOrder(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "websiteId":
          record.setWebsiteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
