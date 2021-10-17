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
import com.magento.test.entity.Wishlist;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("WishlistHandler")
public class WishlistHandler extends DelimiterFileHandler<Wishlist> {

  @Inject
  @Named("DefaultJpaDao")
  public WishlistHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Wishlist parseLine(List<String> headers, List<String> tokens) {
    Wishlist record = new Wishlist();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "wishlistId":
          record.setWishlistId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "customerId":
          record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "shared":
          record.setShared(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sharingCode":
          record.setSharingCode(tokens.get(i));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
