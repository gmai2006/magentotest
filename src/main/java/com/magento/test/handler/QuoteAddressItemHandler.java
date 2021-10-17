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
import com.magento.test.entity.QuoteAddressItem;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("QuoteAddressItemHandler")
public class QuoteAddressItemHandler extends DelimiterFileHandler<QuoteAddressItem> {

  @Inject
  @Named("DefaultJpaDao")
  public QuoteAddressItemHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected QuoteAddressItem parseLine(List<String> headers, List<String> tokens) {
    QuoteAddressItem record = new QuoteAddressItem();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "addressItemId":
          record.setAddressItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parentItemId":
          record.setParentItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteAddressId":
          record.setQuoteAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteItemId":
          record.setQuoteItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "appliedRuleIds":
          record.setAppliedRuleIds(tokens.get(i));
          break;

        case "additionalData":
          record.setAdditionalData(tokens.get(i));
          break;

        case "weight":
          record.setWeight(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "qty":
          record.setQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxAmount":
          record.setTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowTotal":
          record.setRowTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseRowTotal":
          record.setBaseRowTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowTotalWithDiscount":
          record.setRowTotalWithDiscount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountAmount":
          record.setBaseDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxAmount":
          record.setBaseTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowWeight":
          record.setRowWeight(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "superProductId":
          record.setSuperProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parentProductId":
          record.setParentProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "storeId":
          record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "sku":
          record.setSku(tokens.get(i));
          break;

        case "image":
          record.setImage(tokens.get(i));
          break;

        case "name":
          record.setName(tokens.get(i));
          break;

        case "description":
          record.setDescription(tokens.get(i));
          break;

        case "isQtyDecimal":
          record.setIsQtyDecimal(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "price":
          record.setPrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountPercent":
          record.setDiscountPercent(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "noDiscount":
          record.setNoDiscount(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "taxPercent":
          record.setTaxPercent(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "basePrice":
          record.setBasePrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseCost":
          record.setBaseCost(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "priceInclTax":
          record.setPriceInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "basePriceInclTax":
          record.setBasePriceInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowTotalInclTax":
          record.setRowTotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseRowTotalInclTax":
          record.setBaseRowTotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountTaxCompensationAmount":
          record.setDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationAmount":
          record.setBaseDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "giftMessageId":
          record.setGiftMessageId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "freeShipping":
          record.setFreeShipping(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
