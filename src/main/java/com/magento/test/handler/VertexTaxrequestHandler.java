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
import com.magento.test.entity.VertexTaxrequest;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("VertexTaxrequestHandler")
public class VertexTaxrequestHandler extends DelimiterFileHandler<VertexTaxrequest> {

  @Inject
  @Named("DefaultJpaDao")
  public VertexTaxrequestHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected VertexTaxrequest parseLine(List<String> headers, List<String> tokens) {
    VertexTaxrequest record = new VertexTaxrequest();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "requestId":
          record.setRequestId(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "requestType":
          record.setRequestType(tokens.get(i));
          break;

        case "quoteId":
          record.setQuoteId(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "orderId":
          record.setOrderId(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "totalTax":
          record.setTotalTax(tokens.get(i));
          break;

        case "sourcePath":
          record.setSourcePath(tokens.get(i));
          break;

        case "taxAreaId":
          record.setTaxAreaId(tokens.get(i));
          break;

        case "subTotal":
          record.setSubTotal(tokens.get(i));
          break;

        case "total":
          record.setTotal(tokens.get(i));
          break;

        case "lookupResult":
          record.setLookupResult(tokens.get(i));
          break;

        case "requestDate":
          record.setRequestDate(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "requestXml":
          record.setRequestXml(tokens.get(i));
          break;

        case "responseXml":
          record.setResponseXml(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
