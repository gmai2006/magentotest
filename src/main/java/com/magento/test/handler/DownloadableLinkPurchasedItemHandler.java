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
import com.magento.test.entity.DownloadableLinkPurchasedItem;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("DownloadableLinkPurchasedItemHandler")
public class DownloadableLinkPurchasedItemHandler
    extends DelimiterFileHandler<DownloadableLinkPurchasedItem> {

  @Inject
  @Named("DefaultJpaDao")
  public DownloadableLinkPurchasedItemHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected DownloadableLinkPurchasedItem parseLine(List<String> headers, List<String> tokens) {
    DownloadableLinkPurchasedItem record = new DownloadableLinkPurchasedItem();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "itemId":
          record.setItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "purchasedId":
          record.setPurchasedId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "orderItemId":
          record.setOrderItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "linkHash":
          record.setLinkHash(tokens.get(i));
          break;

        case "numberOfDownloadsBought":
          record.setNumberOfDownloadsBought(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "numberOfDownloadsUsed":
          record.setNumberOfDownloadsUsed(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "linkId":
          record.setLinkId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "linkTitle":
          record.setLinkTitle(tokens.get(i));
          break;

        case "isShareable":
          record.setIsShareable(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "linkUrl":
          record.setLinkUrl(tokens.get(i));
          break;

        case "linkFile":
          record.setLinkFile(tokens.get(i));
          break;

        case "linkType":
          record.setLinkType(tokens.get(i));
          break;

        case "status":
          record.setStatus(tokens.get(i));
          break;

        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
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
