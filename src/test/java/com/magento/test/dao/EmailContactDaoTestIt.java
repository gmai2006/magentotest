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
import com.magento.test.entity.EmailContact;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class EmailContactDaoTestIt {
  static final String inputFile = "EmailContact.json";
  static EmailContactDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private EmailContact[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultEmailContactDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, EmailContact[].class);
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
    EmailContact testResult = dao.find(records[1].getEmailContactId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals isGuest ", this.records[1].getIsGuest() == testResult.getIsGuest());
    org.junit.Assert.assertEquals(
        "expect equals contactId ", this.records[1].getContactId(), testResult.getContactId());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", this.records[1].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertTrue(
        "expect equals websiteId ", this.records[1].getWebsiteId() == testResult.getWebsiteId());
    org.junit.Assert.assertTrue(
        "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
    org.junit.Assert.assertTrue(
        "expect equals isSubscriber ",
        this.records[1].getIsSubscriber() == testResult.getIsSubscriber());
    org.junit.Assert.assertTrue(
        "expect equals subscriberStatus ",
        this.records[1].getSubscriberStatus() == testResult.getSubscriberStatus());
    org.junit.Assert.assertTrue(
        "expect equals emailImported ",
        this.records[1].getEmailImported() == testResult.getEmailImported());
    org.junit.Assert.assertTrue(
        "expect equals subscriberImported ",
        this.records[1].getSubscriberImported() == testResult.getSubscriberImported());
    org.junit.Assert.assertTrue(
        "expect equals suppressed ", this.records[1].getSuppressed() == testResult.getSuppressed());
  }
}