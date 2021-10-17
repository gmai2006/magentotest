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
import com.magento.test.entity.SalesInvoiceItem;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesInvoiceItemHandler")
public class SalesInvoiceItemHandler extends DelimiterFileHandler<SalesInvoiceItem> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesInvoiceItemHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesInvoiceItem parseLine(List<String> headers, List<String> tokens) {
    SalesInvoiceItem record = new SalesInvoiceItem();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parentId":
          record.setParentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "basePrice":
          record.setBasePrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxAmount":
          record.setTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseRowTotal":
          record.setBaseRowTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "discountAmount":
          record.setDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowTotal":
          record.setRowTotal(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountAmount":
          record.setBaseDiscountAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "priceInclTax":
          record.setPriceInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseTaxAmount":
          record.setBaseTaxAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "basePriceInclTax":
          record.setBasePriceInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "qty":
          record.setQty(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseCost":
          record.setBaseCost(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "price":
          record.setPrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseRowTotalInclTax":
          record.setBaseRowTotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "rowTotalInclTax":
          record.setRowTotalInclTax(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "productId":
          record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "orderItemId":
          record.setOrderItemId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "additionalData":
          record.setAdditionalData(tokens.get(i));
          break;

        case "description":
          record.setDescription(tokens.get(i));
          break;

        case "sku":
          record.setSku(tokens.get(i));
          break;

        case "name":
          record.setName(tokens.get(i));
          break;

        case "discountTaxCompensationAmount":
          record.setDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseDiscountTaxCompensationAmount":
          record.setBaseDiscountTaxCompensationAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "taxRatio":
          record.setTaxRatio(tokens.get(i));
          break;

        case "weeeTaxApplied":
          record.setWeeeTaxApplied(tokens.get(i));
          break;

        case "weeeTaxAppliedAmount":
          record.setWeeeTaxAppliedAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "weeeTaxAppliedRowAmount":
          record.setWeeeTaxAppliedRowAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "weeeTaxDisposition":
          record.setWeeeTaxDisposition(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "weeeTaxRowDisposition":
          record.setWeeeTaxRowDisposition(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseWeeeTaxAppliedAmount":
          record.setBaseWeeeTaxAppliedAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseWeeeTaxAppliedRowAmnt":
          record.setBaseWeeeTaxAppliedRowAmnt(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseWeeeTaxDisposition":
          record.setBaseWeeeTaxDisposition(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseWeeeTaxRowDisposition":
          record.setBaseWeeeTaxRowDisposition(new java.math.BigDecimal(tokens.get(i)));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
