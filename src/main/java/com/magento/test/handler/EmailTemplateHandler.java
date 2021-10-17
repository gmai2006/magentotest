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
import com.magento.test.entity.EmailTemplate;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("EmailTemplateHandler")
public class EmailTemplateHandler extends DelimiterFileHandler<EmailTemplate> {

  @Inject
  @Named("DefaultJpaDao")
  public EmailTemplateHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected EmailTemplate parseLine(List<String> headers, List<String> tokens) {
    EmailTemplate record = new EmailTemplate();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "templateId":
          record.setTemplateId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "templateCode":
          record.setTemplateCode(tokens.get(i));
          break;

        case "templateText":
          record.setTemplateText(tokens.get(i));
          break;

        case "templateStyles":
          record.setTemplateStyles(tokens.get(i));
          break;

        case "templateType":
          record.setTemplateType(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "templateSubject":
          record.setTemplateSubject(tokens.get(i));
          break;

        case "templateSenderName":
          record.setTemplateSenderName(tokens.get(i));
          break;

        case "templateSenderEmail":
          record.setTemplateSenderEmail(tokens.get(i));
          break;

        case "addedAt":
          record.setAddedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "modifiedAt":
          record.setModifiedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "origTemplateCode":
          record.setOrigTemplateCode(tokens.get(i));
          break;

        case "origTemplateVariables":
          record.setOrigTemplateVariables(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
