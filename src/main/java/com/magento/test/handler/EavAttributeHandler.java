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
import com.magento.test.entity.EavAttribute;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("EavAttributeHandler")
public class EavAttributeHandler extends DelimiterFileHandler<EavAttribute> {

  @Inject
  @Named("DefaultJpaDao")
  public EavAttributeHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected EavAttribute parseLine(List<String> headers, List<String> tokens) {
    EavAttribute record = new EavAttribute();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "attributeId":
          record.setAttributeId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "entityTypeId":
          record.setEntityTypeId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "attributeCode":
          record.setAttributeCode(tokens.get(i));
          break;

        case "attributeModel":
          record.setAttributeModel(tokens.get(i));
          break;

        case "backendModel":
          record.setBackendModel(tokens.get(i));
          break;

        case "backendType":
          record.setBackendType(tokens.get(i));
          break;

        case "backendTable":
          record.setBackendTable(tokens.get(i));
          break;

        case "frontendModel":
          record.setFrontendModel(tokens.get(i));
          break;

        case "frontendInput":
          record.setFrontendInput(tokens.get(i));
          break;

        case "frontendLabel":
          record.setFrontendLabel(tokens.get(i));
          break;

        case "frontendClass":
          record.setFrontendClass(tokens.get(i));
          break;

        case "sourceModel":
          record.setSourceModel(tokens.get(i));
          break;

        case "isRequired":
          record.setIsRequired(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isUserDefined":
          record.setIsUserDefined(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "defaultValue":
          record.setDefaultValue(tokens.get(i));
          break;

        case "isUnique":
          record.setIsUnique(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "note":
          record.setNote(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
