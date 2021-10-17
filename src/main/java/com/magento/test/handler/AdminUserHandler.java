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
import com.magento.test.entity.AdminUser;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("AdminUserHandler")
public class AdminUserHandler extends DelimiterFileHandler<AdminUser> {

  @Inject
  @Named("DefaultJpaDao")
  public AdminUserHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected AdminUser parseLine(List<String> headers, List<String> tokens) {
    AdminUser record = new AdminUser();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "userId":
          record.setUserId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "firstname":
          record.setFirstname(tokens.get(i));
          break;

        case "lastname":
          record.setLastname(tokens.get(i));
          break;

        case "email":
          record.setEmail(tokens.get(i));
          break;

        case "username":
          record.setUsername(tokens.get(i));
          break;

        case "password":
          record.setPassword(tokens.get(i));
          break;

        case "created":
          record.setCreated(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "modified":
          record.setModified(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "logdate":
          record.setLogdate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "lognum":
          record.setLognum(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "reloadAclFlag":
          record.setReloadAclFlag(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isActive":
          record.setIsActive(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "extra":
          record.setExtra(tokens.get(i));
          break;

        case "rpToken":
          record.setRpToken(tokens.get(i));
          break;

        case "rpTokenCreatedAt":
          record.setRpTokenCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "interfaceLocale":
          record.setInterfaceLocale(tokens.get(i));
          break;

        case "failuresNum":
          record.setFailuresNum(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "firstFailure":
          record.setFirstFailure(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "lockExpires":
          record.setLockExpires(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "refreshToken":
          record.setRefreshToken(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
