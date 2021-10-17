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
import com.magento.test.entity.TemandoQuotePickupLocation;
import com.magento.test.dao.JpaDao;

import com.magento.test.utils.DelimiterParser;

// @Stateless
@Named("TemandoQuotePickupLocationHandler")
public class TemandoQuotePickupLocationHandler
    extends DelimiterFileHandler<TemandoQuotePickupLocation> {

  @Inject
  @Named("DefaultJpaDao")
  public TemandoQuotePickupLocationHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected TemandoQuotePickupLocation parseLine(List<String> headers, List<String> tokens) {
    TemandoQuotePickupLocation record = new TemandoQuotePickupLocation();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "entityId":
          record.setEntityId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "recipientAddressId":
          record.setRecipientAddressId(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "pickupLocationId":
          record.setPickupLocationId(tokens.get(i));
          break;

        case "name":
          record.setName(tokens.get(i));
          break;

        case "country":
          record.setCountry(tokens.get(i));
          break;

        case "region":
          record.setRegion(tokens.get(i));
          break;

        case "postcode":
          record.setPostcode(tokens.get(i));
          break;

        case "city":
          record.setCity(tokens.get(i));
          break;

        case "street":
          record.setStreet(tokens.get(i));
          break;

        case "openingHours":
          record.setOpeningHours(tokens.get(i));
          break;

        case "shippingExperiences":
          record.setShippingExperiences(tokens.get(i));
          break;

        case "selected":
          record.setSelected(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "distance":
          record.setDistance(java.lang.Integer.valueOf((tokens.get(i))));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
