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

import com.magento.test.entity.EmailTemplate;
import com.magento.test.entity.EmailTemplateId;

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

public class EmailTemplateServiceTest {
  private static DefaultEmailTemplateService serviceMock;
  private static EmailTemplate[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultEmailTemplateService.class);
    String inputFile = "EmailTemplate.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, EmailTemplate[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final EmailTemplateId id =
        new EmailTemplateId(records[0].getTemplateId(), records[0].getTemplateCode());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final EmailTemplateId id =
        new EmailTemplateId(records[0].getTemplateId(), records[0].getTemplateCode());
    EmailTemplate testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals templateText ", records[0].getTemplateText(), testResult.getTemplateText());
    org.junit.Assert.assertEquals(
        "expect equals templateStyles ",
        records[0].getTemplateStyles(),
        testResult.getTemplateStyles());
    org.junit.Assert.assertTrue(
        "expect equals templateType ",
        records[0].getTemplateType() == testResult.getTemplateType());
    org.junit.Assert.assertEquals(
        "expect equals templateSubject ",
        records[0].getTemplateSubject(),
        testResult.getTemplateSubject());
    org.junit.Assert.assertEquals(
        "expect equals templateSenderName ",
        records[0].getTemplateSenderName(),
        testResult.getTemplateSenderName());
    org.junit.Assert.assertEquals(
        "expect equals templateSenderEmail ",
        records[0].getTemplateSenderEmail(),
        testResult.getTemplateSenderEmail());
    org.junit.Assert.assertEquals(
        "expect equals origTemplateCode ",
        records[0].getOrigTemplateCode(),
        testResult.getOrigTemplateCode());
    org.junit.Assert.assertEquals(
        "expect equals origTemplateVariables ",
        records[0].getOrigTemplateVariables(),
        testResult.getOrigTemplateVariables());
  }
}
