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
import com.magento.test.entity.CmsPage;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CmsPageHandler")
public class CmsPageHandler extends DelimiterFileHandler<CmsPage> {

  @Inject
  @Named("DefaultJpaDao")
  public CmsPageHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CmsPage parseLine(List<String> headers, List<String> tokens) {
    CmsPage record = new CmsPage();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "pageId":
          record.setPageId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "title":
          record.setTitle(tokens.get(i));
          break;

        case "pageLayout":
          record.setPageLayout(tokens.get(i));
          break;

        case "metaKeywords":
          record.setMetaKeywords(tokens.get(i));
          break;

        case "metaDescription":
          record.setMetaDescription(tokens.get(i));
          break;

        case "identifier":
          record.setIdentifier(tokens.get(i));
          break;

        case "contentHeading":
          record.setContentHeading(tokens.get(i));
          break;

        case "content":
          record.setContent(tokens.get(i));
          break;

        case "creationTime":
          record.setCreationTime(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updateTime":
          record.setUpdateTime(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "isActive":
          record.setIsActive(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sortOrder":
          record.setSortOrder(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "layoutUpdateXml":
          record.setLayoutUpdateXml(tokens.get(i));
          break;

        case "customTheme":
          record.setCustomTheme(tokens.get(i));
          break;

        case "customRootTemplate":
          record.setCustomRootTemplate(tokens.get(i));
          break;

        case "customLayoutUpdateXml":
          record.setCustomLayoutUpdateXml(tokens.get(i));
          break;

        case "customThemeFrom":
          record.setCustomThemeFrom(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "customThemeTo":
          record.setCustomThemeTo(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "metaTitle":
          record.setMetaTitle(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
