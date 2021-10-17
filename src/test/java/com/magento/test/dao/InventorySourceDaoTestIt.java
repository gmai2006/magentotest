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
import com.magento.test.entity.InventorySource;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class InventorySourceDaoTestIt {
  static final String inputFile = "InventorySource.json";
  static InventorySourceDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private InventorySource[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultInventorySourceDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, InventorySource[].class);
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
    InventorySource testResult = dao.find(records[1].getSourceCode());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", this.records[1].getName(), testResult.getName());
    org.junit.Assert.assertTrue(
        "expect equals enabled ", this.records[1].getEnabled() == testResult.getEnabled());
    org.junit.Assert.assertEquals(
        "expect equals description ",
        this.records[1].getDescription(),
        testResult.getDescription());
    org.junit.Assert.assertEquals(
        "expect equals latitude ", this.records[1].getLatitude(), testResult.getLatitude());
    org.junit.Assert.assertEquals(
        "expect equals longitude ", this.records[1].getLongitude(), testResult.getLongitude());
    org.junit.Assert.assertEquals(
        "expect equals countryId ", this.records[1].getCountryId(), testResult.getCountryId());
    org.junit.Assert.assertTrue(
        "expect equals regionId ", this.records[1].getRegionId() == testResult.getRegionId());
    org.junit.Assert.assertEquals(
        "expect equals region ", this.records[1].getRegion(), testResult.getRegion());
    org.junit.Assert.assertEquals(
        "expect equals city ", this.records[1].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals street ", this.records[1].getStreet(), testResult.getStreet());
    org.junit.Assert.assertEquals(
        "expect equals postcode ", this.records[1].getPostcode(), testResult.getPostcode());
    org.junit.Assert.assertEquals(
        "expect equals contactName ",
        this.records[1].getContactName(),
        testResult.getContactName());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals phone ", this.records[1].getPhone(), testResult.getPhone());
    org.junit.Assert.assertEquals(
        "expect equals fax ", this.records[1].getFax(), testResult.getFax());
    org.junit.Assert.assertTrue(
        "expect equals useDefaultCarrierConfig ",
        this.records[1].getUseDefaultCarrierConfig() == testResult.getUseDefaultCarrierConfig());
  }
}
