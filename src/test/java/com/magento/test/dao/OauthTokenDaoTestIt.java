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
import com.magento.test.entity.OauthToken;
import com.magento.test.entity.OauthTokenId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class OauthTokenDaoTestIt {
  static final String inputFile = "OauthToken.json";
  static OauthTokenDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private OauthToken[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultOauthTokenDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, OauthToken[].class);
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
    final OauthTokenId id =
        new OauthTokenId(this.records[1].getEntityId(), this.records[1].getToken());
    OauthToken testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertTrue(
        "expect equals consumerId ", this.records[1].getConsumerId() == testResult.getConsumerId());
    org.junit.Assert.assertTrue(
        "expect equals adminId ", this.records[1].getAdminId() == testResult.getAdminId());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", this.records[1].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals type ", this.records[1].getType(), testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals secret ", this.records[1].getSecret(), testResult.getSecret());
    org.junit.Assert.assertEquals(
        "expect equals verifier ", this.records[1].getVerifier(), testResult.getVerifier());
    org.junit.Assert.assertEquals(
        "expect equals callbackUrl ",
        this.records[1].getCallbackUrl(),
        testResult.getCallbackUrl());
    org.junit.Assert.assertTrue(
        "expect equals revoked ", this.records[1].getRevoked() == testResult.getRevoked());
    org.junit.Assert.assertTrue(
        "expect equals authorized ", this.records[1].getAuthorized() == testResult.getAuthorized());
    org.junit.Assert.assertTrue(
        "expect equals userType ", this.records[1].getUserType() == testResult.getUserType());
  }
}
