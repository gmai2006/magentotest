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
import com.magento.test.entity.CmsPage;
import com.magento.test.utils.FileUtils;
import com.magento.test.utils.ByteArrayToBase64TypeAdapter;

public class CmsPageDaoTestIt {
  static final String inputFile = "CmsPage.json";
  static CmsPageDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private CmsPage[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultCmsPageDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, CmsPage[].class);
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
    CmsPage testResult = dao.find(records[1].getPageId());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals title ", this.records[1].getTitle(), testResult.getTitle());
    org.junit.Assert.assertEquals(
        "expect equals pageLayout ", this.records[1].getPageLayout(), testResult.getPageLayout());
    org.junit.Assert.assertEquals(
        "expect equals metaKeywords ",
        this.records[1].getMetaKeywords(),
        testResult.getMetaKeywords());
    org.junit.Assert.assertEquals(
        "expect equals metaDescription ",
        this.records[1].getMetaDescription(),
        testResult.getMetaDescription());
    org.junit.Assert.assertEquals(
        "expect equals identifier ", this.records[1].getIdentifier(), testResult.getIdentifier());
    org.junit.Assert.assertEquals(
        "expect equals contentHeading ",
        this.records[1].getContentHeading(),
        testResult.getContentHeading());
    org.junit.Assert.assertEquals(
        "expect equals content ", this.records[1].getContent(), testResult.getContent());
    org.junit.Assert.assertTrue(
        "expect equals isActive ", this.records[1].getIsActive() == testResult.getIsActive());
    org.junit.Assert.assertTrue(
        "expect equals sortOrder ", this.records[1].getSortOrder() == testResult.getSortOrder());
    org.junit.Assert.assertEquals(
        "expect equals layoutUpdateXml ",
        this.records[1].getLayoutUpdateXml(),
        testResult.getLayoutUpdateXml());
    org.junit.Assert.assertEquals(
        "expect equals customTheme ",
        this.records[1].getCustomTheme(),
        testResult.getCustomTheme());
    org.junit.Assert.assertEquals(
        "expect equals customRootTemplate ",
        this.records[1].getCustomRootTemplate(),
        testResult.getCustomRootTemplate());
    org.junit.Assert.assertEquals(
        "expect equals customLayoutUpdateXml ",
        this.records[1].getCustomLayoutUpdateXml(),
        testResult.getCustomLayoutUpdateXml());
    org.junit.Assert.assertEquals(
        "expect equals metaTitle ", this.records[1].getMetaTitle(), testResult.getMetaTitle());
  }
}