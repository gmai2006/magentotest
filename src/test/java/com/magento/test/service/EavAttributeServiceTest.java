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

import com.magento.test.entity.EavAttribute;
import com.magento.test.entity.EavAttributeId;

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

public class EavAttributeServiceTest {
  private static DefaultEavAttributeService serviceMock;
  private static EavAttribute[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultEavAttributeService.class);
    String inputFile = "EavAttribute.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, EavAttribute[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final EavAttributeId id =
        new EavAttributeId(
            records[0].getAttributeId(),
            records[0].getEntityTypeId(),
            records[0].getAttributeCode());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final EavAttributeId id =
        new EavAttributeId(
            records[0].getAttributeId(),
            records[0].getEntityTypeId(),
            records[0].getAttributeCode());
    EavAttribute testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals attributeModel ",
        records[0].getAttributeModel(),
        testResult.getAttributeModel());
    org.junit.Assert.assertEquals(
        "expect equals backendModel ", records[0].getBackendModel(), testResult.getBackendModel());
    org.junit.Assert.assertEquals(
        "expect equals backendType ", records[0].getBackendType(), testResult.getBackendType());
    org.junit.Assert.assertEquals(
        "expect equals backendTable ", records[0].getBackendTable(), testResult.getBackendTable());
    org.junit.Assert.assertEquals(
        "expect equals frontendModel ",
        records[0].getFrontendModel(),
        testResult.getFrontendModel());
    org.junit.Assert.assertEquals(
        "expect equals frontendInput ",
        records[0].getFrontendInput(),
        testResult.getFrontendInput());
    org.junit.Assert.assertEquals(
        "expect equals frontendLabel ",
        records[0].getFrontendLabel(),
        testResult.getFrontendLabel());
    org.junit.Assert.assertEquals(
        "expect equals frontendClass ",
        records[0].getFrontendClass(),
        testResult.getFrontendClass());
    org.junit.Assert.assertEquals(
        "expect equals sourceModel ", records[0].getSourceModel(), testResult.getSourceModel());
    org.junit.Assert.assertTrue(
        "expect equals isRequired ", records[0].getIsRequired() == testResult.getIsRequired());
    org.junit.Assert.assertTrue(
        "expect equals isUserDefined ",
        records[0].getIsUserDefined() == testResult.getIsUserDefined());
    org.junit.Assert.assertEquals(
        "expect equals defaultValue ", records[0].getDefaultValue(), testResult.getDefaultValue());
    org.junit.Assert.assertTrue(
        "expect equals isUnique ", records[0].getIsUnique() == testResult.getIsUnique());
    org.junit.Assert.assertEquals(
        "expect equals note ", records[0].getNote(), testResult.getNote());
  }
}
