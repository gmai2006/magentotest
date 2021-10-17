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

import com.magento.test.entity.OauthToken;
import com.magento.test.entity.OauthTokenId;

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

public class OauthTokenServiceTest {
  private static DefaultOauthTokenService serviceMock;
  private static OauthToken[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultOauthTokenService.class);
    String inputFile = "OauthToken.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, OauthToken[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final OauthTokenId id = new OauthTokenId(records[0].getEntityId(), records[0].getToken());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final OauthTokenId id = new OauthTokenId(records[0].getEntityId(), records[0].getToken());
    OauthToken testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertTrue(
        "expect equals consumerId ", records[0].getConsumerId() == testResult.getConsumerId());
    org.junit.Assert.assertTrue(
        "expect equals adminId ", records[0].getAdminId() == testResult.getAdminId());
    org.junit.Assert.assertTrue(
        "expect equals customerId ", records[0].getCustomerId() == testResult.getCustomerId());
    org.junit.Assert.assertEquals(
        "expect equals type ", records[0].getType(), testResult.getType());
    org.junit.Assert.assertEquals(
        "expect equals secret ", records[0].getSecret(), testResult.getSecret());
    org.junit.Assert.assertEquals(
        "expect equals verifier ", records[0].getVerifier(), testResult.getVerifier());
    org.junit.Assert.assertEquals(
        "expect equals callbackUrl ", records[0].getCallbackUrl(), testResult.getCallbackUrl());
    org.junit.Assert.assertTrue(
        "expect equals revoked ", records[0].getRevoked() == testResult.getRevoked());
    org.junit.Assert.assertTrue(
        "expect equals authorized ", records[0].getAuthorized() == testResult.getAuthorized());
    org.junit.Assert.assertTrue(
        "expect equals userType ", records[0].getUserType() == testResult.getUserType());
  }
}
