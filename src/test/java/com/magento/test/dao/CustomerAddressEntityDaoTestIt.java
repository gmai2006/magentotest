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
package com.magento.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.magento.test.entity.CustomerAddressEntity;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CustomerAddressEntityDaoTestIt {
  static final String inputFile = "CustomerAddressEntity.json";
  static CustomerAddressEntityDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CustomerAddressEntity[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCustomerAddressEntityDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerAddressEntity[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    CustomerAddressEntity testResult = dao.find(records[1].getEntityId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals incrementId ",
        this.records[1].getIncrementId(),
        testResult.getIncrementId());
    org.junit.Assert.assertTrue(
        "expect equals parentId ", this.records[1].getParentId() == testResult.getParentId());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", this.records[1].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals city ", this.records[1].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals company ", this.records[1].getCompany(), testResult.getCompany());
    org.junit.Assert.assertEquals(
        "expect equals countryId ", this.records[1].getCountryId(), testResult.getCountryId());
    org.junit.Assert.assertEquals(
        "expect equals fax ", this.records[1].getFax(), testResult.getFax());
    org.junit.Assert.assertEquals(
        "expect equals firstname ", this.records[1].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", this.records[1].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals middlename ", this.records[1].getMiddlename(), testResult.getMiddlename());
    org.junit.Assert.assertEquals(
        "expect equals postcode ", this.records[1].getPostcode(), testResult.getPostcode());
    org.junit.Assert.assertEquals(
        "expect equals prefix ", this.records[1].getPrefix(), testResult.getPrefix());
    org.junit.Assert.assertEquals(
        "expect equals region ", this.records[1].getRegion(), testResult.getRegion());
    org.junit.Assert.assertTrue(
        "expect equals regionId ", this.records[1].getRegionId() == testResult.getRegionId());
    org.junit.Assert.assertEquals(
        "expect equals street ", this.records[1].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals suffix ", this.records[1].getSuffix(), testResult.getSuffix());
    org.junit.Assert.assertEquals(
        "expect equals telephone ", this.records[1].getTelephone(), testResult.getTelephone());
    org.junit.Assert.assertEquals(
        "expect equals vatId ", this.records[1].getVatId(), testResult.getVatId());
    org.junit.Assert.assertTrue(
        "expect equals vatIsValid ", this.records[1].getVatIsValid() == testResult.getVatIsValid());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestDate ",
        this.records[1].getVatRequestDate(),
        testResult.getVatRequestDate());
    org.junit.Assert.assertEquals(
        "expect equals vatRequestId ",
        this.records[1].getVatRequestId(),
        testResult.getVatRequestId());
    org.junit.Assert.assertTrue(
        "expect equals vatRequestSuccess ",
        this.records[1].getVatRequestSuccess() == testResult.getVatRequestSuccess());
  }
}
