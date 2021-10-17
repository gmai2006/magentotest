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
import com.magento.test.entity.CustomerGridFlat;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CustomerGridFlatDaoTestIt {
  static final String inputFile = "CustomerGridFlat.json";
  static CustomerGridFlatDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CustomerGridFlat[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCustomerGridFlatDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CustomerGridFlat[].class);
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
    CustomerGridFlat testResult = dao.find(records[1].getEntityId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
    org.junit.Assert.assertTrue(
        "expect equals groupId ", this.records[1].getGroupId() == testResult.getGroupId());
    org.junit.Assert.assertTrue(
        "expect equals websiteId ", this.records[1].getWebsiteId() == testResult.getWebsiteId());
    org.junit.Assert.assertEquals(
        "expect equals confirmation ",
        this.records[1].getConfirmation(),
        testResult.getConfirmation());
    org.junit.Assert.assertEquals(
        "expect equals createdIn ", this.records[1].getCreatedIn(), testResult.getCreatedIn());
    org.junit.Assert.assertTrue(
        "expect equals gender ", this.records[1].getGender() == testResult.getGender());
    org.junit.Assert.assertEquals(
        "expect equals taxvat ", this.records[1].getTaxvat(), testResult.getTaxvat());
    org.junit.Assert.assertEquals(
        "expect equals shippingFull ",
        this.records[1].getShippingFull(),
        testResult.getShippingFull());
    org.junit.Assert.assertEquals(
        "expect equals billingFull ",
        this.records[1].getBillingFull(),
        testResult.getBillingFull());
    org.junit.Assert.assertEquals(
        "expect equals billingFirstname ",
        this.records[1].getBillingFirstname(),
        testResult.getBillingFirstname());
    org.junit.Assert.assertEquals(
        "expect equals billingLastname ",
        this.records[1].getBillingLastname(),
        testResult.getBillingLastname());
    org.junit.Assert.assertEquals(
        "expect equals billingTelephone ",
        this.records[1].getBillingTelephone(),
        testResult.getBillingTelephone());
    org.junit.Assert.assertEquals(
        "expect equals billingPostcode ",
        this.records[1].getBillingPostcode(),
        testResult.getBillingPostcode());
    org.junit.Assert.assertEquals(
        "expect equals billingCountryId ",
        this.records[1].getBillingCountryId(),
        testResult.getBillingCountryId());
    org.junit.Assert.assertEquals(
        "expect equals billingRegion ",
        this.records[1].getBillingRegion(),
        testResult.getBillingRegion());
    org.junit.Assert.assertEquals(
        "expect equals billingStreet ",
        this.records[1].getBillingStreet(),
        testResult.getBillingStreet());
    org.junit.Assert.assertEquals(
        "expect equals billingCity ",
        this.records[1].getBillingCity(),
        testResult.getBillingCity());
    org.junit.Assert.assertEquals(
        "expect equals billingFax ", this.records[1].getBillingFax(), testResult.getBillingFax());
    org.junit.Assert.assertEquals(
        "expect equals billingVatId ",
        this.records[1].getBillingVatId(),
        testResult.getBillingVatId());
    org.junit.Assert.assertEquals(
        "expect equals billingCompany ",
        this.records[1].getBillingCompany(),
        testResult.getBillingCompany());
  }
}
