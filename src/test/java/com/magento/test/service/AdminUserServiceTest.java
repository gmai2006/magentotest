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
package com.magento.test.service;

import com.magento.test.entity.AdminUser;
import com.magento.test.entity.AdminUserId;

import com.magento.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class AdminUserServiceTest {
  private static DefaultAdminUserService serviceMock;
  private static AdminUser[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultAdminUserService.class);
    String inputFile = "AdminUser.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, AdminUser[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final AdminUserId id = new AdminUserId(records[0].getUserId(), records[0].getUsername());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final AdminUserId id = new AdminUserId(records[0].getUserId(), records[0].getUsername());
    AdminUser testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
    org.junit.Assert.assertEquals(
        "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
    org.junit.Assert.assertEquals(
        "expect equals email ", records[0].getEmail(), testResult.getEmail());
    org.junit.Assert.assertEquals(
        "expect equals password ", records[0].getPassword(), testResult.getPassword());
    org.junit.Assert.assertTrue(
        "expect equals lognum ", records[0].getLognum() == testResult.getLognum());
    org.junit.Assert.assertTrue(
        "expect equals reloadAclFlag ",
        records[0].getReloadAclFlag() == testResult.getReloadAclFlag());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertEquals(
        "expect equals extra ", records[0].getExtra(), testResult.getExtra());
    org.junit.Assert.assertEquals(
        "expect equals rpToken ", records[0].getRpToken(), testResult.getRpToken());
    org.junit.Assert.assertEquals(
        "expect equals interfaceLocale ",
        records[0].getInterfaceLocale(),
        testResult.getInterfaceLocale());
    org.junit.Assert.assertTrue(
        "expect equals failuresNum ", records[0].getFailuresNum() == testResult.getFailuresNum());
    org.junit.Assert.assertEquals(
        "expect equals refreshToken ", records[0].getRefreshToken(), testResult.getRefreshToken());
  }
}
