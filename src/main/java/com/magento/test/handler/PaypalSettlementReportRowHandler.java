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
import com.magento.test.entity.PaypalSettlementReportRow;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("PaypalSettlementReportRowHandler")
public class PaypalSettlementReportRowHandler
    extends DelimiterFileHandler<PaypalSettlementReportRow> {

  @Inject
  @Named("DefaultJpaDao")
  public PaypalSettlementReportRowHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected PaypalSettlementReportRow parseLine(List<String> headers, List<String> tokens) {
    PaypalSettlementReportRow record = new PaypalSettlementReportRow();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "rowId":
          record.setRowId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "reportId":
          record.setReportId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "transactionId":
          record.setTransactionId(tokens.get(i));
          break;

        case "invoiceId":
          record.setInvoiceId(tokens.get(i));
          break;

        case "paypalReferenceId":
          record.setPaypalReferenceId(tokens.get(i));
          break;

        case "paypalReferenceIdType":
          record.setPaypalReferenceIdType(tokens.get(i));
          break;

        case "transactionEventCode":
          record.setTransactionEventCode(tokens.get(i));
          break;

        case "transactionInitiationDate":
          record.setTransactionInitiationDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "transactionCompletionDate":
          record.setTransactionCompletionDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "transactionDebitOrCredit":
          record.setTransactionDebitOrCredit(tokens.get(i));
          break;

        case "grossTransactionAmount":
          record.setGrossTransactionAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "grossTransactionCurrency":
          record.setGrossTransactionCurrency(tokens.get(i));
          break;

        case "feeDebitOrCredit":
          record.setFeeDebitOrCredit(tokens.get(i));
          break;

        case "feeAmount":
          record.setFeeAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "feeCurrency":
          record.setFeeCurrency(tokens.get(i));
          break;

        case "customField":
          record.setCustomField(tokens.get(i));
          break;

        case "consumerId":
          record.setConsumerId(tokens.get(i));
          break;

        case "paymentTrackingId":
          record.setPaymentTrackingId(tokens.get(i));
          break;

        case "storeId":
          record.setStoreId(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
