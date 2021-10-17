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
import com.magento.test.entity.Theme;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("ThemeHandler")
public class ThemeHandler extends DelimiterFileHandler<Theme> {

  @Inject
  @Named("DefaultJpaDao")
  public ThemeHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Theme parseLine(List<String> headers, List<String> tokens) {
    Theme record = new Theme();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "themeId":
          record.setThemeId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parentId":
          record.setParentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "themePath":
          record.setThemePath(tokens.get(i));
          break;

        case "themeTitle":
          record.setThemeTitle(tokens.get(i));
          break;

        case "previewImage":
          record.setPreviewImage(tokens.get(i));
          break;

        case "isFeatured":
          record.setIsFeatured(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "area":
          record.setArea(tokens.get(i));
          break;

        case "type":
          record.setType(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "code":
          record.setCode(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
