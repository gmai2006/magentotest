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
import com.magento.test.entity.AdminUser;
import com.magento.test.entity.AdminUserId;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class AdminUserDaoTestIt {
  static final String inputFile = "AdminUser.json";
  static AdminUserDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private AdminUser[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultAdminUserDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AdminUser[].class);
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
    final AdminUserId id =
        new AdminUserId(this.records[1].getUserId(), this.records[1].getUsername());
    AdminUser testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals firstname ", this.records[1].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", this.records[1].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals password ", this.records[1].getPassword(), testResult.getPassword());
    org.junit.Assert.assertTrue(
        "expect equals lognum ", this.records[1].getLognum() == testResult.getLognum());
    org.junit.Assert.assertTrue(
        "expect equals reloadAclFlag ",
        this.records[1].getReloadAclFlag() == testResult.getReloadAclFlag());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", this.records[1].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals extra ", this.records[1].getExtra(), testResult.getExtra());
    org.junit.Assert.assertEquals(
        "expect equals rpToken ", this.records[1].getRpToken(), testResult.getRpToken());
    org.junit.Assert.assertEquals(
        "expect equals interfaceLocale ",
        this.records[1].getInterfaceLocale(),
        testResult.getInterfaceLocale());
    org.junit.Assert.assertTrue(
        "expect equals failuresNum ",
        this.records[1].getFailuresNum() == testResult.getFailuresNum());
    org.junit.Assert.assertEquals(
        "expect equals refreshToken ",
        this.records[1].getRefreshToken(),
        testResult.getRefreshToken());
  }
}
