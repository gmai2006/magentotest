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

import com.magento.test.entity.EavEntityType;

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

public class EavEntityTypeServiceTest {
  private static DefaultEavEntityTypeService serviceMock;
  private static EavEntityType[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultEavEntityTypeService.class);
    String inputFile = "EavEntityType.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, EavEntityType[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getEntityTypeId())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    EavEntityType testResult = serviceMock.find(records[0].getEntityTypeId());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals entityTypeCode ",
        records[0].getEntityTypeCode(),
        testResult.getEntityTypeCode());
    org.junit.Assert.assertEquals(
        "expect equals entityModel ", records[0].getEntityModel(), testResult.getEntityModel());
    org.junit.Assert.assertEquals(
        "expect equals attributeModel ",
        records[0].getAttributeModel(),
        testResult.getAttributeModel());
    org.junit.Assert.assertEquals(
        "expect equals entityTable ", records[0].getEntityTable(), testResult.getEntityTable());
    org.junit.Assert.assertEquals(
        "expect equals valueTablePrefix ",
        records[0].getValueTablePrefix(),
        testResult.getValueTablePrefix());
    org.junit.Assert.assertEquals(
        "expect equals entityIdField ",
        records[0].getEntityIdField(),
        testResult.getEntityIdField());
    org.junit.Assert.assertTrue(
        "expect equals isDataSharing ",
        records[0].getIsDataSharing() == testResult.getIsDataSharing());
    org.junit.Assert.assertEquals(
        "expect equals dataSharingKey ",
        records[0].getDataSharingKey(),
        testResult.getDataSharingKey());
    org.junit.Assert.assertTrue(
        "expect equals defaultAttributeSetId ",
        records[0].getDefaultAttributeSetId() == testResult.getDefaultAttributeSetId());
    org.junit.Assert.assertEquals(
        "expect equals incrementModel ",
        records[0].getIncrementModel(),
        testResult.getIncrementModel());
    org.junit.Assert.assertTrue(
        "expect equals incrementPerStore ",
        records[0].getIncrementPerStore() == testResult.getIncrementPerStore());
    org.junit.Assert.assertTrue(
        "expect equals incrementPadLength ",
        records[0].getIncrementPadLength() == testResult.getIncrementPadLength());
    org.junit.Assert.assertEquals(
        "expect equals incrementPadChar ",
        records[0].getIncrementPadChar(),
        testResult.getIncrementPadChar());
    org.junit.Assert.assertEquals(
        "expect equals additionalAttributeTable ",
        records[0].getAdditionalAttributeTable(),
        testResult.getAdditionalAttributeTable());
    org.junit.Assert.assertEquals(
        "expect equals entityAttributeCollection ",
        records[0].getEntityAttributeCollection(),
        testResult.getEntityAttributeCollection());
  }
}
