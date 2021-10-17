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
import com.magento.test.entity.CustomerEavAttribute;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CustomerEavAttributeHandler")
public class CustomerEavAttributeHandler extends DelimiterFileHandler<CustomerEavAttribute> {

  @Inject
  @Named("DefaultJpaDao")
  public CustomerEavAttributeHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CustomerEavAttribute parseLine(List<String> headers, List<String> tokens) {
    CustomerEavAttribute record = new CustomerEavAttribute();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "attributeId":
          record.setAttributeId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVisible":
          record.setIsVisible(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "inputFilter":
          record.setInputFilter(tokens.get(i));
          break;

        case "multilineCount":
          record.setMultilineCount(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "validateRules":
          record.setValidateRules(tokens.get(i));
          break;

        case "isSystem":
          record.setIsSystem(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sortOrder":
          record.setSortOrder(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "dataModel":
          record.setDataModel(tokens.get(i));
          break;

        case "isUsedInGrid":
          record.setIsUsedInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isVisibleInGrid":
          record.setIsVisibleInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isFilterableInGrid":
          record.setIsFilterableInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isSearchableInGrid":
          record.setIsSearchableInGrid(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
