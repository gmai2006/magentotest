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

import com.magento.test.entity.CheckoutAgreement;

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

public class CheckoutAgreementServiceTest {
  private static DefaultCheckoutAgreementService serviceMock;
  private static CheckoutAgreement[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultCheckoutAgreementService.class);
    String inputFile = "CheckoutAgreement.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CheckoutAgreement[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getAgreementId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    CheckoutAgreement testResult = serviceMock.find(records[0].getAgreementId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals name ", records[0].getName(), testResult.getName());
    org.junit.Assert.assertEquals(
        "expect equals content ", records[0].getContent(), testResult.getContent());
    org.junit.Assert.assertEquals(
        "expect equals contentHeight ",
        records[0].getContentHeight(),
        testResult.getContentHeight());
    org.junit.Assert.assertEquals(
        "expect equals checkboxText ", records[0].getCheckboxText(), testResult.getCheckboxText());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", records[0].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals isHtml ", records[0].getIsHtml() == testResult.getIsHtml());
    org.junit.Assert.assertTrue(
        "expect equals mode ", records[0].getMode() == testResult.getMode());
  }
}
