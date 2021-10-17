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
import com.magento.test.entity.QuotePayment;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("QuotePaymentHandler")
public class QuotePaymentHandler extends DelimiterFileHandler<QuotePayment> {

  @Inject
  @Named("DefaultJpaDao")
  public QuotePaymentHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected QuotePayment parseLine(List<String> headers, List<String> tokens) {
    QuotePayment record = new QuotePayment();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "paymentId":
          record.setPaymentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "quoteId":
          record.setQuoteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "method":
          record.setMethod(tokens.get(i));
          break;

        case "ccType":
          record.setCcType(tokens.get(i));
          break;

        case "ccNumberEnc":
          record.setCcNumberEnc(tokens.get(i));
          break;

        case "ccLast4":
          record.setCcLast4(tokens.get(i));
          break;

        case "ccCidEnc":
          record.setCcCidEnc(tokens.get(i));
          break;

        case "ccOwner":
          record.setCcOwner(tokens.get(i));
          break;

        case "ccExpMonth":
          record.setCcExpMonth(tokens.get(i));
          break;

        case "ccExpYear":
          record.setCcExpYear(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "ccSsOwner":
          record.setCcSsOwner(tokens.get(i));
          break;

        case "ccSsStartMonth":
          record.setCcSsStartMonth(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "ccSsStartYear":
          record.setCcSsStartYear(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "poNumber":
          record.setPoNumber(tokens.get(i));
          break;

        case "additionalData":
          record.setAdditionalData(tokens.get(i));
          break;

        case "ccSsIssue":
          record.setCcSsIssue(tokens.get(i));
          break;

        case "additionalInformation":
          record.setAdditionalInformation(tokens.get(i));
          break;

        case "paypalPayerId":
          record.setPaypalPayerId(tokens.get(i));
          break;

        case "paypalPayerStatus":
          record.setPaypalPayerStatus(tokens.get(i));
          break;

        case "paypalCorrelationId":
          record.setPaypalCorrelationId(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
