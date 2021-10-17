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
import com.magento.test.entity.CataloginventoryStockItem;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CataloginventoryStockItemHandler")
public class CataloginventoryStockItemHandler
    extends DelimiterFileHandler<CataloginventoryStockItem> {

  @Inject
  @Named("DefaultJpaDao")
  public CataloginventoryStockItemHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CataloginventoryStockItem parseLine(List<String> headers, List<String> tokens) {
    CataloginventoryStockItem record = new CataloginventoryStockItem();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "itemId":
          record.setItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "stockId":
          record.setStockId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "qty":
          record.setQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "minQty":
          record.setMinQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "useConfigMinQty":
          record.setUseConfigMinQty(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isQtyDecimal":
          record.setIsQtyDecimal(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "backorders":
          record.setBackorders(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "useConfigBackorders":
          record.setUseConfigBackorders(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "minSaleQty":
          record.setMinSaleQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "useConfigMinSaleQty":
          record.setUseConfigMinSaleQty(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "maxSaleQty":
          record.setMaxSaleQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "useConfigMaxSaleQty":
          record.setUseConfigMaxSaleQty(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isInStock":
          record.setIsInStock(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "lowStockDate":
          record.setLowStockDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "notifyStockQty":
          record.setNotifyStockQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "useConfigNotifyStockQty":
          record.setUseConfigNotifyStockQty(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "manageStock":
          record.setManageStock(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "useConfigManageStock":
          record.setUseConfigManageStock(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "stockStatusChangedAuto":
          record.setStockStatusChangedAuto(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "useConfigQtyIncrements":
          record.setUseConfigQtyIncrements(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "qtyIncrements":
          record.setQtyIncrements(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "useConfigEnableQtyInc":
          record.setUseConfigEnableQtyInc(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "enableQtyIncrements":
          record.setEnableQtyIncrements(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "isDecimalDivided":
          record.setIsDecimalDivided(java.lang.Integer.valueOf((tokens.get(i))));
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
