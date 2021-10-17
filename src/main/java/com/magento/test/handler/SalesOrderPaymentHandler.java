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
import com.magento.test.entity.SalesOrderPayment;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("SalesOrderPaymentHandler")
public class SalesOrderPaymentHandler extends DelimiterFileHandler<SalesOrderPayment> {

  @Inject
  @Named("DefaultJpaDao")
  public SalesOrderPaymentHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected SalesOrderPayment parseLine(List<String> headers, List<String> tokens) {
    SalesOrderPayment record = new SalesOrderPayment();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "parentId":
          record.setParentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "baseShippingCaptured":
          record.setBaseShippingCaptured(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingCaptured":
          record.setShippingCaptured(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "amountRefunded":
          record.setAmountRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountPaid":
          record.setBaseAmountPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "amountCanceled":
          record.setAmountCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountAuthorized":
          record.setBaseAmountAuthorized(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountPaidOnline":
          record.setBaseAmountPaidOnline(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountRefundedOnline":
          record.setBaseAmountRefundedOnline(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingAmount":
          record.setBaseShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingAmount":
          record.setShippingAmount(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "amountPaid":
          record.setAmountPaid(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "amountAuthorized":
          record.setAmountAuthorized(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountOrdered":
          record.setBaseAmountOrdered(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseShippingRefunded":
          record.setBaseShippingRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "shippingRefunded":
          record.setShippingRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountRefunded":
          record.setBaseAmountRefunded(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "amountOrdered":
          record.setAmountOrdered(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "baseAmountCanceled":
          record.setBaseAmountCanceled(new java.math.BigDecimal(tokens.get(i)));
          break;

        case "quotePaymentId":
          record.setQuotePaymentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "additionalData":
          record.setAdditionalData(tokens.get(i));
          break;

        case "ccExpMonth":
          record.setCcExpMonth(tokens.get(i));
          break;

        case "ccSsStartYear":
          record.setCcSsStartYear(tokens.get(i));
          break;

        case "echeckBankName":
          record.setEcheckBankName(tokens.get(i));
          break;

        case "method":
          record.setMethod(tokens.get(i));
          break;

        case "ccDebugRequestBody":
          record.setCcDebugRequestBody(tokens.get(i));
          break;

        case "ccSecureVerify":
          record.setCcSecureVerify(tokens.get(i));
          break;

        case "protectionEligibility":
          record.setProtectionEligibility(tokens.get(i));
          break;

        case "ccApproval":
          record.setCcApproval(tokens.get(i));
          break;

        case "ccLast4":
          record.setCcLast4(tokens.get(i));
          break;

        case "ccStatusDescription":
          record.setCcStatusDescription(tokens.get(i));
          break;

        case "echeckType":
          record.setEcheckType(tokens.get(i));
          break;

        case "ccDebugResponseSerialized":
          record.setCcDebugResponseSerialized(tokens.get(i));
          break;

        case "ccSsStartMonth":
          record.setCcSsStartMonth(tokens.get(i));
          break;

        case "echeckAccountType":
          record.setEcheckAccountType(tokens.get(i));
          break;

        case "lastTransId":
          record.setLastTransId(tokens.get(i));
          break;

        case "ccCidStatus":
          record.setCcCidStatus(tokens.get(i));
          break;

        case "ccOwner":
          record.setCcOwner(tokens.get(i));
          break;

        case "ccType":
          record.setCcType(tokens.get(i));
          break;

        case "poNumber":
          record.setPoNumber(tokens.get(i));
          break;

        case "ccExpYear":
          record.setCcExpYear(tokens.get(i));
          break;

        case "ccStatus":
          record.setCcStatus(tokens.get(i));
          break;

        case "echeckRoutingNumber":
          record.setEcheckRoutingNumber(tokens.get(i));
          break;

        case "accountStatus":
          record.setAccountStatus(tokens.get(i));
          break;

        case "anetTransMethod":
          record.setAnetTransMethod(tokens.get(i));
          break;

        case "ccDebugResponseBody":
          record.setCcDebugResponseBody(tokens.get(i));
          break;

        case "ccSsIssue":
          record.setCcSsIssue(tokens.get(i));
          break;

        case "echeckAccountName":
          record.setEcheckAccountName(tokens.get(i));
          break;

        case "ccAvsStatus":
          record.setCcAvsStatus(tokens.get(i));
          break;

        case "ccNumberEnc":
          record.setCcNumberEnc(tokens.get(i));
          break;

        case "ccTransId":
          record.setCcTransId(tokens.get(i));
          break;

        case "addressStatus":
          record.setAddressStatus(tokens.get(i));
          break;

        case "additionalInformation":
          record.setAdditionalInformation(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
