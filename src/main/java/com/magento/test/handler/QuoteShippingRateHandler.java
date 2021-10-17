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
import com.magento.test.entity.QuoteShippingRate;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("QuoteShippingRateHandler")
public class QuoteShippingRateHandler extends DelimiterFileHandler<QuoteShippingRate> {

  @Inject
  @Named("DefaultJpaDao")
  public QuoteShippingRateHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected QuoteShippingRate parseLine(List<String> headers, List<String> tokens) {
    QuoteShippingRate record = new QuoteShippingRate();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "rateId":
          record.setRateId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "addressId":
          record.setAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "carrier":
          record.setCarrier(tokens.get(i));
          break;

        case "carrierTitle":
          record.setCarrierTitle(tokens.get(i));
          break;

        case "code":
          record.setCode(tokens.get(i));
          break;

        case "method":
          record.setMethod(tokens.get(i));
          break;

        case "methodDescription":
          record.setMethodDescription(tokens.get(i));
          break;

        case "price":
          record.setPrice(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "errorMessage":
          record.setErrorMessage(tokens.get(i));
          break;

        case "methodTitle":
          record.setMethodTitle(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
