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
import com.magento.test.entity.CustomerGridFlat;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CustomerGridFlatHandler")
public class CustomerGridFlatHandler extends DelimiterFileHandler<CustomerGridFlat> {

  @Inject
  @Named("DefaultJpaDao")
  public CustomerGridFlatHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CustomerGridFlat parseLine(List<String> headers, List<String> tokens) {
    CustomerGridFlat record = new CustomerGridFlat();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "name":
          record.setName(tokens.get(i));
          break;

        case "email":
          record.setEmail(tokens.get(i));
          break;

        case "groupId":
          record.setGroupId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "websiteId":
          record.setWebsiteId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "confirmation":
          record.setConfirmation(tokens.get(i));
          break;

        case "createdIn":
          record.setCreatedIn(tokens.get(i));
          break;

        case "dob":
          record.setDob(new java.util.Date(parseDate(tokens.get(i))));
          break;

        case "gender":
          record.setGender(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "taxvat":
          record.setTaxvat(tokens.get(i));
          break;

        case "lockExpires":
          record.setLockExpires(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "shippingFull":
          record.setShippingFull(tokens.get(i));
          break;

        case "billingFull":
          record.setBillingFull(tokens.get(i));
          break;

        case "billingFirstname":
          record.setBillingFirstname(tokens.get(i));
          break;

        case "billingLastname":
          record.setBillingLastname(tokens.get(i));
          break;

        case "billingTelephone":
          record.setBillingTelephone(tokens.get(i));
          break;

        case "billingPostcode":
          record.setBillingPostcode(tokens.get(i));
          break;

        case "billingCountryId":
          record.setBillingCountryId(tokens.get(i));
          break;

        case "billingRegion":
          record.setBillingRegion(tokens.get(i));
          break;

        case "billingStreet":
          record.setBillingStreet(tokens.get(i));
          break;

        case "billingCity":
          record.setBillingCity(tokens.get(i));
          break;

        case "billingFax":
          record.setBillingFax(tokens.get(i));
          break;

        case "billingVatId":
          record.setBillingVatId(tokens.get(i));
          break;

        case "billingCompany":
          record.setBillingCompany(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
