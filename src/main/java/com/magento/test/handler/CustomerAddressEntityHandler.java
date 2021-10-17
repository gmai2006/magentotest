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
import com.magento.test.entity.CustomerAddressEntity;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("CustomerAddressEntityHandler")
public class CustomerAddressEntityHandler extends DelimiterFileHandler<CustomerAddressEntity> {

  @Inject
  @Named("DefaultJpaDao")
  public CustomerAddressEntityHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected CustomerAddressEntity parseLine(List<String> headers, List<String> tokens) {
    CustomerAddressEntity record = new CustomerAddressEntity();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "incrementId":
          record.setIncrementId(tokens.get(i));
          break;

        case "parentId":
          record.setParentId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "createdAt":
          record.setCreatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "updatedAt":
          record.setUpdatedAt(new java.sql.Timestamp(parseTime(tokens.get(i))));
          break;

        case "isActive":
          record.setIsActive(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "city":
          record.setCity(tokens.get(i));
          break;

        case "company":
          record.setCompany(tokens.get(i));
          break;

        case "countryId":
          record.setCountryId(tokens.get(i));
          break;

        case "fax":
          record.setFax(tokens.get(i));
          break;

        case "firstname":
          record.setFirstname(tokens.get(i));
          break;

        case "lastname":
          record.setLastname(tokens.get(i));
          break;

        case "middlename":
          record.setMiddlename(tokens.get(i));
          break;

        case "postcode":
          record.setPostcode(tokens.get(i));
          break;

        case "prefix":
          record.setPrefix(tokens.get(i));
          break;

        case "region":
          record.setRegion(tokens.get(i));
          break;

        case "regionId":
          record.setRegionId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "street":
          record.setStreet(tokens.get(i));
          break;

        case "suffix":
          record.setSuffix(tokens.get(i));
          break;

        case "telephone":
          record.setTelephone(tokens.get(i));
          break;

        case "vatId":
          record.setVatId(tokens.get(i));
          break;

        case "vatIsValid":
          record.setVatIsValid(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "vatRequestDate":
          record.setVatRequestDate(tokens.get(i));
          break;

        case "vatRequestId":
          record.setVatRequestId(tokens.get(i));
          break;

        case "vatRequestSuccess":
          record.setVatRequestSuccess(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
